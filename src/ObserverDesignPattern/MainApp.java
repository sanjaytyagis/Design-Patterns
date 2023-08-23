package ObserverDesignPattern;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();
        ObserverC c = new ObserverC();
    
        ConcreteSubject publisher = new ConcreteSubject();
        publisher.attach(a);
        publisher.attach(b);
    
        publisher.notify(new Message("First update\n"));
    
        publisher.attach(c);
        publisher.detach(b);
        publisher.notify(new Message("Second update\n"));
	}

}
