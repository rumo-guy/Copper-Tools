package net.rumo.coppertools;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperTools implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String MOD_ID = "coppertools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static MiningToolItem COPPER_PICKAXE = new PickaxeItem(CopperToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(CopperToolMaterial.INSTANCE, 2, -2.5f)));
	public static MiningToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(CopperToolMaterial.INSTANCE, 1.0f, -3.0f)));
	public static MiningToolItem COPPER_AXE = new AxeItem(CopperToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(CopperToolMaterial.INSTANCE, 5.0f, -3.1f)));
	public static MiningToolItem COPPER_HOE = new HoeItem(CopperToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(CopperToolMaterial.INSTANCE, -2, -1.0f)));
	public static SwordItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(CopperToolMaterial.INSTANCE, 3, -2.5f)));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "copper_pickaxe"), COPPER_PICKAXE);
		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "copper_shovel"), COPPER_SHOVEL);
		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "copper_axe"), COPPER_AXE);
		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "copper_hoe"), COPPER_HOE);
		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "copper_sword"), COPPER_SWORD);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.addAfter(Items.STONE_HOE, COPPER_SHOVEL);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.addAfter(COPPER_SHOVEL, COPPER_PICKAXE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.addAfter(COPPER_PICKAXE, COPPER_AXE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.addAfter(COPPER_AXE, COPPER_HOE);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.addAfter(Items.STONE_SWORD, COPPER_SWORD);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.addAfter(Items.STONE_AXE, COPPER_AXE);
		});
	}
}