package com.wangcanger.blue_technique.item;

import com.wangcanger.blue_technique.BlueTechnique;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// 定义了自定义物品类，用于注册游戏中的新物品
public class ModItems {
    // 注册金属相关物品
    public static final Item SILVER_INGOT = registerItems("silver_ingot",new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItems("raw_silver",new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItems("tin_ingot",new Item(new Item.Settings()));
    public static final Item RAW_TIN = registerItems("raw_tin",new Item(new Item.Settings()));
    // 注册粉末状物品
    public static final Item COAL_POWDER = registerItems("coal_powder",new Item(new Item.Settings()));
    public static final Item DIAMOND_POWDER = registerItems("diamond_powder",new Item(new Item.Settings()));
    public static final Item EMERALD_POWDER = registerItems("emerald_powder",new Item(new Item.Settings()));
    public static final Item GOLD_POWDER = registerItems("gold_powder",new Item(new Item.Settings()));
    public static final Item IRON_POWDER = registerItems("iron_powder",new Item(new Item.Settings()));
    public static final Item LAPIS_LAZULI_POWDER = registerItems("lapis_lazuli_powder",new Item(new Item.Settings()));
    // 注册食物
    public static final Item BLUEBERRIES = registerItems("blueberries",new Item(new Item.Settings().food(ModFoodComponnents.BLUEBERRIES)));

    // 工具类物品注册
    // 定义并注册银剑，使用了自定义的工具材料和属性修改器
    public static final Item SILVER_SWORD = registerItems("silver_sword",
            new SwordItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,3,-1.1f))));
    // 定义并注册银铲，使用了自定义的工具材料和属性修改器
    public static final Item SILVER_SHOVEL = registerItems("silver_shovel",
            new ShovelItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,1.6f,-2.0f))));
    // 定义并注册银镐，使用了自定义的工具材料和属性修改器
    public static final Item SILVER_PICKAXE = registerItems("silver_pickaxe",
            new PickaxeItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,1.8f,-1.9f))));
    // 定义并注册银斧，使用了自定义的工具材料和属性修改器
    public static final Item SILVER_AXE = registerItems("silver_axe",
            new AxeItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,4.0f,-1.9f))));
    // 定义并注册银锄，使用了自定义的工具材料和属性修改器
    public static final Item SILVER_HOE = registerItems("silver_hoe",
            new HoeItem(ModToolMaterials.SILVER_INGOT,new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SILVER_INGOT,0.0f,-0.9f))));

    /**
     * 注册物品到游戏中。
     *
     * @param id 物品的ID。
     * @param item 要注册的物品实例。
     * @return 注册后的物品实例。
     */
    private static Item registerItems(String id,Item item) {
        return Registry.register(Registries.ITEM,Identifier.of(BlueTechnique.MOD_ID,id),item);
    }

    /**
     * 将物品添加到物品组。
     *
     * @param fabricItemGroupEntries 物品组的入口。
     */
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(SILVER_INGOT);
    }

    /**
     * 注册模块中的所有物品。
     */
    public static void registerModItems() {

    }
}
