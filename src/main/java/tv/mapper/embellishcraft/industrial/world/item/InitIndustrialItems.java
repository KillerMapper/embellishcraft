package tv.mapper.embellishcraft.industrial.world.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.tuple.Pair;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.industrial.world.level.block.InitIndustrialBlocks;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class InitIndustrialItems
{
    public static final DeferredRegister<Item> INDUSTRIAL_ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate", () -> new BlockItem(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_STAIRS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_stairs", () -> new BlockItem(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_STAIRS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_SLABS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_slab", () -> new BlockItem(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_SLABS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_WALLS_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_wall", () -> new BlockItem(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_WALLS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_PRESSURE_PLATES_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_pressure_plate", () -> new BlockItem(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_PRESSURE_PLATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_FENCE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_fence", () -> new BlockItem(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> CORRUGATED_METAL_PLATE_FENCE_GATE_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, INDUSTRIAL_ITEM_REGISTRY.register(type.getSerializedName() + "_corrugated_metal_plate_fence_gate", () -> new BlockItem(InitIndustrialBlocks.CORRUGATED_METAL_PLATE_FENCE_GATES.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final RegistryObject<Item> DARK_METAL_FLOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("dark_metal_floor", () -> new BlockItem(InitIndustrialBlocks.DARK_METAL_FLOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("dark_metal_floor_stairs", () -> new BlockItem(InitIndustrialBlocks.DARK_METAL_FLOOR_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_SLAB_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("dark_metal_floor_slab", () -> new BlockItem(InitIndustrialBlocks.DARK_METAL_FLOOR_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_WALL_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("dark_metal_floor_wall", () -> new BlockItem(InitIndustrialBlocks.DARK_METAL_FLOOR_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_METAL_FLOOR_PRESSURE_PLATE_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("dark_metal_floor_pressure_plate", () -> new BlockItem(InitIndustrialBlocks.DARK_METAL_FLOOR_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("light_metal_floor", () -> new BlockItem(InitIndustrialBlocks.LIGHT_METAL_FLOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("light_metal_floor_stairs", () -> new BlockItem(InitIndustrialBlocks.LIGHT_METAL_FLOOR_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_SLAB_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("light_metal_floor_slab", () -> new BlockItem(InitIndustrialBlocks.LIGHT_METAL_FLOOR_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_WALL_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("light_metal_floor_wall", () -> new BlockItem(InitIndustrialBlocks.LIGHT_METAL_FLOOR_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_METAL_FLOOR_PRESSURE_PLATE_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("light_metal_floor_pressure_plate", () -> new BlockItem(InitIndustrialBlocks.LIGHT_METAL_FLOOR_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_PLATE_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_plate", () -> new BlockItem(InitIndustrialBlocks.RUSTY_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_PLATE_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_plate_stairs", () -> new BlockItem(InitIndustrialBlocks.RUSTY_PLATE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_PLATE_SLAB_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_plate_slab", () -> new BlockItem(InitIndustrialBlocks.RUSTY_PLATE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_PLATE_WALL_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_plate_wall", () -> new BlockItem(InitIndustrialBlocks.RUSTY_PLATE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_PLATE_PRESSURE_PLATE_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_plate_pressure_plate", () -> new BlockItem(InitIndustrialBlocks.RUSTY_PLATE_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> IRON_BEAM_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("iron_beam", () -> new BlockItem(InitIndustrialBlocks.IRON_BEAM.get(), new Item.Properties()));
    public static final RegistryObject<Item> BOLTED_IRON_BEAM_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("bolted_iron_beam", () -> new BlockItem(InitIndustrialBlocks.BOLTED_IRON_BEAM.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_BEAM_JUNCTION_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("iron_beam_junction", () -> new BlockItem(InitIndustrialBlocks.IRON_BEAM_JUNCTION.get(), new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BEAM_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("steel_beam", () -> new BlockItem(InitIndustrialBlocks.STEEL_BEAM.get(), new Item.Properties()));
    public static final RegistryObject<Item> BOLTED_STEEL_BEAM_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("bolted_steel_beam", () -> new BlockItem(InitIndustrialBlocks.BOLTED_STEEL_BEAM.get(), new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BEAM_JUNCTION_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("steel_beam_junction", () -> new BlockItem(InitIndustrialBlocks.STEEL_BEAM_JUNCTION.get(), new Item.Properties()));

    public static final RegistryObject<Item> AIR_DUCT_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("air_duct", () -> new BlockItem(InitIndustrialBlocks.AIR_DUCT.get(), new Item.Properties()));
    public static final RegistryObject<Item> VENT_AIR_DUCT_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("vent_air_duct", () -> new BlockItem(InitIndustrialBlocks.VENT_AIR_DUCT.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRID_AIR_DUCT_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("grid_air_duct", () -> new BlockItem(InitIndustrialBlocks.GRID_AIR_DUCT.get(), new Item.Properties()));

    public static final RegistryObject<Item> BULKHEAD_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("bulkhead", () -> new BlockItem(InitIndustrialBlocks.BULKHEAD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BULKHEAD_TOP_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("bulkhead_top", () -> new BlockItem(InitIndustrialBlocks.BULKHEAD_TOP.get(), new Item.Properties()));

    public static final RegistryObject<Item> STEEL_WALL_LADDER_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("steel_wall_ladder", () -> new BlockItem(InitIndustrialBlocks.STEEL_WALL_LADDER.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_WALL_LADDER_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_wall_ladder", () -> new BlockItem(InitIndustrialBlocks.RUSTY_WALL_LADDER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STEEL_RUNGS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("steel_rungs", () -> new BlockItem(InitIndustrialBlocks.STEEL_RUNGS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_RUNGS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_rungs", () -> new BlockItem(InitIndustrialBlocks.RUSTY_RUNGS.get(), new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SUSPENDED_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("steel_suspended_stairs", () -> new BlockItem(InitIndustrialBlocks.STEEL_SUSPENDED_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_SUSPENDED_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_suspended_stairs", () -> new BlockItem(InitIndustrialBlocks.RUSTY_SUSPENDED_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LARGE_SUSPENDED_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("steel_large_suspended_stairs", () -> new BlockItem(InitIndustrialBlocks.STEEL_LARGE_SUSPENDED_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_LARGE_SUSPENDED_STAIRS_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_large_suspended_stairs", () -> new BlockItem(InitIndustrialBlocks.RUSTY_LARGE_SUSPENDED_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("steel_door", () -> new BlockItem(InitIndustrialBlocks.STEEL_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STURDY_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("sturdy_steel_door", () -> new BlockItem(InitIndustrialBlocks.STURDY_STEEL_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARNING_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("warning_steel_door", () -> new BlockItem(InitIndustrialBlocks.WARNING_STEEL_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("white_steel_door", () -> new BlockItem(InitIndustrialBlocks.WHITE_STEEL_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STURDY_WHITE_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("sturdy_white_steel_door", () -> new BlockItem(InitIndustrialBlocks.STURDY_WHITE_STEEL_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARNING_WHITE_STEEL_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("warning_white_steel_door", () -> new BlockItem(InitIndustrialBlocks.WARNING_WHITE_STEEL_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("rusty_door", () -> new BlockItem(InitIndustrialBlocks.RUSTY_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STURDY_RUSTY_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("sturdy_rusty_door", () -> new BlockItem(InitIndustrialBlocks.STURDY_RUSTY_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARNING_RUSTY_DOOR_ITEM = INDUSTRIAL_ITEM_REGISTRY.register("warning_rusty_door", () -> new BlockItem(InitIndustrialBlocks.WARNING_RUSTY_DOOR.get(), new Item.Properties()));

    public static void init()
    {
        INDUSTRIAL_ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}