package ObserverDesignPattern;

public class ObserverA implements Observer{

	@Override
	public void update(Message m) {
		// TODO Auto-generated method stub
		 System.out.println("observerA: " + m.getMessage());
	}

}
