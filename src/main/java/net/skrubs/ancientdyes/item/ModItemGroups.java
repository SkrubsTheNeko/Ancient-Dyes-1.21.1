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
                        entries.add(ModBlocks.ROSE);
                        entries.add(ModBlocks.CYAN_FLOWER);
                        entries.add(ModBlocks.FLOWER);
                        entries.add(ModBlocks.DANDELION_PUFF);
                        entries.add(ModItems.ROSE_SEEDS);
                        entries.add(ModItems.CYAN_FLOWER_SEEDS);
                        entries.add(ModItems.FLOWER_SEEDS);
                        entries.add(ModItems.DANDELION_SEEDS);
                        entries.add(ModItems.CHARTREUSE_DYE);
                        entries.add(ModItems.ROSE_DYE);
                        entries.add(ModItems.SPRING_GREEN_DYE);
                        entries.add(ModItems.ULTRAMARINE_DYE);
                    })
                    .build());

    public static final ItemGroup ANCIENT_DYES_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AncientDyes.MOD_ID, "ancient_dyes_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SPRING_GREEN_WOOL))
                    .displayName(Text.translatable("itemgroup.ancientdyes.ancient_dyes_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHARTREUSE_WOOL);
                        entries.add(ModBlocks.ROSE_WOOL);
                        entries.add(ModBlocks.SPRING_GREEN_WOOL);
                        entries.add(ModBlocks.ULTRAMARINE_WOOL);
                        entries.add(ModBlocks.CHARTREUSE_CARPET);
                        entries.add(ModBlocks.ROSE_CARPET);
                        entries.add(ModBlocks.SPRING_GREEN_CARPET);
                        entries.add(ModBlocks.ULTRAMARINE_CARPET);
                        entries.add(ModBlocks.CHARTREUSE_TERRACOTTA);
                        entries.add(ModBlocks.ROSE_TERRACOTTA);
                        entries.add(ModBlocks.SPRING_GREEN_TERRACOTTA);
                        entries.add(ModBlocks.ULTRAMARINE_TERRACOTTA);
                        entries.add(ModBlocks.CHARTREUSE_CONCRETE);
                        entries.add(ModBlocks.ROSE_CONCRETE);
                        entries.add(ModBlocks.SPRING_GREEN_CONCRETE);
                        entries.add(ModBlocks.ULTRAMARINE_CONCRETE);
                        entries.add(ModBlocks.CHARTREUSE_CONCRETE_POWDER);
                        entries.add(ModBlocks.ROSE_CONCRETE_POWDER);
                        entries.add(ModBlocks.SPRING_GREEN_CONCRETE_POWDER);
                        entries.add(ModBlocks.ULTRAMARINE_CONCRETE_POWDER);
                        entries.add(ModBlocks.CHARTREUSE_GLAZED_TERRACOTTA);
                        entries.add(ModBlocks.ROSE_GLAZED_TERRACOTTA);
                        entries.add(ModBlocks.SPRING_GREEN_GLAZED_TERRACOTTA);
                        entries.add(ModBlocks.ULTRAMARINE_GLAZED_TERRACOTTA);
                        entries.add(ModBlocks.CHARTREUSE_STAINED_GLASS);
                        entries.add(ModBlocks.ROSE_STAINED_GLASS);
                        entries.add(ModBlocks.SPRING_GREEN_STAINED_GLASS);
                        entries.add(ModBlocks.ULTRAMARINE_STAINED_GLASS);
                        entries.add(ModBlocks.CHARTREUSE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.ROSE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.SPRING_GREEN_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.ULTRAMARINE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.CHARTREUSE_CANDLE);
                        entries.add(ModBlocks.ROSE_CANDLE);
                        entries.add(ModBlocks.SPRING_GREEN_CANDLE);
                        entries.add(ModBlocks.ULTRAMARINE_CANDLE);
                    })
                    .build());

    public static void registerItemGroups(){
        AncientDyes.LOGGER.info("Registering item groups for " + AncientDyes.MOD_ID);
    }
}
