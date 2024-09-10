package tv.mapper.embellishcraft.core.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraft.building.data.gen.BuildingLang;
import tv.mapper.embellishcraft.furniture.data.gen.FurnitureLang;
import tv.mapper.embellishcraft.industrial.data.gen.IndustrialLang;
import tv.mapper.embellishcraft.lights.data.gen.LightLang;
import tv.mapper.embellishcraft.rocks.data.gen.RockLang;

public class ECLang extends LanguageProvider
{
    private String lang;

    public ECLang(DataGenerator gen, String modid, String locale)
    {
        super(gen.getPackOutput(), modid, locale);
        lang = locale;
    }

    @Override
    protected void addTranslations()
    {
        RockLang.addTranslations(this, lang);
        IndustrialLang.addTranslations(this, lang);
        BuildingLang.addTranslations(this, lang);
        FurnitureLang.addTranslations(this, lang);
        LightLang.addTranslations(this, lang);

        switch(lang)
        {
            default:
            case "en_us":
                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
            case "fr_fr":
                add("itemGroup.embellishcraft_group", "EmbellishCraft");
                break;
        }
    }
}