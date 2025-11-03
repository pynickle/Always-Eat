package com.euphony.always_eat.fabric;

import com.euphony.always_eat.AlwaysEat;
import com.euphony.always_eat.event.AlwaysEatEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.world.InteractionResult;

public final class AlwaysEatFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AlwaysEat.init();
        UseItemCallback.EVENT.register((player, world, hand) -> {
            if(AlwaysEatEvent.eat(player, hand)) {
                return InteractionResult.SUCCESS;
            } else {
                return InteractionResult.PASS;
            }
        });
    }
}
