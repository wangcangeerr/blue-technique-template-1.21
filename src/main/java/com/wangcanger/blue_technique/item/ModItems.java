package com.wangcanger.blue_technique.item;

import com.wangcanger.blue_technique.BlueTechnique;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SILVER_INGOT = registerItems("silver_ingot",new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItems("raw_silver",new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItems("tin_ingot",new Item(new Item.Settings()));
    public static final Item RAW_TIN = registerItems("raw_tin",new Item(new Item.Settings()));
    public static final Item COAL_POWDER = registerItems("coal_powder",new Item(new Item.Settings()));
    public static final Item DIAMOND_POWDER = registerItems("diamond_powder",new Item(new Item.Settings()));
    public static final Item EMERALD_POWDER = registerItems("emerald_powder",new Item(new Item.Settings()));
    public static final Item GOLD_POWDER = registerItems("gold_powder",new Item(new Item.Settings()));
    public static final Item IRON_POWDER = registerItems("iron_powder",new Item(new Item.Settings()));
    public static final Item LAPIS_LAZULI_POWDER = registerItems("lapis_lazuli_powder",new Item(new Item.Settings()));
    //Tools
    public static final Item SILVER_SWORD = registerItems("silver_sword",
            new SwordItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,3,-1.1f))));
    public static final Item SILVER_SHOVEL = registerItems("silver_shovel",
            new ShovelItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,1.6f,-2.0f))));
    public static final Item SILVER_PICKAXE = registerItems("silver_pickaxe",
            new PickaxeItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,1.8f,-1.9f))));
    public static final Item SILVER_AXE = registerItems("silver_axe",
            new AxeItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,4.0f,-1.9f))));
    public static final Item SILVER_HOE = registerItems("silver_hoe",
            new HoeItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,0.0f,-0.9f))));

    private static Item registerItems(String id,Item item) {
        return Registry.register(Registries.ITEM,Identifier.of(BlueTechnique.MOD_ID,id),item);
    }
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(SILVER_INGOT);
    }
    public static void registerModItems() {

    }
}
