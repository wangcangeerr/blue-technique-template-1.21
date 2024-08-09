package com.wangcanger.blue_technique.item;

import com.wangcanger.blue_technique.BlueTechnique;
import com.wangcanger.blue_technique.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

// 定义物品组类，用于注册自定义的物品组
public class ModItemGroups {
    // 定义一个物品组的注册键
    public static final RegistryKey<ItemGroup> BLUE_TECHNIQUE_GROUP = register("blue_technique_group");

    // 静态方法，用于注册物品组
    private static RegistryKey<ItemGroup> register(String id) {
        // 返回一个物品组的注册键，键的命名空间与模组ID一致
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(BlueTechnique.MOD_ID,id));
    }

    // 方法：注册自定义物品组
    public static void registerModItemGroups() {
        // 在注册表中注册自定义的物品组
        Registry.register(Registries.ITEM_GROUP,BLUE_TECHNIQUE_GROUP,
                // 创建物品组，设置显示名称和图标
                ItemGroup.create(ItemGroup.Row.TOP,7)
                        .displayName(Text.translatable("itemGroup.blue_technique_group"))
                        .icon(() ->new ItemStack(ModItems.SILVER_INGOT))
                        // 添加物品组中的条目
                        .entries((displayContext, entries) -> {
                            // 添加各种自定义物品和方块到物品组
                            entries.add(ModItems.SILVER_INGOT);
                            entries.add(ModItems.TIN_INGOT);
                            entries.add(ModItems.RAW_SILVER);
                            entries.add(ModItems.RAW_TIN);
                            entries.add(ModBlocks.RAW_SILVER_BLOCK);
                            entries.add(ModBlocks.RAW_TIN_BLOCK);
                            entries.add(ModBlocks.SILVER_BLOCK);
                            entries.add(ModBlocks.TIN_BLOCK);
                            entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                            entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                            entries.add(ModBlocks.SILVER_ORE);
                            entries.add(ModBlocks.TIN_ORE);
                            entries.add(ModItems.SILVER_AXE);
                            entries.add(ModItems.SILVER_PICKAXE);
                            entries.add(ModItems.SILVER_SWORD);
                            entries.add(ModItems.SILVER_HOE);
                            entries.add(ModItems.SILVER_SHOVEL);
                            entries.add(ModItems.TIN_AXE);
                            entries.add(ModItems.TIN_PICKAXE);
                            entries.add(ModItems.TIN_SWORD);
                            entries.add(ModItems.TIN_HOE);
                            entries.add(ModItems.TIN_SHOVEL);
                            entries.add(ModItems.COAL_POWDER);
                            entries.add(ModItems.IRON_POWDER);
                            entries.add(ModItems.GOLD_POWDER);
                            entries.add(ModItems.DIAMOND_POWDER);
                            entries.add(ModItems.EMERALD_POWDER);
                            entries.add(ModItems.LAPIS_LAZULI_POWDER);
                            entries.add(Items.REDSTONE);
                            entries.add(ModItems.BLUEBERRIES);
                            entries.add(ModItems.DIAMOND_BERRIES);
                            entries.add(ModItems.EMERALD_BERRIES);
                            entries.add(ModItems.GOLD_BERRIES);
                            entries.add(ModItems.IRON_BERRIES);
                            entries.add(ModItems.LAPIS_LAZULI_BERRIES);
                            entries.add(ModItems.REDSTONE_BERRIES);

                            // 添加各种自定义的方块到物品组
                            entries.add(ModBlocks.SILVER_BUTTON);
                            entries.add(ModBlocks.SILVER_PRESSURE_PLATE);
                            entries.add(ModBlocks.SILVER_DOOR);
                            entries.add(ModBlocks.SILVER_TRAPDOOR);
                            entries.add(ModBlocks.SILVER_FENCE);
                            entries.add(ModBlocks.SILVER_FENCE_GATE);
                            entries.add(ModBlocks.SILVER_SLAB);
                            entries.add(ModBlocks.SILVER_STAIRS);
                            entries.add(ModBlocks.SILVER_WALL);
                            entries.add(ModBlocks.COAL_CULTIVATION_SOIL);
                            entries.add(ModBlocks.DIAMOND_CULTIVATION_SOIL);
                            entries.add(ModBlocks.EMERALD_CULTIVATION_SOIL);
                            entries.add(ModBlocks.GOLD_CULTIVATION_SOIL);
                            entries.add(ModBlocks.IRON_CULTIVATION_SOIL);
                            entries.add(ModBlocks.LAPIS_LAZULI_CULTIVATION_SOIL);
                            entries.add(ModBlocks.REDSTONE_CULTIVATION_SOIL);
                        }).build());
    }
}
