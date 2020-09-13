package exercises.quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class TrueFalse extends Question {
    private HashMap <String, boolean> answer;
    private String response;

    public TrueFalse(HashMap answer, ArrayList<HashMap> options, String response) {
        super(answer);
        super(options);
        this.response = response;
    }


}
