package singleton;

public class SingletonPersona  {
	
	private static SingletonPersona instanciaUnica;
	private String name;
	private int age;
	
	//constructores
	
	private SingletonPersona() {}
	private SingletonPersona(String name, int age) {
		this.age=age;
		this.name=name;
	}
	
	public static SingletonPersona getInstance (String name, int age) {
		if (instanciaUnica == null) {
			instanciaUnica = new SingletonPersona(name ,  age);
		}
		return instanciaUnica;
	}
	
	public void singletonOperation() {
		System.out.println("Esta persona se llama "+name+" y tiene "+age+" años");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
