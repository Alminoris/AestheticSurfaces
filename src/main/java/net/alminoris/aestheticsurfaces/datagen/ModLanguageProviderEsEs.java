package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;


import java.util.LinkedHashMap;
import java.util.Map;


public class ModLanguageProviderEsEs extends FabricLanguageProvider
{
    public ModLanguageProviderEsEs(FabricDataGenerator dataOutput)
    {
        super(dataOutput, "es_es");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("simple_carpet_", "Alfombra simple");
        woodObjects.put("simple_wallpaper_", "Papel pintado simple");
        woodObjects.put("smooth_carpet", "Alfombra lisa");
        woodObjects.put("smooth_wallpaper", "Papel pintado liso");
        woodObjects.put("transitional_carpet_", "Alfombra transicional");
        woodObjects.put("transitional_wallpaper_", "Papel pintado transicional");
        woodObjects.put("wallpaper_", "Papel pintado");

        Map<String, String> colorObjects = new LinkedHashMap<>();
        colorObjects.put("simple_carpet_", "Alfombra simple");
        colorObjects.put("simple_wallpaper_", "Papel pintado simple");
        colorObjects.put("smooth_carpet", "Alfombra lisa");
        colorObjects.put("smooth_wallpaper", "Papel pintado liso");
        colorObjects.put("transitional_carpet_", "Alfombra transicional");
        colorObjects.put("transitional_wallpaper_", "Papel pintado transicional");
        colorObjects.put("wallpaper_", "Papel pintado");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "Negro %s");
        colors.put("brown", "Marrón %s");
        colors.put("gray", "Gris %s");
        colors.put("light_gray", "Gris claro %s");
        colors.put("white", "Blanco %s");
        colors.put("red", "Rojo %s");
        colors.put("orange", "Naranja %s");
        colors.put("yellow", "Amarillo %s");
        colors.put("blue", "Azul %s");
        colors.put("cyan", "Cian %s");
        colors.put("light_blue", "Azul claro %s");
        colors.put("purple", "Morado %s");
        colors.put("magenta", "Magenta %s");
        colors.put("pink", "Rosa %s");
        colors.put("green", "Verde %s");
        colors.put("lime", "Verde lima %s");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "de piedra");
        stoneMaterials.put("tuff", "de toba");
        stoneMaterials.put("blackstone", "de piedra negra");
        stoneMaterials.put("andesite", "de andesita");
        stoneMaterials.put("diorite", "de diorita");
        stoneMaterials.put("granite", "de granito");
        stoneMaterials.put("deepslate", "de pizarra profunda");
        stoneMaterials.put("basalt_side", "de basalto");
        stoneMaterials.put("quartz_block_bottom", "de cuarzo");
        stoneMaterials.put("stone_bricks", "de ladrillos de piedra");
        stoneMaterials.put("bricks", "de ladrillos");
        stoneMaterials.put("mud_bricks", "de ladrillos de barro");
        stoneMaterials.put("sandstone", "de arenisca");
        stoneMaterials.put("dolomite_block", "de dolomita");
        stoneMaterials.put("saltmarsh_block", "de salmarisma");
        stoneMaterials.put("loessic_marl_block", "de marga loésica");
        stoneMaterials.put("loamy_marl_block", "de marga arcillosa");
        stoneMaterials.put("fossil_marlstone_block", "de marga fósil");
        stoneMaterials.put("limestone_block", "de caliza");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "de ciprés calvo");
        woodMaterials.put("thuja", "de tuya");
        woodMaterials.put("sequoia", "de secuoya");
        woodMaterials.put("mountain_hemlock", "de tsuga de montaña");
        woodMaterials.put("cryptomeria", "de criptomeria");
        woodMaterials.put("yew", "de tejo");
        woodMaterials.put("larch", "de alerce");
        woodMaterials.put("olive", "de olivo");
        woodMaterials.put("tamarisk", "de tamarisco");
        woodMaterials.put("western_serviceberry", "de amelanchero occidental");
        woodMaterials.put("trembling_aspen", "de álamo temblón");
        woodMaterials.put("cottonwood", "de álamo algodonero");
        woodMaterials.put("walnut", "de nogal");
        woodMaterials.put("silver_maple", "de arce plateado");
        woodMaterials.put("staghorn_sumac", "de zumaque");
        woodMaterials.put("silverberry", "de eleagno plateado");
        woodMaterials.put("willow", "de sauce");
        woodMaterials.put("poplar", "de álamo");
        woodMaterials.put("alder", "de aliso");
        woodMaterials.put("aspen", "de álamo");
        woodMaterials.put("azalea", "de azalea");
        woodMaterials.put("apple", "de manzano");
        woodMaterials.put("scots_pine", "de pino silvestre");
        woodMaterials.put("swamp_oak", "de roble de pantano");
        woodMaterials.put("cedar", "de cedro");
        woodMaterials.put("oak", "de roble");
        woodMaterials.put("birch", "de abedul");
        woodMaterials.put("spruce", "de abeto");
        woodMaterials.put("jungle", "de madera tropical");
        woodMaterials.put("acacia", "de acacia");
        woodMaterials.put("dark_oak", "de roble oscuro");
        woodMaterials.put("crimson", "de madera carmesí");
        woodMaterials.put("warped", "de madera distorsionada");
        woodMaterials.put("mangrove", "de manglar");
        woodMaterials.put("cherry", "de cerezo");
        woodMaterials.put("bamboo", "de bambú");
        woodMaterials.put("pine", "de pino");
        woodMaterials.put("fir", "de abeto");
        woodMaterials.put("juniper", "de enebro");

        for (Map.Entry<String, String> type : colorObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "block." + AestheticSurfaces.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(mat.getValue(), type.getValue());

                if (type.getKey().split("_").length > 1)
                    if (type.getKey().split("_")[1].equals("carpet"))
                        translationBuilder.add(key + "_block", value + " bloque");

                translationBuilder.add(key, value);
            }
        }


        translationBuilder.add("itemGroup.aestheticsurfaces.asurftab", "Aesthetic Surfaces");
    }
}