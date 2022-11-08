package me.zbinfinn.mininggame.itemgenerator;

import me.zbinfinn.mininggame.itemgenerator.itemdatatypes.BaseItemData;
import me.zbinfinn.mininggame.itemgenerator.itemdatatypes.BaseItemDataBuilder;
import org.bukkit.Material;

public enum BaseItem {
    GOD_FISH(new BaseItemDataBuilder().setMaterial(Material.COD).setRarity(Rarity.LEGENDARY).setName("God Fish").setLore(new String[]{"Cool Fish that likes", "To eat your toes"}).build()),
    HOT_FISH(new BaseItemDataBuilder().setMaterial(Material.TROPICAL_FISH).setRarity(Rarity.MYTHIC).setName("Hot Fish").setLore(new String[]{"Hot Fish that likes","To be hot"}).build());

    public BaseItemData itemData;
    BaseItem(BaseItemData itemData) {
        this.itemData = itemData;
    }

    public static boolean contains(String test) {

        for (BaseItem item : BaseItem.values()) {
            if (item.name().equals(test)) {
                return true;
            }
        }

        return false;
    }
}
