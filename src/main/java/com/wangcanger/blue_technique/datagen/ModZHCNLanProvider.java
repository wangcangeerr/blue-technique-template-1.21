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
public class ModZHCNLanProvider extends FabricLanguageProvider {
    /**
     * 构造函数，初始化语言提供者
     *
     * @param dataOutput 用于输出生成的数据
     * @param registryLookup 用于查找注册表项的CompletableFuture
     */
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput,"zh_cn", registryLookup);
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
        translationBuilder.add("itemGroup.blue_technique_group","蓝色工艺");

        // 为自定义物品添加翻译
        translationBuilder.add(ModItems.RAW_SILVER,"粗银");
        translationBuilder.add(ModItems.SILVER_INGOT,"银锭");
        translationBuilder.add(ModItems.RAW_TIN,"粗锡");
        translationBuilder.add(ModItems.TIN_INGOT,"锡锭");
        translationBuilder.add(ModItems.SILVER_AXE,"银斧");
        translationBuilder.add(ModItems.SILVER_PICKAXE,"银镐");
        translationBuilder.add(ModItems.SILVER_HOE,"银锄头");
        translationBuilder.add(ModItems.SILVER_SHOVEL,"银锹");
        translationBuilder.add(ModItems.SILVER_SWORD,"银剑");
        translationBuilder.add(ModItems.COAL_POWDER,"煤粉");
        translationBuilder.add(ModItems.DIAMOND_POWDER,"钻石粉");
        translationBuilder.add(ModItems.EMERALD_POWDER,"绿宝石粉");
        translationBuilder.add(ModItems.GOLD_POWDER,"金粉");
        translationBuilder.add(ModItems.IRON_POWDER,"铁粉");
        translationBuilder.add(ModItems.LAPIS_LAZULI_POWDER,"青金石粉");
        translationBuilder.add(ModItems.BLUEBERRIES,"蓝莓");
        translationBuilder.add(ModItems.TIN_SWORD,"锡剑");
        translationBuilder.add(ModItems.TIN_PICKAXE,"锡镐");
        translationBuilder.add(ModItems.TIN_AXE,"锡斧");
        translationBuilder.add(ModItems.TIN_SHOVEL,"锡锹");
        translationBuilder.add(ModItems.TIN_HOE,"锡锄头");
        translationBuilder.add(ModItems.REDSTONE_BERRIES,"红石浆果");
        translationBuilder.add(ModItems.DIAMOND_BERRIES,"钻石浆果");
        translationBuilder.add(ModItems.IRON_BERRIES,"铁浆果");
        translationBuilder.add(ModItems.GOLD_BERRIES,"金浆果");
        translationBuilder.add(ModItems.EMERALD_BERRIES,"绿宝石浆果");
        translationBuilder.add(ModItems.LAPIS_LAZULI_BERRIES,"青金石浆果");
        translationBuilder.add(ModItems.SILVER_BOOTS,"银靴");
        translationBuilder.add(ModItems.SILVER_LEGGINGS,"银裤腿");
        translationBuilder.add(ModItems.SILVER_CHESTPLATE,"银胸甲");
        translationBuilder.add(ModItems.SILVER_HELMET,"银头盔");

        // 为自定义方块添加翻译
        translationBuilder.add(ModBlocks.SILVER_BLOCK,"银块");
        translationBuilder.add(ModBlocks.SILVER_ORE,"银矿石");
        translationBuilder.add(ModBlocks.DEEPSLATE_SILVER_ORE,"深层银矿石");
        translationBuilder.add(ModBlocks.RAW_SILVER_BLOCK,"粗银快");
        translationBuilder.add(ModBlocks.TIN_BLOCK,"锡块");
        translationBuilder.add(ModBlocks.TIN_ORE,"锡矿");
        translationBuilder.add(ModBlocks.DEEPSLATE_TIN_ORE,"深层锡矿");
        translationBuilder.add(ModBlocks.RAW_TIN_BLOCK,"粗锡矿");
        translationBuilder.add(ModBlocks.SILVER_BUTTON,"银按钮");
        translationBuilder.add(ModBlocks.SILVER_PRESSURE_PLATE,"银压力板");
        translationBuilder.add(ModBlocks.SILVER_DOOR,"银门");
        translationBuilder.add(ModBlocks.SILVER_TRAPDOOR,"银活板门");
        translationBuilder.add(ModBlocks.SILVER_FENCE,"银栅栏");
        translationBuilder.add(ModBlocks.SILVER_FENCE_GATE,"银栅栏门");
        translationBuilder.add(ModBlocks.SILVER_SLAB,"银台阶");
        translationBuilder.add(ModBlocks.SILVER_STAIRS,"银楼梯");
        translationBuilder.add(ModBlocks.SILVER_WALL,"银墙");
        translationBuilder.add(ModBlocks.DIAMOND_CULTIVATION_SOIL,"钻石培养土");
        translationBuilder.add(ModBlocks.EMERALD_CULTIVATION_SOIL,"绿宝石培养土");
        translationBuilder.add(ModBlocks.GOLD_CULTIVATION_SOIL,"金培养土");
        translationBuilder.add(ModBlocks.IRON_CULTIVATION_SOIL,"铁培养土");
        translationBuilder.add(ModBlocks.LAPIS_LAZULI_CULTIVATION_SOIL,"青金石培养土");
        translationBuilder.add(ModBlocks.REDSTONE_CULTIVATION_SOIL,"红石培养土");
        translationBuilder.add(ModBlocks.COAL_CULTIVATION_SOIL,"煤炭培养土");
    }
}
