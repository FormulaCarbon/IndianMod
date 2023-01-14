package gamersciguy.indian.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndianMod implements ModInitializer {

	public static final Item RICE = new Item(new Item.Settings().group(ItemGroup.FOOD));
	
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("indianmod");

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("indianmod", "rice"), RICE);
	}
}
