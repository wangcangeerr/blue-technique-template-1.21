package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVER_INGOT = List.of(ModItems.RAW_SILVER);
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SILVER_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK);
        //熔炉(Furnace)
        offerSmelting(exporter,SILVER_INGOT,RecipeCategory.MISC,ModItems.SILVER_INGOT,
                0.7f,200,"silver_ingot");
        //高炉(Blast Furnace)
        offerBlasting(exporter,SILVER_INGOT,RecipeCategory.MISC,ModItems.SILVER_INGOT,
                0.7f,200,"silver_ingot");
    }
}
