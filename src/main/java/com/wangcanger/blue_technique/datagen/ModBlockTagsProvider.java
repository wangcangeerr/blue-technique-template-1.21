package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.tags.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

/**
 * 自定义方块标签提供者，用于生成游戏中的方块标签数据
 */
public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    /**
     * 构造函数，初始化方块标签提供者
     *
     * @param output         方数据输出对象，用于生成数据
     * @param registriesFuture 注册表未来对象，用于处理异步注册
     */
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    /**
     * 配置方块标签的具体内容
     *
     * @param wrapperLookup 注册表包装器，用于查找和操作注册表
     */
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // 定义可以使用镐挖掘的方块标签，并添加自定义方块
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.RAW_SILVER_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK);

        // 定义需要铁工具挖掘的方块标签，并添加自定义方块
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.RAW_SILVER_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK);

        // 定义自定义的方块标签，如矿石类方块
        getOrCreateTagBuilder(ModBlockTags.BLUE_TECHNIQUE_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE);

        // 定义围栏类方块标签，并添加自定义方块
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.SILVER_FENCE);
        // 定义围栏门类方块标签，并添加自定义方块
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.SILVER_FENCE_GATE);
        // 定义墙类方块标签，并添加自定义方块
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SILVER_WALL);
        // 定义按钮类方块标签，并添加自定义方块
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.SILVER_BUTTON);
        // 定义木质围栏类方块标签，并添加自定义方块
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.SILVER_FENCE);
    }
}
