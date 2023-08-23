package ObserverDesignPattern;
import java.util.*;

public class ConcreteSubject implements Subject{

	private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notify(Message message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }
}
