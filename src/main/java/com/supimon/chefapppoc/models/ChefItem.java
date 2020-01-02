package com.supimon.chefapppoc.models;

public class ChefItem {

    private String name;
    private String desc;
    private String imgUrl;
    private String[] skills;
    private String[] specialSkills;
    private int recommendations;
    private double rating;
    private String motherTongue;
    private boolean verified;
    private int expectedSalary;
    private int currentSalary;

    public ChefItem(String name, String desc, String imgUrl, String[] skills, String[] specialSkills,
                    int recommendations, double rating, String motherTongue, boolean verified,
                    int expectedSalary, int currentSalary) {
        this.name = name;
        this.desc = desc;
        this.imgUrl = imgUrl;
        this.skills = skills;
        this.specialSkills = specialSkills;
        this.recommendations = recommendations;
        this.rating = rating;
        this.motherTongue = motherTongue;
        this.verified = verified;
        this.expectedSalary = expectedSalary;
        this.currentSalary = currentSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String[] getSpecialSkills() {
        return specialSkills;
    }

    public void setSpecialSkills(String[] specialSkills) {
        this.specialSkills = specialSkills;
    }

    public int getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(int recommendations) {
        this.recommendations = recommendations;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(int expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public int getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(int currentSalary) {
        this.currentSalary = currentSalary;
    }
}
