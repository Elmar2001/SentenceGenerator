public class SortedSentenceGenerator extends SentenceGenerator {

/**
 * Before adding a word into its internal vocabulary, SSG also converts the word to lower
 * case. Like RSG, SSG picks up the words randomly. The only difference is that it sorts
 * these words before the concatenation.
 */

    public SortedSentenceGenerator(Subject generator) {
        super(generator);
        genBehaviour = new SSGBehaviour(); // SortedSentenceGenerator has SSGBehaviour that implements task above
    }

    @Override
    public void update(String word) {   // SortedSentenceGenerator adds lowercase version of word to vocabulary
        this.vocab.add(word.toLowerCase());
    }

}
