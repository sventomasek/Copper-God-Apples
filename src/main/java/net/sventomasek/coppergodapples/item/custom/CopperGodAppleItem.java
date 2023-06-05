package net.sventomasek.coppergodapples.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CopperGodAppleItem extends Item {
    public CopperGodAppleItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
