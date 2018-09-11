package ood.quora;

import java.util.Collections;
import java.util.List;

public class QuoraPlatform {

    private User user;
    private List<Question> questions;

    public void postQuestion(Question question){
        if(isSimilarQuestion(question));
    }

    private boolean isSimilarQuestion(Question question) {
        for (Question ques: questions) {
            if(question.equals(question))
                return false;

        }
        return true;


    }

    public void answerQuestion(Question question){

    }

    public List<Answer> searchQuestion(String questionToAsk){
        return Collections.emptyList();
    }

    public void upVoteAnswer(Answer answer, User user){

    }

}
