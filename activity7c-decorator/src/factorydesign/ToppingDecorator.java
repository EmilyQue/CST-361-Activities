package factorydesign;

public class ToppingDecorator extends PizzaDecorator{
	public ToppingDecorator(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	@Override
	public void prepare() {
		addTopping(decoratedPizza);
	}
	
	private void addTopping(Pizza decoratedPizza) {
		System.out.println("Adding olives to pizza");
	}
}
