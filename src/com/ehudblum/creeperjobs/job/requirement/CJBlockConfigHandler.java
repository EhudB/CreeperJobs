package com.ehudblum.creeperjobs.job.requirement;

import java.util.ArrayList;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import com.ehudblum.creeperjobs.config.DataHandler;

public class CJBlockConfigHandler extends DataHandler<ArrayList<CJBlock>> {

    public CJBlockConfigHandler(YamlConfiguration configFile) {
        super(configFile);
    }

    @Override
    public ArrayList<CJBlock> parseDataFromConfig() {
        ArrayList<CJBlock> blocks = new ArrayList<CJBlock>();
        if (this.configFile.isConfigurationSection("blocks")) {
            ConfigurationSection blocksSection = this.configFile.getConfigurationSection("blocks");
            for (String blockName : blocksSection.getKeys(false)) {
                ConfigurationSection blockSection = blocksSection.getConfigurationSection(blockName);
                double blockExp = blockSection.getDouble("exp", 0);
                double blockReward = blockSection.getDouble("reward", 0);
                double blockDropRarity = blockSection.getDouble("drop-rarity", 0);
                blocks.add(new CJBlock(blockExp, blockReward, blockDropRarity, blockName));
            }
        }
        return blocks;
    }

    @Override
    public void setDataToConfig(ArrayList<CJBlock> t) {
        ConfigurationSection blocksSection = this.configFile.getConfigurationSection("blocks");
        for (CJBlock block : t) {
            ConfigurationSection blockSection = blocksSection.createSection(block.getBlockMaterial().name());
            blockSection.set("exp", block.getExp());
            blockSection.set("reward", block.getReward());
            blockSection.set("drop-rarity", block.getDropRarity());
        }
    }

}
