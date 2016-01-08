package com.ehudblum.creeperjobs.config;

import org.bukkit.configuration.file.YamlConfiguration;

public abstract class DataHandler<T> {
    
    private YamlConfiguration configFile;
    
    public DataHandler(YamlConfiguration configFile) {
        this.configFile = configFile;
    }
    
    public abstract T parseDataFromConfig();

    public abstract void setDataToConfig(T t);

    /**
     * @return the configFile
     */
    public YamlConfiguration getConfigFile() {
        return configFile;
    }
}
