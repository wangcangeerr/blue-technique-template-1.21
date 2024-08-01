package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
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

        itemModelGenerator.register(ModItems.SILVER_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_SWORD,Models.HANDHELD);
    }
}
