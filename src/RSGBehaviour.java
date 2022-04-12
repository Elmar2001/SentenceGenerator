import java.util.ArrayList;
import java.util.Random;

/**
 * RSGBehaviour is printing random words from the dictionary.
 */

public class RSGBehaviour implements GenBehaviour{

    @Override
    public void generate(ArrayList<String> vocab) {
        System.out.println("RSGBehaviour!");

        Random rand = new Random();

        int till = rand.nextInt(vocab.size()); // select this many words (random)
        ArrayList<String> ret = new ArrayList<String>();

        // select random words
        for (int i = 0; i < till; i++) {
            int index = rand.nextInt(vocab.size());
            ret.add(vocab.get(index));
        }

        System.out.println(String.join(" ", ret)); // combine selected words using empty spaces and print
    }
}
