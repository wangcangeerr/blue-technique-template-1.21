package com.wangcanger.blue_technique.item;

import com.wangcanger.blue_technique.BlueTechnique;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SILVER_INGOT = registerItems("silver_ingot",new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItems("raw_silver",new Item(new Item.Settings()));

    private static Item registerItems(String id,Item item) {
        return Registry.register(Registries.ITEM,Identifier.of(BlueTechnique.MOD_ID,id),item);
    }
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(SILVER_INGOT);
    }
    public static void registerModItems() {

    }
}
