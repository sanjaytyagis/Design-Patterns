package DecoratorDesignPattern;

public class MilkCondiment extends CondimentsDecoratorBase{

	private BeverageBase beverage;
	
	public MilkCondiment(BeverageBase beverage) {
        this.beverage = beverage;
        description = this.beverage.getDescription() + " + Milk";
    }
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + 3;
	}

}
