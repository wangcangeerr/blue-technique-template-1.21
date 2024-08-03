package com.wangcanger.blue_technique.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponnents {
    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f).build();
}
