package org.spongepowered.test;

import org.spongepowered.api.entity.living.Villager;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.ChangeBlockEvent;
import org.spongepowered.api.event.filter.cause.Root;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "villagerfarmtest", name = "Villager Farm Test", description = "A plugin to test villager farming", version = "0.0.0")
public class VillagerFarmTest {

    @Listener
    public void villagerBreak(ChangeBlockEvent.Break breakEvent, @Root Villager villager) {
        // At this point we should have a villager breaking or modifying blocks.
        System.err.println(breakEvent);
        breakEvent.setCancelled(true);
    }

}
