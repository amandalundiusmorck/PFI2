package kd_322b_LundiusM�rck_A_uppgift4;

public class Human {
	private Dog dog;
	private String name;
	public Human (String name) {
		this.name=name;
		
	}
	public String getName (){
		return this.name; 
	}
	public void buyDog(Dog dog){
		this.dog = dog; 
	}
	/** Returnerar "x �ger en hund som heter y" eller "x �ger inte en hund" */
	public String getInfo(){
		if (dog != null){
			return this.getName() + " owns a dog called " + this.dog.getName().toString() + ".";
		} else {
			return this.getName() + " doesn't own a dog!";
		}
	}
}
