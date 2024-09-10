package tv.mapper.embellishcraft.lights.world.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.tuple.Pair;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.lights.world.level.block.InitLightBlocks;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class InitLightItems
{
    public static final DeferredRegister<Item> LIGHT_ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ECConstants.MODID);

    public static final Map<DyeColor, RegistryObject<BlockItem>> TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, LIGHT_ITEM_REGISTRY.register(type.getSerializedName() + "_table_lamp", () -> new BlockItem(InitLightBlocks.TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> MANUAL_TABLE_LAMP_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, LIGHT_ITEM_REGISTRY.register(type.getSerializedName() + "_manual_table_lamp", () -> new BlockItem(InitLightBlocks.MANUAL_TABLE_LAMP_BLOCKS.get(type).get(), new Item.Properties())))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        LIGHT_ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}