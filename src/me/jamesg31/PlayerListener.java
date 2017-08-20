package me.jamesg31;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;

@SuppressWarnings("deprecation")
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
	
	@EventHandler
	public void pickupItem(PlayerPickupItemEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("pickupitemactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("pickupitemmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}	
	}
	
	@EventHandler
	public void gamemode(PlayerGameModeChangeEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("gamemodeactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("gamemodemessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}		
	}
	
	@EventHandler
	public void consume(PlayerItemConsumeEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("consumeactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("consumemessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}		
	}
	
	@EventHandler
	public void shear(PlayerShearEntityEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("shearactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("shearmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}		
	}
	
	@EventHandler
	public void fish(PlayerFishEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("fishactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("fishmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}		
	}
	
	@EventHandler
	public void sneak(PlayerToggleSneakEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("sneakactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("sneakmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}		
	}
	
	@EventHandler
	public void sprint(PlayerToggleSprintEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("sprintactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("sprintmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}		
	}
	
	@EventHandler
	public void leash(PlayerLeashEntityEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("leashactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("leashmessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}		
	}
	
	@EventHandler
	public void xpChange(PlayerExpChangeEvent e) {
		Player player = e.getPlayer();
		Boolean enabled;
		enabled = plugin.getConfig().getBoolean("xpchangeactivated");
		if (enabled == true) {
			String message;
			message = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("xpchangemessage"));
			player.sendMessage(message);
		}
		else {
			return;
		}		
	}
}
