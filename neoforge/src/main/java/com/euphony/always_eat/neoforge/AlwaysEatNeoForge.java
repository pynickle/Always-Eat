package com.euphony.always_eat.neoforge;

import com.euphony.always_eat.AlwaysEat;
import com.euphony.always_eat.event.AlwaysEatEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@Mod(AlwaysEat.MOD_ID)
@EventBusSubscriber(modid = AlwaysEat.MOD_ID)
public final class AlwaysEatNeoForge {
    public AlwaysEatNeoForge() {
        AlwaysEat.init();
    }

    @SubscribeEvent
    public static void onPlayerUseItem(PlayerInteractEvent.RightClickItem event) {
        if (AlwaysEatEvent.eat(event.getEntity(), event.getHand())) {
            event.setCanceled(true);
        }
    }
}
