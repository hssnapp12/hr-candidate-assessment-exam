package com.hr.assessment.dto;

import java.util.List;

public class AssessmentResultDto {
    private CandidateDto candidate;
    private ScoreDto intelligence;
    private ScoreDto computerSkills;
    private List<TraitScoreDto> personality;
    private ScoreDto situational;
    private List<SituationalDimensionResultDto> situationalDimensions;
    private String summary;

    public AssessmentResultDto() {}

    public AssessmentResultDto(CandidateDto candidate, ScoreDto intelligence, ScoreDto computerSkills,
                                List<TraitScoreDto> personality, ScoreDto situational,
                                List<SituationalDimensionResultDto> situationalDimensions, String summary) {
        this.candidate = candidate;
        this.intelligence = intelligence;
        this.computerSkills = computerSkills;
        this.personality = personality;
        this.situational = situational;
        this.situationalDimensions = situationalDimensions;
        this.summary = summary;
    }

    public CandidateDto getCandidate() { return candidate; }
    public void setCandidate(CandidateDto candidate) { this.candidate = candidate; }
    public ScoreDto getIntelligence() { return intelligence; }
    public void setIntelligence(ScoreDto intelligence) { this.intelligence = intelligence; }
    public ScoreDto getComputerSkills() { return computerSkills; }
    public void setComputerSkills(ScoreDto computerSkills) { this.computerSkills = computerSkills; }
    public List<TraitScoreDto> getPersonality() { return personality; }
    public void setPersonality(List<TraitScoreDto> personality) { this.personality = personality; }
    public ScoreDto getSituational() { return situational; }
    public void setSituational(ScoreDto situational) { this.situational = situational; }
    public List<SituationalDimensionResultDto> getSituationalDimensions() { return situationalDimensions; }
    public void setSituationalDimensions(List<SituationalDimensionResultDto> situationalDimensions) { this.situationalDimensions = situationalDimensions; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
}
