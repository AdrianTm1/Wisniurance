package com.company.classes;

public class Damage {
    private String id;
    private String policy;
    private String documents;
    private String damageType;
    private String victim;

    public Damage() {
    }

    public Damage(String id, String policy, String documents, String damageType, String victim) {
        this.id = id;
        this.policy = policy;
        this.documents = documents;
        this.damageType = damageType;
        this.victim = victim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getVictim() {
        return victim;
    }

    public void setVictim(String victim) {
        this.victim = victim;
    }
}
