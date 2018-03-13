package naturix.JARM.items;

import naturix.JARM.JARM;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;


public class GemBraunite extends Item {

    public GemBraunite() {
        setRegistryName("gembraunite");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JARM.MODID + ".gembraunite");     // Used for localization (en_US.lang)
        setCreativeTab(JARM.JustAnotherRubyMod);
        OreDictionary.registerOre("gemBraunite", this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}