package com.horticulture.Item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by expert700 on 10/31/2015.
 */
public class Items
{
    public static final FoodHorticulture lettuce = new FoodHorticulture(6, 2, false).setUnlocalizedName("lettuce");

    public static void registerRenderer(Item item, String name)
    {
        ModelBakery.addVariantName(item, "horticulture:" + name);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("horticulture:" + name, "inventory"));
    }

    public static void init()
    {
        GameRegistry.registerItem(lettuce, "lettuce");
    }

    public static void registerModels()
    {
        registerRenderer(lettuce, "lettuce");
    }
}
