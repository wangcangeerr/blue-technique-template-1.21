package com.wangcanger.blue_technique.item;

import com.wangcanger.blue_technique.BlueTechnique;
import com.wangcanger.blue_technique.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> BLUE_TECHNIQUE_GROUP = register("blue_technique_group");
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(BlueTechnique.MOD_ID,id));
    }
    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP,BLUE_TECHNIQUE_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP,7)
                        .displayName(Text.translatable("itemGroup.blue_technique_group"))
                        .icon(() ->new ItemStack(ModItems.SILVER_INGOT))
                        .entries((displayContext, entries) -> {
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
                       }).build());
    }
}
