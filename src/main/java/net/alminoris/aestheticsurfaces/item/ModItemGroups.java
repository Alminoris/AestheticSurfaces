package net.alminoris.aestheticsurfaces.item;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final String[] EXTRA_WOODS_WF =
            {
                    "olive", "tamarisk"
            };

    public static final String[] EXTRA_WOODS_AN =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar"
            };

    public static final ItemGroup ASURF_TAB = FabricItemGroup.builder(new Identifier(AestheticSurfaces.MOD_ID, "asurftab"))
            .displayName(Text.translatable("itemgroup.asurftab"))
                    .icon(() -> new ItemStack(Blocks.RED_CARPET)).entries((displayContext, entries) ->
                    {
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.WALLPAPERS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SIMPLE_CARPETS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SIMPLE_WALLPAPERS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SMOOTH_CARPETS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SMOOTH_WALLPAPERS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.TRANSITIONAL_CARPETS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.TRANSITIONAL_WALLPAPERS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name));
                    }).build();

    public static void registerItemGroups()
    {

    }
}