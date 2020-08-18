package exercises;

public class InClassCodeAlongPractice {
    public static int sumFirstLast(int[] array) {
       return array[0] + array[array.length-1];
    }
    public static void main(String[] args) {
        int[] myTestArray = new int[] {4, 5, 6, 7, 8};
        System.out.println(sumFirstLast(myTestArray));
    }
}
