package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word shall we search for in the first sentence of Alice in Wonderland?");
        String searchWord;
        searchWord =  input.nextLine().toLowerCase();
        String lowerFirstSentence = firstSentence.toLowerCase();
        if (lowerFirstSentence.contains(searchWord)) {
            System.out.println("The text contains " + searchWord);
        } else {
            System.out.println("The text does not contain " + searchWord);
        }
        input.close();
    }
}
