package me.aberdeener.clearchat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ClearChat extends JavaPlugin{
	
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        
        if(commandLabel.equalsIgnoreCase("clearchat") || commandLabel.equalsIgnoreCase("cc")) {
        	Player p = (Player)sender;
        	if(!p.hasPermission("clear.chat")) {
        		p.sendMessage(ChatColor.RED + "Oops ya got no perms D:");
        	}else {
        		for(int i=0;i<200;i++) {
        			Bukkit.broadcastMessage("");
        		}
        		p.sendMessage(ChatColor.GREEN + "Cleared chat for ya :D");
        	}
        }	
        	
        return true;

    }

}