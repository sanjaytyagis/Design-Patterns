package DecoratorDesignPattern;

public class BlackTea extends BeverageBase{

	public BlackTea() {
        description = "Black tea from teabag";
    }
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 5;
	}

}
