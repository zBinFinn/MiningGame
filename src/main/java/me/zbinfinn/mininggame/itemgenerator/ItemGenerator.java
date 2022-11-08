package me.zbinfinn.mininggame.itemgenerator;

import me.zbinfinn.mininggame.itemgenerator.itemdatatypes.BaseItemData;
import me.zbinfinn.mininggame.itemgenerator.itemdatatypes.ExtraItemData;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class ItemGenerator {

    public static ItemStack generateItem(BaseItemData itemData, ExtraItemData extraItemData) {
        boolean extraItemDataExists = !(extraItemData == null);

        ItemStack item = new ItemStack(itemData.getMaterial());
        ItemMeta meta = item.getItemMeta();


        Color rarityColor = generateRarityColorCode(itemData.getRarity());

        meta.setDisplayName(ChatColor.of(rarityColor) + itemData.getName());
        meta.setLore(generateLore(itemData, extraItemData));


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

        if (itemData.getRarity() != null) {
            lore.add("" + ChatColor.of(generateRarityColorCode(itemData.getRarity())) + ChatColor.BOLD + itemData.getRarity().name);
        }


        return lore;
    }

    private static Color generateRarityColorCode(Rarity rarity) {
        return Color.decode(rarity.colorCode);
    }

}
