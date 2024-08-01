package com.wangcanger.blue_technique;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItemGroups;
import com.wangcanger.blue_technique.item.ModItems;
import com.wangcanger.blue_technique.tags.ModBlockTags;
import com.wangcanger.blue_technique.tags.ModItemTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BlueTechnique类作为模组的主入口点，负责在游戏加载时初始化模组的各项资源
 * 它实现了ModInitializer接口，用于在Fabric环境中进行模组的初始化
 */
public class BlueTechnique implements ModInitializer {

    // 定义模组的ID，用于唯一标识模组
    public static final String MOD_ID = "blue_technique";

    // 初始化日志记录器，用于记录模组运行时的信息
    public static final Logger LOGGER = LoggerFactory.getLogger("blue_technique");

    /**
     * 当Fabric加载模组时，会调用此方法进行初始化
     * 初始化过程包括注册物品、方块、物品组以及标签等
     */
    @Override
    public void onInitialize() {

        ModItems.registerModItems(); // 注册模组中的物品
        ModBlocks.registerModBlocks(); // 注册模组中的方块
        ModItemGroups.registerModItemGroups(); // 注册模组中的物品组
        ModBlockTags.registerModBlockTags(); // 注册模组中的方块标签
        ModItemTags.registerItemTags(); // 注册模组中的物品标签

        LOGGER.info("Hello Fabric world!"); // 记录模组加载完成的日志信息
    }
}
