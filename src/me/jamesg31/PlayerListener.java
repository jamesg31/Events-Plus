package me.jamesg31;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerListener implements Listener {

	private EventsMessages plugin;
	
	public PlayerListener(EventsMessages pl) {
		plugin = pl;
		plugin.getServer().getPluginManager().registerEvents(this, pl);
		
	}
	
	@EventHandler
	public void playerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("playerjoinactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("playerjoinmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}
			
	}
	
	@EventHandler
	public void playerDeath(PlayerRespawnEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("playerdeathactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("playerdeathmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}
			
	}
	
	@EventHandler
	public void eggThrow(PlayerEggThrowEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("eggthrowactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("eggthrowmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}
			
	}
	
	@EventHandler
	public void bedEnter(PlayerBedEnterEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("bedenteractivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bedentermessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}
			
	}
	
	@EventHandler
	public void bedLeave(PlayerBedLeaveEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("bedleaveactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bedleavemessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}
			
	}
	
	@EventHandler
	public void dropItem(PlayerDropItemEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("dropitemactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("dropitemmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}
			
	}
	
}
