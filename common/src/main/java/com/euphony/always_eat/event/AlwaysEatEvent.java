package com.euphony.always_eat.event;

import dev.architectury.event.CompoundEventResult;
import dev.architectury.event.events.common.InteractionEvent;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;

public class AlwaysEatEvent {
    public static void init() {
        InteractionEvent.RIGHT_CLICK_ITEM.register((player, hand) -> {
            ItemStack stack = player.getItemInHand(hand);

            if(stack.get(DataComponents.FOOD) == null) {
                return CompoundEventResult.pass();
            }
            player.startUsingItem(hand);
            return CompoundEventResult.interruptTrue(stack);
        });
    }
}
