package tv.mapper.embellishcraft.core.data.gen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.ECTags;
import tv.mapper.mapperbase.data.BaseTags;

import java.util.concurrent.CompletableFuture;

public class ECItemTags extends ItemTagsProvider
{
    public ECItemTags(DataGenerator generatorIn, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> provider, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn.getPackOutput(), future, provider, ECConstants.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        copy(Tags.Blocks.STONE, Tags.Items.STONE);
        copy(Tags.Blocks.COBBLESTONE, Tags.Items.COBBLESTONE);
        copy(Tags.Blocks.COBBLESTONE, ItemTags.STONE_TOOL_MATERIALS);
        copy(Tags.Blocks.COBBLESTONE, ItemTags.STONE_CRAFTING_MATERIALS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(BlockTags.PRESSURE_PLATES, BaseTags.ForgeItems.PRESSURE_PLATES);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);

        copy(ECTags.ForgeBlocks.CHAIRS, ECTags.ForgeItems.CHAIRS);
        copy(ECTags.ForgeBlocks.TABLES, ECTags.ForgeItems.TABLES);

        copy(ECTags.Blocks.SUSPENDED_STAIRS, ECTags.Items.SUSPENDED_STAIRS);

        copy(ECTags.Blocks.COUCHES, ECTags.Items.COUCHES);

        copy(ECTags.Blocks.WOODEN_DOORS, ECTags.Items.WOODEN_DOORS);
        copy(ECTags.Blocks.DOORS, ECTags.Items.DOORS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.DOORS, ItemTags.DOORS);

        copy(ECTags.Blocks.WOODEN_CRATES, ECTags.Items.WOODEN_CRATES);
        copy(ECTags.ForgeBlocks.CRATES, ECTags.ForgeItems.CRATES);

        // copy(Tags.Blocks.CHESTS, Tags.Items.CHESTS);
        // copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);

        copy(ECTags.Blocks.FANCY_BEDS, ECTags.Items.FANCY_BEDS);
        copy(BlockTags.BEDS, ItemTags.BEDS);
    }
}