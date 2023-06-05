package net.sventomasek.coppergodapples.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.sventomasek.coppergodapples.CopperGodApples;
import net.sventomasek.coppergodapples.item.custom.CopperGodAppleItem;
import net.sventomasek.coppergodapples.item.custom.ReinforcedCopperGodAppleItem;

public class ModItems {
    public static final Item COPPER_APPLE = registerItem("copper_apple",
            new Item(new Item.Settings().rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1).alwaysEdible().build())),
            ItemGroups.FOOD_AND_DRINK
    );

    public static final Item COPPER_GOD_APPLE = registerItem("copper_god_apple",
            new CopperGodAppleItem(new Item.Settings().rarity(Rarity.EPIC).food(new FoodComponent.Builder().hunger(4).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 0), 1.0f).alwaysEdible().build())),
            ItemGroups.FOOD_AND_DRINK
    );

    public static final Item REINFORCED_COPPER_GOD_APPLE = registerItem("reinforced_copper_god_apple",
            new ReinforcedCopperGodAppleItem(new Item.Settings().rarity(Rarity.EPIC).food(new FoodComponent.Builder().hunger(4).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 9), 1.0f).alwaysEdible().build())),
            ItemGroups.FOOD_AND_DRINK
    );

    private static Item registerItem(String name, Item item, ItemGroup group){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(CopperGodApples.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CopperGodApples.LOGGER.debug("Registering Mod Items for " + CopperGodApples.MOD_ID);
    }
}
