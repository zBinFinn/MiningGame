package me.zbinfinn.mininggame.itemgenerator;

import me.zbinfinn.mininggame.itemgenerator.itemdatatypes.BaseItemData;
import me.zbinfinn.mininggame.itemgenerator.itemdatatypes.BaseItemDataBuilder;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public enum BaseItem {
    GOD_FISH(new BaseItemDataBuilder().setID("GOD_FISH").setMaterial(Material.COD).setRarity(Rarity.LEGENDARY).setName("God Fish").setLore(new String[]{"Cool Fish that likes", "To eat your toes"}).build()),
    HOT_FISH(new BaseItemDataBuilder().setID("HOT_FISH").setMaterial(Material.TROPICAL_FISH).setRarity(Rarity.MYTHIC).setName("Hot Fish").setLore(new String[]{"Hot Fish that likes","To be hot"}).setValue(100).build()),
    ADMIN_DRILL(new BaseItemDataBuilder().setID("ADMIN_DRILL").setItemStack(getItemStack("ADMIN_DRILL")).setRarity(Rarity.SUPREME).setName("Admin Drill").setMiningSpeed(100).setBreakingPower(5).build());

    private static ItemStack getItemStack(String id) {
        switch(id) {
            case "ADMIN_DRILL":
                ItemStack itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
                LeatherArmorMeta meta = (LeatherArmorMeta) itemStack.getItemMeta();
                if (meta == null)
                    return itemStack;
                meta.setColor(Color.fromRGB(0xFF0000));
                itemStack.setItemMeta(meta);
                return itemStack;
            default:
                return new ItemStack(Material.STONE);
        }
    }

    public final BaseItemData itemData;
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
