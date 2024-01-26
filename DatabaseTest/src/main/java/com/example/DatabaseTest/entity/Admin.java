package com.example.DatabaseTest.entity;
import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String name;
    private int id;
    private List<Question> questions;
    private List<Answer> answers;

    public Admin(String name, int id) {
        this.name = name;
        this.id = id;
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void deleteQuestion(Question question) {
        questions.remove(question);
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public void deleteAnswer(Answer answer) {
        answers.remove(answer);
    }

    public void editQuestion(Question question, String newQuestionText) {
        question.setQuestionText(newQuestionText);
    }

    public void editAnswer(Answer answer, String newAnswerText) {
        answer.setAnswerText(newAnswerText);
    }

}