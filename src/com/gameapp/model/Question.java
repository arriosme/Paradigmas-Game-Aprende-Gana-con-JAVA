package com.gameapp.model;  //agregamos el paquete general de los archivos del juego

public class Question {
    private int questionIndex;
    private String questionText;
    private String[] optionsText;
    private int answerIndex;
    private float answerScore;

    public Question(int questionIndex, String questionText, String[] optionsText, int answerIndex, float answerScore) {
        this.questionIndex = questionIndex;
        this.questionText = questionText;
        this.optionsText = optionsText;
        this.answerIndex = answerIndex;
        this.answerScore = answerScore;
    }

    public int getQuestionIndex() {
        return questionIndex;
    }

    public void setQuestionIndex(int questionIndex) {
        this.questionIndex = questionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String[] getOptionsText() {
        return optionsText;
    }

    public void setOptionsText(String[] optionsText) {
        this.optionsText = optionsText;
    }

    public int getAnswerIndex() {
        return answerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        this.answerIndex = answerIndex;
    }

    public float getAnswerScore() {
        return answerScore;
    }

    public void setAnswerScore(float answerScore) {
        this.answerScore = answerScore;
    }

    @Override
    public String toString() {
        return "Question{" + "questionIndex=" + questionIndex + ", questionText=" + questionText + ", optionsText="
                + optionsText + ", answerIndex=" + answerIndex + ", answerScore=" + answerScore + '}';
    }

}
