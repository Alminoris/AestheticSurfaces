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
    public ModLanguageProviderFrFr(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "fr_fr", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("simple_carpet_", "Tapis simple");
        woodObjects.put("simple_wallpaper_", "Papier peint simple");
        woodObjects.put("smooth_carpet", "Tapis lisse");
        woodObjects.put("smooth_wallpaper", "Papier peint lisse");
        woodObjects.put("transitional_carpet_", "Tapis transitionnel");
        woodObjects.put("transitional_wallpaper_", "Papier peint transitionnel");
        woodObjects.put("wallpaper_", "Papier peint");

        Map<String, String> colorObjects = new LinkedHashMap<>();
        colorObjects.put("simple_carpet_", "Tapis simple");
        colorObjects.put("simple_wallpaper_", "Papier peint simple");
        colorObjects.put("smooth_carpet", "Tapis lisse");
        colorObjects.put("smooth_wallpaper", "Papier peint lisse");
        colorObjects.put("transitional_carpet_", "Tapis transitionnel");
        colorObjects.put("transitional_wallpaper_", "Papier peint transitionnel");
        colorObjects.put("wallpaper_", "Papier peint");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "Noir %s");
        colors.put("brown", "Brun %s");
        colors.put("gray", "Gris %s");
        colors.put("light_gray", "Gris clair %s");
        colors.put("white", "Blanc %s");
        colors.put("red", "Rouge %s");
        colors.put("orange", "Orange %s");
        colors.put("yellow", "Jaune %s");
        colors.put("blue", "Bleu %s");
        colors.put("cyan", "Turquoise %s");
        colors.put("light_blue", "Bleu clair %s");
        colors.put("purple", "Violet %s");
        colors.put("magenta", "Magenta %s");
        colors.put("pink", "Rose %s");
        colors.put("green", "Vert %s");
        colors.put("lime", "Vert citron %s");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "en pierre");
        stoneMaterials.put("tuff", "en tuf");
        stoneMaterials.put("blackstone", "en pierre noire");
        stoneMaterials.put("andesite", "en andésite");
        stoneMaterials.put("diorite", "en diorite");
        stoneMaterials.put("granite", "en granite");
        stoneMaterials.put("deepslate", "en ardoise profonde");
        stoneMaterials.put("basalt_side", "en basalte");
        stoneMaterials.put("quartz_block_bottom", "en quartz");
        stoneMaterials.put("stone_bricks", "en briques de pierre");
        stoneMaterials.put("bricks", "en briques");
        stoneMaterials.put("mud_bricks", "en briques de boue");
        stoneMaterials.put("sandstone", "en grès");
        stoneMaterials.put("dolomite_block", "en dolomie");
        stoneMaterials.put("saltmarsh_block", "en sol salin");
        stoneMaterials.put("loessic_marl_block", "en marne loessique");
        stoneMaterials.put("loamy_marl_block", "en marne limoneuse");
        stoneMaterials.put("fossil_marlstone_block", "en marne fossile");
        stoneMaterials.put("limestone_block", "en calcaire");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "en cyprès chauve");
        woodMaterials.put("thuja", "en thuya");
        woodMaterials.put("sequoia", "en séquoia");
        woodMaterials.put("mountain_hemlock", "en pruche de montagne");
        woodMaterials.put("cryptomeria", "en cryptoméria");
        woodMaterials.put("yew", "en if");
        woodMaterials.put("larch", "en mélèze");
        woodMaterials.put("olive", "en olivier");
        woodMaterials.put("tamarisk", "en tamaris");
        woodMaterials.put("western_serviceberry", "en amélanchier occidental");
        woodMaterials.put("trembling_aspen", "en peuplier faux-tremble");
        woodMaterials.put("cottonwood", "en peuplier cotonnier");
        woodMaterials.put("walnut", "en noyer");
        woodMaterials.put("silver_maple", "en érable argenté");
        woodMaterials.put("staghorn_sumac", "en sumac vinaigrier");
        woodMaterials.put("silverberry", "en chalef argenté");
        woodMaterials.put("willow", "en saule");
        woodMaterials.put("poplar", "en peuplier");
        woodMaterials.put("alder", "en aulne");
        woodMaterials.put("aspen", "en tremble");
        woodMaterials.put("azalea", "en azalée");
        woodMaterials.put("apple", "en pommier");
        woodMaterials.put("scots_pine", "en pin sylvestre");
        woodMaterials.put("swamp_oak", "en chêne des marais");
        woodMaterials.put("cedar", "en cèdre");
        woodMaterials.put("oak", "en chêne");
        woodMaterials.put("birch", "en bouleau");
        woodMaterials.put("spruce", "en épicéa");
        woodMaterials.put("jungle", "en bois tropical");
        woodMaterials.put("acacia", "en acacia");
        woodMaterials.put("dark_oak", "en chêne foncé");
        woodMaterials.put("crimson", "en bois carmin");
        woodMaterials.put("warped", "en bois biscornu");
        woodMaterials.put("mangrove", "en mangrove");
        woodMaterials.put("cherry", "en cerisier");
        woodMaterials.put("bamboo", "en bambou");
        woodMaterials.put("pine", "en pin");
        woodMaterials.put("fir", "en sapin");
        woodMaterials.put("juniper", "en genévrier");

        for (Map.Entry<String, String> type : colorObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "block." + AestheticSurfaces.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(mat.getValue(), type.getValue());

                if (type.getKey().split("_").length > 1)
                    if (type.getKey().split("_")[1].equals("carpet"))
                        translationBuilder.add(key + "_block", value + " bloc");

                translationBuilder.add(key, value);
            }
        }


        translationBuilder.add("itemgroup.asurftab", "Aesthetic Surfaces");
    }
}