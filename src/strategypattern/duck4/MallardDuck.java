package strategypattern.duck4;

import strategypattern.duck4.flybehavior.*;
import strategypattern.duck4.quackbehavior.*;

public class MallardDuck extends Duck{
	
	MallardDuck()
	{
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
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
		this.setFlyBehavior(new FlyNoWay()); 
	}

}
