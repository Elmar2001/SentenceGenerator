import java.util.ArrayList;

/**
 * SentenceGenerator is the concrete Observer class. It is abstract because there are 3 types of sentence generators
 * that share the same attributes and methods, and they inherit them from this class, and therefore they will also
 * be observers.
 */

public abstract class SentenceGenerator implements Observer {

    protected Subject generator;  // concrete observers have a concrete subject
    protected ArrayList<String> vocab; // each subclass will have its own vocabulary
    AddBehaviour addBehaviour;
    GenBehaviour genBehaviour;  // behavior to generate sentences

    public SentenceGenerator(Subject generator) {
        vocab = new ArrayList<String>(); // instantiate vocabulary
        this.generator = generator;
        generator.registerGenerator(this); // attach this observer to subject
    }
    protected abstract void invokeAddWord(String word, ArrayList<String> vocab);

    @Override
    public void update(String word){
        invokeAddWord(word, vocab);
        generate();  // each time a new word is added, generate a sentence
    }
    // update() class to be implemented by concrete sentence generators

//    Commenting since this method will not be needed for our use
//    public void setGenBehaviour(GenBehaviour genBehaviour){ // the behaviour can be changed
//        this.genBehaviour = genBehaviour;
//    }

    public void generate(){ // invoke generate() method of all behavior classes
        genBehaviour.generate(vocab);   // pass vocabulary as parameter
    }

//    public void display() { // the recently added word can be displayed by the  observers
//        System.out.println("New word: " + vocab.get(vocab.size()-1));
//    }
}
