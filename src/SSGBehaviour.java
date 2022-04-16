import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * SSGBehaviour is printing random, sorted words from the dictionary.
 */

public class SSGBehaviour implements GenBehaviour{

    @Override
    public void generate(ArrayList<String> vocab) {
        System.out.print("SSGBehaviour: ");
        Random rand = new Random();

        int till = rand.nextInt(vocab.size()+1); // select this many words (random)
        if(till == 0) till=1; // replace 0 word with just 1 word

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
