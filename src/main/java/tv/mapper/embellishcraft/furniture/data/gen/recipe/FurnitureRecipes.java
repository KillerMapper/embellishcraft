package tv.mapper.embellishcraft.furniture.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.gen.recipe.ECRecipes;
import tv.mapper.embellishcraft.core.util.McWoods;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;
import tv.mapper.mapperbase.data.BaseTags;
import tv.mapper.mapperbase.world.item.BaseItems;

public class FurnitureRecipes extends ECRecipes
{
    public FurnitureRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        for(int j = 0; j < Arrays.stream(McWoods.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.CHAIR_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("S  ").pattern("SWS").pattern("S S").group("chairs").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_slab", has(ECConstants.McWoodenSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.TERRACE_CHAIR_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenPressures[j]).define('S', Tags.Items.RODS_WOODEN).pattern("S  ").pattern("SWS").pattern("S S").group("terrace_chairs").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_pressure_plate", has(ECConstants.McWoodenPressures[j])).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.TABLE_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("SWS").pattern("S S").pattern("S S").group("tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_slab", has(ECConstants.McWoodenSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.TERRACE_TABLE_BLOCKS.get(McWoods.byId(j)).get()).define('W', ECConstants.McWoodenPressures[j]).define('S', Tags.Items.RODS_WOODEN).pattern("WWW").pattern(" S ").pattern(" S ").group("terrace_tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_pressure_plate", has(ECConstants.McWoodenPressures[j])).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.FANCY_TABLE_BLOCKS.get(McWoods.byId(j)).get(), 2).define('W', ECConstants.McWoodenPlanks[j]).define('S', ECConstants.McWoodenLogs[j]).pattern("WWW").pattern("S S").pattern("S S").group("fancy_tables").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_planks", has(ECConstants.McWoodenPlanks[j])).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.WOODEN_CRATE_BLOCKS.get(McWoods.byId(j)).get()).define('B', BaseItems.BOLT.get()).define('W', ECConstants.McWoodenPlanks[j]).pattern("BWB").pattern("W W").pattern("BWB").group("wooden_crates").unlockedBy("has_" + McWoods.byId(j).getSerializedName() + "_planks", has(ECConstants.McWoodenPlanks[j])).save(consumer);
            // ShapedRecipeBuilder.shaped(InitFurnitureBlocks.FANCY_CHEST_BLOCKS.get(McWoods.byId(j)).get()).define('C', Blocks.CHEST).define('W', ECConstants.McWoodenSlabs[j]).pattern(" W
            // ").pattern("WCW").pattern(" W ").group("fancy_chests").unlockedBy("has_chest", has(Blocks.CHEST)).save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.COUCH_BLOCKS.get(DyeColor.byId(j)).get(), 3).pattern("w ").pattern("ww").pattern("pp").define('p', ItemTags.WOODEN_SLABS).define('w', ECConstants.McWools[j]).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_wool", has(ECConstants.McWools[j])).save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.PILLOW_BLOCKS.get(DyeColor.byId(j)).get()).pattern(" S ").pattern("SWS").pattern(" S ").define('S', Tags.Items.STRING).define('W', ECConstants.McWools[j]).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_wool", has(ECConstants.McWools[j])).save(consumer);
        }

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.ACACIA_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_acacia_planks", has(Blocks.ACACIA_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.BIRCH_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_birch_planks", has(Blocks.BIRCH_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.DARK_OAK_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_dark_oak_planks", has(Blocks.DARK_OAK_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.JUNGLE_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_jungle_planks", has(Blocks.JUNGLE_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.OAK_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_oak_planks", has(Blocks.OAK_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.SPRUCE_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_spruce_planks", has(Blocks.SPRUCE_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.WARPED_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_warped_planks", has(Blocks.WARPED_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', Blocks.CRIMSON_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_crimson_planks", has(Blocks.CRIMSON_PLANKS)).save(consumer);
        }
        for(int j = 1; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.PILLOW_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.PILLOW_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_pillow", has(InitFurnitureBlocks.PILLOW_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_pillow_from_white");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.COUCH_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.COUCH_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_couch", has(InitFurnitureBlocks.COUCH_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_couch_from_white");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_acacia_fancy_bed", has(InitFurnitureBlocks.ACACIA_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_acacia_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_birch_fancy_bed", has(InitFurnitureBlocks.BIRCH_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_birch_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_dark_oak_fancy_bed", has(InitFurnitureBlocks.DARK_OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_dark_oak_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_jungle_fancy_bed", has(InitFurnitureBlocks.JUNGLE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_jungle_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_oak_fancy_bed", has(InitFurnitureBlocks.OAK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_oak_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_spruce_fancy_bed", has(InitFurnitureBlocks.SPRUCE_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_spruce_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_warped_fancy_bed", has(InitFurnitureBlocks.WARPED_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_warped_fancy_bed_from_white");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, InitFurnitureBlocks.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitFurnitureBlocks.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_crimson_fancy_bed", has(InitFurnitureBlocks.CRIMSON_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_crimson_fancy_bed_from_white");
        }

        // ShapedRecipeBuilder.shaped(InitFurnitureBlocks.LOCKER.get(), 2).define('P', BaseTags.ForgeItems.PLATES_STEEL).define('I', BaseTags.ForgeItems.INGOTS_STEEL).pattern(" P ").pattern("P
        // P").pattern(" I ").unlockedBy("has_steel_ingot", has(BaseTags.ForgeItems.INGOTS_STEEL)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.STEEL_TERRACE_CHAIR.get(), 4).define('W', BaseTags.ForgeItems.PLATES_STEEL).define('S', BaseTags.ForgeItems.RODS_STEEL).pattern("S  ").pattern("SWS").pattern("S S").unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.STEEL_TERRACE_TABLE.get(), 4).define('W', BaseTags.ForgeItems.PLATES_STEEL).define('S', BaseTags.ForgeItems.RODS_STEEL).pattern("WWW").pattern(" S ").pattern(" S ").unlockedBy("has_steel_plate", has(BaseTags.ForgeItems.PLATES_STEEL)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, InitFurnitureBlocks.PLATE.get(), 4).define('W', Tags.Items.DYES_WHITE).define('C', Items.CLAY_BALL).pattern(" C ").pattern("CWC").pattern(" C ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);
    }
}