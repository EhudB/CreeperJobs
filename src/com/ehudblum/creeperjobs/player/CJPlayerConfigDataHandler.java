package com.ehudblum.creeperjobs.player;

import org.bukkit.configuration.file.YamlConfiguration;
import com.ehudblum.creeperjobs.config.DataHandler;

public class CJPlayerConfigDataHandler extends DataHandler<CJPlayer>{

    public CJPlayerConfigDataHandler(YamlConfiguration configFile) {
        super(configFile);
    }

    @Override
    public CJPlayer parseDataFromConfig() {
        return null;
    }

    @Override
    public void setDataToConfig(CJPlayer t) {
    }

}
