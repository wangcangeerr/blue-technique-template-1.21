package com.wangcanger.blue_technique.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

/**
 * 自定义工具材料枚举，用于定义游戏内自定义工具的属性
 */
public enum ModToolMaterials implements ToolMaterial {
    /**
     * 银锭工具材料，定义了银质工具的基本属性和修复材料
     */
    SILVER_INGOT(BlockTags.INCORRECT_FOR_IRON_TOOL, 956, 11.2f, 4.0f, 45,
            () -> Ingredient.ofItems(ModItems.SILVER_INGOT));

    // 与方块标签相反的标签，用于确定可以采掘的方块
    private final TagKey<Block> inverseTag;
    // 工具的耐久度
    private final int itemDurability;
    // 工具的采矿速度加成
    private final float miningSpeed;
    // 工具的攻击伤害加成
    private final float attackDamage;
    // 工具的附魔能力
    private final int enchantability;
    // 修复工具所需的材料供应商
    private final Supplier<Ingredient> repairIngredient;

    /**
     * 构造函数，初始化工具材料的属性
     *
     * @param inverseTag 与方块标签相反的标签，用于确定可以采掘的方块
     * @param itemDurability 工具的耐久度
     * @param miningSpeed 工具的采矿速度加成
     * @param attackDamage 工具的攻击伤害加成
     * @param enchantability 工具的附魔能力
     * @param repairIngredient 修复工具所需的材料供应商
     */
    ModToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        // 使用 Suppliers.memoize 优化修复材料的获取，避免重复计算
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    /**
     * 获取工具的耐久度
     *
     * @return 工具的耐久度
     */
    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    /**
     * 获取工具的采矿速度加成
     *
     * @return 工具的采矿速度加成
     */
    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    /**
     * 获取工具的攻击伤害加成
     *
     * @return 工具的攻击伤害加成
     */
    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    /**
     * 获取与方块标签相反的标签
     *
     * @return 与方块标签相反的标签
     */
    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    /**
     * 获取工具的附魔能力
     *
     * @return 工具的附魔能力
     */
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    /**
     * 获取修复工具所需的材料
     *
     * @return 修复工具所需的材料
     */
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
