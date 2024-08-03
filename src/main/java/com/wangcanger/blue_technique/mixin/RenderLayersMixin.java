package com.wangcanger.blue_technique.mixin;

import com.wangcanger.blue_technique.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

// 混合类RenderLayersMixin，用于修改渲染层
@Mixin(RenderLayers.class)
public class RenderLayersMixin {
    // 定义一个静态最终字段BLOCKS，用于存储Block到RenderLayer的映射
    @Shadow @Final private static Map<Block, RenderLayer> BLOCKS;

    // 静态初始化块注入方法，用于在类初始化时添加自定义方块的渲染层
    @Inject(method = "<clinit>", at = @At("RETURN"))
    private static void onBlock(CallbackInfo ci) {
        // 将银门方块添加到剪裁渲染层
        BLOCKS.put(ModBlocks.SILVER_DOOR, RenderLayer.getCutout());
        // 将银活板门方块添加到剪裁渲染层
        BLOCKS.put(ModBlocks.SILVER_TRAPDOOR, RenderLayer.getCutout());
        BLOCKS.put(ModBlocks.BLUEBERRIES_CROP,RenderLayer.getCutout());
        BLOCKS.put(ModBlocks.DIAMOND_BERRIES_CROP,RenderLayer.getCutout());
        BLOCKS.put(ModBlocks.EMERALD_BERRIES_CROP,RenderLayer.getCutout());
        BLOCKS.put(ModBlocks.GOLD_BERRIES_CROP,RenderLayer.getCutout());
        BLOCKS.put(ModBlocks.IRON_BERRIES_CROP,RenderLayer.getCutout());
        BLOCKS.put(ModBlocks.LAPIS_LAZULI_BERRIES_CROP,RenderLayer.getCutout());
        BLOCKS.put(ModBlocks.REDSTONE_BERRIES_CROP,RenderLayer.getCutout());
    }
}
