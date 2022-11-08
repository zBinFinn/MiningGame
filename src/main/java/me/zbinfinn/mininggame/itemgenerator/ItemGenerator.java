package me.zbinfinn.mininggame.itemgenerator;

import me.zbinfinn.mininggame.Main;
import me.zbinfinn.mininggame.constants.UniChars;
import me.zbinfinn.mininggame.itemgenerator.itemdatatypes.BaseItemData;
import me.zbinfinn.mininggame.itemgenerator.itemdatatypes.ExtraItemData;
import me.zbinfinn.mininggame.util.ItemUtil;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class ItemGenerator {

    public static ItemStack generateItem(BaseItemData itemData, ExtraItemData extraItemData) {

        ItemStack item = itemData.getBaseItem();
        if (item.getItemMeta() == null)
            return item;

        ItemMeta meta = ItemUtil.setAllFlagsHidden(item.getItemMeta());

        Color rarityColor = generateRarityColorCode(itemData.getRarity());

        meta.setDisplayName(ChatColor.of(rarityColor) + itemData.getName());
        meta.setLore(generateLore(itemData, extraItemData));
        PersistentDataContainer container = meta.getPersistentDataContainer();
        container.set(new NamespacedKey(Main.PLUGIN_INSTANCE, "id"), PersistentDataType.STRING, itemData.getID());

        if(itemData.getMiningSpeed() != 0)
            container.set(new NamespacedKey(Main.PLUGIN_INSTANCE, "miningspeed"), PersistentDataType.DOUBLE, itemData.getMiningSpeed());

        if(itemData.getBreakingPower() != 0)
            container.set(new NamespacedKey(Main.PLUGIN_INSTANCE, "breakingpower"), PersistentDataType.INTEGER, itemData.getBreakingPower());

        item.setItemMeta(meta);

        return item;



    }
    private static List<String> generateLore(BaseItemData itemData, ExtraItemData extraItemData) {
        List<String> lore = new ArrayList<>();

        if (itemData.getLore() != null) {
            for (String string : itemData.getLore()) {
                lore.add(ChatColor.DARK_GRAY + "› " + ChatColor.GRAY + ChatColor.ITALIC + string);
            }
            lore.add(" ");
        }

        if (itemData.getMiningSpeed() != 0) {
            double miningSpeed = itemData.getMiningSpeed();
            if((miningSpeed - (int) miningSpeed) == 0)
                lore.add(ChatColor.AQUA + "⛏ " + ChatColor.GRAY + "Mining Speed: " + ChatColor.WHITE + (int)(miningSpeed));
            else
                lore.add(ChatColor.AQUA + "⛏ " + ChatColor.GRAY + "Mining Speed: " + ChatColor.WHITE + miningSpeed);

            if (itemData.getBreakingPower() == 0) lore.add(" ");
        }

        if (itemData.getBreakingPower() != 0) {
            lore.add(ChatColor.RED + "※ " + ChatColor.GRAY + "Breaking Power: " + ChatColor.WHITE + itemData.getBreakingPower());
            lore.add(" ");
        }

        if (itemData.getValue() != 0) {
            lore.add(ChatColor.DARK_GRAY + UniChars.FILLED_ARROW_POINTING_RIGHT + " " + ChatColor.GRAY + "Expected Value: " + ChatColor.YELLOW + itemData.getValue() + ChatColor.GOLD + UniChars.CURRENCY_SYMBOL);
            lore.add(" ");
        }

        if (itemData.getRarity() != null) {
            lore.add("" + ChatColor.of(generateRarityColorCode(itemData.getRarity())) + ChatColor.BOLD + itemData.getRarity().name);
        }

        return lore;
    }

    private static Color generateRarityColorCode(Rarity rarity) {
        return Color.decode(rarity.colorCode);
    }

}
