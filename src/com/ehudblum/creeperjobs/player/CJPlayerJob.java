package com.ehudblum.creeperjobs.player;

import com.ehudblum.creeperjobs.CreeperJobs;
import com.ehudblum.creeperjobs.job.CJJob;

public class CJPlayerJob {
    private CJJob job;
    private double exp;
    private boolean jobOn;
    private double expModifier;
    private double rewardModifier;

    public CJPlayerJob(CJJob job) {
        this(job, 0D, CreeperJobs.getData().defaultJobStatus, CreeperJobs.getData().defaultExpModifier, CreeperJobs.getData().defaultRewardModifier);
    }

    public CJPlayerJob(CJJob job, double exp, boolean jobOn, double expModifier, double rewardModifier) {
        this.job = job;
        this.exp = exp;
        this.jobOn = jobOn;
        this.expModifier = expModifier;
        this.rewardModifier = rewardModifier;
    }

    public CJJob getJob() {
        return this.job;
    }

    public double getExp() {
        return this.exp;
    }

    public void addExp(double expToAdd) {
        this.exp += expToAdd;
    }

    public void resetExp() {
        this.exp = 0;
    }

    public boolean isJobOn() {
        return jobOn;
    }

    public void changeJobMode() {
        this.jobOn = !jobOn;
    }

    public double getExpModifier() {
        return this.expModifier;
    }

    public void setExpModifier(double expModifier) {
        this.expModifier = expModifier;
    }

    public double getRewardModifier() {
        return rewardModifier;
    }

    public void setRewardModifier(double rewardModifier) {
        this.rewardModifier = rewardModifier;
    }
}
