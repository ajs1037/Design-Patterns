package strategypattern.duck4.flybehavior;

import strategypattern.duck4.flybehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	public void fly()
	{
		System.out.println("Fly no way");
	}
}
