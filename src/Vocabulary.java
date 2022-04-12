import java.util.Scanner;

public class Vocabulary {

    public static void main(String[] args) {
//        System.out.println("Enter words: ");
        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();

        Generator gen = new Generator(); // Concrete subject

        // Create observers and attach them to the subject
        SentenceGenerator randomSentenceGenerator = new RandomSentenceGenerator(gen);
        SentenceGenerator sortedSentenceGenerator = new SortedSentenceGenerator(gen);
        SentenceGenerator orderedSentenceGenerator = new OrderedSentenceGenerator(gen);

        // Add words and inform observers
        gen.wordAdded("Test1");
        gen.wordAdded("Test4");
        gen.wordAdded("Test5");
        gen.wordAdded("Test6");
        gen.wordAdded("Test7");
        gen.wordAdded("Test8");
        gen.wordAdded("Test9");
        gen.wordAdded("Test2");
        gen.wordAdded("Test3");

        // Generate sentences
        randomSentenceGenerator.generate();
        sortedSentenceGenerator.generate();
        orderedSentenceGenerator.generate();

    }
}
