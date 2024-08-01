package com.wangcanger.blue_technique.tags;

import com.wangcanger.blue_technique.BlueTechnique;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

/**
 * ModItemTags类用于定义模组中的物品标签
 * 物品标签可以用于方便地对物品进行分类和筛选
 */
public class ModItemTags {
    // 定义了名为"staick"的物品标签
    public static final TagKey<Item> STICK = of("staick");
    // 定义了名为"powder"的物品标签
    public static final TagKey<Item> POWDER = of("powder");

    /**
     * 构造TagKey的私有方法
     * 此方法用于创建与模组ID绑定的物品标签键
     *
     * @param id 标签的ID，将被用于标识该标签
     * @return 返回一个与模组ID绑定的物品标签键
     */
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(BlueTechnique.MOD_ID, id));
    }

    /**
     * 注册物品标签的方法
     * 目前该方法为空，未实现具体逻辑
     */
    public static void registerItemTags() {

    }
}

