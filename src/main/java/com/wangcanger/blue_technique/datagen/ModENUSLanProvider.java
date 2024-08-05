package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

/**
 * 自定义英语语言提供者，用于为游戏中的项目和方块提供英文翻译
 */
public class ModENUSLanProvider extends FabricLanguageProvider {
    /**
     * 构造函数，初始化语言提供者
     *
     * @param dataOutput 用于输出生成的数据
     * @param registryLookup 用于查找注册表项的CompletableFuture
     */
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput,"en_us", registryLookup);
    }

    /**
     * 生成翻译的方法，覆盖自基类
     *
     * @param registryLookup 用于查找注册表项的接口
     * @param translationBuilder 用于构建翻译的接口
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        // 为物品组添加翻译
        translationBuilder.add("itemGroup.blue_technique_group","Blue Technique Group");

        // 为自定义物品添加翻译
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
        translationBuilder.add(ModItems.BLUEBERRIES,"Blueberries");
        translationBuilder.add(ModItems.TIN_SWORD,"Tin Sword");
        translationBuilder.add(ModItems.TIN_PICKAXE,"Tin Sword");
        translationBuilder.add(ModItems.TIN_AXE,"Tin Axe");
        translationBuilder.add(ModItems.TIN_SHOVEL,"Tin Shovel");
        translationBuilder.add(ModItems.TIN_HOE,"Tin Hoe");
        translationBuilder.add(ModItems.REDSTONE_BERRIES,"Redstone Berries");
        translationBuilder.add(ModItems.DIAMOND_BERRIES,"Diamond Berries");
        translationBuilder.add(ModItems.IRON_BERRIES,"Iron Berries");
        translationBuilder.add(ModItems.GOLD_BERRIES,"Gold Berries");
        translationBuilder.add(ModItems.EMERALD_BERRIES,"Emerald Berries");
        translationBuilder.add(ModItems.LAPIS_LAZULI_BERRIES,"Lapis Lazuli Berries");

        // 为自定义方块添加翻译
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
