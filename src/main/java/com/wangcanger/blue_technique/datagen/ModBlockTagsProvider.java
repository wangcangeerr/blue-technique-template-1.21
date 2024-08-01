package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.tags.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.RAW_SILVER_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.RAW_SILVER_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK);
        getOrCreateTagBuilder(ModBlockTags.BLUE_TECHNIQUE_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.SILVER_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.SILVER_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SILVER_WALL);
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.SILVER_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.SILVER_FENCE);
    }
}
