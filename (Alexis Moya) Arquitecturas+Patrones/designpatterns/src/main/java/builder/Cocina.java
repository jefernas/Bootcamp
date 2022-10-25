package builder;

public class Cocina {

	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}
	
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void crearPizza() {
		pizzaBuilder.CrearNuevaPizza();
		pizzaBuilder.buildMasa();
		pizzaBuilder.buildSalsa();
		pizzaBuilder.buildRelleno();
	}
}
