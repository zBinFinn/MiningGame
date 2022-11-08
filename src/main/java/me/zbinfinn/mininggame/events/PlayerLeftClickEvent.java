package me.zbinfinn.mininggame.events;

import me.zbinfinn.mininggame.Main;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerAnimationType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerLeftClickEvent implements Listener {

    @EventHandler
    public void onLeftClick(PlayerAnimationEvent event) {
        if(event.getAnimationType().equals(PlayerAnimationType.ARM_SWING)) {
            event.getPlayer().setGameMode(GameMode.ADVENTURE);
            new BukkitRunnable(){
                public void run(){

                }
            }.runTaskLater(Main.PLUGIN_INSTANCE, 20);
        }
        event.getPlayer().sendMessage("You interacted");
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 999999, -1));

    }
}
