import java.util.ArrayList;

public abstract class SentenceGenerator implements Observer {
    protected Subject generator;  // concrete observers have a concrete subject
    protected ArrayList<String> vocab; // made static

    GenBehaviour genBehaviour;  // behavior to generate sentences

    public SentenceGenerator(Subject generator) {
        vocab = new ArrayList<String>();
        this.generator = generator;
        generator.registerGenerator(this);
    }

    @Override
    public abstract void update(String word);

    public void setGenBehaviour(GenBehaviour genBehaviour){
        this.genBehaviour = genBehaviour;
    }

    public void generate(){ // invoke generate() method of all behavior classes
        genBehaviour.generate(vocab);   // pass vocabulary
    }

    public void display() {
        System.out.println("New word: " + vocab.get(vocab.size()-1));
    }
}
