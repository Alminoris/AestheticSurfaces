package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderFrFr extends FabricLanguageProvider
{
    public ModLanguageProviderFrFr(FabricDataOutput dataOutput)
    {
        super(dataOutput, "fr_fr");
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
        colors.put("black", "%s noir");
        colors.put("brown", "%s brun");
        colors.put("gray", "%s gris");
        colors.put("light_gray", "%s gris clair");
        colors.put("white", "%s blanc");
        colors.put("red", "%s rouge");
        colors.put("orange", "%s orange");
        colors.put("yellow", "%s jaune");
        colors.put("blue", "%s bleu");
        colors.put("cyan", "%s cyan");
        colors.put("light_blue", "%s bleu clair");
        colors.put("purple", "%s violet");
        colors.put("magenta", "%s magenta");
        colors.put("pink", "%s rose");
        colors.put("green", "%s vert");
        colors.put("lime", "%s vert clair");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "pierre");
        stoneMaterials.put("tuff", "tuf");
        stoneMaterials.put("blackstone", "pierre noire");
        stoneMaterials.put("andesite", "andésite");
        stoneMaterials.put("diorite", "diorite");
        stoneMaterials.put("granite", "granit");
        stoneMaterials.put("deepslate", "ardoise profonde");
        stoneMaterials.put("basalt_side", "basalte");
        stoneMaterials.put("quartz_block_bottom", "quartz");
        stoneMaterials.put("stone_bricks", "briques de pierre");
        stoneMaterials.put("bricks", "briques");
        stoneMaterials.put("mud_bricks", "briques de boue");
        stoneMaterials.put("sandstone", "grès");
        stoneMaterials.put("dolomite_block", "dolomie");
        stoneMaterials.put("saltmarsh_block", "marais salant");
        stoneMaterials.put("loessic_marl_block", "marne lœssique");
        stoneMaterials.put("loamy_marl_block", "marne argileuse");
        stoneMaterials.put("fossil_marlstone_block", "marne fossile");
        stoneMaterials.put("limestone_block", "calcaire");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "cyprès chauve");
        woodMaterials.put("thuja", "thuya");
        woodMaterials.put("sequoia", "séquoia");
        woodMaterials.put("mountain_hemlock", "pruche de montagne");
        woodMaterials.put("cryptomeria", "cryptoméria");
        woodMaterials.put("yew", "if");
        woodMaterials.put("larch", "mélèze");
        woodMaterials.put("olive", "olivier");
        woodMaterials.put("tamarisk", "tamaris");
        woodMaterials.put("western_serviceberry", "amélanchier de l’Ouest");
        woodMaterials.put("trembling_aspen", "peuplier faux-tremble");
        woodMaterials.put("cottonwood", "peuplier duveteux");
        woodMaterials.put("walnut", "noyer");
        woodMaterials.put("silver_maple", "érable argenté");
        woodMaterials.put("staghorn_sumac", "sumac vinaigrier");
        woodMaterials.put("silverberry", "chalef argenté");
        woodMaterials.put("willow", "saule");
        woodMaterials.put("poplar", "peuplier");
        woodMaterials.put("alder", "aulne");
        woodMaterials.put("aspen", "tremble");
        woodMaterials.put("azalea", "azalée");
        woodMaterials.put("apple", "pommier");
        woodMaterials.put("scots_pine", "pin sylvestre");
        woodMaterials.put("swamp_oak", "chêne des marais");
        woodMaterials.put("aspen_nss", "tremble");
        woodMaterials.put("cedar_nss", "cèdre");
        woodMaterials.put("coconut_nss", "cocotier");
        woodMaterials.put("cypress_nss", "cyprès");
        woodMaterials.put("fir_nss", "sapin");
        woodMaterials.put("ghaf_nss", "ghaf");
        woodMaterials.put("larch_nss", "mélèze");
        woodMaterials.put("mahogany_nss", "acajou");
        woodMaterials.put("maple_nss", "érable");
        woodMaterials.put("olive_nss", "olivier");
        woodMaterials.put("palo_verde_nss", "palo verde");
        woodMaterials.put("redwood_nss", "séquoia rouge");
        woodMaterials.put("saxaul_nss", "saxaul");
        woodMaterials.put("sugi_nss", "sugi");
        woodMaterials.put("willow_nss", "saule");
        woodMaterials.put("wisteria_nss", "glycine");
        woodMaterials.put("oak", "chêne");
        woodMaterials.put("birch", "bouleau");
        woodMaterials.put("spruce", "épicéa");
        woodMaterials.put("jungle", "bois tropical");
        woodMaterials.put("acacia", "acacia");
        woodMaterials.put("dark_oak", "chêne noir");
        woodMaterials.put("crimson", "bois cramoisi");
        woodMaterials.put("warped", "bois déformé");
        woodMaterials.put("mangrove", "mangrove");
        woodMaterials.put("cherry", "cerisier");
        woodMaterials.put("bamboo", "bambou");
        woodMaterials.put("hazelnut", "noisetier");
        woodMaterials.put("hornbeam", "charme");
        woodMaterials.put("hawthorn", "aubépine");
        woodMaterials.put("quince", "cognassier");
        woodMaterials.put("plum", "prunier");
        woodMaterials.put("mango", "manguier");
        woodMaterials.put("fig", "figuier");
        woodMaterials.put("viburnum", "viorne");
        woodMaterials.put("white_mulberry", "mûrier blanc");
        woodMaterials.put("wild_cherry", "merisier");
        woodMaterials.put("bauhinia", "bauhinie");
        woodMaterials.put("pine", "pin");
        woodMaterials.put("fir", "sapin");
        woodMaterials.put("cedar", "cèdre");
        woodMaterials.put("araucaria", "araucaria");
        woodMaterials.put("juniper", "genévrier");

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