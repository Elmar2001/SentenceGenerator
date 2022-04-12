public interface Subject {  // Subject interface to be implemented by concrete Subject class (Generator)
    void registerGenerator(Observer o); // to add a new observer
    void notifyGenerators(); // to notify all observers
}