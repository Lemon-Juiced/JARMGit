package naturix.JARM.proxy;

import java.io.File;

import naturix.JARM.Config;
import naturix.JARM.ModBlocks;
import naturix.JARM.ModItems;
import naturix.JARM.armor.RubyBoots;
import naturix.JARM.blocks.RubyOre;
import naturix.JARM.armor.RubyChestplate;
import naturix.JARM.armor.RubyHelmet;
import naturix.JARM.armor.RubyLeggings;
import naturix.JARM.blocks.RubyBlock;
import naturix.JARM.items.AxeRuby;
import naturix.JARM.items.GemRuby;
import naturix.JARM.items.HoeRuby;
import naturix.JARM.items.PickaxeRuby;
import naturix.JARM.items.ShovelRuby;
import naturix.JARM.items.SwordRuby;
import naturix.JARM.ModCrafting;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) 
	{
		File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "JARM.cfg"));
        Config.readConfig();
    	ModCrafting.initCrafting();
    }

    public void init(FMLInitializationEvent e) 
    {

    }
    
    public void postInit(FMLPostInitializationEvent e) 
    {
    	if (config.hasChanged()) {
            config.save();
    }
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().register(new RubyBlock());
    	event.getRegistry().register(new RubyOre(null));
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new GemRuby());
        event.getRegistry().register(new SwordRuby(null));
        event.getRegistry().register(new PickaxeRuby(null));
        event.getRegistry().register(new AxeRuby(null));
        event.getRegistry().register(new ShovelRuby(null));
        event.getRegistry().register(new HoeRuby(null));
        event.getRegistry().register(new RubyBoots());
        event.getRegistry().register(new RubyLeggings());
        event.getRegistry().register(new RubyChestplate());
        event.getRegistry().register(new RubyHelmet());
        event.getRegistry().register(new ItemBlock(ModBlocks.rubyblock).setRegistryName(ModBlocks.rubyblock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.rubyore).setRegistryName(ModBlocks.rubyore.getRegistryName()));

    }



}