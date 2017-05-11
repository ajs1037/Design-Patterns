package strategypattern.duck3.flybehavior;

import strategypattern.duck3.flybehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	public void fly()
	{
		System.out.println("Fly no way");
	}
}
