package me.frixo.corehungergames.configuration;

import me.frixo.corehungergames.CoreHungerGames;

public class ConfigurationManager {
	
	FileManager fileManager = new FileManager(CoreHungerGames.getPlugin());
	
	public ConfigurationManager() {
		fileManager = new FileManager(CoreHungerGames.getPlugin());
	}
	
	public void loadConfiguration() {
		fileManager.getConfig("config.yml").saveDefaultConfig();
		fileManager.getConfig("messages.yml").saveDefaultConfig();
		fileManager.getConfig("abilities.yml").saveDefaultConfig();
		fileManager.getConfig("kits.yml").saveDefaultConfig();
		fileManager.getConfig("mysql.yml").saveDefaultConfig();
		fileManager.getConfig("sponsor.yml").saveDefaultConfig();
	}
	
	public FileManager getFileManager() {
		return fileManager;
	}

}
