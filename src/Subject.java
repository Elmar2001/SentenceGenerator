public interface Subject {
    void registerGenerator(SGenerator b);
    void notifyGenerators();
}