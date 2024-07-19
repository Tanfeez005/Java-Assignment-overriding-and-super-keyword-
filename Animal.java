
public class Animal {
	String name;
	String species;
	
	Animal(String name,String species){
		this.name=name;
		this.species=species;
	}
	public void makeSound() {
		System.out.println("Animals makes sound");
		
	}
	
	public static class Dog extends Animal{
		 private String breed;

		Dog(String name, String species, String breed) {
	            super(name, species);
	            this.breed = breed;
	        }
		//@override 
		public void makeSound() {
			System.out.println(name+" is a "+species+" of "+breed+" breed is making sound of Barking");
		}
	}
	

	public static void main(String[] args) {
		Dog Dog1=new Dog("Sheru","Domestic Animal","German");
		Dog1.makeSound();

	}

}
