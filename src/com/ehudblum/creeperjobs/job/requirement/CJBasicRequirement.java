package com.ehudblum.creeperjobs.job.requirement;

public abstract class CJBasicRequirement {
    private double exp;
    private double reward;
    
    public CJBasicRequirement(double exp, double reward) {
        this.exp = exp;
        this.reward = reward;
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
