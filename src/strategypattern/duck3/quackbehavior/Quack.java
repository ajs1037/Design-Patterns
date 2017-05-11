package strategypattern.duck3.quackbehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
			System.out.println("Quacks");
	}

}
