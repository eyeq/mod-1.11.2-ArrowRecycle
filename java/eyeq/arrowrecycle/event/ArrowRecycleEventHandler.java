package eyeq.arrowrecycle.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ArrowRecycleEventHandler {
    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if(event.getWorld().isRemote) {
            return;
        }
        Entity entity = event.getEntity();
        if(entity instanceof EntityArrow) {
            ((EntityArrow) entity).pickupStatus = EntityArrow.PickupStatus.ALLOWED;
        }
    }
}
