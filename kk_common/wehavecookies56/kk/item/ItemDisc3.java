package wehavecookies56.kk.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemRecord;

public class ItemDisc3 extends ItemRecord {

	protected ItemDisc3(int par1, String par2Str) {
		super(par1, par2Str);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.maxStackSize = 1;
	}

	@SideOnly(Side.CLIENT)

    public String getRecordTitle()
    {
        return "Square Enix KH 358/2 Days - " + Strings.Disc3;
    }
	
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}
