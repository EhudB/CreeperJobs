package com.ehudblum.creeperjobs.job;

import java.util.ArrayList;
import org.bukkit.configuration.file.YamlConfiguration;
import com.ehudblum.creeperjobs.CreeperJobs;
import com.ehudblum.creeperjobs.config.DataHandler;
import com.ehudblum.creeperjobs.job.requirement.CJBlock;
import com.ehudblum.creeperjobs.job.requirement.CJBlockConfigHandler;
import com.ehudblum.creeperjobs.job.requirement.CJEntity;
import com.ehudblum.creeperjobs.job.requirement.CJEntityConfigHandler;

public class CJJobConfigHandler extends DataHandler<CJJob>{

    public CJJobConfigHandler(YamlConfiguration configFile) {
        super(configFile);
    }

    @Override
    public CJJob parseDataFromConfig() {
        String jobName = this.configFile.getString("job_name", "");
        String description = this.configFile.getString("description", "A default description");
        String expFormula = this.configFile.getString("reward-formula", CreeperJobs.getData().defaultExpFormula);
        String rewardFormula = this.configFile.getString("reward-formula", CreeperJobs.getData().defaultRewardFormula);
        String jobColor = this.configFile.getString("chat-color", "WHITE").toUpperCase();
        boolean isListed = this.configFile.getBoolean("is-listed", true);
        ArrayList<CJBlock> blocks = new CJBlockConfigHandler(this.configFile).parseDataFromConfig();
        ArrayList<CJEntity> entitys = new CJEntityConfigHandler(this.configFile).parseDataFromConfig();
        return new CJJob(this, jobName, description, expFormula, rewardFormula, jobColor, isListed, blocks, entitys);
    }

    @Override
    public void setDataToConfig(CJJob t) {
        
    }
}
