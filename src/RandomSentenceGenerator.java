import java.util.ArrayList;

public class RandomSentenceGenerator extends SentenceGenerator {

/**
 * When a word is added to RSG, before storing it in internal vocabulary, the word is
 * converted to lower case. RSG generates new sentences by randomly picking random
 * amount of words from its internal vocabulary and concatenating them using single
 * space between the words.
 */

    public RandomSentenceGenerator(Subject generator) {
        super(generator);
        genBehaviour = new RSGBehaviour(); // RandomSentenceGenerator has RSGBehaviour that implements task above
        addBehaviour = new LowerCaseBehaviour();
    }

    @Override
    protected void invokeAddWord(String word, ArrayList<String> vocab) {
        addBehaviour.addWord(word, vocab);
    }

}
