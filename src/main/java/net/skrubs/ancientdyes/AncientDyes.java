package net.skrubs.ancientdyes;

import net.fabricmc.api.ModInitializer;

import net.skrubs.ancientdyes.block.ModBlocks;
import net.skrubs.ancientdyes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AncientDyes implements ModInitializer {
	public static final String MOD_ID = "ancientdyes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}