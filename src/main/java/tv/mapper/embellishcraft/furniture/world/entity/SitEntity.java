package tv.mapper.embellishcraft.furniture.world.entity;

import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.core.Direction.AxisDirection;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.NetworkHooks;
import tv.mapper.embellishcraft.furniture.world.level.block.SitBlock;

public class SitEntity extends Entity
{
    public SitEntity(Level pLevel)
    {
        super(InitFurnitureEntities.SIT.get(), pLevel);
    }

    private SitEntity(Level pLevel, BlockPos pPos, double hOffset, double vOffset, Direction direction, boolean reverse)
    {
        this(pLevel);

        if(direction.getAxisDirection() == AxisDirection.POSITIVE)
            hOffset = 1 - hOffset;

        if(direction.getAxis() == Axis.X)
            this.setPos(pPos.getX() + hOffset, pPos.getY() + vOffset, pPos.getZ() + 0.5);
        else
            this.setPos(pPos.getX() + 0.5, pPos.getY() + vOffset, pPos.getZ() + hOffset);

        this.setRot((reverse ? direction.toYRot() : direction.getOpposite().toYRot()), 0F);
    }

    @Override
    public void tick()
    {
        super.tick();
        if(!this.level().isClientSide)
        {
            if(this.getPassengers().isEmpty() || !(this.level().getBlockState(this.blockPosition()).getBlock() instanceof SitBlock))
            {
                this.remove(RemovalReason.DISCARDED);
                this.level().updateNeighbourForOutputSignal(blockPosition(), this.level().getBlockState(blockPosition()).getBlock());
            }
        }
    }

    public static InteractionResult create(Level pLevel, BlockPos pPos, double hOffset, double vOffset, Player pPlayer, Direction direction, boolean reverse)
    {
        if(!pLevel.isClientSide())
        {
            List<SitEntity> seats = pLevel.getEntitiesOfClass(SitEntity.class, new AABB(pPos.getX(), pPos.getY(), pPos.getZ(), pPos.getX() + 1.0, pPos.getY() + 1.0, pPos.getZ() + 1.0));
            if(seats.isEmpty())
            {
                SitEntity seat = new SitEntity(pLevel, pPos, hOffset, vOffset, direction, reverse);
                pLevel.addFreshEntity(seat);
                pPlayer.startRiding(seat, false);
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected boolean canRide(Entity entity)
    {
        return true;
    }

    @Override
    protected void defineSynchedData()
    {}

    @Override
    protected void readAdditionalSaveData(CompoundTag pCompound)
    {}

    @Override
    protected void addAdditionalSaveData(CompoundTag pCompound)
    {}

    // @todo 1.20
//    @Override
//    public Packet<?> getAddEntityPacket()
//    {
//        return NetworkHooks.getEntitySpawningPacket(this);
//    }

    @Override
    protected void addPassenger(Entity entity)
    {
        super.addPassenger(entity);
        entity.setYRot(this.getYRot());
    }

    @Override
    protected void positionRider(Entity entity, MoveFunction pCallback) {
        super.positionRider(entity, pCallback);
        this.clampYaw(entity);
    }

    @Override
    public void onPassengerTurned(Entity entity)
    {
        this.clampYaw(entity);
    }

    private void clampYaw(Entity player)
    {
        player.setYBodyRot(this.getYRot());
        float wrappedYaw = Mth.wrapDegrees(player.getYRot() - this.getYRot());
        float clampedYaw = Mth.clamp(wrappedYaw, -75.0F, 75.0F);
        player.yRotO += clampedYaw - wrappedYaw;
        player.setYRot(player.getYRot() + clampedYaw - wrappedYaw);
        player.setYHeadRot(player.getYRot());
    }
}
