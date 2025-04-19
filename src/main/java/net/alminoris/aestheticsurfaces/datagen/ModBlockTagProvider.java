package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

import static net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper.COLORS;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        for (String name : COLORS)
        {
            getOrCreateTagBuilder(BlockTags.WOOL)
                    .add(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name))
                    .add(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name))
                    .add(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name));

            getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
                    .add(ModBlocks.SIMPLE_CARPETS.get(name))
                    .add(ModBlocks.SMOOTH_CARPETS.get(name))
                    .add(ModBlocks.TRANSITIONAL_CARPETS.get(name));
        }
    }
}