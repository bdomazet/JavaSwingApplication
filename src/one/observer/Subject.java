package one.observer;

public interface Subject {

    public void registerObserver(Observer observer);

    public void removerObserver(Observer observer);

    public void notifyObservers();

}
