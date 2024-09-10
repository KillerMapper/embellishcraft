package tv.mapper.embellishcraft.rocks.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.gen.recipe.ECRecipes;
import tv.mapper.embellishcraft.core.util.RockType;
import tv.mapper.embellishcraft.rocks.world.item.InitRockItems;
import tv.mapper.embellishcraft.rocks.world.level.block.InitRockBlocks;

public class RockRecipes extends ECRecipes
{

    public RockRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        for(int j = 0; j < Arrays.stream(RockType.values()).count(); j++)
        {
            // Rocks
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(InitRockItems.ROCKS_COBBLESTONES_ITEMS.get(RockType.byId(j)).get()), RecipeCategory.BUILDING_BLOCKS, InitRockItems.ROCKS_ITEMS.get(RockType.byId(j)).get(), 0.1f, 200).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_cobblestone", has(InitRockItems.ROCKS_COBBLESTONES_ITEMS.get(RockType.byId(j)).get())).save(consumer, ECConstants.MODID + ":" + RockType.byId(j).getSerializedName() + "_from_cobblestone_smelting");

            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BUTTONS.get(RockType.byId(j)).get());

            // Cobblestones
            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Cobblestone bricks
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_cobblestone", has(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_COBBLESTONE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_COBBLESTONE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Smooth rocks
            CreateBasicRecipes(consumer, InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.SMOOTH_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            SimpleCookingRecipeBuilder.smelting(Ingredient.of(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get()), RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get(), 0.1f, 200).unlockedBy("has_" + RockType.byId(j).getSerializedName(), has(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, ECConstants.MODID + ":smooth_" + RockType.byId(j).getSerializedName() + "_from_smelting");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()).requires(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_polished_" + RockType.byId(j).getSerializedName(), has(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer);

            // Polished rocks
            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()).requires(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_smooth_" + RockType.byId(j).getSerializedName(), has(InitRockBlocks.SMOOTH_ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.POLISHED_ROCK_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock pavings
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_polished_" + RockType.byId(j).getSerializedName(), has(InitRockBlocks.POLISHED_ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock tiles
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_TILES.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_paving", has(InitRockBlocks.ROCK_PAVINGS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_TILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_TILES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock bricks
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName(), has(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock large bricks
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_bricks", has(InitRockBlocks.ROCK_BRICKS.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_LARGE_BRICKS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_LARGE_BRICKS_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock paving stones
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_cobblestones", has(InitRockBlocks.ROCK_COBBLESTONES.get(RockType.byId(j)).get())).save(consumer);

            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_PAVING_STONES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_SLABS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_WALLS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_PAVING_STONES_PRESSURE_PLATES.get(RockType.byId(j)).get(), null);

            // Rock ornaments
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), 2).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get()).unlockedBy("has_smooth_" + RockType.byId(j).getSerializedName() + "_slab", has(InitRockBlocks.SMOOTH_ROCK_SLABS.get(RockType.byId(j)).get())).save(consumer, ECConstants.MODID + ":" + RockType.byId(j).getSerializedName() + "_ornament_from_smooth_slabs");
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get(), 2).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get()).unlockedBy("has_polished_" + RockType.byId(j).getSerializedName() + "_slab", has(InitRockBlocks.POLISHED_ROCK_SLABS.get(RockType.byId(j)).get())).save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ORNAMENT_PRESSURE_PLATES.get(RockType.byId(j)).get()).define('#', InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get()).pattern("##").unlockedBy("has_" + RockType.byId(j).getSerializedName() + "_ornament", has(InitRockBlocks.ROCK_ORNAMENTS.get(RockType.byId(j)).get())).save(consumer);

            // Rock rooftiles
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get()).unlockedBy("has_" + RockType.byId(j).getSerializedName(), has(InitRockBlocks.ROCK_BLOCKS.get(RockType.byId(j)).get())).save(consumer, ECConstants.MODID + ":" + RockType.byId(j).getSerializedName() + "_rooftiles_from_" + RockType.byId(j).getSerializedName());

            CreateBasicRecipes(consumer, InitRockBlocks.ROCK_ROOFTILES.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_ROOFTILES_STAIRS.get(RockType.byId(j)).get(), InitRockBlocks.ROCK_ROOFTILES_SLABS.get(RockType.byId(j)).get(), null, null, null);
        }

        // Paving stones
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.STONE).unlockedBy("has_stone", has(Blocks.STONE)).save(consumer);

        CreateBasicRecipes(consumer, InitRockBlocks.PAVING_STONES.get(), InitRockBlocks.PAVING_STONES_STAIRS.get(), InitRockBlocks.PAVING_STONES_SLAB.get(), InitRockBlocks.PAVING_STONES_WALL.get(), InitRockBlocks.PAVING_STONES_PRESSURE_PLATE.get(), null);

        // Andesite
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_BUTTON.get()).requires(Blocks.ANDESITE).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ANDESITE), RecipeCategory.BUILDING_BLOCKS, InitRockItems.SMOOTH_ANDESITE_ITEM.get(), 0.1f, 200).unlockedBy("has_andesite", has(Items.ANDESITE)).save(consumer, ECConstants.MODID + ":smooth_andesite_from_smelting");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_ANDESITE.get()).requires(Blocks.POLISHED_ANDESITE).unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.SMOOTH_ANDESITE.get(), InitRockBlocks.SMOOTH_ANDESITE_STAIRS.get(), InitRockBlocks.SMOOTH_ANDESITE_SLAB.get(), InitRockBlocks.SMOOTH_ANDESITE_WALL.get(), InitRockBlocks.SMOOTH_ANDESITE_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.POLISHED_ANDESITE).unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.ANDESITE_PAVING.get(), InitRockBlocks.ANDESITE_PAVING_STAIRS.get(), InitRockBlocks.ANDESITE_PAVING_SLAB.get(), InitRockBlocks.ANDESITE_PAVING_WALL.get(), InitRockBlocks.ANDESITE_PAVING_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.ANDESITE_PAVING.get()).unlockedBy("has_andesite_paving", has(InitRockBlocks.ANDESITE_PAVING.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.ANDESITE_TILES.get(), InitRockBlocks.ANDESITE_TILES_STAIRS.get(), InitRockBlocks.ANDESITE_TILES_SLAB.get(), InitRockBlocks.ANDESITE_TILES_WALL.get(), InitRockBlocks.ANDESITE_TILES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.SMOOTH_ANDESITE.get()).unlockedBy("has_smooth_andesite", has(InitRockBlocks.SMOOTH_ANDESITE.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.ANDESITE_BRICKS.get(), InitRockBlocks.ANDESITE_BRICKS_STAIRS.get(), InitRockBlocks.ANDESITE_BRICKS_SLAB.get(), InitRockBlocks.ANDESITE_BRICKS_WALL.get(), InitRockBlocks.ANDESITE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.ANDESITE_BRICKS.get()).unlockedBy("has_andesite_bricks", has(InitRockBlocks.ANDESITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.ANDESITE_LARGE_BRICKS.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.ANDESITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.ANDESITE_BRICKS.get()).unlockedBy("has_andesite_bricks", has(InitRockBlocks.ANDESITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.ANDESITE_PAVING_STONES.get(), InitRockBlocks.ANDESITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.ANDESITE_PAVING_STONES_SLAB.get(), InitRockBlocks.ANDESITE_PAVING_STONES_WALL.get(), InitRockBlocks.ANDESITE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.SMOOTH_ANDESITE_SLAB.get()).unlockedBy("has_smooth_andesite_slab", has(InitRockBlocks.SMOOTH_ANDESITE_SLAB.get())).save(consumer, ECConstants.MODID + ":andesite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.POLISHED_ANDESITE_SLAB).unlockedBy("has_polished_andesite_slab", has(Blocks.POLISHED_ANDESITE_SLAB)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_ORNAMENT_PRESSURE_PLATE.get()).define('#', InitRockBlocks.ANDESITE_ORNAMENT.get()).pattern("##").unlockedBy("has_andesite_ornament", has(InitRockBlocks.ANDESITE_ORNAMENT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.ANDESITE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.ANDESITE).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer, ECConstants.MODID + ":andesite_rooftiles_from_andesite");
        CreateBasicRecipes(consumer, InitRockBlocks.ANDESITE_ROOFTILES.get(), InitRockBlocks.ANDESITE_ROOFTILES_STAIRS.get(), InitRockBlocks.ANDESITE_ROOFTILES_SLAB.get(), null, null, null);

        // Diorite
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_BUTTON.get()).requires(Blocks.DIORITE).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DIORITE), RecipeCategory.BUILDING_BLOCKS, InitRockItems.SMOOTH_DIORITE_ITEM.get(), 0.1f, 200).unlockedBy("has_diorite", has(Items.DIORITE)).save(consumer, ECConstants.MODID + ":smooth_diorite_from_smelting");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_DIORITE.get()).requires(Blocks.POLISHED_DIORITE).unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.SMOOTH_DIORITE.get(), InitRockBlocks.SMOOTH_DIORITE_STAIRS.get(), InitRockBlocks.SMOOTH_DIORITE_SLAB.get(), InitRockBlocks.SMOOTH_DIORITE_WALL.get(), InitRockBlocks.SMOOTH_DIORITE_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.POLISHED_DIORITE).unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.DIORITE_PAVING.get(), InitRockBlocks.DIORITE_PAVING_STAIRS.get(), InitRockBlocks.DIORITE_PAVING_SLAB.get(), InitRockBlocks.DIORITE_PAVING_WALL.get(), InitRockBlocks.DIORITE_PAVING_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.DIORITE_PAVING.get()).unlockedBy("has_diorite_paving", has(InitRockBlocks.DIORITE_PAVING.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.DIORITE_TILES.get(), InitRockBlocks.DIORITE_TILES_STAIRS.get(), InitRockBlocks.DIORITE_TILES_SLAB.get(), InitRockBlocks.DIORITE_TILES_WALL.get(), InitRockBlocks.DIORITE_TILES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.SMOOTH_DIORITE.get()).unlockedBy("has_smooth_diorite", has(InitRockBlocks.SMOOTH_DIORITE.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.DIORITE_BRICKS.get(), InitRockBlocks.DIORITE_BRICKS_STAIRS.get(), InitRockBlocks.DIORITE_BRICKS_SLAB.get(), InitRockBlocks.DIORITE_BRICKS_WALL.get(), InitRockBlocks.DIORITE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.DIORITE_BRICKS.get()).unlockedBy("has_diorite_bricks", has(InitRockBlocks.DIORITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.DIORITE_LARGE_BRICKS.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.DIORITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.DIORITE_BRICKS.get()).unlockedBy("has_diorite_bricks", has(InitRockBlocks.DIORITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.DIORITE_PAVING_STONES.get(), InitRockBlocks.DIORITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.DIORITE_PAVING_STONES_SLAB.get(), InitRockBlocks.DIORITE_PAVING_STONES_WALL.get(), InitRockBlocks.DIORITE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.SMOOTH_DIORITE_SLAB.get()).unlockedBy("has_smooth_diorite_slab", has(InitRockBlocks.SMOOTH_DIORITE_SLAB.get())).save(consumer, ECConstants.MODID + ":diorite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.POLISHED_DIORITE_SLAB).unlockedBy("has_polished_diorite_slab", has(Blocks.POLISHED_DIORITE_SLAB)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_ORNAMENT_PRESSURE_PLATE.get()).define('#', InitRockBlocks.DIORITE_ORNAMENT.get()).pattern("##").unlockedBy("has_diorite_ornament", has(InitRockBlocks.DIORITE_ORNAMENT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.DIORITE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.DIORITE).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer, ECConstants.MODID + ":diorite_rooftiles_from_diorite");
        CreateBasicRecipes(consumer, InitRockBlocks.DIORITE_ROOFTILES.get(), InitRockBlocks.DIORITE_ROOFTILES_STAIRS.get(), InitRockBlocks.DIORITE_ROOFTILES_SLAB.get(), null, null, null);

        // Granite
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_BUTTON.get()).requires(Blocks.GRANITE).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.GRANITE), RecipeCategory.BUILDING_BLOCKS, InitRockItems.SMOOTH_GRANITE_ITEM.get(), 0.1f, 200).unlockedBy("has_granite", has(Items.GRANITE)).save(consumer, ECConstants.MODID + ":smooth_granite_from_smelting");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_GRANITE.get()).requires(Blocks.POLISHED_GRANITE).unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.SMOOTH_GRANITE.get(), InitRockBlocks.SMOOTH_GRANITE_STAIRS.get(), InitRockBlocks.SMOOTH_GRANITE_SLAB.get(), InitRockBlocks.SMOOTH_GRANITE_WALL.get(), InitRockBlocks.SMOOTH_GRANITE_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.POLISHED_GRANITE).unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.GRANITE_PAVING.get(), InitRockBlocks.GRANITE_PAVING_STAIRS.get(), InitRockBlocks.GRANITE_PAVING_SLAB.get(), InitRockBlocks.GRANITE_PAVING_WALL.get(), InitRockBlocks.GRANITE_PAVING_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.GRANITE_PAVING.get()).unlockedBy("has_granite_paving", has(InitRockBlocks.GRANITE_PAVING.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.GRANITE_TILES.get(), InitRockBlocks.GRANITE_TILES_STAIRS.get(), InitRockBlocks.GRANITE_TILES_SLAB.get(), InitRockBlocks.GRANITE_TILES_WALL.get(), InitRockBlocks.GRANITE_TILES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.SMOOTH_GRANITE.get()).unlockedBy("has_smooth_granite", has(InitRockBlocks.SMOOTH_GRANITE.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.GRANITE_BRICKS.get(), InitRockBlocks.GRANITE_BRICKS_STAIRS.get(), InitRockBlocks.GRANITE_BRICKS_SLAB.get(), InitRockBlocks.GRANITE_BRICKS_WALL.get(), InitRockBlocks.GRANITE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.GRANITE_BRICKS.get()).unlockedBy("has_granite_bricks", has(InitRockBlocks.GRANITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.GRANITE_LARGE_BRICKS.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_STAIRS.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_SLAB.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_WALL.get(), InitRockBlocks.GRANITE_LARGE_BRICKS_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.GRANITE_BRICKS.get()).unlockedBy("has_granite_bricks", has(InitRockBlocks.GRANITE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.GRANITE_PAVING_STONES.get(), InitRockBlocks.GRANITE_PAVING_STONES_STAIRS.get(), InitRockBlocks.GRANITE_PAVING_STONES_SLAB.get(), InitRockBlocks.GRANITE_PAVING_STONES_WALL.get(), InitRockBlocks.GRANITE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.SMOOTH_GRANITE_SLAB.get()).unlockedBy("has_smooth_granite_slab", has(InitRockBlocks.SMOOTH_GRANITE_SLAB.get())).save(consumer, ECConstants.MODID + ":granite_ornament_from_smooth_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_ORNAMENT.get()).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.POLISHED_GRANITE_SLAB).unlockedBy("has_polished_granite_slab", has(Blocks.POLISHED_GRANITE_SLAB)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_ORNAMENT_PRESSURE_PLATE.get()).define('#', InitRockBlocks.GRANITE_ORNAMENT.get()).pattern("##").unlockedBy("has_granite_ornament", has(InitRockBlocks.GRANITE_ORNAMENT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.GRANITE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.GRANITE).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer, ECConstants.MODID + ":granite_rooftiles_from_granite");
        CreateBasicRecipes(consumer, InitRockBlocks.GRANITE_ROOFTILES.get(), InitRockBlocks.GRANITE_ROOFTILES_STAIRS.get(), InitRockBlocks.GRANITE_ROOFTILES_SLAB.get(), null, null, null);

        // Sandstone
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_BUTTON.get()).requires(Blocks.SANDSTONE).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_SANDSTONE.get()).requires(Blocks.SMOOTH_SANDSTONE).unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_SANDSTONE_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.POLISHED_SANDSTONE.get()).unlockedBy("has_polished_sandstone", has(InitRockBlocks.POLISHED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_SANDSTONE.get()).pattern("i").pattern("i").define('i', InitRockBlocks.POLISHED_SANDSTONE_SLAB.get()).unlockedBy("has_polished_sandstone_slab", has(InitRockBlocks.POLISHED_SANDSTONE_SLAB.get())).save(consumer, ECConstants.MODID + ":polished_sandstone_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_SANDSTONE_STAIRS.get(), 4).define('#', InitRockBlocks.POLISHED_SANDSTONE.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_polished_sandstone", has(InitRockBlocks.POLISHED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_SANDSTONE_WALL.get(), 6).define('#', InitRockBlocks.POLISHED_SANDSTONE.get()).pattern("###").pattern("###").unlockedBy("has_polished_sandstone", has(InitRockBlocks.POLISHED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_SANDSTONE_PRESSURE_PLATE.get()).define('#', InitRockBlocks.POLISHED_SANDSTONE.get()).pattern("##").unlockedBy("has_polished_sandstone", has(InitRockBlocks.POLISHED_SANDSTONE.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_SANDSTONE).requires(InitRockBlocks.POLISHED_SANDSTONE.get()).unlockedBy("has_polished_sandstone", has(InitRockBlocks.POLISHED_SANDSTONE.get())).save(consumer, ECConstants.MODID + "smooth_sandstone_from_polished_sandstone");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_SANDSTONE).pattern("i").pattern("i").define('i', Blocks.SMOOTH_SANDSTONE_SLAB).unlockedBy("has_smooth_sandstone_slab", has(Blocks.SMOOTH_SANDSTONE_SLAB)).save(consumer, ECConstants.MODID + ":smooth_sandstone_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_SANDSTONE_WALL.get(), 6).define('#', Blocks.SMOOTH_SANDSTONE).pattern("###").pattern("###").unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.get()).define('#', Blocks.SMOOTH_SANDSTONE).pattern("##").unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.POLISHED_SANDSTONE.get()).unlockedBy("has_polished_sandstone", has(InitRockBlocks.POLISHED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_PAVING_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.SANDSTONE_PAVING.get()).unlockedBy("has_sandstone_paving", has(InitRockBlocks.SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_PAVING.get()).pattern("i").pattern("i").define('i', InitRockBlocks.SANDSTONE_PAVING_SLAB.get()).unlockedBy("has_sandstone_paving_slab", has(InitRockBlocks.SANDSTONE_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_paving_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_PAVING_STAIRS.get(), 4).define('#', InitRockBlocks.SANDSTONE_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_paving", has(InitRockBlocks.SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_PAVING_WALL.get(), 6).define('#', InitRockBlocks.SANDSTONE_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_sandstone_paving", has(InitRockBlocks.SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_PAVING_PRESSURE_PLATE.get()).define('#', InitRockBlocks.SANDSTONE_PAVING.get()).pattern("##").unlockedBy("has_sandstone_paving", has(InitRockBlocks.SANDSTONE_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.SANDSTONE_PAVING.get()).unlockedBy("has_sandstone_paving", has(InitRockBlocks.SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_TILES_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.SANDSTONE_TILES.get()).unlockedBy("has_sandstone_tiles", has(InitRockBlocks.SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_TILES.get()).pattern("i").pattern("i").define('i', InitRockBlocks.SANDSTONE_TILES_SLAB.get()).unlockedBy("has_sandstone_tiles_slab", has(InitRockBlocks.SANDSTONE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_TILES_STAIRS.get(), 4).define('#', InitRockBlocks.SANDSTONE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_tiles", has(InitRockBlocks.SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_TILES_WALL.get(), 6).define('#', InitRockBlocks.SANDSTONE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_sandstone_tiles", has(InitRockBlocks.SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_TILES_PRESSURE_PLATE.get()).define('#', InitRockBlocks.SANDSTONE_TILES.get()).pattern("##").unlockedBy("has_sandstone_tiles", has(InitRockBlocks.SANDSTONE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.CUT_SANDSTONE).unlockedBy("has_cut_sandstone", has(Blocks.CUT_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.SANDSTONE_BRICKS.get()).unlockedBy("has_sandstone_bricks", has(InitRockBlocks.SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_BRICKS.get()).pattern("i").pattern("i").define('i', InitRockBlocks.SANDSTONE_BRICKS_SLAB.get()).unlockedBy("has_sandstone_bricks_slab", has(InitRockBlocks.SANDSTONE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_BRICKS_STAIRS.get(), 4).define('#', InitRockBlocks.SANDSTONE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_bricks", has(InitRockBlocks.SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_BRICKS_WALL.get(), 6).define('#', InitRockBlocks.SANDSTONE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_sandstone_bricks", has(InitRockBlocks.SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_BRICKS_PRESSURE_PLATE.get()).define('#', InitRockBlocks.SANDSTONE_BRICKS.get()).pattern("##").unlockedBy("has_sandstone_bricks", has(InitRockBlocks.SANDSTONE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.SANDSTONE_BRICKS.get()).unlockedBy("has_sandstone_bricks", has(InitRockBlocks.SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.SANDSTONE_LARGE_BRICKS.get()).unlockedBy("has_sandstone_large_bricks", has(InitRockBlocks.SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get()).unlockedBy("has_sandstone_large_bricks_slab", has(InitRockBlocks.SANDSTONE_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_LARGE_BRICKS_STAIRS.get(), 4).define('#', InitRockBlocks.SANDSTONE_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_large_bricks", has(InitRockBlocks.SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_LARGE_BRICKS_WALL.get(), 6).define('#', InitRockBlocks.SANDSTONE_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_sandstone_large_bricks", has(InitRockBlocks.SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', InitRockBlocks.SANDSTONE_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_sandstone_large_bricks", has(InitRockBlocks.SANDSTONE_LARGE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.SANDSTONE_BRICKS.get()).unlockedBy("has_sandstone_bricks", has(InitRockBlocks.SANDSTONE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.SANDSTONE_PAVING_STONES.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_WALL.get(), InitRockBlocks.SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.SANDSTONE).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer, ECConstants.MODID + ":sandstone_rooftiles_from_sandstone");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.SANDSTONE_ROOFTILES.get()).unlockedBy("has_sandstone_rooftiles", has(InitRockBlocks.SANDSTONE_ROOFTILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_ROOFTILES.get()).pattern("i").pattern("i").define('i', InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get()).unlockedBy("has_sandstone_rooftiles_slab", has(InitRockBlocks.SANDSTONE_ROOFTILES_SLAB.get())).save(consumer, ECConstants.MODID + ":sandstone_rooftiles_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SANDSTONE_ROOFTILES_STAIRS.get(), 4).define('#', InitRockBlocks.SANDSTONE_ROOFTILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_sandstone_rooftiles", has(InitRockBlocks.SANDSTONE_ROOFTILES.get())).save(consumer);

        // Red Sandstone
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_BUTTON.get()).requires(Blocks.RED_SANDSTONE).unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_RED_SANDSTONE.get()).requires(Blocks.SMOOTH_RED_SANDSTONE).unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.POLISHED_RED_SANDSTONE.get()).unlockedBy("has_polished_red_sandstone", has(InitRockBlocks.POLISHED_RED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_RED_SANDSTONE.get()).pattern("i").pattern("i").define('i', InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get()).unlockedBy("has_polished_red_sandstone_slab", has(InitRockBlocks.POLISHED_RED_SANDSTONE_SLAB.get())).save(consumer, ECConstants.MODID + ":polished_red_sandstone_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), 4).define('#', InitRockBlocks.POLISHED_RED_SANDSTONE.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_polished_red_sandstone", has(InitRockBlocks.POLISHED_RED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_RED_SANDSTONE_WALL.get(), 6).define('#', InitRockBlocks.POLISHED_RED_SANDSTONE.get()).pattern("###").pattern("###").unlockedBy("has_polished_red_sandstone", has(InitRockBlocks.POLISHED_RED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_RED_SANDSTONE_PRESSURE_PLATE.get()).define('#', InitRockBlocks.POLISHED_RED_SANDSTONE.get()).pattern("##").unlockedBy("has_polished_red_sandstone", has(InitRockBlocks.POLISHED_RED_SANDSTONE.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_RED_SANDSTONE).requires(InitRockBlocks.POLISHED_RED_SANDSTONE.get()).unlockedBy("has_polished_red_sandstone", has(InitRockBlocks.POLISHED_RED_SANDSTONE.get())).save(consumer, ECConstants.MODID + "smooth_red_sandstone_from_polished_red_sandstone");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_RED_SANDSTONE).pattern("i").pattern("i").define('i', Blocks.SMOOTH_RED_SANDSTONE_SLAB).unlockedBy("has_smooth_red_sandstone_slab", has(Blocks.SMOOTH_RED_SANDSTONE_SLAB)).save(consumer, ECConstants.MODID + ":smooth_red_sandstone_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), 6).define('#', Blocks.SMOOTH_RED_SANDSTONE).pattern("###").pattern("###").unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get()).define('#', Blocks.SMOOTH_RED_SANDSTONE).pattern("##").unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.POLISHED_RED_SANDSTONE.get()).unlockedBy("has_polished_red_sandstone", has(InitRockBlocks.POLISHED_RED_SANDSTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.RED_SANDSTONE_PAVING.get()).unlockedBy("has_red_sandstone_paving", has(InitRockBlocks.RED_SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_PAVING.get()).pattern("i").pattern("i").define('i', InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get()).unlockedBy("has_red_sandstone_paving_slab", has(InitRockBlocks.RED_SANDSTONE_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_paving_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_PAVING_STAIRS.get(), 4).define('#', InitRockBlocks.RED_SANDSTONE_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_paving", has(InitRockBlocks.RED_SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_PAVING_WALL.get(), 6).define('#', InitRockBlocks.RED_SANDSTONE_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_red_sandstone_paving", has(InitRockBlocks.RED_SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_PAVING_PRESSURE_PLATE.get()).define('#', InitRockBlocks.RED_SANDSTONE_PAVING.get()).pattern("##").unlockedBy("has_red_sandstone_paving", has(InitRockBlocks.RED_SANDSTONE_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_TILES.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.RED_SANDSTONE_PAVING.get()).unlockedBy("has_red_sandstone_paving", has(InitRockBlocks.RED_SANDSTONE_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.RED_SANDSTONE_TILES.get()).unlockedBy("has_red_sandstone_tiles", has(InitRockBlocks.RED_SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_TILES.get()).pattern("i").pattern("i").define('i', InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get()).unlockedBy("has_red_sandstone_tiles_slab", has(InitRockBlocks.RED_SANDSTONE_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_TILES_STAIRS.get(), 4).define('#', InitRockBlocks.RED_SANDSTONE_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_tiles", has(InitRockBlocks.RED_SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_TILES_WALL.get(), 6).define('#', InitRockBlocks.RED_SANDSTONE_TILES.get()).pattern("###").pattern("###").unlockedBy("has_red_sandstone_tiles", has(InitRockBlocks.RED_SANDSTONE_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_TILES_PRESSURE_PLATE.get()).define('#', InitRockBlocks.RED_SANDSTONE_TILES.get()).pattern("##").unlockedBy("has_red_sandstone_tiles", has(InitRockBlocks.RED_SANDSTONE_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.CUT_RED_SANDSTONE).unlockedBy("has_cut_red_sandstone", has(Blocks.CUT_RED_SANDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.RED_SANDSTONE_BRICKS.get()).unlockedBy("has_red_sandstone_bricks", has(InitRockBlocks.RED_SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_BRICKS.get()).pattern("i").pattern("i").define('i', InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get()).unlockedBy("has_red_sandstone_bricks_slab", has(InitRockBlocks.RED_SANDSTONE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_BRICKS_STAIRS.get(), 4).define('#', InitRockBlocks.RED_SANDSTONE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_bricks", has(InitRockBlocks.RED_SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_BRICKS_WALL.get(), 6).define('#', InitRockBlocks.RED_SANDSTONE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_red_sandstone_bricks", has(InitRockBlocks.RED_SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_BRICKS_PRESSURE_PLATE.get()).define('#', InitRockBlocks.RED_SANDSTONE_BRICKS.get()).pattern("##").unlockedBy("has_red_sandstone_bricks", has(InitRockBlocks.RED_SANDSTONE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.RED_SANDSTONE_BRICKS.get()).unlockedBy("has_red_sandstone_bricks", has(InitRockBlocks.RED_SANDSTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get()).unlockedBy("has_red_sandstone_large_bricks", has(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get()).unlockedBy("has_red_sandstone_large_bricks_slab", has(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_STAIRS.get(), 4).define('#', InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_large_bricks", has(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_WALL.get(), 6).define('#', InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_red_sandstone_large_bricks", has(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_red_sandstone_large_bricks", has(InitRockBlocks.RED_SANDSTONE_LARGE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.RED_SANDSTONE_BRICKS.get()).unlockedBy("has_red_sandstone_bricks", has(InitRockBlocks.RED_SANDSTONE_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.RED_SANDSTONE_PAVING_STONES.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_STAIRS.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_SLAB.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_WALL.get(), InitRockBlocks.RED_SANDSTONE_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.RED_SANDSTONE).unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE)).save(consumer, ECConstants.MODID + ":red_sandstone_rooftiles_from_red_sandstone");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.RED_SANDSTONE_ROOFTILES.get()).unlockedBy("has_red_sandstone_rooftiles", has(InitRockBlocks.RED_SANDSTONE_ROOFTILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_ROOFTILES.get()).pattern("i").pattern("i").define('i', InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get()).unlockedBy("has_red_sandstone_rooftiles_slab", has(InitRockBlocks.RED_SANDSTONE_ROOFTILES_SLAB.get())).save(consumer, ECConstants.MODID + ":red_sandstone_rooftiles_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.RED_SANDSTONE_ROOFTILES_STAIRS.get(), 4).define('#', InitRockBlocks.RED_SANDSTONE_ROOFTILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_red_sandstone_rooftiles", has(InitRockBlocks.RED_SANDSTONE_ROOFTILES.get())).save(consumer);

        // Terracotta

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_SLAB.get(), 6).pattern("iii").define('i', Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA).pattern("i").pattern("i").define('i', InitRockBlocks.TERRACOTTA_SLAB.get()).unlockedBy("has_terracotta_slab", has(InitRockBlocks.TERRACOTTA_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_STAIRS.get(), 4).define('#', Blocks.TERRACOTTA).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_WALL.get(), 6).define('#', Blocks.TERRACOTTA).pattern("###").pattern("###").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_PRESSURE_PLATE.get()).define('#', Blocks.TERRACOTTA).pattern("##").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_BUTTON.get()).requires(Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_TERRACOTTA.get()).pattern("i").pattern("i").define('i', Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.POLISHED_TERRACOTTA.get()).unlockedBy("has_polished_terracotta", has(InitRockBlocks.POLISHED_TERRACOTTA.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_TERRACOTTA.get()).pattern("i").pattern("i").define('i', InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get()).unlockedBy("has_polished_terracotta_slab", has(InitRockBlocks.POLISHED_TERRACOTTA_SLAB.get())).save(consumer, ECConstants.MODID + ":polished_terracotta_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_TERRACOTTA_STAIRS.get(), 4).define('#', InitRockBlocks.POLISHED_TERRACOTTA.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_polished_terracotta", has(InitRockBlocks.POLISHED_TERRACOTTA.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_TERRACOTTA_WALL.get(), 6).define('#', InitRockBlocks.POLISHED_TERRACOTTA.get()).pattern("###").pattern("###").unlockedBy("has_polished_terracotta", has(InitRockBlocks.POLISHED_TERRACOTTA.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.POLISHED_TERRACOTTA_PRESSURE_PLATE.get()).define('#', InitRockBlocks.POLISHED_TERRACOTTA.get()).pattern("##").unlockedBy("has_polished_terracotta", has(InitRockBlocks.POLISHED_TERRACOTTA.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_PAVING.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.POLISHED_TERRACOTTA.get()).unlockedBy("has_polished_terracotta", has(InitRockBlocks.POLISHED_TERRACOTTA.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_PAVING_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.TERRACOTTA_PAVING.get()).unlockedBy("has_terracotta_paving", has(InitRockBlocks.TERRACOTTA_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_PAVING.get()).pattern("i").pattern("i").define('i', InitRockBlocks.TERRACOTTA_PAVING_SLAB.get()).unlockedBy("has_terracotta_paving_slab", has(InitRockBlocks.TERRACOTTA_PAVING_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_paving_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_PAVING_STAIRS.get(), 4).define('#', InitRockBlocks.TERRACOTTA_PAVING.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_paving", has(InitRockBlocks.TERRACOTTA_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_PAVING_WALL.get(), 6).define('#', InitRockBlocks.TERRACOTTA_PAVING.get()).pattern("###").pattern("###").unlockedBy("has_terracotta_paving", has(InitRockBlocks.TERRACOTTA_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_PAVING_PRESSURE_PLATE.get()).define('#', InitRockBlocks.TERRACOTTA_PAVING.get()).pattern("##").unlockedBy("has_terracotta_paving", has(InitRockBlocks.TERRACOTTA_PAVING.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_TILES.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.TERRACOTTA_PAVING.get()).unlockedBy("has_terracotta_paving", has(InitRockBlocks.TERRACOTTA_PAVING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_TILES_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.TERRACOTTA_TILES.get()).unlockedBy("has_terracotta_tiles", has(InitRockBlocks.TERRACOTTA_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_TILES.get()).pattern("i").pattern("i").define('i', InitRockBlocks.TERRACOTTA_TILES_SLAB.get()).unlockedBy("has_terracotta_tiles_slab", has(InitRockBlocks.TERRACOTTA_TILES_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_tiles_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_TILES_STAIRS.get(), 4).define('#', InitRockBlocks.TERRACOTTA_TILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_tiles", has(InitRockBlocks.TERRACOTTA_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_TILES_WALL.get(), 6).define('#', InitRockBlocks.TERRACOTTA_TILES.get()).pattern("###").pattern("###").unlockedBy("has_terracotta_tiles", has(InitRockBlocks.TERRACOTTA_TILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_TILES_PRESSURE_PLATE.get()).define('#', InitRockBlocks.TERRACOTTA_TILES.get()).pattern("##").unlockedBy("has_terracotta_tiles", has(InitRockBlocks.TERRACOTTA_TILES.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.TERRACOTTA_BRICKS.get()).unlockedBy("has_terracotta_bricks", has(InitRockBlocks.TERRACOTTA_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_BRICKS.get()).pattern("i").pattern("i").define('i', InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get()).unlockedBy("has_terracotta_bricks_slab", has(InitRockBlocks.TERRACOTTA_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_BRICKS_STAIRS.get(), 4).define('#', InitRockBlocks.TERRACOTTA_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_bricks", has(InitRockBlocks.TERRACOTTA_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_BRICKS_WALL.get(), 6).define('#', InitRockBlocks.TERRACOTTA_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_terracotta_bricks", has(InitRockBlocks.TERRACOTTA_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_BRICKS_PRESSURE_PLATE.get()).define('#', InitRockBlocks.TERRACOTTA_BRICKS.get()).pattern("##").unlockedBy("has_terracotta_bricks", has(InitRockBlocks.TERRACOTTA_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get(), 4).pattern("ii").pattern("ii").define('i', InitRockBlocks.TERRACOTTA_BRICKS.get()).unlockedBy("has_terracotta_bricks", has(InitRockBlocks.TERRACOTTA_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get()).unlockedBy("has_terracotta_large_bricks", has(InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get()).pattern("i").pattern("i").define('i', InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get()).unlockedBy("has_terracotta_large_bricks_slab", has(InitRockBlocks.TERRACOTTA_LARGE_BRICKS_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_large_bricks_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_LARGE_BRICKS_STAIRS.get(), 4).define('#', InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_large_bricks", has(InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_LARGE_BRICKS_WALL.get(), 6).define('#', InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get()).pattern("###").pattern("###").unlockedBy("has_terracotta_large_bricks", has(InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_LARGE_BRICKS_PRESSURE_PLATE.get()).define('#', InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get()).pattern("##").unlockedBy("has_terracotta_large_bricks", has(InitRockBlocks.TERRACOTTA_LARGE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_PAVING_STONES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', InitRockBlocks.TERRACOTTA_BRICKS.get()).unlockedBy("has_terracotta_bricks", has(InitRockBlocks.TERRACOTTA_BRICKS.get())).save(consumer);
        CreateBasicRecipes(consumer, InitRockBlocks.TERRACOTTA_PAVING_STONES.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_STAIRS.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_SLAB.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_WALL.get(), InitRockBlocks.TERRACOTTA_PAVING_STONES_PRESSURE_PLATE.get(), null);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_ROOFTILES.get(), 4).pattern(" i ").pattern("i i").pattern(" i ").define('i', Blocks.TERRACOTTA).unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer, ECConstants.MODID + ":terracotta_rooftiles_from_terracotta");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get(), 6).pattern("iii").define('i', InitRockBlocks.TERRACOTTA_ROOFTILES.get()).unlockedBy("has_terracotta_rooftiles", has(InitRockBlocks.TERRACOTTA_ROOFTILES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_ROOFTILES.get()).pattern("i").pattern("i").define('i', InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get()).unlockedBy("has_terracotta_rooftiles_slab", has(InitRockBlocks.TERRACOTTA_ROOFTILES_SLAB.get())).save(consumer, ECConstants.MODID + ":terracotta_rooftiles_from_slabs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, InitRockBlocks.TERRACOTTA_ROOFTILES_STAIRS.get(), 4).define('#', InitRockBlocks.TERRACOTTA_ROOFTILES.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_terracotta_rooftiles", has(InitRockBlocks.TERRACOTTA_ROOFTILES.get())).save(consumer);
    }
}