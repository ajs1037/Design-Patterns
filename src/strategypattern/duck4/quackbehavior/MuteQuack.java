package strategypattern.duck4.quackbehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("No sound");
	}

}
