package me.zbinfinn.mininggame;

import me.zbinfinn.mininggame.commands.GiveCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[Mining Game] Initializing...");

        initializeEvents();
        initializeCommands();

        System.out.println("[Mining Game] done.");

    }

    private void initializeCommands() {
        getCommand("give").setExecutor(new GiveCommand());
    }

    private void initializeEvents() {

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
