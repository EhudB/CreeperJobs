package com.ehudblum.creeperjobs.player;

import com.ehudblum.creeperjobs.CreeperJobs;
import com.ehudblum.creeperjobs.config.CJSerializable;
import com.ehudblum.creeperjobs.job.CJJob;
import com.ehudblum.creeperjobs.party.CJParty;

public class CJPlayer extends CJSerializable
{
	private String playerUUID; 
	private CJPlayerJob playerJob;
	private CJParty playerParty;
	private boolean jobSpam;
	private CJParty pendingParty;
	private int maxPartySlots;
	
	public CJPlayer(CJPlayerConfigDataHandler dataHandler, String playerUUID)
	{
		this(dataHandler, playerUUID, null);
	}
	
	public CJPlayer(CJPlayerConfigDataHandler dataHandler, String playerUUID, CJPlayerJob playerJob)
	{
		this(dataHandler, playerUUID, playerJob, null);
	}
	
	public CJPlayer(CJPlayerConfigDataHandler dataHandler, String playerUUID, CJPlayerJob playerJob, CJParty playerParty)
	{
		this(dataHandler, playerUUID, playerJob, playerParty, true);
	}
	
	public CJPlayer(CJPlayerConfigDataHandler dataHandler, String playerUUID, CJPlayerJob playerJob, CJParty playerParty, boolean jobSpam)
	{
		this(dataHandler, playerUUID, playerJob, playerParty, jobSpam, CreeperJobs.getData().partyDefaultSlots);
	}
	
	
	public CJPlayer(CJPlayerConfigDataHandler dataHandler, String playerUUID, CJPlayerJob playerJob,
	        CJParty playerParty, boolean jobSpam, int maxPartySlots)
	{
	    super(dataHandler);
		this.playerUUID = playerUUID;
		this.playerParty = playerParty;
		this.playerJob = playerJob;
		this.jobSpam = jobSpam;
		this.maxPartySlots = maxPartySlots;
	}
	
	public String getUUID()
	{
		return this.playerUUID;
	}
	
	public boolean isJobSpam()
	{
		return this.jobSpam;
	}
	
	public void changeJobSpam(boolean jobSpam)
	{
		this.jobSpam = jobSpam;
	}
	
	public CJPlayerJob getPlayerJob()
	{
		return this.playerJob;
	}
	
	public void setPlayerJob(CJJob job)
	{
		CJPlayerJob playerJob = new CJPlayerJob(job);
		this.playerJob = playerJob;
	}
	
	public CJParty getPlayerParty()
	{
		return this.playerParty;
	}
	
	public CJParty getPendingParty()
	{
		return this.pendingParty;
	}
	
	public void setPlayerParty()
	{
		this.playerParty = this.pendingParty;
	}
	
	public int getMaxPartySlots()
	{
		return this.maxPartySlots;
	}
	
	public void setMaxPartySlots(int maxPartySlots)
	{
		this.maxPartySlots = maxPartySlots;
	}
}
