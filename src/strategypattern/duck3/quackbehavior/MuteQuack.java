package strategypattern.duck3.quackbehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("No sound");
	}

}
