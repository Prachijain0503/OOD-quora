package ood.quora;

import java.util.List;

public class Question {
    private final String question;
    private final String genre;
    List<Answer> answers;

    public Question(String question, String genre) {
        this.question = question;
        this.genre = genre;
    }
}
