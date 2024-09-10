package tv.mapper.embellishcraft.core.data.gen.recipe;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.mapperbase.data.gen.BaseRecipes;

import java.util.Objects;
import java.util.function.Consumer;

public class ECRecipes extends BaseRecipes
{
    public ECRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
    }

    protected static void CreateBasicRecipes(Consumer<FinishedRecipe> consumer, Block block, StairBlock stairs, SlabBlock slab, WallBlock wall, PressurePlateBlock pressure, ButtonBlock button)
    {
        if(block != null)
        {
            String name = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();

            if(slab != null)
            {
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slab, 6).pattern("iii").define('i', block).unlockedBy("has_" + name, has(block)).save(consumer);
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block).pattern("i").pattern("i").define('i', slab).unlockedBy("has_" + name + "_slab", has(slab)).save(consumer, ECConstants.MODID + ":" + name + "_from_slabs");
            }
            if(stairs != null)
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stairs, 4).define('#', block).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_" + name, has(block)).save(consumer);
            if(wall != null)
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wall, 6).define('#', block).pattern("###").pattern("###").unlockedBy("has_" + name, has(block)).save(consumer);
            if(pressure != null)
                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pressure).define('#', block).pattern("##").unlockedBy("has_" + name, has(block)).save(consumer);
            if(button != null)
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, button).requires(block).unlockedBy("has_" + name, has(block)).save(consumer);
        }
    }
}