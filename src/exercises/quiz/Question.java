package exercises.quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Question {
    protected String questionText;
    protected ArrayList<HashMap> options;
    protected HashMap answer;
    public void getQuestion() {
        return questionText;
    }
    public void getOptions() {
        return options;
    }
    public Question(String questionText, ArrayList<HashMap> options){
        this.questionText = questionText;
        this.options = options;
    }

    public boolean validateAnswer(String response){
        if (answer.getClass() === ArrayList) {
            if (answer == response) {
                return true;
            } else if (answer.containsKey(response)) {
            return true;
        } else return false;
    }
}
