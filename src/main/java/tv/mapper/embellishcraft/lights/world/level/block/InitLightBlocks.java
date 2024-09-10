package tv.mapper.embellishcraft.lights.world.level.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.tuple.Pair;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class InitLightBlocks
{
    public static final DeferredRegister<Block> LIGHT_BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ECConstants.MODID);

    public static final Map<DyeColor, RegistryObject<LampBlock>> TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, LIGHT_BLOCK_REGISTRY.register(type.getSerializedName() + "_table_lamp", () -> new LampBlock(Block.Properties.of().sound(SoundType.WOOL).mapColor(type.getMapColor()).strength(1.5F, 6.0F).sound(SoundType.WOOL).lightLevel((state) -> 9), ToolTypes.NONE, false)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<LampBlock>> MANUAL_TABLE_LAMP_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, LIGHT_BLOCK_REGISTRY.register(type.getSerializedName() + "_manual_table_lamp", () -> new LampBlock(Block.Properties.of().sound(SoundType.WOOL).mapColor(type.getMapColor()).strength(1.5F, 6.0F).sound(SoundType.WOOL).lightLevel((state) -> 9), ToolTypes.NONE, true)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        LIGHT_BLOCK_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}