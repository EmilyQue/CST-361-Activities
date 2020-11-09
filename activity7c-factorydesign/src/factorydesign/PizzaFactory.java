package factorydesign;

//factory class that generates object
public class PizzaFactory {
	//get object of pizza type
	public Pizza getPizza(String type) {
		if(type == null) {
			return null;
		}
		if(type.equalsIgnoreCase("Cheese Pizza")) {
			return new CheesePizza();
		}
		else if(type.equalsIgnoreCase("Hawaiian Pizza")) {
			return new HawaiianPizza();
		}
		else if(type.equalsIgnoreCase("Pepperoni Pizza")) {
			return new PepperoniPizza();
		}
		
		return null;
	}
	
	
}
