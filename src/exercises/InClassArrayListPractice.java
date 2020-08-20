package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InClassArrayListPractice {
    public static ArrayList<Integer> sumArrayLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        //make an array list to hold the result
        ArrayList<Integer> result = new ArrayList<>();
        //check which array list is longer
        ArrayList<Integer> longerArray = new ArrayList<>();
        ArrayList<Integer>shorterArray = new ArrayList<>();
        if (listOne.size() > listTwo.size()) {
            longerArray = listOne;
            shorterArray = listTwo;
        } else {
            longerArray = listTwo;
            shorterArray = listOne;
        }
        //if there is an int in the shorter list, add the two ints together

        for (int i = 0; i < longerArray.size(); i++) {
            if (i < shorterArray.size()) {
                Integer sum = listOne.get(i) + listTwo.get(i);
                result.add(sum);
            }
            else result.add(longerArray.get(i));
        }
        //else keep the value from the longer one

        //return the arraylist
        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        firstArrayList.add(3);
        firstArrayList.add(4);
        firstArrayList.add(5);
        firstArrayList.add(1);

        ArrayList<Integer> secondArrayList = new ArrayList<>();
        secondArrayList.add(1);
        secondArrayList.add(6);

        System.out.println(sumArrayLists(firstArrayList, secondArrayList));

    }
}
