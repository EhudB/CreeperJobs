package com.ehudblum.creeperjobs;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import com.ehudblum.creeperjobs.config.ConfigSource;
import com.ehudblum.creeperjobs.config.DataSource;
import com.ehudblum.creeperjobs.job.CJJob;
import com.ehudblum.creeperjobs.party.CJParty;
import com.ehudblum.creeperjobs.player.CJPlayer;

public class CJData {

    private ArrayList<CJPlayer> players = new ArrayList<CJPlayer>();
    private ArrayList<CJParty> parties = new ArrayList<CJParty>();
    private ArrayList<CJJob> jobs = new ArrayList<CJJob>();
    private ArrayList<String> forbiddenPrefixes = new ArrayList<String>();

    private DataSource source;

    // Party Stuff
    public boolean partyAllowed = true;
    public int partyDefaultSlots = 5;
    public int maxPartySlots = 1000;
    public double partyShareSelf = 70;
    public double partyShareOthers = 30;
    public double partyRadius = 25;

    // Job Stuff
    public CJJob defaultJob = null;
    public String defaultExpFormula = "150*(1.34^l)";
    public String defaultRewardFormula = "9.8*(1.2^l)";
    public double defaultExpModifier = 1D;
    public double defaultRewardModifier = 1D;
    public boolean defaultJobStatus = true;

    public void load() {
        String dataFolderPath = CreeperJobs.getInstance().getDataFolder().getAbsolutePath();
        source = new ConfigSource(dataFolderPath + "/players", dataFolderPath + "/parties", dataFolderPath + "/jobs");
        this.loadJobs(CreeperJobs.getInstance().getConfig().getStringList("jobs"));
        if (CreeperJobs.getInstance().getConfig().contains("default-job")) {
            defaultJob = this.getJobFromName(CreeperJobs.getInstance().getConfig().getString("default-job"));
        } else {
            if (this.jobs.size() > 0) {
                defaultJob = this.jobs.get(0);
            } else {
                defaultJob = null;
            }
        }
    }

    private void loadJobs(List<String> list) {
        for (String jobName : list) {
            if (!this.isJobRegistered(jobName)) {
                this.jobs.add(this.source.getJob(jobName));
                Bukkit.broadcastMessage("Loaded " + jobName + " from config");
            }
        }
    }

    private boolean isJobRegistered(String jobName) {
        for (CJJob job : jobs) {
            if (job.getJobName().equalsIgnoreCase(jobName)) {
                return true;
            }
        }
        return false;
    }

    public CJJob getJobFromName(String jobName) {
        for (CJJob job : this.jobs) {
            if (job.getJobName().equalsIgnoreCase(jobName)) {
                return job;
            }
        }
        return null;
    }

    public ArrayList<CJPlayer> getPlayers() {
        return players;
    }

    public ArrayList<CJJob> getJobs() {
        return jobs;
    }

    public ArrayList<String> getForbiddenPrefixes() {
        return forbiddenPrefixes;
    }

    public ArrayList<CJParty> getParties() {
        return this.parties;
    }

    public boolean addForbiddenPrefix(String prefix) {
        return this.forbiddenPrefixes.add(prefix);
    }

    public DataSource getSource() {
        return source;
    }
}
