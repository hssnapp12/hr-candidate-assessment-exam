# Candidate Assessment Exam

A Spring Boot web application for HR pre-employment assessments, covering personality (Big Five style), cognitive/intelligence reasoning (including visual pattern-matrix questions), situational judgment, and computer skills — with automatically generated results.

This is a Java rewrite of an earlier single-file HTML/JS prototype. The scoring logic and the answer key now live entirely on the server: the browser only ever receives questions, never correct answers, and all scoring happens in the Java backend after submission.

## Tech stack

- Java 17
- Spring Boot 3.3.4 (`spring-boot-starter-web`, `spring-boot-starter-validation`)
- Maven
- Vanilla HTML/CSS/JS front end (served as static resources), calling the backend via a small JSON REST API

## Running it

```bash
mvn spring-boot:run
```

Then open `http://localhost:8080` in your browser.

## Running the tests

```bash
mvn test
```

Tests cover: that the exam bundle sent to the browser never includes answer keys or point values, that a perfect submission scores 100% across every section, that a worst-case submission scores 0%, and that submitting an incomplete section is rejected with a clear error message.

## Continuous Integration

`.github/workflows/build.yml` runs `mvn -B verify` on every push and pull request to `main` via GitHub Actions, so the full build and test suite is verified automatically on GitHub's runners.

## API

- `GET /api/exam` — returns the exam questions (personality, intelligence, situational, computer skills), with no answer keys exposed.
- `POST /api/assess` — accepts a candidate's answers and returns the scored `AssessmentResultDto` (per-section percentages, personality trait bands, situational judgment breakdown, and a generated summary).

## Project structure

```
src/main/java/com/hr/assessment/
  model/       domain objects (with the answer key — never serialized to the client)
  dto/         request/response objects exposed over the API (answer-key-free)
  service/     ExamBankService (question bank + public exam bundle), ScoringService (validation + scoring)
  controller/  ExamController (REST endpoints), ApiExceptionHandler (error responses)
src/main/resources/
  static/      index.html, css/style.css, js/app.js — the front end
src/test/java/  JUnit 5 test suite
```
