package com.hr.assessment.dto;

import java.util.List;

public class ComputerQuestionDto {
    private int index;
    private String q;
    private List<String> options;

    public ComputerQuestionDto() {}

    public ComputerQuestionDto(int index, String q, List<String> options) {
        this.index = index;
        this.q = q;
        this.options = options;
    }

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }
    public String getQ() { return q; }
    public void setQ(String q) { this.q = q; }
    public List<String> getOptions() { return options; }
    public void setOptions(List<String> options) { this.options = options; }
}
