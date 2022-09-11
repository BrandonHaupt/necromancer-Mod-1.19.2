package net.hollows.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hollows.necromancer.Necromancer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final  Item NECROMANCER_STAFF = registerItem("necromancer_staff", new Item(new FabricItemSettings().group(ModItemGroup.SOUL_FRAGMENT)));
    public static final  Item SOUL_FRAGMENT = registerItem("soul_fragment", new Item(new FabricItemSettings().group(ModItemGroup.SOUL_FRAGMENT)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Necromancer.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Necromancer.LOGGER.debug("Registering Mod Items for " + Necromancer.MOD_ID);
    }
}
