package DecoratorDesignPattern;

public abstract class BeverageBase {
	
	protected String description = "";
	
	public String getDescription() {
        return description;
    }
	
	public abstract double getCost();
}
