import java.util.ArrayList;

/**
 * OSGBehaviour is printing words that are already uppercase+reversed in added order.
 */

public class OSGBehaviour implements GenBehaviour{

    @Override
    public void generate(ArrayList<String> vocab) {
        System.out.println("OSGBehaviour!");
        System.out.println(String.join(" ", vocab)); // print space seperated all words in vocabulary
    }

}
