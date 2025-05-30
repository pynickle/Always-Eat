package com.euphony.always_eat.event;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class AlwaysEatEvent {
    public static boolean eat(Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if(stack.get(DataComponents.FOOD) == null) {
            return false;
        }
        player.startUsingItem(hand);
        return true;
    }
}
