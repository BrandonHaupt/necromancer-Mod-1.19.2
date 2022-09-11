package net.hollows.necromancer;

import net.fabricmc.api.ModInitializer;
import net.hollows.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Necromancer implements ModInitializer {
	public static final String MOD_ID = "necromancer";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
