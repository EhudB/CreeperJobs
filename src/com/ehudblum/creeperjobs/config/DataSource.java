package com.ehudblum.creeperjobs.config;

import java.util.ArrayList;

import com.ehudblum.creeperjobs.job.CJJob;
import com.ehudblum.creeperjobs.party.CJParty;
import com.ehudblum.creeperjobs.player.CJPlayer;

public interface DataSource
{
	public CJPlayer getPlayer(String UUID);
	
	public void setPlayer(CJPlayer player);
	
	public ArrayList<CJJob> getJobs(String[] jobsList);
	
	public ArrayList<CJParty> getParties();
}
