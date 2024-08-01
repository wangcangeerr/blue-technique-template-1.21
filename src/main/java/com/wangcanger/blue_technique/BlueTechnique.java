package com.wangcanger.blue_technique;

import com.wangcanger.blue_technique.block.ModBlocks;
import com.wangcanger.blue_technique.item.ModItemGroups;
import com.wangcanger.blue_technique.item.ModItems;
import com.wangcanger.blue_technique.tags.ModBlockTags;
import com.wangcanger.blue_technique.tags.ModItemTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueTechnique implements ModInitializer {

	public static final String MOD_ID = "blue_technique";

    public static final Logger LOGGER = LoggerFactory.getLogger("blue_technique");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModItemGroups();
		ModBlockTags.registerModBlockTags();
		ModItemTags.registerItemTags();

		LOGGER.info("Hello Fabric world!");
	}
}