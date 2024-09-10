package tv.mapper.embellishcraft.building.data.gen.recipe;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import tv.mapper.embellishcraft.building.world.level.block.InitBuildingBlocks;
import tv.mapper.embellishcraft.core.data.gen.recipe.ECStonecutterRecipes;

public class BuildingStoneCutter extends ECStonecutterRecipes
{
    public BuildingStoneCutter(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Other bricks
        basicRecipes(consumer, InitBuildingBlocks.DARK_BRICKS.get(), InitBuildingBlocks.DARK_BRICKS_SLAB.get(), InitBuildingBlocks.DARK_BRICKS_STAIRS.get(), InitBuildingBlocks.DARK_BRICKS_WALL.get(), InitBuildingBlocks.DARK_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.DARK_LARGE_BRICKS.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.DARK_LARGE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.OLD_BRICKS.get(), InitBuildingBlocks.OLD_BRICKS_SLAB.get(), InitBuildingBlocks.OLD_BRICKS_STAIRS.get(), InitBuildingBlocks.OLD_BRICKS_WALL.get(), InitBuildingBlocks.OLD_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.OLD_LARGE_BRICKS.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.OLD_LARGE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.WEARED_BRICKS.get(), InitBuildingBlocks.WEARED_BRICKS_SLAB.get(), InitBuildingBlocks.WEARED_BRICKS_STAIRS.get(), InitBuildingBlocks.WEARED_BRICKS_WALL.get(), InitBuildingBlocks.WEARED_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.WEARED_LARGE_BRICKS.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_SLAB.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_STAIRS.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_WALL.get(), InitBuildingBlocks.WEARED_LARGE_BRICKS_PRESSURE_PLATE.get());

        // Pavings
        basicRecipes(consumer, InitBuildingBlocks.CONCRETE_PAVING.get(), InitBuildingBlocks.CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.CONCRETE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.DAMAGED_PAVING.get(), InitBuildingBlocks.DAMAGED_PAVING_SLAB.get(), InitBuildingBlocks.DAMAGED_PAVING_STAIRS.get(), InitBuildingBlocks.DAMAGED_PAVING_WALL.get(), InitBuildingBlocks.DAMAGED_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.DARK_CONCRETE_PAVING.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.DARK_CONCRETE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.MOIST_PAVING.get(), InitBuildingBlocks.MOIST_PAVING_SLAB.get(), InitBuildingBlocks.MOIST_PAVING_STAIRS.get(), InitBuildingBlocks.MOIST_PAVING_WALL.get(), InitBuildingBlocks.MOIST_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.POLISHED_PAVING.get(), InitBuildingBlocks.POLISHED_PAVING_SLAB.get(), InitBuildingBlocks.POLISHED_PAVING_STAIRS.get(), InitBuildingBlocks.POLISHED_PAVING_WALL.get(), InitBuildingBlocks.POLISHED_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.WHITE_CONCRETE_PAVING.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_SLAB.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_STAIRS.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_WALL.get(), InitBuildingBlocks.WHITE_CONCRETE_PAVING_PRESSURE_PLATE.get());

        // Tiles
        basicRecipes(consumer, InitBuildingBlocks.CONCRETE_TILES.get(), InitBuildingBlocks.CONCRETE_TILES_SLAB.get(), InitBuildingBlocks.CONCRETE_TILES_STAIRS.get(), InitBuildingBlocks.CONCRETE_TILES_WALL.get(), InitBuildingBlocks.CONCRETE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.SKYBLUE_TILES.get(), InitBuildingBlocks.SKYBLUE_TILES_SLAB.get(), InitBuildingBlocks.SKYBLUE_TILES_STAIRS.get(), InitBuildingBlocks.SKYBLUE_TILES_WALL.get(), InitBuildingBlocks.SKYBLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.ORANGE_TILES.get(), InitBuildingBlocks.ORANGE_TILES_SLAB.get(), InitBuildingBlocks.ORANGE_TILES_STAIRS.get(), InitBuildingBlocks.ORANGE_TILES_WALL.get(), InitBuildingBlocks.ORANGE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.BLUE_TILES.get(), InitBuildingBlocks.BLUE_TILES_SLAB.get(), InitBuildingBlocks.BLUE_TILES_STAIRS.get(), InitBuildingBlocks.BLUE_TILES_WALL.get(), InitBuildingBlocks.BLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.LIGHT_BLUE_TILES.get(), InitBuildingBlocks.LIGHT_BLUE_TILES_SLAB.get(), InitBuildingBlocks.LIGHT_BLUE_TILES_STAIRS.get(), InitBuildingBlocks.LIGHT_BLUE_TILES_WALL.get(), InitBuildingBlocks.LIGHT_BLUE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.RED_TILES.get(), InitBuildingBlocks.RED_TILES_SLAB.get(), InitBuildingBlocks.RED_TILES_STAIRS.get(), InitBuildingBlocks.RED_TILES_WALL.get(), InitBuildingBlocks.RED_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.WHITE_TILES.get(), InitBuildingBlocks.WHITE_TILES_SLAB.get(), InitBuildingBlocks.WHITE_TILES_STAIRS.get(), InitBuildingBlocks.WHITE_TILES_WALL.get(), InitBuildingBlocks.WHITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.YELLOW_TILES.get(), InitBuildingBlocks.YELLOW_TILES_SLAB.get(), InitBuildingBlocks.YELLOW_TILES_STAIRS.get(), InitBuildingBlocks.YELLOW_TILES_WALL.get(), InitBuildingBlocks.YELLOW_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitBuildingBlocks.YELLOW_GREY_TILES.get(), InitBuildingBlocks.YELLOW_GREY_TILES_SLAB.get(), InitBuildingBlocks.YELLOW_GREY_TILES_STAIRS.get(), InitBuildingBlocks.YELLOW_GREY_TILES_WALL.get(), InitBuildingBlocks.YELLOW_GREY_TILES_PRESSURE_PLATE.get());

        // Wallpapers
        basicRecipes(consumer, InitBuildingBlocks.WHITE_BLUE_WALLPAPER.get(), InitBuildingBlocks.WHITE_BLUE_WALLPAPER_SLAB.get(), InitBuildingBlocks.WHITE_BLUE_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER.get(), InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_SLAB.get(), InitBuildingBlocks.BEIGE_FLOWER_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, InitBuildingBlocks.BEIGE_WALLPAPER.get(), InitBuildingBlocks.BEIGE_WALLPAPER_SLAB.get(), InitBuildingBlocks.BEIGE_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, InitBuildingBlocks.PINK_WALLPAPER.get(), InitBuildingBlocks.PINK_WALLPAPER_SLAB.get(), InitBuildingBlocks.PINK_WALLPAPER_STAIRS.get(), null, null);
        basicRecipes(consumer, InitBuildingBlocks.WHITE_GREEN_WALLPAPER.get(), InitBuildingBlocks.WHITE_GREEN_WALLPAPER_SLAB.get(), InitBuildingBlocks.WHITE_GREEN_WALLPAPER_STAIRS.get(), null, null);

    }
}