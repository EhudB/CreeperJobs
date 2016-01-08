package com.ehudblum.creeperjobs.job;

import org.bukkit.configuration.file.YamlConfiguration;
import com.ehudblum.creeperjobs.config.DataHandler;

public class CJJobConfigDataHandler extends DataHandler<CJJob>{

    public CJJobConfigDataHandler(YamlConfiguration configFile) {
        super(configFile);
    }

    @Override
    public CJJob parseDataFromConfig() {
        return null;
    }

    @Override
    public void setDataToConfig(CJJob t) {
        // TODO Auto-generated method stub
        
    }
}
