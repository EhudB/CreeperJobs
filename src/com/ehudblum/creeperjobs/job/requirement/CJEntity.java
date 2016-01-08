package com.ehudblum.creeperjobs.job.requirement;

import org.bukkit.entity.EntityType;

public class CJEntity extends CJBasicRequirement {

    private EntityType entity;
    
    public CJEntity(double exp, double reward, double dropRarity, String entity) {
        this(exp, reward, dropRarity, EntityType.valueOf(entity));
    }

    public CJEntity(double exp, double reward, double dropRarity, EntityType entity) {
        super(exp, reward, dropRarity);
        this.entity = entity;
    }

    /**
     * @return the entity
     */
    public EntityType getEntity() {
        return entity;
    }

}
