package com.hr.assessment.model;

import java.util.List;

/**
 * One cognitive / logical-reasoning item. Two shapes share this class:
 *  - "text": a verbal/numerical question with plain-text options (q, options, correct).
 *  - "visual": a Raven's-style 3x3 pattern-matrix item (rows, quadrantSeq, visualOptions, correct).
 */
public class IntelligenceItem {

    public static final String TYPE_TEXT = "text";
    public static final String TYPE_VISUAL = "visual";

    private final String type;

    // text-type fields
    private final String q;
    private final List<String> options;

    // visual-type fields
    private final List<String> rows;             // 3 shape kinds, one per matrix row
    private final List<Integer> quadrantSeq;      // which quadrant is shaded per matrix column
    private final List<VisualOption> visualOptions;

    private final int correct; // index into options (text) or visualOptions (visual)

    public static IntelligenceItem text(String q, List<String> options, int correct) {
        return new IntelligenceItem(TYPE_TEXT, q, options, null, null, null, correct);
    }

    public static IntelligenceItem visual(List<String> rows, List<Integer> quadrantSeq,
                                           List<VisualOption> visualOptions, int correct) {
        return new IntelligenceItem(TYPE_VISUAL, null, null, rows, quadrantSeq, visualOptions, correct);
    }

    private IntelligenceItem(String type, String q, List<String> options,
                              List<String> rows, List<Integer> quadrantSeq,
                              List<VisualOption> visualOptions, int correct) {
        this.type = type;
        this.q = q;
        this.options = options;
        this.rows = rows;
        this.quadrantSeq = quadrantSeq;
        this.visualOptions = visualOptions;
        this.correct = correct;
    }

    public String getType() { return type; }
    public String getQ() { return q; }
    public List<String> getOptions() { return options; }
    public List<String> getRows() { return rows; }
    public List<Integer> getQuadrantSeq() { return quadrantSeq; }
    public List<VisualOption> getVisualOptions() { return visualOptions; }
    public int getCorrect() { return correct; }

    public boolean isVisual() { return TYPE_VISUAL.equals(type); }
}
