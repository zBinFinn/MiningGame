package me.zbinfinn.mininggame.itemgenerator.itemdatatypes;

import me.zbinfinn.mininggame.itemgenerator.Rarity;
import org.bukkit.inventory.ItemStack;

public class BaseItemData {
    private final Rarity rarity;
    private final String name;
    private final String[] lore;
    private final int breakingPower;
    private final double miningSpeed;
    private final ItemStack baseItem;

    public BaseItemData(Rarity rarity, String name, String[] lore, int breakingPower, double miningSpeed, ItemStack baseItem) {
        this.rarity = rarity;
        this.name = name;
        this.lore = lore;
        this.breakingPower = breakingPower;
        this.miningSpeed = miningSpeed;
        this.baseItem = baseItem;
    }


    public Rarity getRarity() {
        return rarity;
    }

    public String getName() {
        return name;
    }

    public String[] getLore() {
        return lore;
    }

    public int getBreakingPower() {
        return breakingPower;
    }

    public double getMiningSpeed() {
        return miningSpeed;
    }

    public ItemStack getBaseItem() {
        return baseItem;
    }
}
