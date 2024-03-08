
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.solarisassets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.solarisassets.item.TexturePlayerTabItem;
import net.mcreator.solarisassets.SolarisassetsMod;

public class SolarisassetsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SolarisassetsMod.MODID);
	public static final RegistryObject<Item> TEXTURE_PLAYER_TAB = REGISTRY.register("texture_player_tab", () -> new TexturePlayerTabItem());
}
