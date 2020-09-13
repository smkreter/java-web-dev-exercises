package exercises.quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class MultipleChoice extends Question {
    private HashMap<String, String> answer;
    private String response;
    public HashMap getAnswer() {
        return answer;
    }
    public MultipleChoice(String question, ArrayList<String> options, HashMap answer) {
        super(question);
        super(options);
        this.answer = answer;
    }


}
