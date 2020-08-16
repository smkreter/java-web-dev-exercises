package exercises;
import java.util.ArrayList;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(123);
        myArrayList.add(456);
        myArrayList.add(789);
        myArrayList.add(147);
        myArrayList.add(258);
        myArrayList.add(369);
        myArrayList.add(987);
        myArrayList.add(654);
        myArrayList.add(321);
        myArrayList.add(741);
        //System.out.println(myArrayList);

        Integer sum = 0;
        // LOL this is not how you do for loops
        for (int i = 0; i < myArrayList.size(); i++) {
            sum += myArrayList.get(i);
        }
         //

        System.out.println(sum);


    }
}
