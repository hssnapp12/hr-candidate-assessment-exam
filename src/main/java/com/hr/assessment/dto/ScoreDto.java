package com.hr.assessment.dto;

/** A simple achieved/total/percent score, used for the intelligence, computer-skills and situational sections. */
public class ScoreDto {
    private int achieved;
    private int total;
    private int pct;

    public ScoreDto() {}

    public ScoreDto(int achieved, int total, int pct) {
        this.achieved = achieved;
        this.total = total;
        this.pct = pct;
    }

    public int getAchieved() { return achieved; }
    public void setAchieved(int achieved) { this.achieved = achieved; }
    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }
    public int getPct() { return pct; }
    public void setPct(int pct) { this.pct = pct; }
}
