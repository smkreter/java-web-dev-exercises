package exercises;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a student name to add them to the roster:");
        String newName = input.next();
        System.out.println("Type in that student's ID number to associate it with the student:");
        Integer newID = input.nextInt();
        students.put(newName, newID);
        System.out.println("The students roster is as follows: \n" + students);
    }
}
