package com.wangcanger.blue_technique.datagen;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

/**
 * 自定义战利品表提供者，用于定义模组中方块的掉落物
 */
public class ModLootTableProvider extends FabricBlockLootTableProvider {

    /**
     * 构造函数
     * @param dataOutput 用于输出数据
     * @param registryLookup 用于查找注册表
     */
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    /**
     * 生成战利品表的逻辑
     * 为模组中的所有方块定义默认的掉落物
     */
    @Override
    public void generate() {
        // 添加直接掉落自身的方块
        addDrop(ModBlocks.SILVER_BLOCK);
        addDrop(ModBlocks.RAW_SILVER_BLOCK);
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.RAW_TIN_BLOCK);
        // 添加直接掉落物品的方块
        addDrop(ModBlocks.SILVER_BUTTON);
        addDrop(ModBlocks.SILVER_DOOR);
        addDrop(ModBlocks.SILVER_FENCE);
        addDrop(ModBlocks.SILVER_FENCE_GATE);
        addDrop(ModBlocks.SILVER_PRESSURE_PLATE);
        addDrop(ModBlocks.SILVER_SLAB);
        addDrop(ModBlocks.SILVER_STAIRS);
        addDrop(ModBlocks.SILVER_TRAPDOOR);
        addDrop(ModBlocks.SILVER_WALL);
        // 添加矿石方块的掉落，包含方块和原矿物品
        addDrop(ModBlocks.SILVER_ORE,silverOreLikeDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
        addDrop(ModBlocks.DEEPSLATE_SILVER_ORE,silverOreLikeDrops(ModBlocks.DEEPSLATE_SILVER_ORE, ModItems.RAW_SILVER));
        addDrop(ModBlocks.TIN_ORE,tinOreLikeDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.DEEPSLATE_TIN_ORE,tinOreLikeDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN));
    }

    /**
     * 创建类似银矿石的掉落战利品表
     * @param drop 矿石方块
     * @param dropItem 掉落的物品
     * @return 矿石掉落的战利品表构建器
     */
    public LootTable.Builder silverOreLikeDrops(Block drop, Item dropItem) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        // 使用丝滑触摸附魔时掉落自身，否则根据幸运值掉落对应物品
        return this.dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(dropItem)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    /**
     * 创建类似锡矿石的掉落战利品表
     * @param drop 矿石方块
     * @param dropItem 掉落的物品
     * @return 矿石掉落的战利品表构建器
     */
    public LootTable.Builder tinOreLikeDrops(Block drop, Item dropItem) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        // 使用丝滑触摸附魔时掉落自身，否则根据幸运值掉落对应物品
        return this.dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(dropItem)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}
