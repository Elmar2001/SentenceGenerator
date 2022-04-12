import java.util.Scanner;

public class Vocabulary {

    public static void main(String[] args) {
//        System.out.println("Enter words: ");
        Scanner sc = new Scanner(System.in);

//        String word = sc.nextLine();

        Generator gen = new Generator();

        SentenceGenerator sg = new RandomSentenceGenerator(gen);
        SentenceGenerator sg2 = new SortedSentenceGenerator(gen);
        SentenceGenerator sg3 = new OrderedSentenceGenerator(gen);

        gen.wordChanged("Test1");
        gen.wordChanged("Test4");
        gen.wordChanged("Test5");
        gen.wordChanged("Test6");
        gen.wordChanged("Test7");
        gen.wordChanged("Test8");
        gen.wordChanged("Test9");
        gen.wordChanged("Test2");
        gen.wordChanged("Test3");

        sg.generate();
        sg2.generate();
        sg3.generate();




    }
}
