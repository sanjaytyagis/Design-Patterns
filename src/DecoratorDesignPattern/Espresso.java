package DecoratorDesignPattern;

public class Espresso extends BeverageBase{

	public Espresso() {
        description = "Small portion of strong coffee";
    }
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 12;
	}

}
