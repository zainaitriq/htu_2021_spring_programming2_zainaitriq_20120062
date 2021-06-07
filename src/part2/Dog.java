package part2;

public class Dog extends Animal {
	protected String type;
	protected void display(String name)//overriding
	{
		System.out.println("i am a dog my name is " +name + " my age is "+ age+" months" +" my color "+color+" my size is "+size+ "kg"+" my type is "+type);
	}
	protected void sound() {
		System.out.println("wooof");
	}

}
