package service;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface Subject {
    void register(Observer ob);
    void unregister(Observer ob);
    void notifyAllObservers(String message);
}
