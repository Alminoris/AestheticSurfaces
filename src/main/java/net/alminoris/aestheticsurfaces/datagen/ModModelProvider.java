package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.alminoris.aestheticsurfaces.util.helper.ModJsonHelper;
import net.alminoris.aestheticsurfaces.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.COLORS)
        {
            registerWallpaper(blockStateModelGenerator, ModBlocks.WALLPAPERS.get(name), name);
            registerWoolCarpetAndWallpaper(blockStateModelGenerator, ModBlocks.SIMPLE_CARPET_BLOCKS.get(name), ModBlocks.SIMPLE_CARPETS.get(name), ModBlocks.SIMPLE_WALLPAPERS.get(name));
            registerWoolCarpetAndWallpaper(blockStateModelGenerator, ModBlocks.SMOOTH_CARPET_BLOCKS.get(name), ModBlocks.SMOOTH_CARPETS.get(name), ModBlocks.SMOOTH_WALLPAPERS.get(name));
            registerWoolCarpetAndWallpaper(blockStateModelGenerator, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name), ModBlocks.TRANSITIONAL_CARPETS.get(name), ModBlocks.TRANSITIONAL_WALLPAPERS.get(name));
            registerCofferedCeilingBlock(blockStateModelGenerator, ModBlocks.COFFERED_CEILINGS.get(name), name);
        }

        for(String name : BlockSetsHelper.CEILING_TYPES)
        {
            registerSlimCeilingBlock(blockStateModelGenerator, ModBlocks.SLIM_CEILINGS.get(name), name);
        }

        for(String name : BlockSetsHelper.getWoods())
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                registerCarpetAndParquetBlock(blockStateModelGenerator, ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName), ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));

        registerPathBlock(blockStateModelGenerator, ModBlocks.SMOOTH_STONE_ROAD, "minecraft:block/smooth_stone");
    }

    public final void registerPathBlock(BlockStateModelGenerator blockStateModelGenerator, Block block, String texture)
    {
        ModJsonHelper.createBlockModel(ModJsonTemplates.PATH_BLOCK_MODEL_TEMPLATE, Registries.BLOCK.getId(block).getPath(), texture);
        blockStateModelGenerator.registerSimpleState(block);
    }

    public final void registerCofferedCeilingBlock(BlockStateModelGenerator blockStateModelGenerator, Block block, String color)
    {
        ModJsonHelper.createBlockModel(ModJsonTemplates.COFFERED_CEILING, Registries.BLOCK.getId(block).getPath(), "minecraft:block/"+color+"_concrete");
        blockStateModelGenerator.registerSimpleState(block);
    }

    public final void registerSlimCeilingBlock(BlockStateModelGenerator blockStateModelGenerator, Block block, String type)
    {
        ModJsonHelper.createBlockModel(ModJsonTemplates.SLIM_CEILING, Registries.BLOCK.getId(block).getPath(), type);
        blockStateModelGenerator.registerSimpleState(block);
    }

    public final void registerCarpetAndParquetBlock(BlockStateModelGenerator blockStateModelGenerator, Block block, Block carpet)
    {
        ModJsonHelper.createBlockModel(ModJsonTemplates.PARQUET_BLOCK_MODEL_TEMPLATE, Registries.BLOCK.getId(block).getPath());
        ModJsonHelper.createYAxisRotatedBlockState(Registries.BLOCK.getId(block).getPath());
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registries.BLOCK.getId(block).getPath()));

        ModJsonHelper.createBlockModel(ModJsonTemplates.CARPET_MODEL_TEMPLATE, Registries.BLOCK.getId(carpet).getPath());
        ModJsonHelper.createYAxisRotatedBlockState(Registries.BLOCK.getId(carpet).getPath());
        blockStateModelGenerator.registerParentedItemModel(carpet, Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registries.BLOCK.getId(carpet).getPath()));
    }

    public final void registerCarpetAndBlock(BlockStateModelGenerator blockStateModelGenerator, Block block, Block carpet)
    {
        ModJsonHelper.createBlockModel(ModJsonTemplates.CARPET_BLOCK_MODEL_TEMPLATE, Registries.BLOCK.getId(block).getPath());
        ModJsonHelper.createYAxisRotatedBlockState(Registries.BLOCK.getId(block).getPath());
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registries.BLOCK.getId(block).getPath()));

        ModJsonHelper.createBlockModel(ModJsonTemplates.CARPET_MODEL_TEMPLATE, Registries.BLOCK.getId(carpet).getPath());
        ModJsonHelper.createYAxisRotatedBlockState(Registries.BLOCK.getId(carpet).getPath());
        blockStateModelGenerator.registerParentedItemModel(carpet, Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registries.BLOCK.getId(carpet).getPath()));
    }

    public final void registerWoolCarpetAndWallpaper(BlockStateModelGenerator blockStateModelGenerator, Block wool, Block carpet, Block... wallpaper)
    {
        registerCarpetAndBlock(blockStateModelGenerator, wool, carpet);

        if (wallpaper.length > 0)
        {
            ModJsonHelper.createBlockModel(ModJsonTemplates.WALLPAPER_MODEL_TEMPLATE, Registries.BLOCK.getId(wallpaper[0]).getPath());
            ModJsonHelper.createYAxisRotatedBlockState(Registries.BLOCK.getId(wallpaper[0]).getPath());
            blockStateModelGenerator.registerParentedItemModel(wallpaper[0], Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registries.BLOCK.getId(wallpaper[0]).getPath()));
        }
    }

    public final void registerWallpaper(BlockStateModelGenerator blockStateModelGenerator, Block wallpaper, String colorName)
    {
        ModJsonHelper.createWallpaperBlockModel(ModJsonTemplates.WALLPAPER_MODEL_TEMPLATE, Registries.BLOCK.getId(wallpaper).getPath(), colorName);
        ModJsonHelper.createYAxisRotatedBlockState(Registries.BLOCK.getId(wallpaper).getPath());
        blockStateModelGenerator.registerParentedItemModel(wallpaper, Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registries.BLOCK.getId(wallpaper).getPath()));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }
}