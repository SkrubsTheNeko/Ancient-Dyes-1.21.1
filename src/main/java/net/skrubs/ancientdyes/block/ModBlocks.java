package net.skrubs.ancientdyes.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.skrubs.ancientdyes.AncientDyes;

import java.util.function.ToIntFunction;

import static net.minecraft.block.Blocks.CANDLE_CAKE;


public class ModBlocks {
    public static final Block CHARTREUSE_CONCRETE = registerBlock(
            "chartreuse_concrete", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F))
    );
    public static final Block CHARTREUSE_CONCRETE_POWDER = registerBlock("chartreuse_concrete_powder",
            new ConcretePowderBlock(
                    CHARTREUSE_CONCRETE, AbstractBlock.Settings.create().mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block ROSE_CONCRETE = registerBlock(
            "rose_concrete", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F))
    );
    public static final Block ROSE_CONCRETE_POWDER = registerBlock("rose_concrete_powder",
            new ConcretePowderBlock(
                    ROSE_CONCRETE, AbstractBlock.Settings.create().mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block SPRING_GREEN_CONCRETE = registerBlock(
            "spring_green_concrete", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F))
    );
    public static final Block SPRING_GREEN_CONCRETE_POWDER = registerBlock("spring_green_concrete_powder",
            new ConcretePowderBlock(
                    SPRING_GREEN_CONCRETE, AbstractBlock.Settings.create().mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block ULTRAMARINE_CONCRETE = registerBlock(
            "ultramarine_concrete", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F))
    );
    public static final Block ULTRAMARINE_CONCRETE_POWDER = registerBlock("ultramarine_concrete_powder",
            new ConcretePowderBlock(
                    ULTRAMARINE_CONCRETE, AbstractBlock.Settings.create().mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block CHARTREUSE_TERRACOTTA = registerBlock(
            "chartreuse_terracotta",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F))
    );
    public static final Block ROSE_TERRACOTTA = registerBlock(
            "rose_terracotta",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F))
    );
    public static final Block SPRING_GREEN_TERRACOTTA = registerBlock(
            "spring_green_terracotta",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F))
    );
    public static final Block ULTRAMARINE_TERRACOTTA = registerBlock(
            "ultramarine_terracotta",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F))
    );
    public static final Block CHARTREUSE_GLAZED_TERRACOTTA = registerBlock(
            "chartreuse_glazed_terracotta",
            new GlazedTerracottaBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(DyeColor.LIME)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.4F)
                            .pistonBehavior(PistonBehavior.PUSH_ONLY)

            )
    );
    public static final Block ROSE_GLAZED_TERRACOTTA = registerBlock(
            "rose_glazed_terracotta",
            new GlazedTerracottaBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(DyeColor.MAGENTA)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.4F)
                            .pistonBehavior(PistonBehavior.PUSH_ONLY)
            )
    );
    public static final Block SPRING_GREEN_GLAZED_TERRACOTTA = registerBlock(
            "spring_green_glazed_terracotta",
            new GlazedTerracottaBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(DyeColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.4F)
                            .pistonBehavior(PistonBehavior.PUSH_ONLY)
            )
    );
    public static final Block ULTRAMARINE_GLAZED_TERRACOTTA = registerBlock(
            "ultramarine_glazed_terracotta",
            new GlazedTerracottaBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(DyeColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.4F)
                            .pistonBehavior(PistonBehavior.PUSH_ONLY)
            )
    );
    public static final Block CHARTREUSE_WOOL = registerBlock(
            "chartreuse_wool",
            new Block(
                    AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()
            )
    );
    public static final Block ROSE_WOOL = registerBlock(
            "rose_wool",
            new Block(
                    AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()
            )
    );
    public static final Block SPRING_GREEN_WOOL = registerBlock(
            "spring_green_wool",
            new Block(
                    AbstractBlock.Settings.create().mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()
            )
    );
    public static final Block ULTRAMARINE_WOOL = registerBlock(
            "ultramarine_wool",
            new Block(
                    AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()
            )
    );
    public static final Block CHARTREUSE_STAINED_GLASS = registerBlock(
            "chartreuse_stained_glass",
            new TransparentBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );
    public static final Block CHARTREUSE_STAINED_GLASS_PANE = registerBlock(
            "chartreuse_stained_glass_pane",
            new StainedGlassPaneBlock(
                    DyeColor.BLUE, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
            )
    );
    public static final Block ROSE_STAINED_GLASS = registerBlock(
            "rose_stained_glass",
            new TransparentBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );
    public static final Block ROSE_STAINED_GLASS_PANE = registerBlock(
            "rose_stained_glass_pane",
            new StainedGlassPaneBlock(
                    DyeColor.BLUE, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
            )
    );
    public static final Block SPRING_GREEN_STAINED_GLASS = registerBlock(
            "spring_green_stained_glass",
            new TransparentBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );
    public static final Block SPRING_GREEN_STAINED_GLASS_PANE = registerBlock(
            "spring_green_stained_glass_pane",
            new StainedGlassPaneBlock(
                    DyeColor.BLUE, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
            )
    );
    public static final Block ULTRAMARINE_STAINED_GLASS = registerBlock(
            "ultramarine_stained_glass",
            new TransparentBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );
    public static final Block ULTRAMARINE_STAINED_GLASS_PANE = registerBlock(
            "ultramarine_stained_glass_pane",
            new StainedGlassPaneBlock(
                    DyeColor.BLUE, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
            )
    );
    public static final Block CHARTREUSE_CANDLE = registerBlock(
            "chartreuse_candle", new CandleBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .pistonBehavior(PistonBehavior.DESTROY))
    );

    public static final Block CHARTREUSE_CANDLE_CAKE = registerBlock(
            "chartreuse_candle_cake", new CandleCakeBlock(CHARTREUSE_CANDLE, AbstractBlock.Settings.copyShallow(CANDLE_CAKE)
                    .nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .pistonBehavior(PistonBehavior.DESTROY))
    );
    public static final Block ROSE_CANDLE = registerBlock(
            "rose_candle", new CandleBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .pistonBehavior(PistonBehavior.DESTROY))
    );
    public static final Block SPRING_GREEN_CANDLE = registerBlock(
            "spring_green_candle", new CandleBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .pistonBehavior(PistonBehavior.DESTROY))
    );
    public static final Block ULTRAMARINE_CANDLE = registerBlock(
            "ultramarine_candle", new CandleBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));
    public static final Block CHARTREUSE_CARPET = registerBlock(
            "chartreuse_carpet",
            new DyedCarpetBlock(DyeColor.LIME, AbstractBlock.Settings.create().mapColor(MapColor.LIME).strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable())
    );
    public static final Block ROSE_CARPET = registerBlock(
            "rose_carpet",
            new DyedCarpetBlock(DyeColor.MAGENTA, AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable())
    );
    public static final Block SPRING_GREEN_CARPET = registerBlock(
            "spring_green_carpet",
            new DyedCarpetBlock(DyeColor.CYAN, AbstractBlock.Settings.create().mapColor(MapColor.CYAN).strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable())
    );
    public static final Block ULTRAMARINE_CARPET = registerBlock(
            "ultramarine_carpet",
            new DyedCarpetBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable())
    );
    public static final Block ROSE = registerBlock(
            "rose",
            new FlowerBlock(
                    StatusEffects.LUCK,
                    5.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block POTTED_ROSE = registerBlock("potted_rose", createFlowerPotBlock(ROSE));
    public static final Block CYAN_FLOWER = registerBlock(
            "cyan_flower",
            new FlowerBlock(
                    StatusEffects.UNLUCK,
                    5.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block POTTED_CYAN_FLOWER = registerBlock("potted_cyan_flower", createFlowerPotBlock(CYAN_FLOWER));
    public static final Block FLOWER = registerBlock(
            "flower",
            new FlowerBlock(
                    StatusEffects.SATURATION,
                    5.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block POTTED_FLOWER = registerBlock("potted_flower", createFlowerPotBlock(FLOWER));
    public static final Block DANDELION_PUFF = registerBlock(
            "dandelion_puff",
            new FlowerBlock(
                    StatusEffects.LEVITATION,
                    5.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block POTTED_DANDELION_PUFF = registerBlock("potted_dandelion_puff", createFlowerPotBlock(DANDELION_PUFF));
    public static final Block CYAN_FLOWER_BUSH = registerBlock(
            "cyan_flower_bush",
            new TallFlowerBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );


    public static Block createFlowerPotBlock(Block flower) {
        return new FlowerPotBlock(flower, AbstractBlock.Settings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AncientDyes.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AncientDyes.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks(){
        AncientDyes.LOGGER.info("Registering Mod Blocks for " + AncientDyes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(fabricItemGroupEntries -> {

        });
    }
}
