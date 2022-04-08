import java.util.ArrayList;

public class Generator implements Subject {
    private ArrayList<SGenerator> sgenerators;
    private String word;

    public Generator() {
        sgenerators = new ArrayList<SGenerator>();
    }

    @Override
    public void registerGenerator(SGenerator sgenerator) {
        sgenerators.add(sgenerator);
    }

    @Override
    public void notifyGenerators() {
        for (SGenerator sg : sgenerators) {
            sg.update(word);
        }
    }

    public void wordChanged(String word) {
        this.word = word;
        notifyGenerators();
    }

}
