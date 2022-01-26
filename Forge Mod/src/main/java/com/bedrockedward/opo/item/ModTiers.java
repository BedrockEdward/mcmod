package com.bedrockedward.opo.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier RAINBOW = new ForgeTier(1, 1500, 20f,
            20f, 30, Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.RAINBOW_INGOD.get()));
}
