package naturix.jarm.blocks;

import naturix.jarm.Config;
import naturix.jarm.JARM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BeaconBase extends Block {

	public boolean addBeaconBase = Config.addBeaconBase;
	private String name;
	
    public BeaconBase(String name) {
        super(Material.ROCK);
        setUnlocalizedName(JARM.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(JARM.JARM);
        setHardness(4f);
		setResistance(5f);
		this.name = name;
	}
	public BeaconBase setBeaconBase(boolean b){
		addBeaconBase = b;
		return this;
	}
	@Override
	public boolean isBeaconBase(IBlockAccess world, BlockPos pos, BlockPos beacon){
		return addBeaconBase;
	}
	public boolean canEntitySpawn(Entity entityIn)
	{
		return true;
	}
	public void registerItemModel(Item itemBlock) {
		JARM.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
}