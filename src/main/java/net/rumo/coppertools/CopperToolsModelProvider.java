package net.rumo.coppertools;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Items;

public class CopperToolsModelProvider extends FabricModelProvider {
    public CopperToolsModelProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(CopperTools.COPPER_PICKAXE, Items.IRON_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(CopperTools.COPPER_SHOVEL, Items.IRON_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(CopperTools.COPPER_AXE, Items.IRON_AXE, Models.GENERATED);
        itemModelGenerator.register(CopperTools.COPPER_HOE, Items.IRON_HOE, Models.GENERATED);
    }
}
