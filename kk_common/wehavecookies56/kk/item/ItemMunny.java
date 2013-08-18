package wehavecookies56.kk.item;

import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;

public class ItemMunny extends ItemKingdomKeys{

    public ItemMunny(int id) {
        super(id);       
        this.setUnlocalizedName(Strings.Munny); 
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}