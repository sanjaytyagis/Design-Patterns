package ObserverDesignPattern;

public class ObserverB implements Observer{

	@Override
	public void update(Message m) {
		// TODO Auto-generated method stub
		System.out.println("observerB: " + m.getMessage());
	}

}
