package com.ehudblum.creeperjobs;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CreeperJobs extends JavaPlugin
{
	private static CreeperJobs instance;
	private CJData data = new CJData();
	private Logger log = Bukkit.getLogger();
	
	public void onEnable()
	{
		instance = this;
	}
	
	public void onDisable()
	{
		instance = null;
	}
	
	public static CreeperJobs getInstance()
	{
		return instance;
	}
	
	public static CJData getData()
	{
		return instance.data;
	}

	public static void logInfo(String msg)
	{
		instance.log.info(msg);
	}
}
