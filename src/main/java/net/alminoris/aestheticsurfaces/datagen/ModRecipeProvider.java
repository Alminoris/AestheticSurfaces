package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> recipeExporter)
    {
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