package DecoratorDesignPattern;

public class SugarCondiment extends CondimentsDecoratorBase{

	private BeverageBase beverage;
	
	public SugarCondiment(BeverageBase beverage) {
        this.beverage = beverage;
        description = beverage.getDescription() + " + Sugar";
    }
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + 1;
	}

}
