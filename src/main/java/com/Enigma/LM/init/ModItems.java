package com.Enigma.LM.init;

import com.Enigma.LM.item.ItemExample;
import com.Enigma.LM.item.ItemLM;
import com.Enigma.LM.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLM Example = new ItemExample();

    public static void init()
    {
        GameRegistry.registerItem(Example, "Example");
    }


}
