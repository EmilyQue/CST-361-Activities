package factorydesign;

//concrete class implementing pizza interface
public class PepperoniPizza implements Pizza{
	@Override
	public void prepare() {
		System.out.println("Preparing pepperoni pizza");
	}
	
	@Override
	public void bake() {
		System.out.println("Baking the pepperoni pizza in the oven");
	}
	
	@Override
	public void slice() {
		System.out.println("The pepperoni pizza is being sliced");
	}
	
	@Override 
	public void pack() {
		System.out.println("The pepperoni pizza is being packed into box");
	}
}
