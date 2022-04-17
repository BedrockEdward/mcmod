package com.bedrockedward.opo.item;

import com.bedrockedward.opo.Opo;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Opo.MOD_ID);
    public static final RegistryObject<Item> RAINBOW_INGOD = ITEMS.register("rainbow_ingod",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static final RegistryObject<Item> RAINBOW_SWORD = ITEMS.register("rainbow_sword",
            () -> new SwordItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static final RegistryObject<Item> RAINBOOW_SWORD = ITEMS.register("rainboow_sword",
            () -> new SwordItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAINBOW_PICKAXE = ITEMS.register("rainbow_pickaxe",
            () -> new PickaxeItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static final RegistryObject<Item> RAINBOW_AXE = ITEMS.register("rainbow_axe",
            () -> new AxeItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAINBOW_SHOVEL = ITEMS.register("rainbow_shovel",
            () -> new ShovelItem(ModTiers.RAINBOW, 1000000000, 1000000000,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static final RegistryObject<Item> RAINBOW_HOE = ITEMS.register("rainbow_hoe",
            () -> new HoeItem(ModTiers.RAINBOW, 1000000000, 1000000000,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAINBOW_KATANA = ITEMS.register("rainbow_katana",
            () -> new SwordItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    //armor
    public static final RegistryObject<Item> RAINBOW_KATANA = ITEMS.register("rainbow_katana",
            () -> new SwordItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAINBOW_KATANA = ITEMS.register("rainbow_katana",
            () -> new SwordItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAINBOW_KATANA = ITEMS.register("rainbow_katana",
            () -> new SwordItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAINBOW_KATANA = ITEMS.register("rainbow_katana",
            () -> new SwordItem(ModTiers.RAINBOW, 2147483647, 2147483647f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));





































    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
