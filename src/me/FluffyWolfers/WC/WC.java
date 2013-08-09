package me.FluffyWolfers.WC;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class WC extends JavaPlugin{

	public static WC w;
	public static PluginDescriptionFile pdf;

	public void onEnable(){

		w = this;
		pdf = this.getDescription();
		
		Bukkit.getLogger().info("[ColorYourWolf v" + pdf.getVersion() + "] Starting up...");

		this.getServer().getPluginManager().registerEvents(new WCListener(), this);

	}

}