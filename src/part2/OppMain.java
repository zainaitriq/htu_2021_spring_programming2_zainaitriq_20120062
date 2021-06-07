package part2;

public class OppMain {
	public static void main(String[] args) {
			Animal sweety = new Animal();
			sweety.age=5;
			sweety.color="gray";
			sweety.size=10;
			sweety.display("sweety");
			Dog Dani = new Dog();
			Dani.age=6;
			Dani.color="balck";
			Dani.size=50;
			Dani.type="husky";
			Dani.display("Dani");
			Dani.sound();
			Cat gulia = new Cat();
			gulia.age=7;
			gulia.color="white";
			gulia.size=8;
			gulia.type="himalayan";
			gulia.display("gulia");
			gulia.sound();
	}

}
