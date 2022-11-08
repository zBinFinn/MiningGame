package me.zbinfinn.mininggame.itemgenerator.itemdatatypes;

import me.zbinfinn.mininggame.itemgenerator.Rarity;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BaseItemDataBuilder {
    private Rarity rarity = Rarity.COMMON;
    private String name = "";
    private String[] lore = null;
    private int breakingPower = 0;
    private double miningSpeed = 0;
    private ItemStack itemStack = null;
    private int value = 0;
    private String id;

    public BaseItemData build() {
        return new BaseItemData(rarity, name, lore, breakingPower, miningSpeed, itemStack, value, id);
    }

    public BaseItemDataBuilder setID(String id) {
        this.id = id;
        return this;
    }

    public BaseItemDataBuilder setValue(int value) {
        this.value = value;
        return this;
    }

    public BaseItemDataBuilder setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
        return this;
    }

    public BaseItemDataBuilder setRarity(Rarity rarity) {
        this.rarity = rarity;
        return this;
    }

    public BaseItemDataBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BaseItemDataBuilder setLore(String[] lore) {
        this.lore = lore;
        return this;
    }

    public BaseItemDataBuilder setBreakingPower(int breakingPower) {
        this.breakingPower = breakingPower;
        return this;
    }

    public BaseItemDataBuilder setMiningSpeed(double miningSpeed) {
        this.miningSpeed = miningSpeed;
        return this;
    }


    public BaseItemDataBuilder setMaterial(Material material) {
        itemStack = new ItemStack(material);
        return this;
    }
}
