package com.effortguy.oop.lecture;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void Lecture객체테스트() {
        Lecture lecture = new Lecture(70, "객체지향 프로그래밍", Arrays.asList(81, 95, 75, 50, 45));

        String evaluation = lecture.evaluate();

        System.out.println(evaluation);
    }
}