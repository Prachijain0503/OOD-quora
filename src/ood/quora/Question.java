package ood.quora;

import java.util.List;

public class Question {
    private final String question;
    private final String genere;
    List<String> answers;
    int upVoteCount;
    int downVoteCount;

    public Question(String question, String genere) {
        this.question = question;
        this.genere = genere;
    }
}
