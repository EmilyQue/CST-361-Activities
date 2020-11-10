package factorydesign;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Pizza topping = new ToppingDecorator(new CheesePizza());
		
		Pizza cheese = new CheesePizza();
		cheese.prepare();
		topping.prepare();
		cheese.bake();
		cheese.slice();
		cheese.pack();
		System.out.println("\n");
		
		Pizza pepperoni = new PepperoniPizza();
		pepperoni.prepare();
		topping.prepare();
		pepperoni.bake();
		pepperoni.slice();
		pepperoni.pack();
		System.out.println("\n");
		
		Pizza hawaiian = new HawaiianPizza();
		hawaiian.prepare();
		topping.prepare();
		hawaiian.bake();
		hawaiian.slice();
		hawaiian.pack();
	}
}
