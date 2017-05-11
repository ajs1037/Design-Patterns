package strategypattern.duck4.quackbehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
			System.out.println("Quacks");
	}

}
