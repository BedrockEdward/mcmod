package com.bedrockedward.opo.block;

import com.bedrockedward.opo.Opo;
import com.bedrockedward.opo.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public  static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Opo.MOD_ID);

    public static final RegistryObject<Block> PINK_ORE = registerBlock("pink_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(100f,100f)));
    public static final RegistryObject<Block> PURPLE_ORE = registerBlock("purple_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(100f,100f)));
    public static final RegistryObject<Block> BLUE_ORE = registerBlock("blue_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(100f,100f)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private  static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
            new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }









}
