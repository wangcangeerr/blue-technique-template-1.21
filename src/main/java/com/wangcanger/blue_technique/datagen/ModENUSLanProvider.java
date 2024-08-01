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

        translationBuilder.add(ModBlocks.SILVER_BLOCK,"Silver Block");
        translationBuilder.add(ModBlocks.SILVER_ORE,"Silver Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_SILVER_ORE,"Deepslate Silver Ore");
        translationBuilder.add(ModBlocks.RAW_SILVER_BLOCK,"Raw Silver Block");
    }
}
