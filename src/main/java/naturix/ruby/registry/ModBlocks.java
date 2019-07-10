package naturix.ruby.registry;

import naturix.ruby.objects.blocks.BlockBase;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static BlockBase ruby_ore = new BlockBase("ruby_ore");
    public static BlockBase braunite_ore = new BlockBase("braunite_ore");
    public static BlockBase opal_ore = new BlockBase("opal_ore");

}
