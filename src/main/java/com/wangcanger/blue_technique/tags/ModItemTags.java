package com.wangcanger.blue_technique.tags;

import com.wangcanger.blue_technique.BlueTechnique;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> STICK = of("staick");
    public static final TagKey<Item> POWDER = of("powder");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(BlueTechnique.MOD_ID));
    }
    public static void registerItemTags() {

    }
}
