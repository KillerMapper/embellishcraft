package tv.mapper.embellishcraft.rocks.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import tv.mapper.embellishcraft.core.data.gen.recipe.ECStonecutterRecipes;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;

public class RockStoneCutter extends ECStonecutterRecipes
{
    public RockStoneCutter(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            basicRecipes(consumer, InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)).get(), 2).unlockedBy("has_" + RockType.byId(j).getName(), has(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, RockType.byId(j).getName() + "_button_from_" + RockType.byId(j).getName() + "_stonecutting");
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getName(), has(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, RockType.byId(j).getName() + "_ornament_from_" + RockType.byId(j).getName() + "_stonecutting");

            basicRecipes(consumer, InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get());

            basicRecipes(consumer, InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get());

            basicRecipes(consumer, InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get()).unlockedBy("has_smooth_" + RockType.byId(j).getName(), has(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, RockType.byId(j).getName() + "_ornament_from_smooth_" + RockType.byId(j).getName() + "_stonecutting");

            basicRecipes(consumer, InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get());
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), 2).unlockedBy("has_polished_" + RockType.byId(j).getName(), has(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, RockType.byId(j).getName() + "_ornament_from_polished_" + RockType.byId(j).getName() + "_stonecutting");

            basicRecipes(consumer, InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get());
            basicRecipes(consumer, InitRockBlocks.ROCK_TILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get());
            basicRecipes(consumer, InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get());
            basicRecipes(consumer, InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get());

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get(), 2).unlockedBy("has_" + RockType.byId(j).getName() + "_ornament", has(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get())).save(consumer, RockType.byId(j).getName() + "_ornament_pressure_plate_from_" + RockType.byId(j).getName() + "_stonecutting");

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), 2).unlockedBy("has_" + RockType.byId(j).getName(), has(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, RockType.byId(j).getName() + "_rooftiles_from_" + RockType.byId(j).getName() + "_stonecutting");
            basicRecipes(consumer, InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), null, null);
        }

        // Andesite
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_BUTTON.get(), 2).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer, "andesite_button_from_andesite_stonecutting");

        basicRecipes(consumer, InitRockBlocks.SMOOTH_ANDESITE.get(), InitRockBlocks.SMOOTH_ANDESITE_SLAB.get(), InitRockBlocks.SMOOTH_ANDESITE_STAIRS.get(), InitRockBlocks.SMOOTH_ANDESITE_WALL.get(), InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.ANDESITE_PAVING.get(), InitRockBlocks.ANDESITE_PAVING_SLAB.get(), InitRockBlocks.ANDESITE_PAVING_STAIRS.get(), InitRockBlocks.ANDESITE_PAVING_WALL.get(), InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.ANDESITE_TILES.get(), InitRockBlocks.ANDESITE_TILES_SLAB.get(), InitRockBlocks.ANDESITE_TILES_STAIRS.get(), InitRockBlocks.ANDESITE_TILES_WALL.get(), InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.ANDESITE_BRICKS.get(), InitRockBlocks.ANDESITE_BRICKS_SLAB.get(), InitRockBlocks.ANDESITE_BRICKS_STAIRS.get(), InitRockBlocks.ANDESITE_BRICKS_WALL.get(), InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.ANDESITE_LARGE_BRICKS.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_ORNAMENT.get()).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer, "andesite_ornament_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.ANDESITE_ORNAMENT.get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE.get(), 2).unlockedBy("has_andesite_ornament", has(InitRockBlocks.ANDESITE_ORNAMENT.get())).save(consumer, "andesite_ornament_pressure_place_from_andesite_ornament_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_ROOFTILES.get(), 2).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer, "andesite_rooftiles_from_andesite_stonecutting");
        basicRecipes(consumer, InitRockBlocks.ANDESITE_ROOFTILES.get(), InitRockBlocks.ANDESITE_ROOFTILES_SLAB.get(), InitRockBlocks.ANDESITE_ROOFTILES_STAIRS.get(), null, null);

        // Diorite
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_BUTTON.get(), 2).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer, "diorite_button_from_diorite_stonecutting");

        basicRecipes(consumer, InitRockBlocks.SMOOTH_DIORITE.get(), InitRockBlocks.SMOOTH_DIORITE_SLAB.get(), InitRockBlocks.SMOOTH_DIORITE_STAIRS.get(), InitRockBlocks.SMOOTH_DIORITE_WALL.get(), InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.DIORITE_PAVING.get(), InitRockBlocks.DIORITE_PAVING_SLAB.get(), InitRockBlocks.DIORITE_PAVING_STAIRS.get(), InitRockBlocks.DIORITE_PAVING_WALL.get(), InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.DIORITE_TILES.get(), InitRockBlocks.DIORITE_TILES_SLAB.get(), InitRockBlocks.DIORITE_TILES_STAIRS.get(), InitRockBlocks.DIORITE_TILES_WALL.get(), InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.DIORITE_BRICKS.get(), InitRockBlocks.DIORITE_BRICKS_SLAB.get(), InitRockBlocks.DIORITE_BRICKS_STAIRS.get(), InitRockBlocks.DIORITE_BRICKS_WALL.get(), InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.DIORITE_LARGE_BRICKS.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_ORNAMENT.get()).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer, "diorite_ornament_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.DIORITE_ORNAMENT.get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE.get(), 2).unlockedBy("has_diorite_ornament", has(InitRockBlocks.DIORITE_ORNAMENT.get())).save(consumer, "diorite_ornament_pressure_place_from_diorite_ornament_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_ROOFTILES.get(), 2).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer, "diorite_rooftiles_from_diorite_stonecutting");
        basicRecipes(consumer, InitRockBlocks.DIORITE_ROOFTILES.get(), InitRockBlocks.DIORITE_ROOFTILES_SLAB.get(), InitRockBlocks.DIORITE_ROOFTILES_STAIRS.get(), null, null);

        // Granite
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_BUTTON.get(), 2).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer, "granite_button_from_granite_stonecutting");

        basicRecipes(consumer, InitRockBlocks.SMOOTH_GRANITE.get(), InitRockBlocks.SMOOTH_GRANITE_SLAB.get(), InitRockBlocks.SMOOTH_GRANITE_STAIRS.get(), InitRockBlocks.SMOOTH_GRANITE_WALL.get(), InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.GRANITE_PAVING.get(), InitRockBlocks.GRANITE_PAVING_SLAB.get(), InitRockBlocks.GRANITE_PAVING_STAIRS.get(), InitRockBlocks.GRANITE_PAVING_WALL.get(), InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.GRANITE_TILES.get(), InitRockBlocks.GRANITE_TILES_SLAB.get(), InitRockBlocks.GRANITE_TILES_STAIRS.get(), InitRockBlocks.GRANITE_TILES_WALL.get(), InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.GRANITE_BRICKS.get(), InitRockBlocks.GRANITE_BRICKS_SLAB.get(), InitRockBlocks.GRANITE_BRICKS_STAIRS.get(), InitRockBlocks.GRANITE_BRICKS_WALL.get(), InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.GRANITE_LARGE_BRICKS.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_ORNAMENT.get()).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer, "granite_ornament_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(InitRockBlocks.GRANITE_ORNAMENT.get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE.get(), 2).unlockedBy("has_granite_ornament", has(InitRockBlocks.GRANITE_ORNAMENT.get())).save(consumer, "granite_ornament_pressure_place_from_granite_ornament_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_ROOFTILES.get(), 2).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer, "granite_rooftiles_from_granite_stonecutting");
        basicRecipes(consumer, InitRockBlocks.GRANITE_ROOFTILES.get(), InitRockBlocks.GRANITE_ROOFTILES_SLAB.get(), InitRockBlocks.GRANITE_ROOFTILES_STAIRS.get(), null, null);

        // Sandstone
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_BUTTON.get(), 2).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer, "sandstone_button_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_SANDSTONE_WALL.get()).unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE)).save(consumer, "smooth_sandstone_wall_from_smooth_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.get(), 2).unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE)).save(consumer, "smooth_sandstone_pressure_plate_from_smooth_sandstone_stonecutting");

        basicRecipes(consumer, InitRockBlocks.POLISHED_SANDSTONE.get(), InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), InitRockBlocks.POLISHED_SANDSTONE_WALL.get(), InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.SANDSTONE_PAVING.get(), InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_WALL.get(), InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.SANDSTONE_TILES.get(), InitRockBlocks.SANDSTONE_TILES_SLAB.get(), InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.SANDSTONE_TILES_WALL.get(), InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.SANDSTONE_BRICKS.get(), InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_BRICKS_WALL.get(), InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL.get(), InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_ROOFTILES.get(), 2).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer, "sandstone_rooftiles_from_sandstone_stonecutting");
        basicRecipes(consumer, InitRockBlocks.SANDSTONE_ROOFTILES.get(), InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get(), InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get(), null, null);

        // Red Sandstone
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_BUTTON.get(), 2).unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE)).save(consumer, "red_sandstone_button_from_red_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL.get()).unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE)).save(consumer, "smooth_red_sandstone_wall_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get(), 2).unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE)).save(consumer, "smooth_red_sandstone_pressure_plate_from_smooth_red_sandstone_stonecutting");

        basicRecipes(consumer, InitRockBlocks.POLISHED_RED_SANDSTONE.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_WALL.get(), InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.RED_SANDSTONE_PAVING.get(), InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_WALL.get(), InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.RED_SANDSTONE_TILES.get(), InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_TILES_WALL.get(), InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.RED_SANDSTONE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_WALL.get(), InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_ROOFTILES.get(), 2).unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE)).save(consumer, "red_sandstone_rooftiles_from_red_sandstone_stonecutting");
        basicRecipes(consumer, InitRockBlocks.RED_SANDSTONE_ROOFTILES.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get(), null, null);

        // Terracotta
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.TERRACOTTA), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_BUTTON.get(), 2).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer, "terracotta_button_from_terracotta_stonecutting");
        basicRecipes(consumer, Blocks.TERRACOTTA, InitRockBlocks.TERRACOTTA_SLAB.get(), InitRockBlocks.TERRACOTTA_STAIRS.get(), InitRockBlocks.TERRACOTTA_WALL.get(), InitRockBlocks.TERRACOTTA_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.POLISHED_TERRACOTTA.get(), InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get(), InitRockBlocks.POLISHED_TERRACOTTA_STAIRS.get(), InitRockBlocks.POLISHED_TERRACOTTA_WALL.get(), InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.TERRACOTTA_PAVING.get(), InitRockBlocks.TERRACOTTA_PAVING_SLAB.get(), InitRockBlocks.TERRACOTTA_PAVING_STAIRS.get(), InitRockBlocks.TERRACOTTA_PAVING_WALL.get(), InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.TERRACOTTA_TILES.get(), InitRockBlocks.TERRACOTTA_TILES_SLAB.get(), InitRockBlocks.TERRACOTTA_TILES_STAIRS.get(), InitRockBlocks.TERRACOTTA_TILES_WALL.get(), InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.TERRACOTTA_BRICKS.get(), InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get(), InitRockBlocks.TERRACOTTA_BRICKS_STAIRS.get(), InitRockBlocks.TERRACOTTA_BRICKS_WALL.get(), InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE.get());
        basicRecipes(consumer, InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL.get(), InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.TERRACOTTA), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_ROOFTILES.get(), 2).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer, "terracotta_rooftiles_from_terracotta_stonecutting");
        basicRecipes(consumer, InitRockBlocks.TERRACOTTA_ROOFTILES.get(), InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get(), InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS.get(), null, null);
    }
}