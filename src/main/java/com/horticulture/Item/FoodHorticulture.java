package com.horticulture.Item;

import com.horticulture.Reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by expert700 on 10/31/2015.
 */
public class FoodHorticulture extends ItemFood
{
    public FoodHorticulture(int amount, int saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setCreativeTab(CreativeTabs.tabFood);
    }

    @Override
    public FoodHorticulture setUnlocalizedName(String unlocalizedName)
    {
        super.setUnlocalizedName(Reference.PREFIX + unlocalizedName);
        return this;
    }
}
