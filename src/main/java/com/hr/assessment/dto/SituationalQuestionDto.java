package com.hr.assessment.dto;

import java.util.List;

/** Public view of a situational item — option text only, points are kept server-side. */
public class SituationalQuestionDto {
    private int index;
    private String dimension;
    private String q;
    private List<String> options;

    public SituationalQuestionDto() {}

    public SituationalQuestionDto(int index, String dimension, String q, List<String> options) {
        this.index = index;
        this.dimension = dimension;
        this.q = q;
        this.options = options;
    }

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }
    public String getDimension() { return dimension; }
    public void setDimension(String dimension) { this.dimension = dimension; }
    public String getQ() { return q; }
    public void setQ(String q) { this.q = q; }
    public List<String> getOptions() { return options; }
    public void setOptions(List<String> options) { this.options = options; }
}
