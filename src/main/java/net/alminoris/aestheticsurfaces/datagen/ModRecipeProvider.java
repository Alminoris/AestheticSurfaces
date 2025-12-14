package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.item.ModItemGroups;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.alminoris.aestheticsurfaces.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;


import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registry.BLOCK.get(Identifier.of("minecraft", name+"_planks"));

            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                offerStonecuttingRecipe(recipeExporter, ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName), block, 3);
            }
        }

        offerStonecuttingRecipe(recipeExporter, ModBlocks.SLIM_CEILINGS.get("smooth"), Blocks.SMOOTH_QUARTZ_SLAB, 2);
        offerStonecuttingRecipe(recipeExporter, ModBlocks.SLIM_CEILINGS.get("tiles"), ModBlocks.SLIM_CEILINGS.get("smooth"), 1);
        offerStonecuttingRecipe(recipeExporter, ModBlocks.SLIM_CEILINGS.get("small_tiles"), ModBlocks.SLIM_CEILINGS.get("tiles"), 1);
        offerStonecuttingRecipe(recipeExporter, ModBlocks.SLIM_CEILINGS.get("tiny_tiles"), ModBlocks.SLIM_CEILINGS.get("small_tiles"), 1);
        offerStonecuttingRecipe(recipeExporter, ModBlocks.SLIM_CEILINGS.get("concrete"), Blocks.LIGHT_GRAY_CONCRETE, 4);
        ShapelessRecipeJsonBuilder.create(ModBlocks.SLIM_CEILINGS.get("gypsum"))
                .input(Items.BONE_MEAL)
                .input(Blocks.SAND)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(Items.BONE_MEAL), conditionsFromItem(Items.BONE_MEAL))
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(recipeExporter);
        offerStonecuttingRecipe(recipeExporter, ModBlocks.SLIM_CEILINGS.get("popcorn"), Blocks.DIORITE_SLAB, 2);

        for (String name : BlockSetsHelper.BRICKS_NAMES)
        {
            Block block = Registry.BLOCK.get(Identifier.of("minecraft", name));
            offerStonecuttingRecipe(recipeExporter, ModBlocks.BRICKS_VENEERS.get(name), block, 3);
        }

        for (String name : BlockSetsHelper.COLORS)
        {
            offerStonecuttingRecipe(recipeExporter, ModBlocks.COFFERED_CEILINGS.get(name),
                    Registry.BLOCK.get(Identifier.of("minecraft", name+"_concrete")), 2);
        }

        offerStonecuttingRecipe(recipeExporter, ModBlocks.SMOOTH_STONE_ROAD, Blocks.SMOOTH_STONE, 1);

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                        Registry.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("black"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.WHITE_WOOL)
                .input('*', Blocks.BLACK_WOOL)
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL))
                .criterion(hasItem(Blocks.BLACK_WOOL), conditionsFromItem(Blocks.BLACK_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("blue"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.LIME_WOOL)
                .input('*', Blocks.BLUE_WOOL)
                .criterion(hasItem(Blocks.LIME_WOOL), conditionsFromItem(Blocks.LIME_WOOL))
                .criterion(hasItem(Blocks.BLUE_WOOL), conditionsFromItem(Blocks.BLUE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("brown"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.BLACK_WOOL)
                .input('*', Blocks.BROWN_WOOL)
                .criterion(hasItem(Blocks.BLACK_WOOL), conditionsFromItem(Blocks.BLACK_WOOL))
                .criterion(hasItem(Blocks.BROWN_WOOL), conditionsFromItem(Blocks.BROWN_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("cyan"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.PURPLE_WOOL)
                .input('*', Blocks.CYAN_WOOL)
                .criterion(hasItem(Blocks.PURPLE_WOOL), conditionsFromItem(Blocks.PURPLE_WOOL))
                .criterion(hasItem(Blocks.CYAN_WOOL), conditionsFromItem(Blocks.CYAN_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("gray"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.GREEN_WOOL)
                .input('*', Blocks.GRAY_WOOL)
                .criterion(hasItem(Blocks.GREEN_WOOL), conditionsFromItem(Blocks.GREEN_WOOL))
                .criterion(hasItem(Blocks.GRAY_WOOL), conditionsFromItem(Blocks.GRAY_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("green"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.BROWN_WOOL)
                .input('*', Blocks.GREEN_WOOL)
                .criterion(hasItem(Blocks.BROWN_WOOL), conditionsFromItem(Blocks.BROWN_WOOL))
                .criterion(hasItem(Blocks.GREEN_WOOL), conditionsFromItem(Blocks.GREEN_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("light_blue"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.CYAN_WOOL)
                .input('*', Blocks.LIGHT_BLUE_WOOL)
                .criterion(hasItem(Blocks.CYAN_WOOL), conditionsFromItem(Blocks.CYAN_WOOL))
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL), conditionsFromItem(Blocks.LIGHT_BLUE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("light_gray"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.GRAY_WOOL)
                .input('*', Blocks.LIGHT_GRAY_WOOL)
                .criterion(hasItem(Blocks.GRAY_WOOL), conditionsFromItem(Blocks.GRAY_WOOL))
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL), conditionsFromItem(Blocks.LIGHT_GRAY_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("lime"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.LIGHT_BLUE_WOOL)
                .input('*', Blocks.LIME_WOOL)
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL), conditionsFromItem(Blocks.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Blocks.LIME_WOOL), conditionsFromItem(Blocks.LIME_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("magenta"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.RED_WOOL)
                .input('*', Blocks.MAGENTA_WOOL)
                .criterion(hasItem(Blocks.RED_WOOL), conditionsFromItem(Blocks.RED_WOOL))
                .criterion(hasItem(Blocks.MAGENTA_WOOL), conditionsFromItem(Blocks.MAGENTA_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("orange"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.YELLOW_WOOL)
                .input('*', Blocks.ORANGE_WOOL)
                .criterion(hasItem(Blocks.YELLOW_WOOL), conditionsFromItem(Blocks.YELLOW_WOOL))
                .criterion(hasItem(Blocks.ORANGE_WOOL), conditionsFromItem(Blocks.ORANGE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("pink"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.MAGENTA_WOOL)
                .input('*', Blocks.PINK_WOOL)
                .criterion(hasItem(Blocks.MAGENTA_WOOL), conditionsFromItem(Blocks.MAGENTA_WOOL))
                .criterion(hasItem(Blocks.PINK_WOOL), conditionsFromItem(Blocks.PINK_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("purple"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.PINK_WOOL)
                .input('*', Blocks.PURPLE_WOOL)
                .criterion(hasItem(Blocks.PINK_WOOL), conditionsFromItem(Blocks.PINK_WOOL))
                .criterion(hasItem(Blocks.PURPLE_WOOL), conditionsFromItem(Blocks.PURPLE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("red"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.ORANGE_WOOL)
                .input('*', Blocks.RED_WOOL)
                .criterion(hasItem(Blocks.ORANGE_WOOL), conditionsFromItem(Blocks.ORANGE_WOOL))
                .criterion(hasItem(Blocks.RED_WOOL), conditionsFromItem(Blocks.RED_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("white"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.LIGHT_GRAY_WOOL)
                .input('*', Blocks.WHITE_WOOL)
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL), conditionsFromItem(Blocks.LIGHT_GRAY_WOOL))
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("yellow"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.BLUE_WOOL)
                .input('*', Blocks.YELLOW_WOOL)
                .criterion(hasItem(Blocks.BLUE_WOOL), conditionsFromItem(Blocks.BLUE_WOOL))
                .criterion(hasItem(Blocks.YELLOW_WOOL), conditionsFromItem(Blocks.YELLOW_WOOL))
                .offerTo(recipeExporter);

        for(String name : BlockSetsHelper.COLORS)
        {
            ShapedRecipeJsonBuilder.create(ModBlocks.SIMPLE_CARPETS.get(name), 4)
                    .pattern("##")
                    .input('#', ModBlocks.SIMPLE_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMOOTH_CARPETS.get(name), 4)
                    .pattern("##")
                    .input('#', ModBlocks.SMOOTH_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name), 4)
                    .pattern("##")
                    .pattern("##")
                    .input('#', Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool")))
                    .criterion(hasItem(Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool"))),
                            conditionsFromItem(Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool"))))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name), 1)
                    .pattern("RGB")
                    .pattern(" # ")
                    .input('R', Items.RED_DYE)
                    .input('G', Items.GREEN_DYE)
                    .input('B', Items.BLUE_DYE)
                    .input('#', Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool")))
                    .criterion(hasItem(Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool"))),
                            conditionsFromItem(Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool"))))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_CARPETS.get(name), 4)
                    .pattern("##")
                    .input('#', ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SIMPLE_WALLPAPERS.get(name), 4)
                    .pattern("#")
                    .pattern("#")
                    .input('#', ModBlocks.SIMPLE_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMOOTH_WALLPAPERS.get(name), 4)
                    .pattern("#")
                    .pattern("#")
                    .input('#', ModBlocks.SMOOTH_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.TRANSITIONAL_WALLPAPERS.get(name), 4)
                    .pattern("#")
                    .pattern("#")
                    .input('#', ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.WALLPAPERS.get(name), 4)
                    .pattern("#")
                    .pattern("#")
                    .input('#', Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool")))
                    .criterion(hasItem(Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool"))),
                            conditionsFromItem(Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool"))))
                    .offerTo(recipeExporter);
        }
    }
}