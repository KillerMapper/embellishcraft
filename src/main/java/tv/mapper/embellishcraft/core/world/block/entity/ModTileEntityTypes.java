package tv.mapper.embellishcraft.core.world.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.embellishcraft.EmbellishCraft;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.furniture.world.level.block.CrateBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.CustomBedBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.furniture.world.level.block.entity.CrateTileEntity;
import tv.mapper.embellishcraft.furniture.world.level.block.entity.CustomBedTileEntity;
import tv.mapper.embellishcraft.furniture.world.level.block.entity.CustomChestTileEntity;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(bus = Bus.MOD)
public class ModTileEntityTypes
{
    @ObjectHolder(registryName = "block_entity_type", value = ECConstants.MODID + ":custom_chest")
    public static final BlockEntityType<CustomChestTileEntity> CUSTOM_CHEST = null;
    // @ObjectHolder(registryName = "block_entity_type", value = ECConstants.MODID + ":vertical_chest")
    // public static final BlockEntityType<VerticalChestTileEntity> VERTICAL_CHEST = null;
    @ObjectHolder(registryName = "block_entity_type", value = ECConstants.MODID + ":custom_bed")
    public static final BlockEntityType<CustomBedTileEntity> CUSTOM_BED = null;
    @ObjectHolder(registryName = "block_entity_type", value = ECConstants.MODID + ":crate")
    public static final BlockEntityType<CrateTileEntity> CRATE = null;

    @SubscribeEvent
    public static void registerTileEntities(RegisterEvent event)
    {
        EmbellishCraft.LOGGER.info("1.3- EmbellishCraft: TE registering.");

        // for(RegistryObject<CustomChestBlock> object : InitFurnitureBlocks.FANCY_CHESTS)
        // {
        // CHESTS.add(object.get());
        // }

        EmbellishCraft.LOGGER.info("EmbellishCraft: if this line crashes please report to https://github.com/MapperTV/embellishcraft/issues/19");

        // event.getRegistry().register(BlockEntityType.Builder.of(CustomChestTileEntity::new, CHESTS.toArray(new
        // Block[InitFurnitureBlocks.FANCY_CHESTS.size()])).build(null).setRegistryName("custom_chest"));
        // event.getRegistry().register(BlockEntityType.Builder.of(VerticalChestTileEntity::new, InitFurnitureBlocks.LOCKER.get()).build(null).setRegistryName("vertical_chest"));
        event.register(ForgeRegistries.Keys.BLOCK_ENTITY_TYPES,
                helper -> {
                    // Make an array of CustomChestBlock objects from InitFurnitureBlocks.FANCY_CHESTS
                    List<CustomBedBlock> fancyBeds = new ArrayList<>();
                    for (RegistryObject<CustomBedBlock> fancyBed : InitFurnitureBlocks.FANCY_BEDS)
                    {
                        fancyBeds.add(fancyBed.get());
                    }
                    // Make an array of CrateBlock objects from InitFurnitureBlocks.CRATES
                    List<CrateBlock> crates = new ArrayList<>();
                    for (RegistryObject<CrateBlock> crate : InitFurnitureBlocks.CRATES)
                    {
                        crates.add(crate.get());
                    }
                    helper.register("custom_bed", BlockEntityType.Builder.of(CustomBedTileEntity::new, fancyBeds.toArray(new CustomBedBlock[InitFurnitureBlocks.FANCY_BEDS.size()])).build(null));
                    helper.register("crate", BlockEntityType.Builder.of(CrateTileEntity::new, crates.toArray(new CrateBlock[InitFurnitureBlocks.CRATES.size()])).build(null));
                });
    }
}