package factorydesign;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Pizza cheeseTopping = new ToppingDecorator(new CheesePizza());
		
		Pizza cheese = new CheesePizza();
		cheese.prepare();
		cheeseTopping.prepare();
		cheese.bake();
		cheese.slice();
		cheese.pack();
		System.out.println("\n");
		
		Pizza pepperoniTopping = new ToppingDecorator(new PepperoniPizza());
		Pizza pepperoni = new PepperoniPizza();
		pepperoni.prepare();
		pepperoniTopping.prepare();
		pepperoni.bake();
		pepperoni.slice();
		pepperoni.pack();
		System.out.println("\n");
		
		Pizza hawaiianTopping = new ToppingDecorator(new HawaiianPizza());
		Pizza hawaiian = new HawaiianPizza();
		hawaiian.prepare();
		hawaiianTopping.prepare();
		hawaiian.bake();
		hawaiian.slice();
		hawaiian.pack();
	}
}
