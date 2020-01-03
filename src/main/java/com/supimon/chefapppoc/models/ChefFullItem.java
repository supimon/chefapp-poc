package com.supimon.chefapppoc.models;

public class ChefFullItem {

    private String chefId;
    private String name;
    private String imgUrl;
    private String skills;
    private int recommendations;
    private double rating;
    private boolean verified;
    private int experience;
    private String phoneNumber;
    private String speciality;
    private String desc;
    private int expectedSalary;
    private String motherTongue;
    private String emailId;
    private int noticePeriod;

    public ChefFullItem(
            String chefId, String name, String imgUrl, String skills, int recommendations, double rating,
            boolean verified, int experience, String phoneNumber, String speciality, String desc,
            int expectedSalary, String motherTongue, String emailId, int noticePeriod) {
        this.chefId = chefId;
        this.name = name;
        this.imgUrl = imgUrl;
        this.skills = skills;
        this.recommendations = recommendations;
        this.rating = rating;
        this.verified = verified;
        this.experience = experience;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.desc = desc;
        this.expectedSalary = expectedSalary;
        this.motherTongue = motherTongue;
        this.emailId = emailId;
        this.noticePeriod = noticePeriod;
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

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(int expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(int noticePeriod) {
        this.noticePeriod = noticePeriod;
    }
}
