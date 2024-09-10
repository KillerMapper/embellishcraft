package tv.mapper.embellishcraft.lights.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.gen.recipe.ECRecipes;
import tv.mapper.embellishcraft.lights.world.level.block.InitLightBlocks;

public class LightRecipes extends ECRecipes
{
    public LightRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).pattern(" w ").pattern("wgw").pattern(" p ").define('g', Tags.Items.DUSTS_GLOWSTONE).define('p', ItemTags.PLANKS).define('w', ECConstants.McWools[j]).unlockedBy("has_" + DyeColor.byId(j).getSerializedName() + "_wool", has(ECConstants.McWools[j])).save(consumer);
            ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(Blocks.LEVER).unlockedBy("has_table_lamp", has(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_manual_table_lamp");
            ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).unlockedBy("has_manual_table_lamp", has(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_table_lamp_from_manual");
        }

        for(int j = 1; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(j)).get()).requires(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get()).requires(DyeColor.byId(j).getTag()).unlockedBy("has_white_table_lamp", has(InitLightBlocks.TABLE_LAMP_BLOCKS.get(DyeColor.byId(0)).get())).save(consumer, DyeColor.byId(j).getSerializedName() + "_table_lamp_from_white");
        }
    }
}