package com.wangcanger.blue_technique.item;

import com.wangcanger.blue_technique.BlueTechnique;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SILVER_INGOT = registerItems("silver_ingot",new Item(new Item.Settings()));

    private static Item registerItems(String id,Item item) {
        return Registry.register(Registries.ITEM,Identifier.of(BlueTechnique.MOD_ID,id),item);
    }
    public static void registerModItems() {}
}
