package net.rumo.coppertools;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class CopperToolsItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public CopperToolsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(CopperTools.COPPER_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(CopperTools.COPPER_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(CopperTools.COPPER_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(CopperTools.COPPER_HOE);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(CopperTools.COPPER_SWORD);
    }
}
