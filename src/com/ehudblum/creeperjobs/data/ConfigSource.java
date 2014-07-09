package com.ehudblum.creeperjobs.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.ehudblum.creeperjobs.CreeperJobs;
import com.ehudblum.creeperjobs.job.CJJob;
import com.ehudblum.creeperjobs.party.CJParty;
import com.ehudblum.creeperjobs.player.CJPlayer;

public class ConfigSource implements DataSource
{

	private String	playersPath;
	private String	partiesPath;
	private String	jobsPath;

	public ConfigSource(String playersPath, String partiesPath, String jobsPath)
	{
		this.jobsPath = jobsPath;
		this.partiesPath = partiesPath;
		this.playersPath = playersPath;
	}

	@Override
	public CJPlayer getPlayer(String UUID)
	{
		CJPlayer player = null;
		File playerFile = new File(playersPath,UUID + ".yml");
		if(!checkFile(playerFile))
		{
			CreeperJobs.logInfo("Problem loading player: " + UUID + " .");
			return null;
		}
		
		return player;
	}

	@Override
	public void setPlayer(CJPlayer player)
	{
		
	}

	@Override
	public ArrayList<CJJob> getJobs(String[] jobsList)
	{
		ArrayList<CJJob> jobs = new ArrayList<CJJob>();
		return jobs;
	}
	
	@Override
	public ArrayList<CJParty> getParties()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean checkFile(File file)
	{
		if(!file.exists())
		{
			try
			{
				file.createNewFile();
				return true;
			}
			catch (IOException e)
			{
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
}
