package com.wangcanger.blue_technique.block;

import com.wangcanger.blue_technique.BlueTechnique;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SILVER_BLOCK = register("silver_block",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    public static final Block SILVER_ORE = register("silver_ore",new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f,3.0f)));
    public static final Block DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore",new Block(AbstractBlock.Settings.create().requiresTool().strength(4.5f,3.0f)));
    public static void registerBlockItems(String id,Block block) {
        Item item = Registry.register(Registries.ITEM,Identifier.of(BlueTechnique.MOD_ID,id),new BlockItem(block,new Item.Settings()));
        if (item instanceof  BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS,item);
        }
    }
    public static Block register(String id,Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BlueTechnique.MOD_ID,id),block);
    }
    public static void registerModBlocks() {

    }
}
