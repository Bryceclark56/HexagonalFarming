package com.horticulture;

import com.horticulture.Item.Items;
import com.horticulture.Proxy.CommonProxy;
import com.horticulture.Reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by expert700 on 10/31/2015.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Horticulture
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}
