package com.ehudblum.creeperjobs.job.requirement;

public abstract class CJBasicRequirement {
    private double exp;
    private double reward;
    private double dropRarity;

    public CJBasicRequirement(double exp, double reward, double dropRarity) {
        this.exp = exp;
        this.reward = reward;
        this.dropRarity = dropRarity;
    }

    /**
     * @return the dropRarity
     */
    public double getDropRarity() {
        return dropRarity;
    }

    /**
     * @return the exp
     */
    public double getExp() {
        return exp;
    }

    /**
     * @return the reward
     */
    public double getReward() {
        return reward;
    }
}
