import java.util.ArrayList;

public class OrderedSentenceGenerator extends SentenceGenerator {

/**
 * OSG is different from both RSG and SSG. A word, before adding into internal
 * vocabulary, will be converted to upper case and reversed. OSG concatenates all of the
 * words in the same order they have been added to the vocabulary.
 */

    public OrderedSentenceGenerator(Subject generator) {
        super(generator);
        genBehaviour = new OSGBehaviour(); // OrderedSentenceGenerator has OSGBehaviour that implements task above
        addBehaviour = new UpperCaseReverseBehaviour();
    }

    @Override
    protected void invokeAddWord(String word, ArrayList<String> vocab) {
        addBehaviour.addWord(word, vocab);
    }
}
