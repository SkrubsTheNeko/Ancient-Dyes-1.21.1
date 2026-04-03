package net.skrubs.ancientdyes.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.skrubs.ancientdyes.AncientDyes;

public class ModItems {
    public static final Item CHARTREUSE_DYE = registerItem("chartreuse_dye", new Item(new Item.Settings()));
    public static final Item ROSE_DYE = registerItem("rose_dye", new Item(new Item.Settings()));
    public static final Item SPRING_GREEN_DYE = registerItem("spring_green_dye", new Item(new Item.Settings()));
    public static final Item ULTRAMARINE_DYE = registerItem("ultramarine_dye", new Item(new Item.Settings()));
    public static final Item CYAN_FLOWER_SEEDS = registerItem("cyan_flower_seeds", new Item(new Item.Settings()));
    public static final Item DANDELION_SEEDS = registerItem("dandelion_seeds", new Item(new Item.Settings()));
    public static final Item FLOWER_SEEDS = registerItem("flower_seeds", new Item(new Item.Settings()));
    public static final Item ROSE_SEEDS = registerItem("rose_seeds", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AncientDyes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AncientDyes.LOGGER.info("Registering Mod Items for " + AncientDyes.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {

        });
    }
}
