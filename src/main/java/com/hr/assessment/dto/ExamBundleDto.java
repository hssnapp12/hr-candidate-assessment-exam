package com.hr.assessment.dto;

import java.util.List;

/** Everything the browser needs to render the exam, with no answer keys included. */
public class ExamBundleDto {
    private List<String> likertLabels;
    private List<PersonalityQuestionDto> personality;
    private List<IntelligenceQuestionDto> intelligence;
    private List<SituationalQuestionDto> situational;
    private List<ComputerQuestionDto> computerSkills;

    public ExamBundleDto() {}

    public ExamBundleDto(List<String> likertLabels,
                          List<PersonalityQuestionDto> personality,
                          List<IntelligenceQuestionDto> intelligence,
                          List<SituationalQuestionDto> situational,
                          List<ComputerQuestionDto> computerSkills) {
        this.likertLabels = likertLabels;
        this.personality = personality;
        this.intelligence = intelligence;
        this.situational = situational;
        this.computerSkills = computerSkills;
    }

    public List<String> getLikertLabels() { return likertLabels; }
    public void setLikertLabels(List<String> likertLabels) { this.likertLabels = likertLabels; }
    public List<PersonalityQuestionDto> getPersonality() { return personality; }
    public void setPersonality(List<PersonalityQuestionDto> personality) { this.personality = personality; }
    public List<IntelligenceQuestionDto> getIntelligence() { return intelligence; }
    public void setIntelligence(List<IntelligenceQuestionDto> intelligence) { this.intelligence = intelligence; }
    public List<SituationalQuestionDto> getSituational() { return situational; }
    public void setSituational(List<SituationalQuestionDto> situational) { this.situational = situational; }
    public List<ComputerQuestionDto> getComputerSkills() { return computerSkills; }
    public void setComputerSkills(List<ComputerQuestionDto> computerSkills) { this.computerSkills = computerSkills; }
}
