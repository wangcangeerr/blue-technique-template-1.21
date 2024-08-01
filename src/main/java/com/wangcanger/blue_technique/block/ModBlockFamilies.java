package com.wangcanger.blue_technique.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class ModBlockFamilies {
    // 使用Google的Maps类创建一个用于存储方块及其对应方块家族的映射
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.newHashMap();

    // 定义银方块家族，包括方块的各种变种如楼梯、按钮等
    public static BlockFamily SILVER = register(ModBlocks.SILVER_BLOCK)
            .stairs(ModBlocks.SILVER_STAIRS)
            .slab(ModBlocks.SILVER_SLAB)
            .button(ModBlocks.SILVER_BUTTON)
            .wall(ModBlocks.SILVER_WALL)
            .fence(ModBlocks.SILVER_FENCE)
            .fenceGate(ModBlocks.SILVER_FENCE_GATE)
            .pressurePlate(ModBlocks.SILVER_PRESSURE_PLATE)
            .door(ModBlocks.SILVER_DOOR)
            .trapdoor(ModBlocks.SILVER_TRAPDOOR)
            .build();

    /**
     * 注册一个新的方块家族
     *
     * @param baseBlock 基础方块，用于构建方块家族
     * @return 返回一个方块家族构建器，用于添加更多细节
     */
    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            // 如果该方块家族已经存在，则抛出异常
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }

    /**
     * 获取所有已注册的方块家族的流
     *
     * @return 返回一个包含所有方块家族的流
     */
    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
