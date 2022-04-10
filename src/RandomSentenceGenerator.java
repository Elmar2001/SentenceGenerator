import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class RandomSentenceGenerator extends SentenceGenerator {
    //    When a word is added to RSG, before storing it in internal vocabulary, the word is
    //    converted to lower case. RSG generates new sentences by randomly picking random
    //    amount of words from its internal vocabulary and concatenating them using single
    //    space between the words.

    public RandomSentenceGenerator(Subject generator) {
        super(generator);
        genBehaviour = new RSGBehaviour();
    }

    @Override
    public void update(String word) {
        Random rand = new Random();

        this.vocab.add(word.toLowerCase());
        int till = rand.nextInt(vocab.size());
        ArrayList<String> ret = new ArrayList<String>();

        for (int i = 0; i < till; i++) {
            int index = rand.nextInt(vocab.size());
            ret.add(vocab.get(index));
        }

        System.out.println(String.join(" ", ret));
    }


}
