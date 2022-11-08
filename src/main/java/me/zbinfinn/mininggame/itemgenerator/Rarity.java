package me.zbinfinn.mininggame.itemgenerator;

public enum Rarity {
    COMMON("#FFFFFF", "COMMON"),
    UNCOMMON("#6ceb8e", "UNCOMMON"),
    RARE("#71eef5","RARE"),
    EPIC("#a84ccf","EPIC"),
    LEGENDARY("#ffb300","LEGENDARY"),
    MYTHIC("#0e87eb","MYTHIC"),
    SUPREME("#FF0000","SUPREME");

    public final String colorCode;
    public final String name;

    Rarity(String colorCode, String name) {
        this.colorCode = colorCode;
        this.name = name;
    }

}
