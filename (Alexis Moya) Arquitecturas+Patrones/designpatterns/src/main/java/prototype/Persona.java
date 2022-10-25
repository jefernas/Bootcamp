package prototype;

import org.springframework.context.annotation.Scope;


public class Persona  {

	private String name;
	private int age;
	
	public Persona(){}
	
	public Persona(String name, int age){
		this.name=name;
		this.age=age;
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
	@Override
	public String toString() {
		return "Persona [name=" + name + ", age=" + age + "]";
	}
	
	
	public Persona clone() {
		Persona persona = new Persona();
		persona.setName(this.getName());
		persona.setAge(this.getAge());
		return persona;
	}
	
	
}
