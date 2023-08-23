package DecoratorDesignPattern;

public class GetBeverages {

	static void printBeverage(BeverageBase beverage) {
        System.out.println("Beverage: " + beverage.getDescription()
                + ", Cost: " + beverage.getCost());
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeverageBase espresso = new Espresso();
        BeverageBase blackTea = new BlackTea();

        //printBeverage(espresso);
        printBeverage(blackTea);

        System.out.println("========================");

        BeverageBase capuccino = new SugarCondiment(new MilkCondiment(new BlackTea()));
        printBeverage(capuccino);

        BeverageBase greenTeaWithSugar = new SugarCondiment(new BlackTea());
        printBeverage(greenTeaWithSugar);
        
	}

}
