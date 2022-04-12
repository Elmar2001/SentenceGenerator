import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * SSGBehaviour is printing random, sorted words from the dictionary.
 */

public class SSGBehaviour implements GenBehaviour{

    @Override
    public void generate(ArrayList<String> vocab) {
        System.out.println("SSGBehaviour!");
        Random rand = new Random();

        int till = rand.nextInt(vocab.size()); // select this many words (random)
        ArrayList<String> ret = new ArrayList<String>();

        // get random words
        for (int i = 0; i < till; i++) {
            int index = rand.nextInt(vocab.size());
            ret.add(vocab.get(index));
        }

        Collections.sort(ret);  // sort selected words

        System.out.println(String.join(" ", ret));  // print space seperated words.
    }
}
