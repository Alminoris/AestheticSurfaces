package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderEsEs extends FabricLanguageProvider
{
    public ModLanguageProviderEsEs(FabricDataOutput dataOutput)
    {
        super(dataOutput, "es_es");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("table_", "Стол из %s");
        woodObjects.put("coffee_table_", "Кофейный столик из %s");
        woodObjects.put("garden_table_", "Садовый стол из %s");
        woodObjects.put("octagonal_table_", "Восьмиугольный столик из %s");
        woodObjects.put("dining_table_", "Обеденный стол из %s");
        woodObjects.put("kitchen_table_", "Кухонный стол из %s");
        woodObjects.put("desk_table_", "Письменный стол из %s");

        Map<String, String> colorObjects = new LinkedHashMap<>();
        colorObjects.put("table_", "Стол из %s");
        colorObjects.put("coffee_table_", "Кофейный столик из %s");
        colorObjects.put("garden_table_", "Садовый стол из %s");
        colorObjects.put("octagonal_table_", "Восьмиугольный столик из %s");
        colorObjects.put("dining_table_", "Обеденный стол из %s");
        colorObjects.put("kitchen_table_", "Кухонный стол из %s");
        colorObjects.put("desk_table_", "Письменный стол из %s");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "%s negro");
        colors.put("brown", "%s marrón");
        colors.put("gray", "%s gris");
        colors.put("light_gray", "%s gris claro");
        colors.put("white", "%s blanco");
        colors.put("red", "%s rojo");
        colors.put("orange", "%s naranja");
        colors.put("yellow", "%s amarillo");
        colors.put("blue", "%s azul");
        colors.put("cyan", "%s cian");
        colors.put("light_blue", "%s azul claro");
        colors.put("purple", "%s morado");
        colors.put("magenta", "%s magenta");
        colors.put("pink", "%s rosa");
        colors.put("green", "%s verde");
        colors.put("lime", "%s verde lima");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "piedra");
        stoneMaterials.put("tuff", "toba");
        stoneMaterials.put("blackstone", "piedra negra");
        stoneMaterials.put("andesite", "andesita");
        stoneMaterials.put("diorite", "diorita");
        stoneMaterials.put("granite", "granito");
        stoneMaterials.put("deepslate", "pizarra profunda");
        stoneMaterials.put("basalt_side", "basalto");
        stoneMaterials.put("quartz_block_bottom", "cuarzo");
        stoneMaterials.put("stone_bricks", "ladrillos de piedra");
        stoneMaterials.put("bricks", "ladrillos");
        stoneMaterials.put("mud_bricks", "ladrillos de barro");
        stoneMaterials.put("sandstone", "arenisca");
        stoneMaterials.put("dolomite_block", "dolomita");
        stoneMaterials.put("saltmarsh_block", "bloque de marisma salina");
        stoneMaterials.put("loessic_marl_block", "marga loésica");
        stoneMaterials.put("loamy_marl_block", "marga arcillosa");
        stoneMaterials.put("fossil_marlstone_block", "marga fósil");
        stoneMaterials.put("limestone_block", "caliza");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "ciprés calvo");
        woodMaterials.put("thuja", "tuya");
        woodMaterials.put("sequoia", "secuoya");
        woodMaterials.put("mountain_hemlock", "abeto de montaña");
        woodMaterials.put("cryptomeria", "criptomeria");
        woodMaterials.put("yew", "tejo");
        woodMaterials.put("larch", "alerce");
        woodMaterials.put("olive", "olivo");
        woodMaterials.put("tamarisk", "tamarisco");
        woodMaterials.put("western_serviceberry", "amelanchier occidental");
        woodMaterials.put("trembling_aspen", "álamo temblón");
        woodMaterials.put("cottonwood", "álamo algodonoso");
        woodMaterials.put("walnut", "nogal");
        woodMaterials.put("silver_maple", "arce plateado");
        woodMaterials.put("staghorn_sumac", "zumaque");
        woodMaterials.put("silverberry", "elaeagnus plateado");
        woodMaterials.put("willow", "sauce");
        woodMaterials.put("poplar", "álamo");
        woodMaterials.put("alder", "aliso");
        woodMaterials.put("aspen", "álamo temblón");
        woodMaterials.put("azalea", "azalea");
        woodMaterials.put("apple", "manzano");
        woodMaterials.put("scots_pine", "pino silvestre");
        woodMaterials.put("swamp_oak", "roble pantanoso");
        woodMaterials.put("aspen_nss", "álamo temblón");
        woodMaterials.put("cedar_nss", "cedro");
        woodMaterials.put("coconut_nss", "palmera de coco");
        woodMaterials.put("cypress_nss", "ciprés");
        woodMaterials.put("fir_nss", "abeto");
        woodMaterials.put("ghaf_nss", "ghaf");
        woodMaterials.put("larch_nss", "alerce");
        woodMaterials.put("mahogany_nss", "caoba");
        woodMaterials.put("maple_nss", "arce");
        woodMaterials.put("olive_nss", "olivo");
        woodMaterials.put("palo_verde_nss", "palo verde");
        woodMaterials.put("redwood_nss", "secuoya roja");
        woodMaterials.put("saxaul_nss", "saxaul");
        woodMaterials.put("sugi_nss", "sugi");
        woodMaterials.put("willow_nss", "sauce");
        woodMaterials.put("wisteria_nss", "glicinia");
        woodMaterials.put("oak", "roble");
        woodMaterials.put("birch", "abedul");
        woodMaterials.put("spruce", "abeto");
        woodMaterials.put("jungle", "madera selvática");
        woodMaterials.put("acacia", "acacia");
        woodMaterials.put("dark_oak", "roble oscuro");
        woodMaterials.put("crimson", "madera carmesí");
        woodMaterials.put("warped", "madera deformada");
        woodMaterials.put("mangrove", "madera de mangle");
        woodMaterials.put("cherry", "cerezo");
        woodMaterials.put("bamboo", "bambú");
        woodMaterials.put("hazelnut", "avellano");
        woodMaterials.put("hornbeam", "carpe");
        woodMaterials.put("hawthorn", "espino");
        woodMaterials.put("quince", "membrillo");
        woodMaterials.put("plum", "ciruelo");
        woodMaterials.put("mango", "mango");
        woodMaterials.put("fig", "higuera");
        woodMaterials.put("viburnum", "viburno");
        woodMaterials.put("white_mulberry", "moral blanco");
        woodMaterials.put("wild_cherry", "cerezo silvestre");
        woodMaterials.put("bauhinia", "bauhinia");
        woodMaterials.put("pine", "pino");
        woodMaterials.put("fir", "abeto");
        woodMaterials.put("cedar", "cedro");
        woodMaterials.put("araucaria", "araucaria");
        woodMaterials.put("juniper", "enebro");

        for (Map.Entry<String, String> type : colorObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "block." + AestheticSurfaces.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(mat.getValue(), type.getValue());
                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("itemgroup.asurftab", "Aesthetic Surfaces");
    }
}