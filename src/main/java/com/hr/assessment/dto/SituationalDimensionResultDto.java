package com.hr.assessment.dto;

public class SituationalDimensionResultDto {
    private String dimension;
    private int points;
    private String band;

    public SituationalDimensionResultDto() {}

    public SituationalDimensionResultDto(String dimension, int points, String band) {
        this.dimension = dimension;
        this.points = points;
        this.band = band;
    }

    public String getDimension() { return dimension; }
    public void setDimension(String dimension) { this.dimension = dimension; }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }
    public String getBand() { return band; }
    public void setBand(String band) { this.band = band; }
}
