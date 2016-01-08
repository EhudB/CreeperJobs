package com.ehudblum.creeperjobs.config;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;
import com.ehudblum.creeperjobs.CreeperJobs;
import com.ehudblum.creeperjobs.job.CJJob;
import com.ehudblum.creeperjobs.job.CJJobConfigDataHandler;
import com.ehudblum.creeperjobs.party.CJParty;
import com.ehudblum.creeperjobs.player.CJPlayer;
import com.ehudblum.creeperjobs.player.CJPlayerConfigDataHandler;;

public class ConfigSource implements DataSource {

    private String playersPath;
    private String partiesPath;
    private String jobsPath;

    public ConfigSource(String playersPath, String partiesPath, String jobsPath) {
        this.jobsPath = jobsPath;
        this.partiesPath = partiesPath;
        this.playersPath = playersPath;
    }

    @Override
    public CJPlayer getPlayer(String playerUUID) {
        CJPlayer player = null;
        File playerFile = new File(playersPath, playerUUID + ".yml");
        if (!createFileIfNotExists(playerFile)) {
            CreeperJobs.logInfo("Problem loading player: " + playerUUID + " .");
            return null;
        }
        player = new CJPlayerConfigDataHandler(YamlConfiguration.loadConfiguration(playerFile)).parseDataFromConfig();

        return player;
    }

    @Override
    public void setPlayer(CJPlayer player) {
        
    }

    @Override
    public CJJob getJob(String jobName) {
        CJJob job = null;
        File jobFile = new File(jobsPath, jobName + ".yml");
        if (!createFileIfNotExists(jobFile)) {
            CreeperJobs.logInfo("Problem loading job: " + jobName + " .");
            return null;
        }
        job = new CJJobConfigDataHandler(YamlConfiguration.loadConfiguration(jobFile)).parseDataFromConfig();

        return job;
    }

    @Override
    public void setJob(CJJob job) {
        ((CJJobConfigDataHandler) job.getDataHandler()).setDataToConfig(job);

    }

    @Override
    public CJParty getParty(String partyName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setParty(CJParty party) {
        // TODO Auto-generated method stub

    }

    private boolean createFileIfNotExists(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
