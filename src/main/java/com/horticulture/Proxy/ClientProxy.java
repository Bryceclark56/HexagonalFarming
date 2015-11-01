package com.horticulture.Proxy;

import com.horticulture.Item.Items;

/**
 * Created by expert700 on 10/31/2015.
 */
public class ClientProxy extends CommonProxy
{
    public void preInit()
    {
        super.preInit();
    }

    public void init()
    {
        super.init();
        Items.registerModels();
    }

    public void postInit()
    {
        super.postInit();
    }
}
