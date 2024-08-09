package com.wangcanger.blue_technique.tags;

import com.wangcanger.blue_technique.BlueTechnique;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

/**
 * ModBlockTags类用于定义模组中块的标签
 */
public class ModBlockTags {
    // 定义矿石的标签
    public static final TagKey<Block> BLUE_TECHNIQUE_ORE = of("ore_list");

    public static final TagKey<Block> CULTIVATION_SOIL = of("cultivation_soil");

    /**
     * 根据给定的ID字符串创建一个标签键
     *
     * @param id 标签的ID字符串，这里使用了BlueTechnique模组的ID
     * @return 返回一个Block类型的标签键
     */
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BlueTechnique.MOD_ID));
    }

    /**
     * 注册模组的块标签
     */
    public static void registerModBlockTags() {

    }
}
