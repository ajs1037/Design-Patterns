package strategypattern.duck4;

import strategypattern.duck4.flybehavior.*;
import strategypattern.duck4.quackbehavior.*;

public abstract class Duck {
	
	//Two instance variables for the fly and quack behaviors
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	//duck can quack
	//This is replaced
	//public abstract void quack();
	public void performFly() {
		flyBehavior = new FlyNoWay();
	}
	
	//duck can swim
	public abstract void swim();
	
	//duck can fly
	//This is replaced
	//public abstract void fly();
	public void performQuack() {
		quackBehavior = new Quack();
	}

	//display status of duck
	public abstract void display ();

	
	//get the fly behavior
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	
	//set the fly behavior
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	//get the quack behavior
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	
	//set the fly behavior
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
