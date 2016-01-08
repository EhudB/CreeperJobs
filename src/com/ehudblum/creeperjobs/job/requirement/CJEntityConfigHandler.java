package com.ehudblum.creeperjobs.job.requirement;

import java.util.ArrayList;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import com.ehudblum.creeperjobs.config.DataHandler;

public class CJEntityConfigHandler extends DataHandler<ArrayList<CJEntity>> {

    public CJEntityConfigHandler(YamlConfiguration configFile) {
        super(configFile);
    }

    @Override
    public ArrayList<CJEntity> parseDataFromConfig() {
        ArrayList<CJEntity> blocks = new ArrayList<CJEntity>();
        if (this.configFile.isConfigurationSection("entitys")) {
            ConfigurationSection entitysSection = this.configFile.getConfigurationSection("entitys");
            for (String entityName : entitysSection.getKeys(false)) {
                ConfigurationSection entitySection = entitysSection.getConfigurationSection(entityName);
                double blockExp = entitySection.getDouble("exp", 0);
                double blockReward = entitySection.getDouble("reward", 0);
                double blockDropRarity = entitySection.getDouble("drop-rarity", 0);
                blocks.add(new CJEntity(blockExp, blockReward, blockDropRarity, entityName));
            }
        }
        return blocks;
    }

    @Override
    public void setDataToConfig(ArrayList<CJEntity> t) {
        ConfigurationSection blocksSection = this.configFile.getConfigurationSection("entitys");
        for (CJEntity entity : t) {
            ConfigurationSection blockSection = blocksSection.createSection(entity.getEntity().name());
            blockSection.set("exp", entity.getExp());
            blockSection.set("reward", entity.getReward());
            blockSection.set("drop-rarity", entity.getDropRarity());
        }
    }

}
