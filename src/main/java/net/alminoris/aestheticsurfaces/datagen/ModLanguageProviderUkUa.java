package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderUkUa extends FabricLanguageProvider
{
    public ModLanguageProviderUkUa(FabricDataOutput dataOutput)
    {
        super(dataOutput, "uk_ua");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("simple_carpet_", "ий простий килим");
        woodObjects.put("simple_wallpaper_", "і прості шпалери");
        woodObjects.put("smooth_carpet", "ий гладкий килим");
        woodObjects.put("smooth_wallpaper", "і гладкі шпалери");
        woodObjects.put("transitional_carpet_", "ий перехідний килим");
        woodObjects.put("transitional_wallpaper_", "і перехідні шпалери");
        woodObjects.put("wallpaper_", "і шпалери");

        Map<String, String> colorObjects = new LinkedHashMap<>();
        colorObjects.put("simple_carpet_", "ий простий килим");
        colorObjects.put("simple_wallpaper_", "і прості шпалери");
        colorObjects.put("smooth_carpet", "ий гладкий килим");
        colorObjects.put("smooth_wallpaper", "і гладкі шпалери");
        colorObjects.put("transitional_carpet_", "ий перехідний килим");
        colorObjects.put("transitional_wallpaper_", "і перехідні шпалери");
        colorObjects.put("wallpaper_", "і шпалери");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "Чорн%s");
        colors.put("brown", "Коричнев%s");
        colors.put("gray", "Сір%s");
        colors.put("light_gray", "Світло-сір%s");
        colors.put("white", "Біл%s");
        colors.put("red", "Червон%s");
        colors.put("orange", "Оранжев%s");
        colors.put("yellow", "Жовт%s");
        colors.put("blue", "Син%s");
        colors.put("cyan", "Бірюзов%s");
        colors.put("light_blue", "Блакитн%s");
        colors.put("purple", "Фіолетов%s");
        colors.put("magenta", "Пурпурн%s");
        colors.put("pink", "Рожев%s");
        colors.put("green", "Зелен%s");
        colors.put("lime", "Лаймов%s");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "каменю");
        stoneMaterials.put("tuff", "туфу");
        stoneMaterials.put("blackstone", "чорного каменю");
        stoneMaterials.put("andesite", "андезиту");
        stoneMaterials.put("diorite", "діориту");
        stoneMaterials.put("granite", "граніту");
        stoneMaterials.put("deepslate", "глибокої сланцю");
        stoneMaterials.put("basalt_side", "базальту");
        stoneMaterials.put("quartz_block_bottom", "кварцу");
        stoneMaterials.put("stone_bricks", "кам’яної цегли");
        stoneMaterials.put("bricks", "цегли");
        stoneMaterials.put("mud_bricks", "глиняної цегли");
        stoneMaterials.put("sandstone", "піщанику");
        stoneMaterials.put("dolomite_block", "доломіту");
        stoneMaterials.put("saltmarsh_block", "солончака");
        stoneMaterials.put("loessic_marl_block", "лессового мергеля");
        stoneMaterials.put("loamy_marl_block", "суглинкового мергеля");
        stoneMaterials.put("fossil_marlstone_block", "викопного мергеля");
        stoneMaterials.put("limestone_block", "вапняку");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "болотного кипариса");
        woodMaterials.put("thuja", "туї");
        woodMaterials.put("sequoia", "секвої");
        woodMaterials.put("mountain_hemlock", "гірської тсуги");
        woodMaterials.put("cryptomeria", "криптомерії");
        woodMaterials.put("yew", "тису");
        woodMaterials.put("larch", "модрини");
        woodMaterials.put("olive", "оливи");
        woodMaterials.put("tamarisk", "тамаріску");
        woodMaterials.put("western_serviceberry", "ірги західної");
        woodMaterials.put("trembling_aspen", "осики");
        woodMaterials.put("cottonwood", "тополі бавовникової");
        woodMaterials.put("walnut", "горіха");
        woodMaterials.put("silver_maple", "сріблястого клена");
        woodMaterials.put("staghorn_sumac", "сузу");
        woodMaterials.put("silverberry", "лохини сріблястої");
        woodMaterials.put("willow", "верби");
        woodMaterials.put("poplar", "тополі");
        woodMaterials.put("alder", "вільхи");
        woodMaterials.put("aspen", "осики");
        woodMaterials.put("azalea", "азалії");
        woodMaterials.put("apple", "яблуні");
        woodMaterials.put("scots_pine", "сосни звичайної");
        woodMaterials.put("swamp_oak", "болотного дуба");
        woodMaterials.put("aspen_nss", "осики");
        woodMaterials.put("cedar_nss", "кедра");
        woodMaterials.put("coconut_nss", "кокосової пальми");
        woodMaterials.put("cypress_nss", "кипариса");
        woodMaterials.put("fir_nss", "ялиці");
        woodMaterials.put("ghaf_nss", "гафу");
        woodMaterials.put("larch_nss", "модрини");
        woodMaterials.put("mahogany_nss", "махаґоні");
        woodMaterials.put("maple_nss", "клена");
        woodMaterials.put("olive_nss", "оливи");
        woodMaterials.put("palo_verde_nss", "пало верде");
        woodMaterials.put("redwood_nss", "секвої");
        woodMaterials.put("saxaul_nss", "саксаулу");
        woodMaterials.put("sugi_nss", "суґі");
        woodMaterials.put("willow_nss", "верби");
        woodMaterials.put("wisteria_nss", "гліцинії");
        woodMaterials.put("oak", "дуба");
        woodMaterials.put("birch", "берези");
        woodMaterials.put("spruce", "ялиці");
        woodMaterials.put("jungle", "тропічного дерева");
        woodMaterials.put("acacia", "акації");
        woodMaterials.put("dark_oak", "темного дуба");
        woodMaterials.put("crimson", "пурпурового дерева");
        woodMaterials.put("warped", "деформованого дерева");
        woodMaterials.put("mangrove", "мангрового дерева");
        woodMaterials.put("cherry", "вишні");
        woodMaterials.put("bamboo", "бамбука");
        woodMaterials.put("hazelnut", "ліщини");
        woodMaterials.put("hornbeam", "грабу");
        woodMaterials.put("hawthorn", "глоду");
        woodMaterials.put("quince", "айви");
        woodMaterials.put("plum", "сливи");
        woodMaterials.put("mango", "манго");
        woodMaterials.put("fig", "інжиру");
        woodMaterials.put("viburnum", "калини");
        woodMaterials.put("white_mulberry", "білої шовковиці");
        woodMaterials.put("wild_cherry", "черешні");
        woodMaterials.put("bauhinia", "баухінії");
        woodMaterials.put("pine", "сосни");
        woodMaterials.put("fir", "ялини");
        woodMaterials.put("cedar", "кедра");
        woodMaterials.put("araucaria", "араукарії");
        woodMaterials.put("juniper", "ялівця");

        for (Map.Entry<String, String> type : colorObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "block." + AestheticSurfaces.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(mat.getValue(), type.getValue());
                if (type.getKey().split("_").length > 1)
                    if (type.getKey().split("_")[1].equals("carpet"))
                        translationBuilder.add(key+"_block", value+" блок");

                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("itemgroup.asurftab", "Aesthetic Surfaces");
    }
}