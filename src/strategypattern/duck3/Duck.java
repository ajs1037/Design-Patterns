package strategypattern.duck3;

import strategypattern.duck3.flybehavior.*;
import strategypattern.duck3.quackbehavior.*;

public abstract class Duck {
	
	//Two instance variables for the fly and quack behaviors
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	//duck can quack
	//This is replaced
	//public abstract void quack();
	public void performFly()
	{
		flyBehavior = new FlyNoWay();
	}
	
	//duck can swim
	public abstract void swim();
	
	//duck can fly
	//This is replaced
	//public abstract void fly();
	public void performQuack()
	{
		quackBehavior = new Quack();
	}
	
	//display status of duck
	public abstract void display ();
	
}
