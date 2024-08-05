package com.wangcanger.blue_technique.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponnents {
    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f).build();

    public static final FoodComponent DIAMOND_BERRIES = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(1.0f).build();

    public static final FoodComponent EMERALD_BERRIES = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(2.0f).build();

    public static final FoodComponent GOLD_BERRIES = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(1.4f).build();

    public static final FoodComponent IRON_BERRIES = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.4f).build();

    public static final FoodComponent LAPIS_LAZULI_BERRIES = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(3.4f).build();

    public static final FoodComponent REDSTONE_BERRIES = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(2.4f).build();
}
