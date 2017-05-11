package strategypattern.duck3;

import strategypattern.duck3.flybehavior.*;
import strategypattern.duck3.quackbehavior.*;

public class MallardDuck extends Duck{
	
	MallardDuck()
	{
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display()
	{
		System.out.println("Looks like a Mallard");
	}

	public void swim()
	{
		System.out.println("Can swim");
	}

	public void performFly()
	{
		flyBehavior = new FlyNoWay();
	}

}
