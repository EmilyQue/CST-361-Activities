package factorydesign;

//concrete class implementing pizza interface
public class HawaiianPizza implements Pizza{
	@Override
	public void prepare() {
		System.out.println("Preparing hawaiian pizza");
	}
	
	@Override
	public void bake() {
		System.out.println("Baking the hawaiian pizza in the oven");
	}
	
	@Override
	public void slice() {
		System.out.println("The hawaiian pizza is being sliced");
	}
	
	@Override 
	public void pack() {
		System.out.println("The hawaiian pizza is being packed into box");
	}
}
