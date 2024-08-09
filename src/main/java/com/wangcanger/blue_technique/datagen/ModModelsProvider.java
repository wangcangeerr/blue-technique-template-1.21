package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.block.ModBlockFamilies;
import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.state.property.Properties;

/**
 * 自定义模型提供者，用于生成游戏中的方块和物品模型
 */
public class ModModelsProvider extends FabricModelProvider {
    /**
     * 构造函数，初始化模型提供者
     *
     * @param output 数据输出对象，用于生成数据
     */
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * 生成方块状态模型
     * 该方法中定义了如何生成自定义方块的模型
     *
     * @param blockStateModelGenerator 方块状态模型生成器，用于注册方块模型
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // 为所有的方块家族生成模型
        ModBlockFamilies.getFamilies()
                .filter(BlockFamily::shouldGenerateModels).forEach(
                        blockFamily -> blockStateModelGenerator.registerCubeAllModelTexturePool(blockFamily.getBaseBlock())
                                .family(blockFamily));
        // 为特定方块注册简单立方体模型
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COAL_CULTIVATION_SOIL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_CULTIVATION_SOIL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMERALD_CULTIVATION_SOIL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAPIS_LAZULI_CULTIVATION_SOIL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REDSTONE_CULTIVATION_SOIL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_CULTIVATION_SOIL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLD_CULTIVATION_SOIL);

        blockStateModelGenerator.registerCrop(ModBlocks.BLUEBERRIES_CROP, Properties.AGE_3, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.DIAMOND_BERRIES_CROP, Properties.AGE_3, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.EMERALD_BERRIES_CROP, Properties.AGE_3, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.GOLD_BERRIES_CROP, Properties.AGE_3, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.IRON_BERRIES_CROP, Properties.AGE_3, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.LAPIS_LAZULI_BERRIES_CROP, Properties.AGE_3, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.REDSTONE_BERRIES_CROP, Properties.AGE_3, 0, 1, 2, 3);
    }

    /**
     * 生成物品模型
     * 该方法中定义了如何生成自定义物品的模型
     *
     * @param itemModelGenerator 物品模型生成器，用于注册物品模型
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // 为金属锭和原材料物品注册生成模型
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COAL_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_LAZULI_POWDER, Models.GENERATED);


        // 为工具类物品注册手持模型
        itemModelGenerator.register(ModItems.SILVER_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_SWORD,Models.HANDHELD);
    }
}
