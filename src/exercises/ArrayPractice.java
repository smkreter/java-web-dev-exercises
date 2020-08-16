package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] fibonaccArray = new int[] {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < fibonaccArray.length; i++) {
            System.out.println(fibonaccArray[i]);
        }
        String catHatString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //String[] catHatArray = new String[32];
        //catHatArray = catHatString.split(" ");
        //System.out.println(catHatArray);
        String[] catHatArray = catHatString.split(" ");
        //System.out.println(catHatArray);
        System.out.println(Arrays.toString(catHatArray));
    }
}



