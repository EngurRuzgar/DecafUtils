package xyz.nucceteere.decafutils;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = DecafSinatraUtils.MODID, name = DecafSinatraUtils.NAME, version = DecafSinatraUtils.VERSION)

public class DecafSinatraUtils
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
        logger.info("DecafSinatraUtils by Nucceteere loaded");
    }
}
