package com.supimon.chefapppoc.models;

public class ChefItem {

    private String chefId;
    private String name;
    private String imgUrl;
    private String skills;
    private int experience;

    public ChefItem() {
    }

    public ChefItem(String chefId, String name, String imgUrl, String skills, int experience) {
        this.chefId = chefId;
        this.name = name;
        this.imgUrl = imgUrl;
        this.skills = skills;
        this.experience = experience;
    }

    public String getChefId() {
        return chefId;
    }

    public void setChefId(String chefId) {
        this.chefId = chefId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
