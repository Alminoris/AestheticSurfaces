package net.alminoris.aestheticsurfaces.util;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> PARQUET_CARPETS = createTag("parquet_carpets");

        private static TagKey<Block> createTag(String name)
        {
            return TagKey.of(Registry.BLOCK.getKey(), Identifier.of(AestheticSurfaces.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> PARQUET_CARPETS = createTag("parquet_carpets");

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(Registry.ITEM.getKey(), Identifier.of(AestheticSurfaces.MOD_ID, name));
        }
    }
}