package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderRuRu extends FabricLanguageProvider
{
    public ModLanguageProviderRuRu(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("simple_carpet_", "ый простой ковёр");
        woodObjects.put("simple_wallpaper_", "ые простые обои");
        woodObjects.put("smooth_carpet", "ый гладкий ковёр");
        woodObjects.put("smooth_wallpaper", "ые гладкие обои");
        woodObjects.put("transitional_carpet_", "ый переходный ковёр");
        woodObjects.put("transitional_wallpaper_", "ые переходные обои");
        woodObjects.put("wallpaper_", "ые обои");

        Map<String, String> colorObjects = new LinkedHashMap<>();
        colorObjects.put("simple_carpet_", "ый простой ковёр");
        colorObjects.put("simple_wallpaper_", "ые простые обои");
        colorObjects.put("smooth_carpet", "ый гладкий ковёр");
        colorObjects.put("smooth_wallpaper", "ые гладкие обои");
        colorObjects.put("transitional_carpet_", "ый переходный ковёр");
        colorObjects.put("transitional_wallpaper_", "ые переходные обои");
        colorObjects.put("wallpaper_", "ые обои");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "Чёрн%s");
        colors.put("brown", "Коричнев%s");
        colors.put("gray", "Сер%s");
        colors.put("light_gray", "Светло-сер%s");
        colors.put("white", "Бел%s");
        colors.put("red", "Красн%s");
        colors.put("orange", "Оранжев%s");
        colors.put("yellow", "Жёлт%s");
        colors.put("blue", "Син%s");
        colors.put("cyan", "Бирюзов%s");
        colors.put("light_blue", "Голуб%s");
        colors.put("purple", "Фиолетов%s");
        colors.put("magenta", "Пурпурн%s");
        colors.put("pink", "Розов%s");
        colors.put("green", "Зелён%s");
        colors.put("lime", "Лаймов%s");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "камня");
        stoneMaterials.put("tuff", "туфа");
        stoneMaterials.put("blackstone", "чёрного камня");
        stoneMaterials.put("andesite", "андезита");
        stoneMaterials.put("diorite", "диорита");
        stoneMaterials.put("granite", "гранита");
        stoneMaterials.put("deepslate", "глубинного сланца");
        stoneMaterials.put("basalt_side", "базальта");
        stoneMaterials.put("quartz_block_bottom", "кварца");
        stoneMaterials.put("stone_bricks", "каменного кирпича");
        stoneMaterials.put("bricks", "кирпича");
        stoneMaterials.put("mud_bricks", "глиняного кирпича");
        stoneMaterials.put("sandstone", "песчаника");
        stoneMaterials.put("dolomite_block", "доломита");
        stoneMaterials.put("saltmarsh_block", "солончака");
        stoneMaterials.put("loessic_marl_block", "лёссового мергеля");
        stoneMaterials.put("loamy_marl_block", "суглинистого мергеля");
        stoneMaterials.put("fossil_marlstone_block", "ископаемого мергеля");
        stoneMaterials.put("limestone_block", "известняка");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "болотного кипариса");
        woodMaterials.put("thuja", "туи");
        woodMaterials.put("sequoia", "секвойи");
        woodMaterials.put("mountain_hemlock", "горной тсуги");
        woodMaterials.put("cryptomeria", "криптомерии");
        woodMaterials.put("yew", "тиса");
        woodMaterials.put("larch", "лиственницы");
        woodMaterials.put("olive", "оливы");
        woodMaterials.put("tamarisk", "тамариска");
        woodMaterials.put("western_serviceberry", "западной ирги");
        woodMaterials.put("trembling_aspen", "осины");
        woodMaterials.put("cottonwood", "хлопкового тополя");
        woodMaterials.put("walnut", "ореха");
        woodMaterials.put("silver_maple", "серебристого клёна");
        woodMaterials.put("staghorn_sumac", "сумаха");
        woodMaterials.put("silverberry", "серебристого лоха");
        woodMaterials.put("willow", "ивы");
        woodMaterials.put("poplar", "тополя");
        woodMaterials.put("alder", "ольхи");
        woodMaterials.put("aspen", "осины");
        woodMaterials.put("azalea", "азалии");
        woodMaterials.put("apple", "яблони");
        woodMaterials.put("scots_pine", "сосны обыкновенной");
        woodMaterials.put("swamp_oak", "болотного дуба");
        woodMaterials.put("cedar", "кедра");
        woodMaterials.put("oak", "дуба");
        woodMaterials.put("birch", "берёзы");
        woodMaterials.put("spruce", "ели");
        woodMaterials.put("jungle", "тропического дерева");
        woodMaterials.put("acacia", "акации");
        woodMaterials.put("dark_oak", "тёмного дуба");
        woodMaterials.put("crimson", "пурпурного дерева");
        woodMaterials.put("warped", "искажённого дерева");
        woodMaterials.put("mangrove", "мангрового дерева");
        woodMaterials.put("cherry", "вишни");
        woodMaterials.put("bamboo", "бамбука");
        woodMaterials.put("pine", "сосны");
        woodMaterials.put("fir", "пихты");
        woodMaterials.put("juniper", "можжевельника");

        for (Map.Entry<String, String> type : colorObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "block." + AestheticSurfaces.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(mat.getValue(), type.getValue());

                if (type.getKey().split("_").length > 1)
                    if (type.getKey().split("_")[1].equals("carpet"))
                        translationBuilder.add(key + "_block", value + " блок");

                translationBuilder.add(key, value);
            }
        }


        translationBuilder.add("itemgroup.asurftab", "Aesthetic Surfaces");
    }
}