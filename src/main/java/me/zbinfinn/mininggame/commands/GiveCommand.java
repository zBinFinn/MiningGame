package me.zbinfinn.mininggame.commands;

import me.zbinfinn.mininggame.itemgenerator.BaseItem;
import me.zbinfinn.mininggame.itemgenerator.ItemGenerator;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class GiveCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player))
            return false;

        Player player = (Player) sender;
        if (BaseItem.contains(args[0])) {
            player.getInventory().addItem(ItemGenerator.generateItem(BaseItem.valueOf(args[0]).itemData, null));
        } else {
            player.sendMessage("" + ChatColor.DARK_RED + ChatColor.BOLD + "ERROR: " + ChatColor.RED + "The specified item does not exist");
        }

        return false;
    }

}
