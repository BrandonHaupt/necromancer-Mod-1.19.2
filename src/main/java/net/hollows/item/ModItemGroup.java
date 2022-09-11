package net.hollows.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.hollows.necromancer.Necromancer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    //if I wanted a second one I can just copy VVVVVVV and paste it below and change the path and name
    public static final ItemGroup SOUL_FRAGMENT = FabricItemGroupBuilder.build(
            new Identifier(Necromancer.MOD_ID, "soul_fragment"), () -> new ItemStack(ModItems.SOUL_FRAGMENT));
}
