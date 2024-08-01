package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.BlueTechnique;
import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItems;
import com.wangcanger.blue_technique.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    // 定义银锭的转换列表，包括生银、银矿石和深层银矿石
    private static final List<ItemConvertible> SILVER_INGOT = List.of(ModItems.RAW_SILVER,ModBlocks.SILVER_ORE,ModBlocks.DEEPSLATE_SILVER_ORE);
    // 定义锡锭的转换列表，包括生锡、锡矿石和深层锡矿石
    private static final List<ItemConvertible> TIN_INGOT = List.of(ModItems.RAW_TIN,ModBlocks.TIN_ORE,ModBlocks.DEEPSLATE_TIN_ORE);

    // 构造函数，用于初始化ModRecipesProvider
    // 参数：
    // output - 数据输出对象，用于生成或输出数据
    // registriesFuture - 一个CompletableFuture对象，用于查找注册表包装器
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
        //有序合成
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_PICKAXE,1)
                .pattern("###")
                .pattern(" X ")
                .pattern(" X ")
                .input('#', Ingredient.ofItems(ModItems.SILVER_INGOT))
                .input('X', ModItemTags.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlueTechnique.MOD_ID, "silver_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_AXE,1)
                .pattern("## ")
                .pattern("#X ")
                .pattern(" X ")
                .input('#', Ingredient.ofItems(ModItems.SILVER_INGOT))
                .input('X', ModItemTags.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlueTechnique.MOD_ID, "silver_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_SHOVEL,1)
                .pattern("#")
                .pattern("X")
                .pattern("X")
                .input('#', Ingredient.ofItems(ModItems.SILVER_INGOT))
                .input('X', ModItemTags.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlueTechnique.MOD_ID, "silver_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_HOE,1)
                .pattern("## ")
                .pattern(" X ")
                .pattern(" X ")
                .input('#', Ingredient.ofItems(ModItems.SILVER_INGOT))
                .input('X', ModItemTags.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlueTechnique.MOD_ID, "silver_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_SWORD,1)
                .pattern("#")
                .pattern("#")
                .pattern("X")
                .input('#', Ingredient.ofItems(ModItems.SILVER_INGOT))
                .input('X', ModItemTags.STICK)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlueTechnique.MOD_ID, "silver_sword"));
    }
}
