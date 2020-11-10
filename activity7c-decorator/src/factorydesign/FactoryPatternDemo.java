package factorydesign;

//get concrete class object by passing type of pizza using the factory class 
public class FactoryPatternDemo {
	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		
		Pizza cheese = factory.getPizza("Cheese Pizza");
		cheese.prepare();
		cheese.bake();
		cheese.slice();
		cheese.pack();
		System.out.println("\n");
		
		Pizza pepperoni = factory.getPizza("Pepperoni Pizza");
		pepperoni.prepare();
		pepperoni.bake();
		pepperoni.slice();
		pepperoni.pack();
		System.out.println("\n");
		
		Pizza hawaiian = factory.getPizza("Hawaiian Pizza");
		hawaiian.prepare();
		hawaiian.bake();
		hawaiian.slice();
		hawaiian.pack();
	}
}
