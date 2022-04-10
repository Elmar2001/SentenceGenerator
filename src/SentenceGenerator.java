import java.util.ArrayList;

public abstract class SentenceGenerator implements Observer {
    protected Subject generator;
    protected ArrayList<String> vocab;

    GenBehaviour genBehaviour;

    public SentenceGenerator(Subject generator) {
        vocab = new ArrayList<String>();
        this.generator = generator;
        generator.registerGenerator(this);
    }

    @Override
    public abstract void update(String word);
//    {
//        this.vocab.add(word);
//        display();
//    }

    public void setGenBehaviour(GenBehaviour genBehaviour){
        this.genBehaviour = genBehaviour;
    }

    public void generate(){
        genBehaviour.generate();
    }

    public void display() {
        System.out.println("New word: " + vocab.get(vocab.size()-1));
    }
}
