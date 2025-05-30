package com.euphony.always_eat.fabric;

import com.euphony.always_eat.AlwaysEat;
import net.fabricmc.api.ModInitializer;

public final class AlwaysEatFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AlwaysEat.init();
    }
}
