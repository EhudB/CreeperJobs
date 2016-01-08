package com.ehudblum.creeperjobs.job.requirement;

import org.bukkit.Material;

public class CJBlock extends CJBasicRequirement {

    private Material blockMaterial;

    public CJBlock(double exp, double reward, String blockMaterial) {
        this(exp, reward, Material.valueOf(blockMaterial));
    }

    public CJBlock(double exp, double reward, Material blockMaterial) {
        this(exp, reward, 0, blockMaterial);
    }
    
    public CJBlock(double exp, double reward, double dropRarity, String blockMaterial) {
        this(exp, reward, dropRarity, Material.valueOf(blockMaterial));
    }

    public CJBlock(double exp, double reward, double dropRarity, Material blockMaterial) {
        super(exp, reward, dropRarity);
        this.blockMaterial = blockMaterial;
    }

    /**
     * @return the blockMaterial
     */
    public Material getBlockMaterial() {
        return blockMaterial;
    }

}
