import java.util.ArrayList;
import java.util.Random;

/**
 * LowerCaseBehaviour adds the lowercase of the word to the vocabulary
 */

public class LowerCaseBehaviour implements AddBehaviour{
    @Override
    public void addWord(String word, ArrayList<String> vocab) {
        vocab.add(word.toLowerCase());
    }
}
