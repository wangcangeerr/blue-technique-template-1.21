package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.item.ModItems;
import com.wangcanger.blue_technique.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

/**
 * 自定义物品标签提供者，用于生成游戏中的物品标签数据
 */
public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {

    /**
     * 构造函数
     *
     * @param output 数据输出对象
     * @param completableFuture 包含注册表查找的未来完成任务
     */
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    /**
     * 配置物品标签
     *
     * @param wrapperLookup 注册表查找对象
     */
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // 创建或获取STICK标签，并添加基础棒物品
        getOrCreateTagBuilder(ModItemTags.STICK)
                .add(Items.STICK);

        // 创建或获取POWDER标签，并添加多种粉末类物品
        getOrCreateTagBuilder(ModItemTags.POWDER)
                .add(ModItems.IRON_POWDER)
                .add(ModItems.GOLD_POWDER)
                .add(ModItems.LAPIS_LAZULI_POWDER)
                .add(ModItems.DIAMOND_POWDER)
                .add(ModItems.EMERALD_POWDER)
                .add(ModItems.COAL_POWDER);
    }
}
