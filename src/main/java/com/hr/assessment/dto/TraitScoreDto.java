package com.hr.assessment.dto;

public class TraitScoreDto {
    private String trait;
    private double avg;
    private String band;
    private String description;

    public TraitScoreDto() {}

    public TraitScoreDto(String trait, double avg, String band, String description) {
        this.trait = trait;
        this.avg = avg;
        this.band = band;
        this.description = description;
    }

    public String getTrait() { return trait; }
    public void setTrait(String trait) { this.trait = trait; }
    public double getAvg() { return avg; }
    public void setAvg(double avg) { this.avg = avg; }
    public String getBand() { return band; }
    public void setBand(String band) { this.band = band; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
