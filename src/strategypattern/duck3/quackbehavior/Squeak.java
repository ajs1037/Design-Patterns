package strategypattern.duck3.quackbehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeaks");

	}

}
