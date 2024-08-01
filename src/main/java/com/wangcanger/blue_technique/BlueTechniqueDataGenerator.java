package com.wangcanger.blue_technique;

import com.wangcanger.blue_technique.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * 蓝色技术模组的数据生成器入口类，用于在游戏启动时生成模组所需的各种数据
 */
public class BlueTechniqueDataGenerator implements DataGeneratorEntrypoint {

    /**
     * 初始化数据生成器，配置数据包的提供者
     *
     * @param fabricDataGenerator 数据生成器实例，用于创建数据包并添加数据提供者
     */
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        // 创建一个新的数据包
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        // 为数据包添加各种数据提供者，这些提供者负责生成具体的数据文件
        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModItemTagsProvider::new);
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModRecipesProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModENUSLanProvider::new);
    }
}
