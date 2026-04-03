package net.skrubs.ancientdyes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.skrubs.ancientdyes.AncientDyes;
import net.skrubs.ancientdyes.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ANCIENT_DYES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AncientDyes.MOD_ID, "ancient_dyes_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ROSE_SEEDS))
                    .displayName(Text.translatable("itemgroup.ancientdyes.ancient_dyes_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CYAN_FLOWER_SEEDS);
                    })
                    .build());

    public static final ItemGroup ANCIENT_DYES_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AncientDyes.MOD_ID, "ancient_dyes_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SPRING_GREEN_WOOL))
                    .displayName(Text.translatable("itemgroup.ancientdyes.ancient_dyes_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHARTREUSE_WOOL);
                    })
                    .build());

    public static void registerItemGroups(){
        AncientDyes.LOGGER.info("Registering item groups for " + AncientDyes.MOD_ID);
    }
}
