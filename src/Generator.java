import java.util.ArrayList;

public class Generator implements Subject {
    private ArrayList<Observer> observers;
    private String word;

    public Generator() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerGenerator(Observer sgenerator) {
        observers.add(sgenerator);
    }

    @Override
    public void notifyGenerators() {
        for (Observer sg : observers) {
            sg.update(word);
        }
    }

    public void wordChanged(String word) {
        this.word = word;
        notifyGenerators();
    }

}
