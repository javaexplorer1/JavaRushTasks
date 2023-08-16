package com.javarush.task.task29.task2909.human;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends UniversityPerson {
    @Getter
    double averageGrade;
    Date beginningOfSession;
    Date endOfSession;
    @Getter
    int course;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }

    public void incAverageGrade(double delta) {
        setAverageGrade(getAverageGrade() + delta);
    }

    public String getPosition() {
        return "Студент";
    }
}