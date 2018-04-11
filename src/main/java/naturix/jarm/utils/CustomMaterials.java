package naturix.jarm.utils;

import naturix.jarm.JARM;
import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class CustomMaterials {
	public static String MODID = JARM.MODID;
    public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("ruby", MODID + ":ruby", 15, new int[]{ConfigMain.rubyHelm, ConfigMain.rubyChest, ConfigMain.rubyLeg, ConfigMain.rubyBoot}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial PrismarineArmorMaterial = EnumHelper.addArmorMaterial("prismarine", MODID + ":prismarine", 4, new int[]{ConfigMain.prismarineHelm, 5, 2, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LapisArmorMaterial = EnumHelper.addArmorMaterial("lapis", MODID + ":lapis", 4, new int[]{ConfigMain.lapisHelm, ConfigMain.lapisChest, ConfigMain.lapisLeg, ConfigMain.lapisBoot}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial EmeraldArmorMaterial = EnumHelper.addArmorMaterial("emerald", MODID + ":emerald", 4, new int[]{ConfigMain.emeraldHelm, ConfigMain.emeraldChest, ConfigMain.emeraldLeg, ConfigMain.emeraldBoot}, 500, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    public static final ItemArmor.ArmorMaterial AmethystArmorMaterial = EnumHelper.addArmorMaterial("amethyst", MODID + ":amethyst", 4, new int[]{ConfigMain.amethystHelm, ConfigMain.amethystChest, ConfigMain.amethystLeg, ConfigMain.amethystBoot}, 500, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial ShulkerArmorMaterial = EnumHelper.addArmorMaterial("SHULKER", MODID + ":shulker", 4, new int[]{ConfigMain.shulkerHelm, ConfigMain.shulkerChest, ConfigMain.shulkerLeg, ConfigMain.shulkerBoot}, 500, SoundEvents.ENTITY_SHULKER_AMBIENT, 0.0F); 
    public static final ItemArmor.ArmorMaterial brauniteArmorMaterial = EnumHelper.addArmorMaterial("braunite", MODID + ":braunite", 4, new int[]{ConfigMain.shulkerHelm +1, ConfigMain.shulkerChest+2, ConfigMain.shulkerLeg+2, ConfigMain.shulkerBoot+1}, 500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F); 
    public static final ItemArmor.ArmorMaterial amberArmorMaterial = EnumHelper.addArmorMaterial("amber", MODID + ":amber", 4, new int[]{3, 5, 4, 1}, 500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial cinnibarArmorMaterial = EnumHelper.addArmorMaterial("cinnibar", MODID + ":cinnibar", 4, new int[]{1, 2, 2, 1}, 500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial jadeArmorMaterial = EnumHelper.addArmorMaterial("jade", MODID + ":jade", 4, new int[]{3, 4, 4, 2}, 500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial opalArmorMaterial = EnumHelper.addArmorMaterial("opal", MODID + ":opal", 4, new int[]{2, 3, 2, 1}, 500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial saphireArmorMaterial = EnumHelper.addArmorMaterial("saphire", MODID + ":saphire", 4, new int[]{4, 4, 4, 3}, 500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial meteoriteArmorMaterial = EnumHelper.addArmorMaterial("meteorite", MODID + ":meteorite", 4, new int[]{5, 8, 7, 4}, 6546, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial tinArmorMaterial = EnumHelper.addArmorMaterial("tin", MODID + ":tin", 4, new int[]{4, 7, 5, 2}, 500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("copper", MODID + ":copper", 4, new int[]{3, 4, 3, 2}, 500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial leadArmorMaterial = EnumHelper.addArmorMaterial("lead", MODID + ":lead", 4, new int[]{1, 5, 2, 3}, 4500, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial silverArmorMaterial = EnumHelper.addArmorMaterial("silver", MODID + ":silver", 4, new int[]{4, 5, 5, 4}, 1024, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial tungstenArmorMaterial = EnumHelper.addArmorMaterial("tungsten", MODID + ":tungsten", 4, new int[]{2, 3, 4, 1}, 401, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial platinumArmorMaterial = EnumHelper.addArmorMaterial("platinum", MODID + ":platinum", 4, new int[]{5, 7, 6, 4}, 7854, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial cobaltArmorMaterial = EnumHelper.addArmorMaterial("cobalt", MODID + ":cobalt", 4, new int[]{4, 8, 7, 4}, 5468, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial mythrillArmorMaterial = EnumHelper.addArmorMaterial("mythrill", MODID + ":mythrill", 4, new int[]{4, 4, 4, 4}, 5644, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial titaniumArmorMaterial = EnumHelper.addArmorMaterial("titanium", MODID + ":titanium", 4, new int[]{9, 14, 13, 8}, 14395, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial luminiteArmorMaterial = EnumHelper.addArmorMaterial("luminite", MODID + ":luminite", 4, new int[]{1, 2, 1, 1}, 412, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial uraniumArmorMaterial = EnumHelper.addArmorMaterial("uranium", MODID + ":uranium", 4, new int[]{1, 2, 2, 2}, 800, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial nickelArmorMaterial = EnumHelper.addArmorMaterial("nickel", MODID + ":nickel", 4, new int[]{2, 4, 3, 1}, 1214, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial steelArmorMaterial = EnumHelper.addArmorMaterial("steel", MODID + ":steel", 4, new int[]{4, 7, 5, 4}, 2400, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial osmiumArmorMaterial = EnumHelper.addArmorMaterial("osmium", MODID + ":osmium", 4, new int[]{4, 6, 6, 4}, 3601, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F); 
    
    public static final ToolMaterial brauniteToolMaterial = EnumHelper.addToolMaterial("BRAUNITE", 4, 6723, 13, 10, 500);
    public static final ToolMaterial LapisToolMaterial = EnumHelper.addToolMaterial("LAPIS", 1, 100, 2, 1, 50);
    public static final ToolMaterial EmeraldToolMaterial = EnumHelper.addToolMaterial("EMERALD", 3, 1300, 11, 7, 50);
    public static final ToolMaterial AmethystToolMaterial = EnumHelper.addToolMaterial("AMETHYST", 4, 6723, 13, 10, 500);
    public static final ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("RUBY", 4, 4096, 14, 9, 19);
    public static final ToolMaterial amberToolMaterial = EnumHelper.addToolMaterial("AMBER", 1, 1520, 2, 5, 5);
    public static final ToolMaterial cinnibarToolMaterial = EnumHelper.addToolMaterial("CINNIBAR", 1, 1621, 2, 4, 3);
    public static final ToolMaterial jadeToolMaterial = EnumHelper.addToolMaterial("JADE", 2, 3215, 4, 9, 5);
    public static final ToolMaterial opalToolMaterial = EnumHelper.addToolMaterial("OPAL", 1, 1200, 1, 1, 2);
    public static final ToolMaterial saphireToolMaterial = EnumHelper.addToolMaterial("SAPHIRE", 4, 4096, 14, 9, 19);
    public static final ToolMaterial meteoriteToolMaterial = EnumHelper.addToolMaterial("METEORITE", 4, 8521, 14, 9, 19);
    public static final ToolMaterial tinToolMaterial = EnumHelper.addToolMaterial("TIN", 3, 4210, 8, 6, 5);
    public static final ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 2400, 8, 6, 4);
    public static final ToolMaterial leadToolMaterial = EnumHelper.addToolMaterial("LEAD", 2, 4096, 8, 6, 5);
    public static final ToolMaterial silverToolMaterial = EnumHelper.addToolMaterial("SILVER", 4, 2987, 8, 6, 5);
    public static final ToolMaterial tungstenToolMaterial = EnumHelper.addToolMaterial("TUNGSTEN", 3, 1000, 5, 3, 4);
    public static final ToolMaterial platinumToolMaterial = EnumHelper.addToolMaterial("PLATINUM", 4, 8000, 8, 6, 4);
    public static final ToolMaterial cobaltToolMaterial = EnumHelper.addToolMaterial("COBALT", 4, 4096, 14, 9, 19);
    public static final ToolMaterial mythrillToolMaterial = EnumHelper.addToolMaterial("MYTHRILL", 4, 4096, 14, 9, 19);
    public static final ToolMaterial titaniumToolMaterial = EnumHelper.addToolMaterial("TITANIUM", 4, 4096, 14, 9, 19);
    public static final ToolMaterial luminiteToolMaterial = EnumHelper.addToolMaterial("LUMINITE", 2, 2100, 3, 1, 2);
    public static final ToolMaterial nickelToolMaterial = EnumHelper.addToolMaterial("NICKEL", 2, 3600, 8, 6, 8);
    public static final ToolMaterial steelToolMaterial = EnumHelper.addToolMaterial("STEEL", 3, 4096, 8, 7, 6);
    public static final ToolMaterial osmiumToolMaterial = EnumHelper.addToolMaterial("OSMIUM", 4, 4096, 8, 8, 5);
}