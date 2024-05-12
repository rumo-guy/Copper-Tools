package net.rumo.coppertools;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class CopperToolsRecipeProvider extends FabricRecipeProvider {
    public CopperToolsRecipeProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CopperTools.COPPER_PICKAXE)
                .pattern("ccc")
                .pattern(" s ")
                .pattern(" s ")
                .input('c', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CopperTools.COPPER_SHOVEL)
                .pattern(" c ")
                .pattern(" s ")
                .pattern(" s ")
                .input('c', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CopperTools.COPPER_AXE)
                .pattern(" cc")
                .pattern(" sc")
                .pattern(" s ")
                .input('c', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CopperTools.COPPER_HOE)
                .pattern(" cc")
                .pattern(" s ")
                .pattern(" s ")
                .input('c', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
}