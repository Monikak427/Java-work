package basic;

public class Dog extends Animal {
	String breed;
	
	public Dog(int age, String breed) {
		super(age);
		this.breed = breed;
	}
	
	public Dog(String breed) {
		super(0);
		this.breed = breed;
	}

	public static void main(String[] args) {

		Dog d1 = new Dog(2, "Shih Tzu");
		Dog d2 = new Dog(3, "Husky");

		System.out.println("Dog 1 - Age: " + d1.age + ", Breed: " + d1.breed);
		System.out.println("Dog 2 - Age: " + d2.age + ", Breed: " + d2.breed);
	}

}
