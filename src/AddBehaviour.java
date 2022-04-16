import java.util.ArrayList;

/**
 * GenBehaviour is the interface that provides generate() method to be implemented by concrete behaviour classes:
 * RSGBehaviour, SSGBehaviour, OSGBehaviour. Because, sentence generators have different behaviours, such as making
 * the word uppercase or lowercase before adding it to the vocabulary.
 */

public interface AddBehaviour {
    void addWord(String word, ArrayList<String> vocab);
}
