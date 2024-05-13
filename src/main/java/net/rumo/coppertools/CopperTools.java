package net.rumo.coppertools;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
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

	public static MiningToolItem COPPER_PICKAXE = new PickaxeItem(CopperToolMaterial.INSTANCE, 5, -2.5f, new FabricItemSettings());
	public static MiningToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 4.0f, -3.0f, new FabricItemSettings());
	public static MiningToolItem COPPER_AXE = new AxeItem(CopperToolMaterial.INSTANCE, 8.0f, -0.5f, new FabricItemSettings());
	public static MiningToolItem COPPER_HOE = new HoeItem(CopperToolMaterial.INSTANCE, 1, -1.0f, new FabricItemSettings());
	public static SwordItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 6, 1.6f, new FabricItemSettings());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_pickaxe"), COPPER_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_shovel"), COPPER_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_axe"), COPPER_AXE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_hoe"), COPPER_HOE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_sword"), COPPER_SWORD);
	}
}