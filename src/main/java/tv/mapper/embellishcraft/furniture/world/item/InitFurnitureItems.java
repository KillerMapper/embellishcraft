package tv.mapper.embellishcraft.furniture.world.item;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.McWoods;
import tv.mapper.embellishcraft.core.world.item.ModItemGroups;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;
import tv.mapper.mapperbase.world.item.FuelBlockItem;

public class InitFurnitureItems
{
    public static final DeferredRegister<Item> FURNITURE_ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> CHAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_chair", () -> new FuelBlockItem(InitFurnitureBlocks.CHAIR_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TERRACE_CHAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_terrace_chair", () -> new FuelBlockItem(InitFurnitureBlocks.TERRACE_CHAIR_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_table", () -> new FuelBlockItem(InitFurnitureBlocks.TABLE_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_fancy_table", () -> new FuelBlockItem(InitFurnitureBlocks.FANCY_TABLE_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.couchBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<McWoods, RegistryObject<FuelBlockItem>> TERRACE_TABLE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_terrace_table", () -> new FuelBlockItem(InitFurnitureBlocks.TERRACE_TABLE_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> STEEL_TERRACE_TABLE_ITEM = FURNITURE_ITEM_REGISTRY.register("steel_terrace_table", () -> new BlockItem(InitFurnitureBlocks.STEEL_TERRACE_TABLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> STEEL_TERRACE_CHAIR_ITEM = FURNITURE_ITEM_REGISTRY.register("steel_terrace_chair", () -> new BlockItem(InitFurnitureBlocks.STEEL_TERRACE_CHAIR.get(), new Item.Properties()));

    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> COUCH_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_couch", () -> new FuelBlockItem(InitFurnitureBlocks.COUCH_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.couchBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> PLATE_ITEM = FURNITURE_ITEM_REGISTRY.register("plate", () -> new BlockItem(InitFurnitureBlocks.PLATE.get(), new Item.Properties()));

    // Pillows
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> PILLOW_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_pillow", () -> new FuelBlockItem(InitFurnitureBlocks.PILLOW_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.doorBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Crates
    public static final Map<McWoods, RegistryObject<BlockItem>> WOODEN_CRATE_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_wooden_crate", () -> new BlockItem(InitFurnitureBlocks.WOODEN_CRATE_BLOCKS.get(type).get(), new Item.Properties().stacksTo(1))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Chests
    // public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_CHEST_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type,
    // FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_fancy_chest", () -> new FuelBlockItem(InitFurnitureBlocks.FANCY_CHEST_BLOCKS.get(type).get(), new
    // Item.Properties(), ECConstants.chestBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // public static final RegistryObject<Item> LOCKER_ITEM = FURNITURE_ITEM_REGISTRY.register("locker", () -> new BlockItem(InitFurnitureBlocks.LOCKER.get(), new
    // Item.Properties()));

    // Beds
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> OAK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_oak_fancy_bed", () -> new FuelBlockItem(InitFurnitureBlocks.OAK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> BIRCH_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_birch_fancy_bed", () -> new FuelBlockItem(InitFurnitureBlocks.BIRCH_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> SPRUCE_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_spruce_fancy_bed", () -> new FuelBlockItem(InitFurnitureBlocks.SPRUCE_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> JUNGLE_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_jungle_fancy_bed", () -> new FuelBlockItem(InitFurnitureBlocks.JUNGLE_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> DARK_OAK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_dark_oak_fancy_bed", () -> new FuelBlockItem(InitFurnitureBlocks.DARK_OAK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> ACACIA_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_acacia_fancy_bed", () -> new FuelBlockItem(InitFurnitureBlocks.ACACIA_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> WARPED_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_warped_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.WARPED_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CRIMSON_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, FURNITURE_ITEM_REGISTRY.register(type.getSerializedName() + "_crimson_fancy_bed", () -> new BlockItem(InitFurnitureBlocks.CRIMSON_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        FURNITURE_ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}