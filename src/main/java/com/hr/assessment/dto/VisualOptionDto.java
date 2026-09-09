package com.hr.assessment.dto;

public class VisualOptionDto {
    private String kind;
    private int quadrant;

    public VisualOptionDto() {}

    public VisualOptionDto(String kind, int quadrant) {
        this.kind = kind;
        this.quadrant = quadrant;
    }

    public String getKind() { return kind; }
    public void setKind(String kind) { this.kind = kind; }
    public int getQuadrant() { return quadrant; }
    public void setQuadrant(int quadrant) { this.quadrant = quadrant; }
}
