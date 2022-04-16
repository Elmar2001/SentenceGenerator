import java.util.ArrayList;

public class SortedSentenceGenerator extends SentenceGenerator {

/**
 * Before adding a word into its internal vocabulary, SSG also converts the word to lower
 * case. Like RSG, SSG picks up the words randomly. The only difference is that it sorts
 * these words before the concatenation.
 */

    public SortedSentenceGenerator(Subject generator) {
        super(generator);
        genBehaviour = new SSGBehaviour(); // SortedSentenceGenerator has SSGBehaviour that implements task above
        addBehaviour = new LowerCaseBehaviour(); // SortedSentenceGenerator needs to convert words to lowercase before adding to vocabulary
    }

    @Override
    protected void invokeAddWord(String word, ArrayList<String> vocab) {
        addBehaviour.addWord(word, vocab);
    }

}
