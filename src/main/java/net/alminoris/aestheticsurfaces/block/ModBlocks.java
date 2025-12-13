package net.alminoris.aestheticsurfaces.block;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.alminoris.aestheticsurfaces.block.custom.*;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Block SMOOTH_STONE_ROAD = registerBlock("smooth_stone_road", new PathBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));

    public static final Dictionary<String, Block> PARQUET_CARPETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                put(name+"_"+typeName, registerBlock(typeName+"_parquet_"+name, new YAxisRotatedCarpetBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
            }
        }
    }};

    public static final Dictionary<String, Block> PARQUET_BLOCKS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
            {
                put(name+"_"+typeName, registerBlock(typeName+"_parquet_"+name+"_block", new ParquetBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
            }
        }
    }};

    public static final Dictionary<String, Block> SLIM_CEILINGS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.CEILING_TYPES)
        {
            put(name, registerBlock("slim_ceiling_"+name, new SlimCeilingBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static final Dictionary<String, Block> COFFERED_CEILINGS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("coffered_ceiling_"+name, new CofferedCeilingBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE))));
        }
    }};

    public static final Dictionary<String, Block> BRICKS_VENEERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.BRICKS_NAMES)
        {
            put(name, registerBlock("veneer_"+name, new BricksVeneerBlock(AbstractBlock.Settings.copy(Blocks.BRICKS))));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_CARPETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("simple_carpet_"+name, new YAxisRotatedCarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_CARPET_BLOCKS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("simple_carpet_"+name+"_block", new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_WALLPAPERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("simple_wallpaper_"+name, new WallpaperBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> SMOOTH_CARPETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("smooth_carpet_"+name, new YAxisRotatedCarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> SMOOTH_WALLPAPERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("smooth_wallpaper_"+name, new WallpaperBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> SMOOTH_CARPET_BLOCKS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("smooth_carpet_"+name+"_block", new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> TRANSITIONAL_CARPETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("transitional_carpet_"+name, new YAxisRotatedCarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> TRANSITIONAL_CARPET_BLOCKS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("transitional_carpet_"+name+"_block", new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> TRANSITIONAL_WALLPAPERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("transitional_wallpaper_"+name, new WallpaperBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static final Dictionary<String, Block> WALLPAPERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("wallpaper_"+name, new WallpaperBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AestheticSurfaces.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AestheticSurfaces.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {

    }
}