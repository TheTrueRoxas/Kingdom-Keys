package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemDarkHeart extends ItemKingdomKeys{
    public ItemDarkHeart(int id) {
        super(id);       
        this.setUnlocalizedName(Strings.DHeart);
        
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon("kk:Dark Heart");
        }
}