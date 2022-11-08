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
    private final int value;
    private final String id;

    public BaseItemData(Rarity rarity, String name, String[] lore, int breakingPower, double miningSpeed, ItemStack baseItem, int value, String id) {
        this.rarity = rarity;
        this.name = name;
        this.lore = lore;
        this.breakingPower = breakingPower;
        this.miningSpeed = miningSpeed;
        this.baseItem = baseItem;
        this.value = value;
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public int getValue() {
        return value;
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
