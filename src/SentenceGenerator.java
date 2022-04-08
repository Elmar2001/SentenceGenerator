import java.util.ArrayList;

public class SentenceGenerator implements SGenerator {
    private Subject generator;
    private ArrayList<String> vocab;

    public SentenceGenerator(Subject generator) {
        vocab = new ArrayList<String>();
        this.generator = generator;
        generator.registerGenerator(this);
    }

    @Override
    public void update(String word) {
        this.vocab.add(word);
        display();
    }

    public void display() {
        System.out.println("New word: " + vocab.get(vocab.size()-1));
    }
}
