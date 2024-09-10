package tv.mapper.embellishcraft.building.world.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.tuple.Pair;
import tv.mapper.embellishcraft.building.world.level.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.McWoods;
import tv.mapper.mapperbase.world.item.FuelBlockItem;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class InitBuildingItems
{
    public static final DeferredRegister<Item> BUILDING_ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    // Other bricks
    public static final RegistryObject<Item> DARK_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.register("dark_bricks", () -> new BlockItem(InitBuildingBlocks.DARK_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("dark_bricks_stairs", () -> new BlockItem(InitBuildingBlocks.DARK_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("dark_bricks_slab", () -> new BlockItem(InitBuildingBlocks.DARK_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("dark_bricks_wall", () -> new BlockItem(InitBuildingBlocks.DARK_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("dark_bricks_pressure_plate", () -> new BlockItem(InitBuildingBlocks.DARK_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DARK_LARGE_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.register("dark_large_bricks", () -> new BlockItem(InitBuildingBlocks.DARK_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("dark_large_bricks_stairs", () -> new BlockItem(InitBuildingBlocks.DARK_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("dark_large_bricks_slab", () -> new BlockItem(InitBuildingBlocks.DARK_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("dark_large_bricks_wall", () -> new BlockItem(InitBuildingBlocks.DARK_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_LARGE_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("dark_large_bricks_pressure_plate", () -> new BlockItem(InitBuildingBlocks.DARK_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OLD_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.register("old_bricks", () -> new BlockItem(InitBuildingBlocks.OLD_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("old_bricks_stairs", () -> new BlockItem(InitBuildingBlocks.OLD_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("old_bricks_slab", () -> new BlockItem(InitBuildingBlocks.OLD_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("old_bricks_wall", () -> new BlockItem(InitBuildingBlocks.OLD_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("old_bricks_pressure_plate", () -> new BlockItem(InitBuildingBlocks.OLD_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OLD_LARGE_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.register("old_large_bricks", () -> new BlockItem(InitBuildingBlocks.OLD_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("old_large_bricks_stairs", () -> new BlockItem(InitBuildingBlocks.OLD_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("old_large_bricks_slab", () -> new BlockItem(InitBuildingBlocks.OLD_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("old_large_bricks_wall", () -> new BlockItem(InitBuildingBlocks.OLD_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_LARGE_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("old_large_bricks_pressure_plate", () -> new BlockItem(InitBuildingBlocks.OLD_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WEARED_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.register("weared_bricks", () -> new BlockItem(InitBuildingBlocks.WEARED_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEARED_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("weared_bricks_stairs", () -> new BlockItem(InitBuildingBlocks.WEARED_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEARED_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("weared_bricks_slab", () -> new BlockItem(InitBuildingBlocks.WEARED_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEARED_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("weared_bricks_wall", () -> new BlockItem(InitBuildingBlocks.WEARED_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEARED_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("weared_bricks_pressure_plate", () -> new BlockItem(InitBuildingBlocks.WEARED_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_ITEM = BUILDING_ITEM_REGISTRY.register("weared_large_bricks", () -> new BlockItem(InitBuildingBlocks.WEARED_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("weared_large_bricks_stairs", () -> new BlockItem(InitBuildingBlocks.WEARED_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("weared_large_bricks_slab", () -> new BlockItem(InitBuildingBlocks.WEARED_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("weared_large_bricks_wall", () -> new BlockItem(InitBuildingBlocks.WEARED_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEARED_LARGE_BRICKS_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("weared_large_bricks_pressure_plate", () -> new BlockItem(InitBuildingBlocks.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    // Pavings
    public static final RegistryObject<Item> CONCRETE_PAVING_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_paving", () -> new BlockItem(InitBuildingBlocks.CONCRETE_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONCRETE_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_paving_stairs", () -> new BlockItem(InitBuildingBlocks.CONCRETE_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONCRETE_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_paving_slab", () -> new BlockItem(InitBuildingBlocks.CONCRETE_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONCRETE_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_paving_wall", () -> new BlockItem(InitBuildingBlocks.CONCRETE_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONCRETE_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_paving_pressure_plate", () -> new BlockItem(InitBuildingBlocks.CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DAMAGED_PAVING_ITEM = BUILDING_ITEM_REGISTRY.register("damaged_paving", () -> new BlockItem(InitBuildingBlocks.DAMAGED_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<Item> DAMAGED_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("damaged_paving_stairs", () -> new BlockItem(InitBuildingBlocks.DAMAGED_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DAMAGED_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("damaged_paving_slab", () -> new BlockItem(InitBuildingBlocks.DAMAGED_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DAMAGED_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("damaged_paving_wall", () -> new BlockItem(InitBuildingBlocks.DAMAGED_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DAMAGED_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("damaged_paving_pressure_plate", () -> new BlockItem(InitBuildingBlocks.DAMAGED_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_ITEM = BUILDING_ITEM_REGISTRY.register("dark_concrete_paving", () -> new BlockItem(InitBuildingBlocks.DARK_CONCRETE_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("dark_concrete_paving_stairs", () -> new BlockItem(InitBuildingBlocks.DARK_CONCRETE_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("dark_concrete_paving_slab", () -> new BlockItem(InitBuildingBlocks.DARK_CONCRETE_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("dark_concrete_paving_wall", () -> new BlockItem(InitBuildingBlocks.DARK_CONCRETE_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_CONCRETE_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("dark_concrete_paving_pressure_plate", () -> new BlockItem(InitBuildingBlocks.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MOIST_PAVING_ITEM = BUILDING_ITEM_REGISTRY.register("moist_paving", () -> new BlockItem(InitBuildingBlocks.MOIST_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOIST_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("moist_paving_stairs", () -> new BlockItem(InitBuildingBlocks.MOIST_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOIST_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("moist_paving_slab", () -> new BlockItem(InitBuildingBlocks.MOIST_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOIST_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("moist_paving_wall", () -> new BlockItem(InitBuildingBlocks.MOIST_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOIST_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("moist_paving_pressure_plate", () -> new BlockItem(InitBuildingBlocks.MOIST_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> POLISHED_PAVING_ITEM = BUILDING_ITEM_REGISTRY.register("polished_paving", () -> new BlockItem(InitBuildingBlocks.POLISHED_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("polished_paving_stairs", () -> new BlockItem(InitBuildingBlocks.POLISHED_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("polished_paving_slab", () -> new BlockItem(InitBuildingBlocks.POLISHED_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("polished_paving_wall", () -> new BlockItem(InitBuildingBlocks.POLISHED_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("polished_paving_pressure_plate", () -> new BlockItem(InitBuildingBlocks.POLISHED_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_ITEM = BUILDING_ITEM_REGISTRY.register("white_concrete_paving", () -> new BlockItem(InitBuildingBlocks.WHITE_CONCRETE_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("white_concrete_paving_stairs", () -> new BlockItem(InitBuildingBlocks.WHITE_CONCRETE_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("white_concrete_paving_slab", () -> new BlockItem(InitBuildingBlocks.WHITE_CONCRETE_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("white_concrete_paving_wall", () -> new BlockItem(InitBuildingBlocks.WHITE_CONCRETE_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CONCRETE_PAVING_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("white_concrete_paving_pressure_plate", () -> new BlockItem(InitBuildingBlocks.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    // Tiles
    public static final RegistryObject<Item> CONCRETE_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_tiles", () -> new BlockItem(InitBuildingBlocks.CONCRETE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONCRETE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.CONCRETE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONCRETE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_tiles_slab", () -> new BlockItem(InitBuildingBlocks.CONCRETE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONCRETE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_tiles_wall", () -> new BlockItem(InitBuildingBlocks.CONCRETE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONCRETE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("concrete_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.CONCRETE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> SKYBLUE_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("skyblue_tiles", () -> new BlockItem(InitBuildingBlocks.SKYBLUE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYBLUE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("skyblue_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.SKYBLUE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYBLUE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("skyblue_tiles_slab", () -> new BlockItem(InitBuildingBlocks.SKYBLUE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYBLUE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("skyblue_tiles_wall", () -> new BlockItem(InitBuildingBlocks.SKYBLUE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYBLUE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("skyblue_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.SKYBLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ORANGE_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("orange_tiles", () -> new BlockItem(InitBuildingBlocks.ORANGE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("orange_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.ORANGE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("orange_tiles_slab", () -> new BlockItem(InitBuildingBlocks.ORANGE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("orange_tiles_wall", () -> new BlockItem(InitBuildingBlocks.ORANGE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("orange_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.ORANGE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BLUE_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("blue_tiles", () -> new BlockItem(InitBuildingBlocks.BLUE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("blue_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.BLUE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("blue_tiles_slab", () -> new BlockItem(InitBuildingBlocks.BLUE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("blue_tiles_wall", () -> new BlockItem(InitBuildingBlocks.BLUE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("blue_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.BLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> LIGHT_BLUE_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("light_blue_tiles", () -> new BlockItem(InitBuildingBlocks.LIGHT_BLUE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("light_blue_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.LIGHT_BLUE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("light_blue_tiles_slab", () -> new BlockItem(InitBuildingBlocks.LIGHT_BLUE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("light_blue_tiles_wall", () -> new BlockItem(InitBuildingBlocks.LIGHT_BLUE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("light_blue_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.LIGHT_BLUE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> RED_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("red_tiles", () -> new BlockItem(InitBuildingBlocks.RED_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("red_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.RED_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("red_tiles_slab", () -> new BlockItem(InitBuildingBlocks.RED_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("red_tiles_wall", () -> new BlockItem(InitBuildingBlocks.RED_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("red_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.RED_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITE_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("white_tiles", () -> new BlockItem(InitBuildingBlocks.WHITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("white_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.WHITE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("white_tiles_slab", () -> new BlockItem(InitBuildingBlocks.WHITE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("white_tiles_wall", () -> new BlockItem(InitBuildingBlocks.WHITE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("white_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.WHITE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> YELLOW_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_tiles", () -> new BlockItem(InitBuildingBlocks.YELLOW_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.YELLOW_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_tiles_slab", () -> new BlockItem(InitBuildingBlocks.YELLOW_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_tiles_wall", () -> new BlockItem(InitBuildingBlocks.YELLOW_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.YELLOW_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> YELLOW_GREY_TILES_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_grey_tiles", () -> new BlockItem(InitBuildingBlocks.YELLOW_GREY_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_grey_tiles_stairs", () -> new BlockItem(InitBuildingBlocks.YELLOW_GREY_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_grey_tiles_slab", () -> new BlockItem(InitBuildingBlocks.YELLOW_GREY_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_WALL_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_grey_tiles_wall", () -> new BlockItem(InitBuildingBlocks.YELLOW_GREY_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_GREY_TILES_PRESSURE_PLATE_ITEM = BUILDING_ITEM_REGISTRY.register("yellow_grey_tiles_pressure_plate", () -> new BlockItem(InitBuildingBlocks.YELLOW_GREY_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    // Wallpaper
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.register("white_blue_wallpaper", () -> new BlockItem(InitBuildingBlocks.WHITE_BLUE_WALLPAPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("white_blue_wallpaper_stairs", () -> new BlockItem(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("white_blue_wallpaper_slab", () -> new BlockItem(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_BLUE_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.register("white_blue_wallpaper_plinth", () -> new BlockItem(InitBuildingBlocks.WHITE_BLUE_WALLPAPER_PLINTH.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.register("beige_flower_wallpaper", () -> new BlockItem(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("beige_flower_wallpaper_stairs", () -> new BlockItem(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("beige_flower_wallpaper_slab", () -> new BlockItem(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEIGE_FLOWER_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.register("beige_flower_wallpaper_plinth", () -> new BlockItem(InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_PLINTH.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEIGE_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.register("beige_wallpaper", () -> new BlockItem(InitBuildingBlocks.BEIGE_WALLPAPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("beige_wallpaper_stairs", () -> new BlockItem(InitBuildingBlocks.BEIGE_WALLPAPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("beige_wallpaper_slab", () -> new BlockItem(InitBuildingBlocks.BEIGE_WALLPAPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.register("beige_wallpaper_plinth", () -> new BlockItem(InitBuildingBlocks.BEIGE_WALLPAPER_PLINTH.get(), new Item.Properties()));

    public static final RegistryObject<Item> PINK_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.register("pink_wallpaper", () -> new BlockItem(InitBuildingBlocks.PINK_WALLPAPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("pink_wallpaper_stairs", () -> new BlockItem(InitBuildingBlocks.PINK_WALLPAPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("pink_wallpaper_slab", () -> new BlockItem(InitBuildingBlocks.PINK_WALLPAPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.register("pink_wallpaper_plinth", () -> new BlockItem(InitBuildingBlocks.PINK_WALLPAPER_PLINTH.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_ITEM = BUILDING_ITEM_REGISTRY.register("white_green_wallpaper", () -> new BlockItem(InitBuildingBlocks.WHITE_GREEN_WALLPAPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_STAIRS_ITEM = BUILDING_ITEM_REGISTRY.register("white_green_wallpaper_stairs", () -> new BlockItem(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_SLAB_ITEM = BUILDING_ITEM_REGISTRY.register("white_green_wallpaper_slab", () -> new BlockItem(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_GREEN_WALLPAPER_PLINTH_ITEM = BUILDING_ITEM_REGISTRY.register("white_green_wallpaper_plinth", () -> new BlockItem(InitBuildingBlocks.WHITE_GREEN_WALLPAPER_PLINTH.get(), new Item.Properties()));

    // Stairs
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> SUSPENDED_STAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.register(type.getSerializedName() + "_suspended_stairs", () -> new FuelBlockItem(InitBuildingBlocks.SUSPENDED_STAIRS_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.suspendedStairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> LARGE_SUSPENDED_STAIRS_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.register(type.getSerializedName() + "_large_suspended_stairs", () -> new FuelBlockItem(InitBuildingBlocks.LARGE_SUSPENDED_STAIRS_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.largeSuspendedStairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Doors
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> FANCY_DOOR_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.register(type.getSerializedName() + "_fancy_door", () -> new FuelBlockItem(InitBuildingBlocks.FANCY_DOOR_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.doorBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<McWoods, RegistryObject<FuelBlockItem>> PLAIN_DOOR_ITEMS = Arrays.stream(McWoods.values()).map(type -> Pair.of(type, BUILDING_ITEM_REGISTRY.register(type.getSerializedName() + "_plain_door", () -> new FuelBlockItem(InitBuildingBlocks.PLAIN_DOOR_BLOCKS.get(type).get(), new Item.Properties(), ECConstants.doorBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        BUILDING_ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}