import java.util.Scanner;

public class Vocabulary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Generator gen = new Generator(); // Concrete generator subject

        // Create observers and attach them to the subject
        SentenceGenerator randomSentenceGenerator = new RandomSentenceGenerator(gen);
        SentenceGenerator sortedSentenceGenerator = new SortedSentenceGenerator(gen);
        SentenceGenerator orderedSentenceGenerator = new OrderedSentenceGenerator(gen);

        String input;
        System.out.println("Starting sentence generator...");
        System.out.println("Enter words to add them to vocabulary and to generate sentences (CMD+D or CTRL+Z to quit)");

        while (sc.hasNext()){
            input = sc.nextLine();
            gen.wordAdded(input);

        }

        // Add words and inform observers
//        gen.wordAdded("Hello");
//        gen.wordAdded("Hi");

        // Generate sentences
//        randomSentenceGenerator.generate();
//        sortedSentenceGenerator.generate();
//        orderedSentenceGenerator.generate();

    }
}
