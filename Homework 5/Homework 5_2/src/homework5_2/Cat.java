package homework5_2;

public class Cat {

	private String name;
	private int age;
	
	public Cat() {}
	
	public Cat(String name, int age) {
		setName(name);
		setAge(age);
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
	
	public void say() {
		System.out.println("Name: " + getName() + "\nAge: " + getAge());
	}
}
