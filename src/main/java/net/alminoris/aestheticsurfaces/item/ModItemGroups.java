package net.alminoris.aestheticsurfaces.item;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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

    public static final ItemGroup ASURF_TAB = FabricItemGroupBuilder.build(new Identifier(AestheticSurfaces.MOD_ID, "asurftab"),
            () -> new ItemStack(Blocks.RED_CARPET));

    public static void registerItemGroups()
    {

    }
}