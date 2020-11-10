package factorydesign;

public class PizzaDecorator implements Pizza{
	protected Pizza decoratedPizza;
	
	public PizzaDecorator(Pizza decoratedPizza) {
		super();
		this.decoratedPizza = decoratedPizza;
	}
	
	@Override
	public void prepare() {
		decoratedPizza.prepare();
	}
	
	@Override
	public void bake() {
		decoratedPizza.bake();
	}
	
	@Override
	public void slice() {
		decoratedPizza.slice();
	}
	
	@Override
	public void pack() {
		decoratedPizza.pack();
	}
}
