package exercises.quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckBox {
    private ArrayList<String> answer;
    private ArrayList<String> response;
    public ArrayList<HashMap> getAnswer() {
        return answer;
    }
    public void addResponse(String answerPiece) {
        answer.add(answerPiece);
    }
    public CheckBox (String question, ArrayList<HashMap> options, <ArrayList> answer) {
        super(question);
        super(options);
        this.answer = answer;
    }
}

