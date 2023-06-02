package net.sventomasek.arrowattachments.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sventomasek.arrowattachments.ArrowAttachments;

public class ModItems {
    public static final Item ICE_FRUIT = registerItem(
            "ice_fruit",
            new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier((1)).build())),

            ItemGroups.FOOD_AND_DRINK
    );

    private static Item registerItem(String name, Item item, ItemGroup group){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(ArrowAttachments.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ArrowAttachments.LOGGER.debug("Registering Mod Items for " + ArrowAttachments.MOD_ID);
    }
}
