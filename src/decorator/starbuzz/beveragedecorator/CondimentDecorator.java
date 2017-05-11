package decorator.starbuzz.beveragedecorator;

import decorator.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
	
	//Beverage already has a getDescription method. This one forces
	//any class inheriting CondimentDecorator to implement a getDescription method
	public abstract String getDescription();
}
