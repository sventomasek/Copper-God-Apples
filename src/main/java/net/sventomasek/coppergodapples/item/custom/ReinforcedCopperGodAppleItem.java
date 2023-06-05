package net.sventomasek.coppergodapples.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ReinforcedCopperGodAppleItem extends Item {
    public ReinforcedCopperGodAppleItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("This apple has been reinforced with copper and netherite.").formatted(Formatting.RED));
        tooltip.add(Text.translatable("You can barely chew on it, losing some teeth in the process.").formatted(Formatting.RED));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
