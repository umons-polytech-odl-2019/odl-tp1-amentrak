package exercise1;
import java.util.*;
class Person {
	private String name;
	private int age;

	public Person (String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public void afficher(){
		System.out.print("Name: ");
		System.out.println(name);

		System.out.print("Age ");
		System.out.println(age);

	}
}
