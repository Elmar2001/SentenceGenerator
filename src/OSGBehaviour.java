import java.util.ArrayList;
import java.util.Random;

public class OSGBehaviour implements GenBehaviour{
    @Override
    public void generate(ArrayList<String> vocab) {
        System.out.println("OSGBehaviour!");


        System.out.println(String.join(" ", vocab));
    }
}
