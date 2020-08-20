package exercises;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounterStudio {
    /*
    String mySentence = "I love the baby giant panda; I'd welcome one to my veranda. I never worry, wondering maybe, whether it isn't giant baby. I leave such matters to the scientists-- the giant baby and baby giantists. I simply want a veranda and a giant baby giant panda.";
     */
    // for each str.charAt(i)

    // if the char isn't a key in the hashmap, make it a key
    // make its value one
    // if the char IS a key already in the hashmap, add one to the value of that key

    public static void main(String[] args) {
        String mySentence = "I love the baby giant panda; I'd welcome one to my veranda. I never worry, wondering maybe, whether it isn't giant baby. I leave such matters to the scientists-- the giant baby and baby giantists. I simply want a veranda and a giant baby giant panda.";
        HashMap<Character, Integer> sentenceHashMap = new HashMap<>();
        String[] mySentenceArray = mySentence.split("");
        //System.out.println(mySentenceArray.getClass());
        for (int i = 0; i < mySentenceArray.length; i++) {
            Character searchedChar = mySentence.charAt(i);
            //System.out.println(searchedChar);

            if (!sentenceHashMap.containsKey(searchedChar)) {
                sentenceHashMap.put(searchedChar, 1);
            } else {
                sentenceHashMap.get(searchedChar)++;
            }


        }
        //System.out.println(sentenceHashMap);
    }

}
