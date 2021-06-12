package part2;

public class Cat extends Animal {
	protected String type;
	protected void display(String name) //overriding 
	{
		System.out.println("i am a cat my name is " +name + " my age is "+ age+" months" +" my color "+color+" my size is "+size+"kg" + " my type is "+type);

	}
	protected void sound() {
		System.out.println("meow");
	}

}
