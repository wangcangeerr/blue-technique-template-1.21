package com.wangcanger.blue_technique.block;

import com.wangcanger.blue_technique.BlueTechnique;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// 定义模组中的方块类
public class ModBlocks {
    // 注册银方块及其相关属性
    public static final Block SILVER_BLOCK = register("silver_block",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    // 注册原银块及其相关属性
    public static final Block RAW_SILVER_BLOCK = register("raw_silver_block",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    // 注册银矿石及其相关属性
    public static final Block SILVER_ORE = register("silver_ore",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    // 注册深板岩银矿石及其相关属性
    public static final Block DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore",new Block(AbstractBlock.Settings.create().requiresTool().strength(4.5f,3.0f)));
    // 注册锡方块及其相关属性
    public static final Block TIN_BLOCK = register("tin_block",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    // 注册原锡块及其相关属性
    public static final Block RAW_TIN_BLOCK = register("raw_tin_block",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    // 注册锡矿石及其相关属性
    public static final Block TIN_ORE = register("tin_ore",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    // 注册深板岩锡矿石及其相关属性
    public static final Block DEEPSLATE_TIN_ORE = register("deepslate_tin_ore",new Block(AbstractBlock.Settings.create().requiresTool().strength(4.5f,3.0f)));

    // 注册银楼梯及其相关属性
    public static final Block SILVER_STAIRS = register("silver_stairs",
            new StairsBlock(SILVER_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(SILVER_BLOCK)));

    // 注册银台阶及其相关属性
    public static final Block SILVER_SLAB = register("silver_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SILVER_BLOCK)));

    // 注册银按钮及其相关属性
    public static final Block SILVER_BUTTON = register("silver_button",
            new ButtonBlock(BlockSetType.IRON,10,AbstractBlock.Settings.copy(SILVER_BLOCK)));

    // 注册银压力板及其相关属性
    public static final Block SILVER_PRESSURE_PLATE = register("silver_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON,AbstractBlock.Settings.copy(SILVER_BLOCK)));

    // 注册银栅栏及其相关属性
    public static final Block SILVER_FENCE = register("silver_fence",
            new FenceBlock(AbstractBlock.Settings.copy(SILVER_BLOCK)));

    // 注册银栅栏门及其相关属性
    public static final Block SILVER_FENCE_GATE = register("silver_fence_gate",
            new FenceGateBlock(WoodType.OAK,AbstractBlock.Settings.copy(SILVER_BLOCK)));

    // 注册银墙及其相关属性
    public static final Block SILVER_WALL = register("silver_wall",
            new WallBlock(AbstractBlock.Settings.copy(SILVER_BLOCK)));

    // 注册银门及其相关属性
    public static final Block SILVER_DOOR = register("silver_door",
            new DoorBlock(BlockSetType.STONE,AbstractBlock.Settings.copy(SILVER_BLOCK).nonOpaque()));

    // 注册银活板门及其相关属性
    public static final Block SILVER_TRAPDOOR = register("silver_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE,AbstractBlock.Settings.copy(SILVER_BLOCK).nonOpaque()));

    /**
     * 注册方块物品。
     *
     * @param id 方块的ID。
     * @param block 要注册的方块。
     */
    public static void registerBlockItems(String id,Block block) {
        Item item = Registry.register(Registries.ITEM,Identifier.of(BlueTechnique.MOD_ID,id),new BlockItem(block,new Item.Settings()));
        if (item instanceof  BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS,item);
        }
    }

    /**
     * 注册方块。
     *
     * @param id 方块的ID。
     * @param block 要注册的方块。
     * @return 注册后的方块。
     */
    public static Block register(String id,Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BlueTechnique.MOD_ID,id),block);
    }

    /**
     * 注册模组中的所有方块。
     */
    public static void registerModBlocks() {
        // 注册所有方块的逻辑
    }
}

