import java.util.Scanner;

public class Vocabulary {

    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner sc = new Scanner(System.in);

//        String word = sc.nextLine();

        Generator gen = new Generator();


        // Create and attach observers (Auction Bidders)
        SentenceGenerator sg = new SentenceGenerator(gen);
        SentenceGenerator sg2 = new SentenceGenerator(gen);
        SentenceGenerator sg3 = new SentenceGenerator(gen);

        gen.wordChanged("Test1");
        System.out.println();
        gen.wordChanged("Test2");
        System.out.println();
        gen.wordChanged("Test3");
        System.out.println();


    }
}
