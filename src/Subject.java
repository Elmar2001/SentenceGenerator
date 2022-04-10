public interface Subject {
    void registerGenerator(Observer b);
    void notifyGenerators();
}