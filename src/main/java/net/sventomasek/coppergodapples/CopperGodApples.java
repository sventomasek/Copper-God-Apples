package net.sventomasek.coppergodapples;

import net.fabricmc.api.ModInitializer;
import net.sventomasek.coppergodapples.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperGodApples implements ModInitializer {
	public static final String MOD_ID = "coppergodapples";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
