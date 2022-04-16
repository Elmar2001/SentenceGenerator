import java.util.ArrayList;

/**
 * Generator class is the concrete implementation of Subject interface. Its main purpose is to keep a list of observers
 * and inform them about newly added words.
 */

public class Generator implements Subject {
    private ArrayList<Observer> observers;  // list of observers
    private String word;  // latest added word

    public Generator() {
        observers = new ArrayList<Observer>();  // instantiate list of observers
    }

    @Override
    public void registerGenerator(Observer observer) { // to manually add a new observer
        observers.add(observer);
    }

    @Override
    public void notifyGenerators() {
        for (Observer o : observers) {
            o.update(word); // send the word to each observer
        }
    }

    public void wordAdded(String word) {  // new word to add/added  by the user
        this.word = word;
        System.out.println("New word added to vocabulary: " + word);
        notifyGenerators(); // notify all observers to add the word to their vocabulary
    }

}
