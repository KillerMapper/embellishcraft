package tv.mapper.embellishcraft.furniture.world.level.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.tuple.Pair;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.McWoods;
import tv.mapper.embellishcraft.core.util.WoodsType;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InitFurnitureBlocks
{
    public static final DeferredRegister<Block> FURNITURE_BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ECConstants.MODID);

    // public static List<RegistryObject<CustomChestBlock>> FANCY_CHESTS = new ArrayList<>();
    public static List<RegistryObject<CustomBedBlock>> FANCY_BEDS = new ArrayList<>();
    public static List<RegistryObject<CrateBlock>> CRATES = new ArrayList<>();
    public static List<RegistryObject<? extends Block>> CUTOUT_BLOCKS = new ArrayList<>();

    public static final Map<McWoods, RegistryObject<ChairBlock>> CHAIR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_chair", () -> new ChairBlock(Block.Properties.of().sound(SoundType.WOOD).mapColor(MapColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TerraceChairBlock>> TERRACE_CHAIR_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_terrace_chair", () -> new TerraceChairBlock(Block.Properties.of().sound(SoundType.WOOD).mapColor(MapColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TableBlock>> TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_table", () -> new TableBlock(Block.Properties.of().sound(SoundType.WOOD).mapColor(MapColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FancyTableBlock>> FANCY_TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_fancy_table", () -> new FancyTableBlock(Block.Properties.of().sound(SoundType.WOOD).mapColor(MapColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<TerraceTableBlock>> TERRACE_TABLE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_terrace_table", () -> new TerraceTableBlock(Block.Properties.of().sound(SoundType.WOOD).mapColor(MapColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<TerraceTableBlock> STEEL_TERRACE_TABLE = FURNITURE_BLOCK_REGISTRY.register("steel_terrace_table", () -> new TerraceTableBlock(Block.Properties.of().sound(SoundType.METAL).mapColor(MapColor.METAL).strength(0.75F, 0.5F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final RegistryObject<TerraceChairBlock> STEEL_TERRACE_CHAIR = FURNITURE_BLOCK_REGISTRY.register("steel_terrace_chair", () -> new TerraceChairBlock(Block.Properties.of().sound(SoundType.METAL).mapColor(MapColor.METAL).strength(0.75F, 0.5F).sound(SoundType.LANTERN), ToolTypes.PICKAXE));

    public static final Map<DyeColor, RegistryObject<CouchBlock>> COUCH_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_couch", () -> new CouchBlock(Block.Properties.of().sound(SoundType.WOOL).mapColor(type.getMapColor()).strength(1.5F, 6.0F).sound(SoundType.WOOL), ToolTypes.PICKAXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<PlateBlock> PLATE = FURNITURE_BLOCK_REGISTRY.register("plate", () -> new PlateBlock(Block.Properties.of().sound(SoundType.GLASS).mapColor(MapColor.QUARTZ).strength(0.25F).sound(SoundType.GLASS), ToolTypes.NONE));

    // Pillows
    public static final Map<DyeColor, RegistryObject<PillowBlock>> PILLOW_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_pillow", () -> new PillowBlock(type, Block.Properties.of().sound(SoundType.WOOL).mapColor(type.getMapColor()).strength(0.25F).sound(SoundType.WOOL))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Crates
    public static final Map<McWoods, RegistryObject<CrateBlock>> WOODEN_CRATE_BLOCKS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_wooden_crate", () -> new CrateBlock(Block.Properties.of().sound(SoundType.WOOD).mapColor(MapColor.WOOD).strength(2.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Beds
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> OAK_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_oak_fancy_bed", () -> new CustomBedBlock(type, WoodsType.OAK, Block.Properties.of().sound(SoundType.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> BIRCH_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_birch_fancy_bed", () -> new CustomBedBlock(type, WoodsType.BIRCH, Block.Properties.of().sound(SoundType.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> SPRUCE_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_spruce_fancy_bed", () -> new CustomBedBlock(type, WoodsType.SPRUCE, Block.Properties.of().sound(SoundType.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> JUNGLE_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_jungle_fancy_bed", () -> new CustomBedBlock(type, WoodsType.JUNGLE, Block.Properties.of().sound(SoundType.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> DARK_OAK_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_dark_oak_fancy_bed", () -> new CustomBedBlock(type, WoodsType.DARK_OAK, Block.Properties.of().sound(SoundType.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> ACACIA_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_acacia_fancy_bed", () -> new CustomBedBlock(type, WoodsType.ACACIA, Block.Properties.of().sound(SoundType.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> WARPED_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_warped_fancy_bed", () -> new CustomBedBlock(type, WoodsType.WARPED, Block.Properties.of().sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> CRIMSON_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_BLOCK_REGISTRY.register(type.getSerializedName() + "_crimson_fancy_bed", () -> new CustomBedBlock(type, WoodsType.CRIMSON, Block.Properties.of().sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        FURNITURE_BLOCK_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void postInit()
    {
        for(int i = 0; i < McWoods.values().length; i++)
        {
            // FANCY_CHESTS.add(FANCY_CHEST_BLOCKS.get(McWoods.byId(i)));
            CUTOUT_BLOCKS.add(TERRACE_CHAIR_BLOCKS.get(McWoods.byId(i)));
            CUTOUT_BLOCKS.add(TERRACE_TABLE_BLOCKS.get(McWoods.byId(i)));
            CRATES.add(WOODEN_CRATE_BLOCKS.get(McWoods.byId(i)));
        }

        CUTOUT_BLOCKS.add(STEEL_TERRACE_CHAIR);
        CUTOUT_BLOCKS.add(STEEL_TERRACE_TABLE);

        for(int i = 0; i < DyeColor.values().length; i++)
        {
            FANCY_BEDS.add(OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            FANCY_BEDS.add(ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
        }
    }
}
