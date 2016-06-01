package me.frixo.corehungergames;

import org.bukkit.plugin.java.JavaPlugin;

import me.frixo.corehungergames.configuration.ConfigurationManager;

public class CoreHungerGames extends JavaPlugin {
	
	private static CoreHungerGames instance;
	
	@Override
	public void onEnable() {
		
		instance = this;
		getConfiguration().loadConfiguration();
		
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
	}
	
	public static CoreHungerGames getPlugin() {
		return instance;
	}
	
	public ConfigurationManager getConfiguration() {
		return new ConfigurationManager();
	}
}