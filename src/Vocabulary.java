import java.util.Scanner;

/**
 * Vocabulary class initializes generators and interacts with the user through the console to generate sentences.
 */
public class Vocabulary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Generator gen = new Generator(); // Concrete generator subject

        // Create observers and attach them to the subject
        SentenceGenerator randomSentenceGenerator = new RandomSentenceGenerator(gen);
        SentenceGenerator sortedSentenceGenerator = new SortedSentenceGenerator(gen);
        SentenceGenerator orderedSentenceGenerator = new OrderedSentenceGenerator(gen);

        System.out.println("Starting sentence generator...");
        System.out.println("Enter words to add them to vocabulary and to generate sentences (CMD+D or CTRL+Z to quit)");

        String input;

        while (sc.hasNext()){
            input = sc.nextLine(); // accept input from console
            gen.wordAdded(input); // inform observers about the new word
        }

        System.out.print("Exiting...");

    }
}
