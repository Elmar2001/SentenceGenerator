import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SSGBehaviour implements GenBehaviour{
    @Override
    public void generate(ArrayList<String> vocab) {
        System.out.println("SSGBehaviour!");
        Random rand = new Random();

        int till = rand.nextInt(vocab.size());
        ArrayList<String> ret = new ArrayList<String>();

        for (int i = 0; i < till; i++) {
            int index = rand.nextInt(vocab.size());
            ret.add(vocab.get(index));
        }

        Collections.sort(ret);

        System.out.println(String.join(" ", ret));
    }
}
