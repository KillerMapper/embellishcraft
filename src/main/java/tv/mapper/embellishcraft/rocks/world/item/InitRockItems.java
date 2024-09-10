package tv.mapper.embellishcraft.rocks.world.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.tuple.Pair;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class InitRockItems
{
    public static final DeferredRegister<Item> ROCK_ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    // Rocks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName(), () -> new BlockItem(InitRockBlocks.ROCK_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_stairs", () -> new BlockItem(InitRockBlocks.ROCK_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_slab", () -> new BlockItem(InitRockBlocks.ROCK_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_wall", () -> new BlockItem(InitRockBlocks.ROCK_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BUTTONS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_button", () -> new BlockItem(InitRockBlocks.ROCK_BUTTONS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_COBBLESTONES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_stairs", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_slab", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_wall", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Cobblestones bricks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_COBBLESTONE_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks_stairs", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks_slab", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks_wall", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_cobblestone_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Smooth rocks
    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName(), () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName() + "_stairs", () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName() + "_slab", () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName() + "_wall", () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> SMOOTH_ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("smooth_" + type.getName() + "_pressure_plate", () -> new BlockItem(InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Polished rocks
    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName(), () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName() + "_stairs", () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName() + "_slab", () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName() + "_wall", () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> POLISHED_ROCK_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register("polished_" + type.getName() + "_pressure_plate", () -> new BlockItem(InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock pavings
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_PAVINGS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving", () -> new BlockItem(InitRockBlocks.ROCK_PAVINGS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stairs", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_slab", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_wall", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock tiles
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_TILES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles", () -> new BlockItem(InitRockBlocks.ROCK_TILES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles_stairs", () -> new BlockItem(InitRockBlocks.ROCK_TILES_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles_slab", () -> new BlockItem(InitRockBlocks.ROCK_TILES_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles_wall", () -> new BlockItem(InitRockBlocks.ROCK_TILES_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_TILES_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_tiles_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock bricks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks_stairs", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks_slab", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks_wall", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock large bricks
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_LARGE_BRICKS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks_stairs", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks_slab", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks_wall", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_LARGE_BRICKS_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_large_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock paving stones
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_PAVING_STONES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones_stairs", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones_slab", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_WALLS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones_wall", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_PAVING_STONES_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock ornaments
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ORNAMENTS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_ornament", () -> new BlockItem(InitRockBlocks.ROCK_ORNAMENTS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ORNAMENT_PRESSURE_PLATES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_ornament_pressure_plate", () -> new BlockItem(InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Rock rooftiles
    public static final Map<RockType, RegistryObject<BlockItem>> ROCKS_ROOFTILES_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_rooftiles", () -> new BlockItem(InitRockBlocks.ROCK_ROOFTILES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ROOFTILES_STAIRS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_rooftiles_stairs", () -> new BlockItem(InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<RockType, RegistryObject<BlockItem>> ROCK_ROOFTILES_SLABS_ITEMS = Arrays.stream(RockType.values()).map(type -> Pair.of(type, ROCK_ITEM_REGISTRY.register(type.getName() + "_rooftiles_slab", () -> new BlockItem(InitRockBlocks.ROCK_ROOFTILES_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // Paving stones
    public static final RegistryObject<BlockItem> PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones", () -> new BlockItem(InitRockBlocks.PAVING_STONES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones_stairs", () -> new BlockItem(InitRockBlocks.PAVING_STONES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones_slab", () -> new BlockItem(InitRockBlocks.PAVING_STONES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones_wall", () -> new BlockItem(InitRockBlocks.PAVING_STONES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties()));

    // Andesite
    public static final RegistryObject<BlockItem> SMOOTH_ANDESITE_ITEM = ROCK_ITEM_REGISTRY.register("smooth_andesite", () -> new BlockItem(InitRockBlocks.SMOOTH_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_ANDESITE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("smooth_andesite_stairs", () -> new BlockItem(InitRockBlocks.SMOOTH_ANDESITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_ANDESITE_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("smooth_andesite_slab", () -> new BlockItem(InitRockBlocks.SMOOTH_ANDESITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_ANDESITE_WALL_ITEM = ROCK_ITEM_REGISTRY.register("smooth_andesite_wall", () -> new BlockItem(InitRockBlocks.SMOOTH_ANDESITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_ANDESITE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("smooth_andesite_pressure_plate", () -> new BlockItem(InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.register("andesite_button", () -> new BlockItem(InitRockBlocks.ANDESITE_BUTTON.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ANDESITE_PAVING_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_stairs", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_slab", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_wall", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_pressure_plate", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ANDESITE_TILES_ITEM = ROCK_ITEM_REGISTRY.register("andesite_tiles", () -> new BlockItem(InitRockBlocks.ANDESITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("andesite_tiles_stairs", () -> new BlockItem(InitRockBlocks.ANDESITE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("andesite_tiles_slab", () -> new BlockItem(InitRockBlocks.ANDESITE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("andesite_tiles_wall", () -> new BlockItem(InitRockBlocks.ANDESITE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("andesite_tiles_pressure_plate", () -> new BlockItem(InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ANDESITE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("andesite_bricks", () -> new BlockItem(InitRockBlocks.ANDESITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("andesite_bricks_stairs", () -> new BlockItem(InitRockBlocks.ANDESITE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("andesite_bricks_slab", () -> new BlockItem(InitRockBlocks.ANDESITE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("andesite_bricks_wall", () -> new BlockItem(InitRockBlocks.ANDESITE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("andesite_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ANDESITE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("andesite_large_bricks", () -> new BlockItem(InitRockBlocks.ANDESITE_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("andesite_large_bricks_stairs", () -> new BlockItem(InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("andesite_large_bricks_slab", () -> new BlockItem(InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("andesite_large_bricks_wall", () -> new BlockItem(InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("andesite_large_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ANDESITE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_stones", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_STONES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_stones_stairs", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_stones_slab", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_STONES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_stones_wall", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_STONES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("andesite_paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ANDESITE_ORNAMENT_ITEM = ROCK_ITEM_REGISTRY.register("andesite_ornament", () -> new BlockItem(InitRockBlocks.ANDESITE_ORNAMENT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_ORNAMENT_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("andesite_ornament_pressure_plate", () -> new BlockItem(InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ANDESITE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.register("andesite_rooftiles", () -> new BlockItem(InitRockBlocks.ANDESITE_ROOFTILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("andesite_rooftiles_stairs", () -> new BlockItem(InitRockBlocks.ANDESITE_ROOFTILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ANDESITE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("andesite_rooftiles_slab", () -> new BlockItem(InitRockBlocks.ANDESITE_ROOFTILES_SLAB.get(), new Item.Properties()));

    // Diorite
    public static final RegistryObject<BlockItem> SMOOTH_DIORITE_ITEM = ROCK_ITEM_REGISTRY.register("smooth_diorite", () -> new BlockItem(InitRockBlocks.SMOOTH_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_DIORITE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("smooth_diorite_stairs", () -> new BlockItem(InitRockBlocks.SMOOTH_DIORITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_DIORITE_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("smooth_diorite_slab", () -> new BlockItem(InitRockBlocks.SMOOTH_DIORITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_DIORITE_WALL_ITEM = ROCK_ITEM_REGISTRY.register("smooth_diorite_wall", () -> new BlockItem(InitRockBlocks.SMOOTH_DIORITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_DIORITE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("smooth_diorite_pressure_plate", () -> new BlockItem(InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.register("diorite_button", () -> new BlockItem(InitRockBlocks.DIORITE_BUTTON.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DIORITE_PAVING_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_stairs", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_slab", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_wall", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_pressure_plate", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DIORITE_TILES_ITEM = ROCK_ITEM_REGISTRY.register("diorite_tiles", () -> new BlockItem(InitRockBlocks.DIORITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("diorite_tiles_stairs", () -> new BlockItem(InitRockBlocks.DIORITE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("diorite_tiles_slab", () -> new BlockItem(InitRockBlocks.DIORITE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("diorite_tiles_wall", () -> new BlockItem(InitRockBlocks.DIORITE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("diorite_tiles_pressure_plate", () -> new BlockItem(InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DIORITE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("diorite_bricks", () -> new BlockItem(InitRockBlocks.DIORITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("diorite_bricks_stairs", () -> new BlockItem(InitRockBlocks.DIORITE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("diorite_bricks_slab", () -> new BlockItem(InitRockBlocks.DIORITE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("diorite_bricks_wall", () -> new BlockItem(InitRockBlocks.DIORITE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("diorite_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DIORITE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("diorite_large_bricks", () -> new BlockItem(InitRockBlocks.DIORITE_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("diorite_large_bricks_stairs", () -> new BlockItem(InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("diorite_large_bricks_slab", () -> new BlockItem(InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("diorite_large_bricks_wall", () -> new BlockItem(InitRockBlocks.DIORITE_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("diorite_large_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DIORITE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_stones", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_STONES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_stones_stairs", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_STONES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_stones_slab", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_STONES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_stones_wall", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_STONES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("diorite_paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DIORITE_ORNAMENT_ITEM = ROCK_ITEM_REGISTRY.register("diorite_ornament", () -> new BlockItem(InitRockBlocks.DIORITE_ORNAMENT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_ORNAMENT_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("diorite_ornament_pressure_plate", () -> new BlockItem(InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DIORITE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.register("diorite_rooftiles", () -> new BlockItem(InitRockBlocks.DIORITE_ROOFTILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("diorite_rooftiles_stairs", () -> new BlockItem(InitRockBlocks.DIORITE_ROOFTILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DIORITE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("diorite_rooftiles_slab", () -> new BlockItem(InitRockBlocks.DIORITE_ROOFTILES_SLAB.get(), new Item.Properties()));

    // Granite
    public static final RegistryObject<BlockItem> SMOOTH_GRANITE_ITEM = ROCK_ITEM_REGISTRY.register("smooth_granite", () -> new BlockItem(InitRockBlocks.SMOOTH_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_GRANITE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("smooth_granite_stairs", () -> new BlockItem(InitRockBlocks.SMOOTH_GRANITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_GRANITE_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("smooth_granite_slab", () -> new BlockItem(InitRockBlocks.SMOOTH_GRANITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_GRANITE_WALL_ITEM = ROCK_ITEM_REGISTRY.register("smooth_granite_wall", () -> new BlockItem(InitRockBlocks.SMOOTH_GRANITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_GRANITE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("smooth_granite_pressure_plate", () -> new BlockItem(InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.register("granite_button", () -> new BlockItem(InitRockBlocks.GRANITE_BUTTON.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> GRANITE_PAVING_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_stairs", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_slab", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_wall", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_pressure_plate", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> GRANITE_TILES_ITEM = ROCK_ITEM_REGISTRY.register("granite_tiles", () -> new BlockItem(InitRockBlocks.GRANITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("granite_tiles_stairs", () -> new BlockItem(InitRockBlocks.GRANITE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("granite_tiles_slab", () -> new BlockItem(InitRockBlocks.GRANITE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("granite_tiles_wall", () -> new BlockItem(InitRockBlocks.GRANITE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("granite_tiles_pressure_plate", () -> new BlockItem(InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> GRANITE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("granite_bricks", () -> new BlockItem(InitRockBlocks.GRANITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("granite_bricks_stairs", () -> new BlockItem(InitRockBlocks.GRANITE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("granite_bricks_slab", () -> new BlockItem(InitRockBlocks.GRANITE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("granite_bricks_wall", () -> new BlockItem(InitRockBlocks.GRANITE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("granite_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> GRANITE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("granite_large_bricks", () -> new BlockItem(InitRockBlocks.GRANITE_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("granite_large_bricks_stairs", () -> new BlockItem(InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("granite_large_bricks_slab", () -> new BlockItem(InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("granite_large_bricks_wall", () -> new BlockItem(InitRockBlocks.GRANITE_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("granite_large_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> GRANITE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_stones", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_STONES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_stones_stairs", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_STONES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_stones_slab", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_STONES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_stones_wall", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_STONES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("granite_paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> GRANITE_ORNAMENT_ITEM = ROCK_ITEM_REGISTRY.register("granite_ornament", () -> new BlockItem(InitRockBlocks.GRANITE_ORNAMENT.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_ORNAMENT_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("granite_ornament_pressure_plate", () -> new BlockItem(InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> GRANITE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.register("granite_rooftiles", () -> new BlockItem(InitRockBlocks.GRANITE_ROOFTILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("granite_rooftiles_stairs", () -> new BlockItem(InitRockBlocks.GRANITE_ROOFTILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> GRANITE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("granite_rooftiles_slab", () -> new BlockItem(InitRockBlocks.GRANITE_ROOFTILES_SLAB.get(), new Item.Properties()));

    // Sandstone
    public static final RegistryObject<BlockItem> SANDSTONE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_button", () -> new BlockItem(InitRockBlocks.SANDSTONE_BUTTON.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> SMOOTH_SANDSTONE_WALL_ITEM = ROCK_ITEM_REGISTRY.register("smooth_sandstone_wall", () -> new BlockItem(InitRockBlocks.SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_SANDSTONE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("smooth_sandstone_pressure_plate", () -> new BlockItem(InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> POLISHED_SANDSTONE_ITEM = ROCK_ITEM_REGISTRY.register("polished_sandstone", () -> new BlockItem(InitRockBlocks.POLISHED_SANDSTONE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_SANDSTONE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("polished_sandstone_stairs", () -> new BlockItem(InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_SANDSTONE_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("polished_sandstone_slab", () -> new BlockItem(InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_SANDSTONE_WALL_ITEM = ROCK_ITEM_REGISTRY.register("polished_sandstone_wall", () -> new BlockItem(InitRockBlocks.POLISHED_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_SANDSTONE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("polished_sandstone_pressure_plate", () -> new BlockItem(InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_stairs", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_slab", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_wall", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_pressure_plate", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> SANDSTONE_TILES_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_tiles", () -> new BlockItem(InitRockBlocks.SANDSTONE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_tiles_stairs", () -> new BlockItem(InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_tiles_slab", () -> new BlockItem(InitRockBlocks.SANDSTONE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_tiles_wall", () -> new BlockItem(InitRockBlocks.SANDSTONE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_tiles_pressure_plate", () -> new BlockItem(InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> SANDSTONE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_bricks", () -> new BlockItem(InitRockBlocks.SANDSTONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_bricks_stairs", () -> new BlockItem(InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_bricks_slab", () -> new BlockItem(InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_bricks_wall", () -> new BlockItem(InitRockBlocks.SANDSTONE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> SANDSTONE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_large_bricks", () -> new BlockItem(InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_large_bricks_stairs", () -> new BlockItem(InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_large_bricks_slab", () -> new BlockItem(InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_large_bricks_wall", () -> new BlockItem(InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_large_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_stones", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_STONES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_stones_stairs", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_stones_slab", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_stones_wall", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_STONES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> SANDSTONE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_rooftiles", () -> new BlockItem(InitRockBlocks.SANDSTONE_ROOFTILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_rooftiles_stairs", () -> new BlockItem(InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SANDSTONE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("sandstone_rooftiles_slab", () -> new BlockItem(InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get(), new Item.Properties()));

    // Red Sandstone
    public static final RegistryObject<BlockItem> RED_SANDSTONE_BUTTON_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_button", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_BUTTON.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> SMOOTH_RED_SANDSTONE_WALL_ITEM = ROCK_ITEM_REGISTRY.register("smooth_red_sandstone_wall", () -> new BlockItem(InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SMOOTH_RED_SANDSTONE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("smooth_red_sandstone_pressure_plate", () -> new BlockItem(InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> POLISHED_RED_SANDSTONE_ITEM = ROCK_ITEM_REGISTRY.register("polished_red_sandstone", () -> new BlockItem(InitRockBlocks.POLISHED_RED_SANDSTONE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_RED_SANDSTONE_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("polished_red_sandstone_stairs", () -> new BlockItem(InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_RED_SANDSTONE_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("polished_red_sandstone_slab", () -> new BlockItem(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_RED_SANDSTONE_WALL_ITEM = ROCK_ITEM_REGISTRY.register("polished_red_sandstone_wall", () -> new BlockItem(InitRockBlocks.POLISHED_RED_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_RED_SANDSTONE_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("polished_red_sandstone_pressure_plate", () -> new BlockItem(InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_stairs", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_slab", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_wall", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_pressure_plate", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> RED_SANDSTONE_TILES_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_tiles", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_tiles_stairs", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_tiles_slab", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_tiles_wall", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_tiles_pressure_plate", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> RED_SANDSTONE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_bricks", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_bricks_stairs", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_bricks_slab", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_bricks_wall", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> RED_SANDSTONE_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_large_bricks", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_large_bricks_stairs", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_large_bricks_slab", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_large_bricks_wall", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_large_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_stones", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_stones_stairs", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_stones_slab", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_stones_wall", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> RED_SANDSTONE_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_rooftiles", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_ROOFTILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_rooftiles_stairs", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RED_SANDSTONE_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("red_sandstone_rooftiles_slab", () -> new BlockItem(InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get(), new Item.Properties()));

    // Terracotta
    public static final RegistryObject<BlockItem> TERRACOTTA_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_stairs", () -> new BlockItem(InitRockBlocks.TERRACOTTA_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_slab", () -> new BlockItem(InitRockBlocks.TERRACOTTA_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_WALL_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_wall", () -> new BlockItem(InitRockBlocks.TERRACOTTA_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_pressure_plate", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_BUTTON_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_button", () -> new BlockItem(InitRockBlocks.TERRACOTTA_BUTTON.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> POLISHED_TERRACOTTA_ITEM = ROCK_ITEM_REGISTRY.register("polished_terracotta", () -> new BlockItem(InitRockBlocks.POLISHED_TERRACOTTA.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_TERRACOTTA_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("polished_terracotta_stairs", () -> new BlockItem(InitRockBlocks.POLISHED_TERRACOTTA_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_TERRACOTTA_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("polished_terracotta_slab", () -> new BlockItem(InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_TERRACOTTA_WALL_ITEM = ROCK_ITEM_REGISTRY.register("polished_terracotta_wall", () -> new BlockItem(InitRockBlocks.POLISHED_TERRACOTTA_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_TERRACOTTA_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("polished_terracotta_pressure_plate", () -> new BlockItem(InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_stairs", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_slab", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_WALL_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_wall", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_pressure_plate", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TERRACOTTA_TILES_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_tiles", () -> new BlockItem(InitRockBlocks.TERRACOTTA_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_TILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_tiles_stairs", () -> new BlockItem(InitRockBlocks.TERRACOTTA_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_TILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_tiles_slab", () -> new BlockItem(InitRockBlocks.TERRACOTTA_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_TILES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_tiles_wall", () -> new BlockItem(InitRockBlocks.TERRACOTTA_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_TILES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_tiles_pressure_plate", () -> new BlockItem(InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TERRACOTTA_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_bricks", () -> new BlockItem(InitRockBlocks.TERRACOTTA_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_bricks_stairs", () -> new BlockItem(InitRockBlocks.TERRACOTTA_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_bricks_slab", () -> new BlockItem(InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_bricks_wall", () -> new BlockItem(InitRockBlocks.TERRACOTTA_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TERRACOTTA_LARGE_BRICKS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_large_bricks", () -> new BlockItem(InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_LARGE_BRICKS_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_large_bricks_stairs", () -> new BlockItem(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_LARGE_BRICKS_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_large_bricks_slab", () -> new BlockItem(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_LARGE_BRICKS_WALL_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_large_bricks_wall", () -> new BlockItem(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_large_bricks_pressure_plate", () -> new BlockItem(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_STONES_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_stones", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_STONES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_STONES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_stones_stairs", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_STONES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_stones_slab", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_STONES_WALL_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_stones_wall", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_PAVING_STONES_PRESSURE_PLATE_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_paving_stones_pressure_plate", () -> new BlockItem(InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TERRACOTTA_ROOFTILES_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_rooftiles", () -> new BlockItem(InitRockBlocks.TERRACOTTA_ROOFTILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_ROOFTILES_STAIRS_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_rooftiles_stairs", () -> new BlockItem(InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TERRACOTTA_ROOFTILES_SLAB_ITEM = ROCK_ITEM_REGISTRY.register("terracotta_rooftiles_slab", () -> new BlockItem(InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get(), new Item.Properties()));

    public static void init()
    {
        ROCK_ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}