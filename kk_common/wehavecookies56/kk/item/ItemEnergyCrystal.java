package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import wehavecookies56.kk.lib.Reference;

public class ItemEnergyCrystal extends ItemKingdomKeys{
    public ItemEnergyCrystal(int id) {
        super(id);       
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}