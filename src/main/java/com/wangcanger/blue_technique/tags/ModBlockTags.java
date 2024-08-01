package com.wangcanger.blue_technique.tags;

import com.wangcanger.blue_technique.BlueTechnique;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> BLUE_TECHNIQUE_ORE = of("ore_list");
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BlueTechnique.MOD_ID));
    }
    public static void registerModBlockTags() {

    }
}
