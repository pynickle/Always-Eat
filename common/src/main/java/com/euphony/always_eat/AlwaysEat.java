package com.euphony.always_eat;

import com.euphony.always_eat.event.AlwaysEatEvent;

public final class AlwaysEat {
    public static final String MOD_ID = "always_eat";

    public static void init() {
        AlwaysEatEvent.init();
    }
}
