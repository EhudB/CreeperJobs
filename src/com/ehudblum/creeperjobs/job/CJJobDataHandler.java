package com.ehudblum.creeperjobs.job;

import org.bukkit.configuration.file.YamlConfiguration;
import com.ehudblum.creeperjobs.config.DataHandler;

public class CJJobDataHandler extends DataHandler<CJJob>{

    public CJJobDataHandler(YamlConfiguration configFile) {
        super(configFile);
    }

    @Override
    public CJJob parseDataFromConfig() {
        return null;
    }

    @Override
    public void setDataToConfig(String key, Object data) {
        
    }

}
