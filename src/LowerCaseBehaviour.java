import java.util.ArrayList;
import java.util.Random;

/**
 * LowerBehaviour is printing random words from the dictionary.
 */

public class LowerCaseBehaviour implements AddBehaviour{
    @Override
    public void addWord(String word, ArrayList<String> vocab) {
        vocab.add(word.toLowerCase());
    }
}
