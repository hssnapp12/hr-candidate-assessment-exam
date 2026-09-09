package com.hr.assessment.controller;

import com.hr.assessment.dto.AssessmentResultDto;
import com.hr.assessment.dto.ExamBundleDto;
import com.hr.assessment.dto.SubmissionRequest;
import com.hr.assessment.service.ExamBankService;
import com.hr.assessment.service.ScoringService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExamController {

    private final ExamBankService examBank;
    private final ScoringService scoringService;

    public ExamController(ExamBankService examBank, ScoringService scoringService) {
        this.examBank = examBank;
        this.scoringService = scoringService;
    }

    /** The question set the browser renders, with no answer key included. */
    @GetMapping("/exam")
    public ExamBundleDto getExam() {
        return examBank.getExamBundle();
    }

    /** Grades a completed submission server-side and returns the results. */
    @PostMapping("/assess")
    public AssessmentResultDto assess(@Valid @RequestBody SubmissionRequest submission) {
        return scoringService.score(submission);
    }
}
