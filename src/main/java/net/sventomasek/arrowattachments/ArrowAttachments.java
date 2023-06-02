package net.sventomasek.arrowattachments;

import net.fabricmc.api.ModInitializer;
import net.sventomasek.arrowattachments.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrowAttachments implements ModInitializer {
	public static final String MOD_ID = "arrowattachments";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
