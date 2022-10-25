package builder;

public class CarbonaraPizza extends PizzaBuilder {

	@Override
	public void buildMasa() {
		pizza.setMasa("fina");
		
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("carbonara");
		
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno("champiñones+beicon");
		
	}

}
