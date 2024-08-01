package com.wangcanger.blue_technique;

import com.wangcanger.blue_technique.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

/**
 * BlueTechniqueClient类作为客户端模组的初始化器，用于在客户端加载时进行特定的初始化操作
 * 主要用于设置模组中新增方块的渲染方式
 */
public class BlueTechniqueClient implements ClientModInitializer {

    /**
     * 在客户端加载时进行初始化
     * 主要用于设置模组中新增方块的渲染层次，以确保方块在世界中的正确渲染
     */
    @Override
    public void onInitializeClient() {
        // 设置银门方块的渲染层次为剪裁，以确保其在渲染时能正确地与其他方块分层
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SILVER_DOOR, RenderLayer.getCutout());
        // 设置银活板门方块的渲染层次为剪裁，原因同上
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SILVER_TRAPDOOR, RenderLayer.getCutout());
    }
}
