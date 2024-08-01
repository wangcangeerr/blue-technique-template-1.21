package com.wangcanger.blue_technique.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class ModBlockFamilies {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();

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
    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily)BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }
    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
