package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.blue_technique_group","Blue Technique Group");

        translationBuilder.add(ModItems.RAW_SILVER,"Raw Silver");
        translationBuilder.add(ModItems.SILVER_INGOT,"Silver Ingot");
        translationBuilder.add(ModItems.RAW_TIN,"Raw Tin");
        translationBuilder.add(ModItems.TIN_INGOT,"Tin Ingot");
        translationBuilder.add(ModItems.SILVER_AXE,"Silver Axe");
        translationBuilder.add(ModItems.SILVER_PICKAXE,"Silver Pickaxe");
        translationBuilder.add(ModItems.SILVER_HOE,"Slver Hoe");
        translationBuilder.add(ModItems.SILVER_SHOVEL,"Silver Shovel");
        translationBuilder.add(ModItems.SILVER_SWORD,"Silver Sword");
        translationBuilder.add(ModItems.COAL_POWDER,"Coal Powder");
        translationBuilder.add(ModItems.DIAMOND_POWDER,"Diamond Powder");
        translationBuilder.add(ModItems.EMERALD_POWDER,"Emerald Powder");
        translationBuilder.add(ModItems.GOLD_POWDER,"Gold Powder");
        translationBuilder.add(ModItems.IRON_POWDER,"Iron Powder");
        translationBuilder.add(ModItems.LAPIS_LAZULI_POWDER,"Lapis Lazuli Powder");

        translationBuilder.add(ModBlocks.SILVER_BLOCK,"Silver Block");
        translationBuilder.add(ModBlocks.SILVER_ORE,"Silver Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_SILVER_ORE,"Deepslate Silver Ore");
        translationBuilder.add(ModBlocks.RAW_SILVER_BLOCK,"Raw Silver Block");
        translationBuilder.add(ModBlocks.TIN_BLOCK,"Tin Block");
        translationBuilder.add(ModBlocks.TIN_ORE,"Tin Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_TIN_ORE,"Deepslate Tin Ore");
        translationBuilder.add(ModBlocks.RAW_TIN_BLOCK,"Raw Tin Block");
        translationBuilder.add(ModBlocks.SILVER_BUTTON,"Silver Button");
        translationBuilder.add(ModBlocks.SILVER_PRESSURE_PLATE,"Silver Pressure Plate");
        translationBuilder.add(ModBlocks.SILVER_DOOR,"Silver Door");
        translationBuilder.add(ModBlocks.SILVER_TRAPDOOR,"Silver Trapdoor");
        translationBuilder.add(ModBlocks.SILVER_FENCE,"Silver Fence");
        translationBuilder.add(ModBlocks.SILVER_FENCE_GATE,"Silver Fence Gate");
        translationBuilder.add(ModBlocks.SILVER_SLAB,"Silver Slab");
        translationBuilder.add(ModBlocks.SILVER_STAIRS,"Silver Stairs");
        translationBuilder.add(ModBlocks.SILVER_WALL,"Silver Wall");
    }
}
