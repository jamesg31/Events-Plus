package me.jamesg31;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class EventsMessages extends JavaPlugin{
	
	public Permission playerPermission = new Permission("events.notify");
	
			
	@Override
	public void onEnable() {
		getLogger().info("EventsPlus Enabled!");
		new PlayerListener(this);
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(playerPermission);
		registerConfig();
	}
	


	@Override
	public void onDisable() {
		
	}
	
	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
	}
}