package com.hr.assessment.model;

import java.util.List;

/** One Excel/Word computer-skills multiple-choice question. */
public class ComputerItem {
    private final String q;
    private final List<String> options;
    private final int correct;

    public ComputerItem(String q, List<String> options, int correct) {
        this.q = q;
        this.options = options;
        this.correct = correct;
    }

    public String getQ() { return q; }
    public List<String> getOptions() { return options; }
    public int getCorrect() { return correct; }
}
