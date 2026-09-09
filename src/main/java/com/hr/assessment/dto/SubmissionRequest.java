package com.hr.assessment.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Map;

/** What the browser posts to /api/assess: the candidate plus one answer map per section (question index -> chosen option index, 1-5 for personality). */
public class SubmissionRequest {

    @Valid
    @NotNull(message = "Candidate details are required")
    private CandidateDto candidate;

    @NotNull(message = "Personality answers are required")
    private Map<Integer, Integer> personality;

    @NotNull(message = "Intelligence answers are required")
    private Map<Integer, Integer> intelligence;

    @NotNull(message = "Situational-judgment answers are required")
    private Map<Integer, Integer> situational;

    @NotNull(message = "Computer-skills answers are required")
    private Map<Integer, Integer> computerSkills;

    public SubmissionRequest() {}

    public CandidateDto getCandidate() { return candidate; }
    public void setCandidate(CandidateDto candidate) { this.candidate = candidate; }
    public Map<Integer, Integer> getPersonality() { return personality; }
    public void setPersonality(Map<Integer, Integer> personality) { this.personality = personality; }
    public Map<Integer, Integer> getIntelligence() { return intelligence; }
    public void setIntelligence(Map<Integer, Integer> intelligence) { this.intelligence = intelligence; }
    public Map<Integer, Integer> getSituational() { return situational; }
    public void setSituational(Map<Integer, Integer> situational) { this.situational = situational; }
    public Map<Integer, Integer> getComputerSkills() { return computerSkills; }
    public void setComputerSkills(Map<Integer, Integer> computerSkills) { this.computerSkills = computerSkills; }
}
