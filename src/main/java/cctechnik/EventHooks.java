package cctechnik;

import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHooks {

    @SubscribeEvent
    public void onEntityUpdate(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntityLiving().isPotionActive(TechnikMod.customPotion)) {
            if (event.getEntityLiving().world.rand.nextInt(20) == 0) {
                event.getEntityLiving().attackEntityFrom(DamageSource.GENERIC, 2);
            }
        }
    }
}
