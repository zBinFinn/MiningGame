package me.zbinfinn.mininggame.itemgenerator.itemdatatypes;

import me.zbinfinn.mininggame.itemgenerator.Rarity;
import org.bukkit.Material;

public class BaseItemDataBuilder {
    private Rarity rarity = Rarity.COMMON;
    private String name = "";
    private String[] lore = null;
    private int breakingPower = 0;
    private double miningSpeed = 0;
    private Material material = null;

    public BaseItemData build() {
        return new BaseItemData(rarity, name, lore, breakingPower, miningSpeed, material);

    }

    public BaseItemDataBuilder setMaterial(Material material) {
        this.material = material;
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




}
