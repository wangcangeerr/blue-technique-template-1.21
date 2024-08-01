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
    private static final List<ItemConvertible> SILVER_INGOT = List.of(ModItems.RAW_SILVER,ModBlocks.SILVER_ORE,ModBlocks.DEEPSLATE_SILVER_ORE);
    private static final List<ItemConvertible> TIN_INGOT = List.of(ModItems.RAW_TIN,ModBlocks.TIN_ORE,ModBlocks.DEEPSLATE_TIN_ORE);
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SILVER_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TIN_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK);
        //熔炉(Furnace)
        offerSmelting(exporter,SILVER_INGOT,RecipeCategory.MISC,ModItems.SILVER_INGOT,
                0.7f,200,"silver_ingot");
        offerSmelting(exporter,TIN_INGOT,RecipeCategory.MISC,ModItems.TIN_INGOT,
                0.5f,200,"tin_ingot");
        //高炉(Blast Furnace)
        offerBlasting(exporter,SILVER_INGOT,RecipeCategory.MISC,ModItems.SILVER_INGOT,
                0.7f,120,"silver_ingot");
        offerBlasting(exporter,TIN_INGOT,RecipeCategory.MISC,ModItems.TIN_INGOT,
                0.6f,100,"tin_ingot");
    }
}
