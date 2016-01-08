package com.ehudblum.creeperjobs.config;

import com.ehudblum.creeperjobs.job.CJJob;
import com.ehudblum.creeperjobs.party.CJParty;
import com.ehudblum.creeperjobs.player.CJPlayer;

public interface DataSource
{
	public CJPlayer getPlayer(String playerUUID);
	
	public void setPlayer(CJPlayer player);
	
	public CJJob getJob(String jobName);
	
	public void setJob(CJJob job);
	
	public CJParty getParty(String partyName);
	
	public void setParty(CJParty party);
}
