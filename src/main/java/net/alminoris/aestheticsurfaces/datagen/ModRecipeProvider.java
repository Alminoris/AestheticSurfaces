package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.alminoris.aestheticsurfaces.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name+"_planks"));

            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName), block, 3);
            }
        }

        for (String name : BlockSetsHelper.CEILING_TYPES)
        {

        }

        for (String name : BlockSetsHelper.COLORS)
        {
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COFFERED_CEILINGS.get(name),
                    Registries.BLOCK.get(Identifier.ofVanilla(name+"_concrete")), 2);
        }

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_ROAD, Blocks.SMOOTH_STONE, 1);

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : BlockSetsHelper.WT_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : BlockSetsHelper.ST_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : BlockSetsHelper.MT_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName)).getPath(), "3");
                ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                        Registries.BLOCK.getId(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName)).getPath(), "1");
            }
        }

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("black"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.WHITE_WOOL)
                .input('*', Blocks.BLACK_WOOL)
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL))
                .criterion(hasItem(Blocks.BLACK_WOOL), conditionsFromItem(Blocks.BLACK_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("blue"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.LIME_WOOL)
                .input('*', Blocks.BLUE_WOOL)
                .criterion(hasItem(Blocks.LIME_WOOL), conditionsFromItem(Blocks.LIME_WOOL))
                .criterion(hasItem(Blocks.BLUE_WOOL), conditionsFromItem(Blocks.BLUE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("brown"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.BLACK_WOOL)
                .input('*', Blocks.BROWN_WOOL)
                .criterion(hasItem(Blocks.BLACK_WOOL), conditionsFromItem(Blocks.BLACK_WOOL))
                .criterion(hasItem(Blocks.BROWN_WOOL), conditionsFromItem(Blocks.BROWN_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("cyan"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.PURPLE_WOOL)
                .input('*', Blocks.CYAN_WOOL)
                .criterion(hasItem(Blocks.PURPLE_WOOL), conditionsFromItem(Blocks.PURPLE_WOOL))
                .criterion(hasItem(Blocks.CYAN_WOOL), conditionsFromItem(Blocks.CYAN_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("gray"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.GREEN_WOOL)
                .input('*', Blocks.GRAY_WOOL)
                .criterion(hasItem(Blocks.GREEN_WOOL), conditionsFromItem(Blocks.GREEN_WOOL))
                .criterion(hasItem(Blocks.GRAY_WOOL), conditionsFromItem(Blocks.GRAY_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("green"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.BROWN_WOOL)
                .input('*', Blocks.GREEN_WOOL)
                .criterion(hasItem(Blocks.BROWN_WOOL), conditionsFromItem(Blocks.BROWN_WOOL))
                .criterion(hasItem(Blocks.GREEN_WOOL), conditionsFromItem(Blocks.GREEN_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("light_blue"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.CYAN_WOOL)
                .input('*', Blocks.LIGHT_BLUE_WOOL)
                .criterion(hasItem(Blocks.CYAN_WOOL), conditionsFromItem(Blocks.CYAN_WOOL))
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL), conditionsFromItem(Blocks.LIGHT_BLUE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("light_gray"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.GRAY_WOOL)
                .input('*', Blocks.LIGHT_GRAY_WOOL)
                .criterion(hasItem(Blocks.GRAY_WOOL), conditionsFromItem(Blocks.GRAY_WOOL))
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL), conditionsFromItem(Blocks.LIGHT_GRAY_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("lime"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.LIGHT_BLUE_WOOL)
                .input('*', Blocks.LIME_WOOL)
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL), conditionsFromItem(Blocks.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Blocks.LIME_WOOL), conditionsFromItem(Blocks.LIME_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("magenta"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.RED_WOOL)
                .input('*', Blocks.MAGENTA_WOOL)
                .criterion(hasItem(Blocks.RED_WOOL), conditionsFromItem(Blocks.RED_WOOL))
                .criterion(hasItem(Blocks.MAGENTA_WOOL), conditionsFromItem(Blocks.MAGENTA_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("orange"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.YELLOW_WOOL)
                .input('*', Blocks.ORANGE_WOOL)
                .criterion(hasItem(Blocks.YELLOW_WOOL), conditionsFromItem(Blocks.YELLOW_WOOL))
                .criterion(hasItem(Blocks.ORANGE_WOOL), conditionsFromItem(Blocks.ORANGE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("pink"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.MAGENTA_WOOL)
                .input('*', Blocks.PINK_WOOL)
                .criterion(hasItem(Blocks.MAGENTA_WOOL), conditionsFromItem(Blocks.MAGENTA_WOOL))
                .criterion(hasItem(Blocks.PINK_WOOL), conditionsFromItem(Blocks.PINK_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("purple"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.PINK_WOOL)
                .input('*', Blocks.PURPLE_WOOL)
                .criterion(hasItem(Blocks.PINK_WOOL), conditionsFromItem(Blocks.PINK_WOOL))
                .criterion(hasItem(Blocks.PURPLE_WOOL), conditionsFromItem(Blocks.PURPLE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("red"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.ORANGE_WOOL)
                .input('*', Blocks.RED_WOOL)
                .criterion(hasItem(Blocks.ORANGE_WOOL), conditionsFromItem(Blocks.ORANGE_WOOL))
                .criterion(hasItem(Blocks.RED_WOOL), conditionsFromItem(Blocks.RED_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("white"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.LIGHT_GRAY_WOOL)
                .input('*', Blocks.WHITE_WOOL)
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL), conditionsFromItem(Blocks.LIGHT_GRAY_WOOL))
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get("yellow"), 4)
                .pattern("##")
                .pattern("**")
                .input('#', Blocks.BLUE_WOOL)
                .input('*', Blocks.YELLOW_WOOL)
                .criterion(hasItem(Blocks.BLUE_WOOL), conditionsFromItem(Blocks.BLUE_WOOL))
                .criterion(hasItem(Blocks.YELLOW_WOOL), conditionsFromItem(Blocks.YELLOW_WOOL))
                .offerTo(recipeExporter);

        for(String name : BlockSetsHelper.COLORS)
        {
            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SIMPLE_CARPETS.get(name), 4)
                    .pattern("##")
                    .input('#', ModBlocks.SIMPLE_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_CARPETS.get(name), 4)
                    .pattern("##")
                    .input('#', ModBlocks.SMOOTH_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_CARPET_BLOCKS.get(name), 4)
                    .pattern("##")
                    .pattern("##")
                    .input('#', Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool")))
                    .criterion(hasItem(Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool"))),
                            conditionsFromItem(Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool"))))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SIMPLE_CARPET_BLOCKS.get(name), 1)
                    .pattern("RGB")
                    .pattern(" # ")
                    .input('R', Items.RED_DYE)
                    .input('G', Items.GREEN_DYE)
                    .input('B', Items.BLUE_DYE)
                    .input('#', Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool")))
                    .criterion(hasItem(Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool"))),
                            conditionsFromItem(Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool"))))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_CARPETS.get(name), 4)
                    .pattern("##")
                    .input('#', ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SIMPLE_WALLPAPERS.get(name), 4)
                    .pattern("#")
                    .pattern("#")
                    .input('#', ModBlocks.SIMPLE_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_WALLPAPERS.get(name), 4)
                    .pattern("#")
                    .pattern("#")
                    .input('#', ModBlocks.SMOOTH_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TRANSITIONAL_WALLPAPERS.get(name), 4)
                    .pattern("#")
                    .pattern("#")
                    .input('#', ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name))
                    .criterion(hasItem(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name)), conditionsFromItem(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WALLPAPERS.get(name), 4)
                    .pattern("#")
                    .pattern("#")
                    .input('#', Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool")))
                    .criterion(hasItem(Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool"))),
                            conditionsFromItem(Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool"))))
                    .offerTo(recipeExporter);
        }
    }
}