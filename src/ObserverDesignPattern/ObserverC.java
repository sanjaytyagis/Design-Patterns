package ObserverDesignPattern;

public class ObserverC implements Observer{

	@Override
	public void update(Message m) {
		// TODO Auto-generated method stub
		System.out.println("observerC: " + m.getMessage());
	}

}
