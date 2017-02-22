package eyeq.arrowrecycle;

import eyeq.arrowrecycle.event.ArrowRecycleEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.arrowrecycle.ArrowRecycle.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class ArrowRecycle {
    public static final String MOD_ID = "eyeq_arrowrecycle";

    @Mod.Instance(MOD_ID)
    public static ArrowRecycle instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ArrowRecycleEventHandler());
    }
}
