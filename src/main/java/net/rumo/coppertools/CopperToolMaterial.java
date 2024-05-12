package net.rumo.coppertools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {
    public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();

    @Override
    public int getDurability() {
        // stone: 131
        // iron: 250
        return 180;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // stone: 4
        // iron: 6
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        // same as iron
        return 2.0f;
    }

    @Override
    public int getMiningLevel() {
        // same as iron
        return 2;
    }

    @Override
    public int getEnchantability() {
        // iron: 14
        // gold: 22
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
}
