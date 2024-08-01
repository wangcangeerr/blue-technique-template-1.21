package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.item.ModItems;
import com.wangcanger.blue_technique.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.STICK)
                .add(Items.STICK);
        getOrCreateTagBuilder(ModItemTags.POWDER)
                .add(ModItems.IRON_POWDER)
                .add(ModItems.GOLD_POWDER)
                .add(ModItems.LAPIS_LAZULI_POWDER)
                .add(ModItems.DIAMOND_POWDER)
                .add(ModItems.EMERALD_POWDER)
                .add(ModItems.COAL_POWDER);
    }
}
