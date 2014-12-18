package com.Enigma.LM;

import com.Enigma.LM.handler.ConfiguartionHandler;
import com.Enigma.LM.init.ModBlocks;
import com.Enigma.LM.init.ModItems;
import com.Enigma.LM.proxy.IProxy;
import com.Enigma.LM.reference.Reference;
import com.Enigma.LM.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LearnModdingTest
{
    @Mod.Instance(Reference.MOD_ID)
    public static LearnModdingTest instance;

    @SidedProxy(clientSide = Reference.ClIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // mod config files, networking handling, initialize items and blocks
        ConfiguartionHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfiguartionHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre initalisation complete :)");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("initalisation complete :)");
        // tile enitities, crafting recipes
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // wrapping things up
        LogHelper.info("Post initalisation complete :)");

    }


}
