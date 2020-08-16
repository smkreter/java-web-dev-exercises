package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double length;
        double width;
        Scanner input = new Scanner(System.in);
        System.out.println("What's the length of your rectangle?");
        length = input.nextDouble();
        System.out.println("What's the width of your rectangle?");
        width = input.nextDouble();
        double area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}
