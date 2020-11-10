package factorydesign;

//concrete class implementing pizza interface
public class CheesePizza implements Pizza{
	@Override
	public void prepare() {
		System.out.println("Preparing cheese pizza");
	}
	
	@Override
	public void bake() {
		System.out.println("Baking the cheese pizza in the oven");
	}
	
	@Override
	public void slice() {
		System.out.println("The cheese pizza is being sliced");
	}
	
	@Override 
	public void pack() {
		System.out.println("The cheese pizza is being packed into box");
	}
}
