package net.sventomasek.coppergodapples.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sventomasek.coppergodapples.CopperGodApples;

public class ModItems {
    public static final Item COPPER_APPLE = registerItem("copper_apple",
            new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier((4)).build())),
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
