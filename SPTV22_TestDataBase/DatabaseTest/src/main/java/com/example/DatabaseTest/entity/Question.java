package com.example.DatabaseTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String questionText;

    public Question() {
    }

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
}