package me.zbinfinn.mininggame.itemgenerator.itemdatatypes;

import me.zbinfinn.mininggame.itemgenerator.Rarity;
import org.bukkit.Material;

public class BaseItemData {
    private Rarity rarity;
    private String name;
    private String[] lore;
    private int breakingPower;
    private double miningSpeed;
    private Material material;

    public BaseItemData(Rarity rarity, String name, String[] lore, int breakingPower, double miningSpeed, Material material) {
        this.rarity = rarity;
        this.name = name;
        this.lore = lore;
        this.breakingPower = breakingPower;
        this.miningSpeed = miningSpeed;
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getLore() {
        return lore;
    }
    public void setLore(String[] lore) {
        this.lore = lore;
    }
    public int getBreakingPower() {
        return breakingPower;
    }
    public void setBreakingPower(int breakingPower) {
        this.breakingPower = breakingPower;
    }
    public double getMiningSpeed() {
        return miningSpeed;
    }
    public void setMiningSpeed(double miningSpeed) {
        this.miningSpeed = miningSpeed;
    }
    public Rarity getRarity() {
        return rarity;
    }
    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}
