package com.effortguy.oop.lecture;

import java.util.Collections;
import java.util.List;

public class Lecture {
    private int pass;
    private String title;
    private List<Integer> scores;

    public Lecture(int pass, String title, List<Integer> scores) {
        this.pass = pass;
        this.title = title;
        this.scores = scores;
    }

    public double average() {
        return scores.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);
    }

    public List<Integer> getScores() {
        return Collections.unmodifiableList(scores);
    }

    public String evaluate() {
        return String.format("Pass:%d Fail:%d", passCount(), failCount());
    }

    private long failCount() {
        return scores.size() - passCount();
    }

    private long passCount() {
        return scores.stream().filter(score -> score >= pass).count();
    }
}
