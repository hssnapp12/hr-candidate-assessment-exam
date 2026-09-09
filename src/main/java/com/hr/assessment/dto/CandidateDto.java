package com.hr.assessment.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CandidateDto {

    @NotBlank(message = "Candidate name is required")
    private String name;

    @NotNull(message = "Candidate age is required")
    @Min(value = 16, message = "Candidate age must be at least 16")
    private Integer age;

    @NotBlank(message = "Position applied for is required")
    private String position;

    public CandidateDto() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
}
