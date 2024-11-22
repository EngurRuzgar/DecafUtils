package xyz.nucceteere.decafutils;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = DecafUtils.MODID, name = DecafUtils.NAME, version = DecafUtils.VERSION)

public class DecafUtils
{
    public static final String MODID = "decafutils";
    public static final String NAME = "DecafSinatra Utilities";
    public static final String VERSION = "0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DecafUtils by Nucceteere loaded");
    }
}
