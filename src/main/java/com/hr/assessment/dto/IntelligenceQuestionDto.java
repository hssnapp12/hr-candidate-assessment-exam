package com.hr.assessment.dto;

import java.util.List;

/** Public (answer-key-free) view of an intelligence item, sent to the browser. */
public class IntelligenceQuestionDto {
    private int index;
    private String type;
    private String q;
    private List<String> options;
    private List<String> rows;
    private List<Integer> quadrantSeq;
    private List<VisualOptionDto> visualOptions;

    public IntelligenceQuestionDto() {}

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getQ() { return q; }
    public void setQ(String q) { this.q = q; }
    public List<String> getOptions() { return options; }
    public void setOptions(List<String> options) { this.options = options; }
    public List<String> getRows() { return rows; }
    public void setRows(List<String> rows) { this.rows = rows; }
    public List<Integer> getQuadrantSeq() { return quadrantSeq; }
    public void setQuadrantSeq(List<Integer> quadrantSeq) { this.quadrantSeq = quadrantSeq; }
    public List<VisualOptionDto> getVisualOptions() { return visualOptions; }
    public void setVisualOptions(List<VisualOptionDto> visualOptions) { this.visualOptions = visualOptions; }
}
