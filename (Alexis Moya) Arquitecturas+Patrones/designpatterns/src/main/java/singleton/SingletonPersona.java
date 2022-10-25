package singleton;

public class SingletonPersona  {
	
	private static SingletonPersona instanciaUnica;
	private String name;
	private int age;
	
	//constructor por defecto
	private SingletonPersona(String name, int age) {
		this.age=age;
		this.name=name;
	}
	
	public static SingletonPersona instanciaUnica(String name, int age) {
		if (instanciaUnica == null) {
			instanciaUnica = new SingletonPersona(name, age);
		}
		return instanciaUnica;
	}
	
	public void singletonOperation() {
		System.out.println("Esta persona se llama {$name} y tiene {$age} años");
	}

}
