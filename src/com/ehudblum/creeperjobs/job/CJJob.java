package com.ehudblum.creeperjobs.job;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import com.ehudblum.creeperjobs.config.CJSerializable;
import com.ehudblum.creeperjobs.job.requirement.CJBlock;
import com.ehudblum.creeperjobs.job.requirement.CJEntity;

public class CJJob extends CJSerializable {
    private String jobName;
    private String jobDescription;
    private String expFormula;
    private String rewardFormula;
    private ChatColor jobColor;
    private boolean isJobListed;

    private ArrayList<CJBlock> jobBlocks;
    private ArrayList<CJEntity> jobEntitys;

    public CJJob(CJJobConfigHandler dataHandler, String jobName, String jobDescription, String expFormula,
            String rewardFormula, String jobColor, boolean isJobListed, ArrayList<CJBlock> jobBlocks,
            ArrayList<CJEntity> jobEntitys) {
        this(dataHandler, jobName, jobDescription, expFormula, rewardFormula, ChatColor.valueOf(jobColor), isJobListed,
                jobBlocks, jobEntitys);
    }

    public CJJob(CJJobConfigHandler dataHandler, String jobName, String jobDescription, String expFormula,
            String rewardFormula, ChatColor jobColor, boolean isJobListed, ArrayList<CJBlock> jobBlocks,
            ArrayList<CJEntity> jobEntitys) {
        super(dataHandler);
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.expFormula = expFormula;
        this.rewardFormula = rewardFormula;
        this.jobColor = jobColor;
        this.isJobListed = isJobListed;
    }

    /**
     * @return the jobName
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName
     *            the jobName to set
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return the jobDescription
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * @param jobDescription
     *            the jobDescription to set
     */
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * @return the expFormula
     */
    public String getExpFormula() {
        return expFormula;
    }

    /**
     * @param expFormula
     *            the expFormula to set
     */
    public void setExpFormula(String expFormula) {
        this.expFormula = expFormula;
    }

    /**
     * @return the rewardFormula
     */
    public String getRewardFormula() {
        return rewardFormula;
    }

    /**
     * @param rewardFormula
     *            the rewardFormula to set
     */
    public void setRewardFormula(String rewardFormula) {
        this.rewardFormula = rewardFormula;
    }

    /**
     * @return the jobColor
     */
    public ChatColor getJobColor() {
        return jobColor;
    }

    /**
     * @param jobColor
     *            the jobColor to set
     */
    public void setJobColor(ChatColor jobColor) {
        this.jobColor = jobColor;
    }

    /**
     * @return the isJobListed
     */
    public boolean isJobListed() {
        return isJobListed;
    }

    /**
     * @param isJobListed
     *            the isJobListed to set
     */
    public void setJobListed(boolean isJobListed) {
        this.isJobListed = isJobListed;
    }

    /**
     * @return the jobBlocks
     */
    public ArrayList<CJBlock> getJobBlocks() {
        return jobBlocks;
    }

    /**
     * @param jobBlocks
     *            the jobBlocks to set
     */
    public void setJobBlocks(ArrayList<CJBlock> jobBlocks) {
        this.jobBlocks = jobBlocks;
    }

    /**
     * @param jobBlock
     *            the jobBlock to add
     */
    public void addJobBlock(CJBlock jobBlock) {
        this.jobBlocks.add(jobBlock);
    }

    /**
     * @return the jobEntitys
     */
    public ArrayList<CJEntity> getJobEntitys() {
        return jobEntitys;
    }

    /**
     * @param jobEntitys
     *            the jobEntitys to set
     */
    public void setJobEntitys(ArrayList<CJEntity> jobEntitys) {
        this.jobEntitys = jobEntitys;
    }

    /**
     * @param jobEntity
     *            the jobEntity to add
     */
    public void addJobEntity(CJEntity jobEntity) {
        this.jobEntitys.add(jobEntity);
    }
}
