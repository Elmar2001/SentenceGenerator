import java.util.ArrayList;

/**
 * SentenceGenerator is the concrete Observer class. It is abstract because there are 3 types of sentence generators
 * that share the same attributes and methods, and they inherit them from this class, and therefore they will also
 * be observers.
 */

public abstract class SentenceGenerator implements Observer {

    protected Subject generator;  // concrete observers have a concrete subject
    protected ArrayList<String> vocab; // each subclass will have its own vocabulary
    AddBehaviour addBehaviour;  // behaviour to add words to vocabulary
    GenBehaviour genBehaviour;  // behavior to generate sentences

    public SentenceGenerator(Subject generator) {
        vocab = new ArrayList<String>(); // instantiate vocabulary
        this.generator = generator;
        generator.registerGenerator(this); // attach this observer to subject
    }
    protected abstract void invokeAddWord(String word, ArrayList<String> vocab); // each generator will implement this method

    @Override
    public void update(String word){
        invokeAddWord(word, vocab); // invoke addWord method
        generate();  // each time a new word is added, generate a sentence
    }

//    Commenting since this method will not be needed for our use
//    public void setGenBehaviour(GenBehaviour genBehaviour){ // the behaviour can be changed
//        this.genBehaviour = genBehaviour;
//    }

    public void generate(){ // invoke generate() method of all behavior classes
        genBehaviour.generate(vocab);   // pass vocabulary as parameter
    }
}
