package me.zbinfinn.mininggame;

import me.zbinfinn.mininggame.commands.GiveCommand;
import me.zbinfinn.mininggame.events.PlayerLeftClickEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static Main PLUGIN_INSTANCE;

    @Override
    public void onEnable() {
        System.out.println("[Mining Game] Initializing...");

        initializeEvents();
        initializeCommands();

        PLUGIN_INSTANCE = this;

        System.out.println("[Mining Game] done.");

    }

    private void initializeCommands() {
        getCommand("give").setExecutor(new GiveCommand());
    }

    private void initializeEvents() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerLeftClickEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
