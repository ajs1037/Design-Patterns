package decorator.starbuzz;

import decorator.starbuzz.beveragedecorator.Mocha;
import decorator.starbuzz.beveragedecorator.Soy;
import decorator.starbuzz.beveragedecorator.Whip;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		// Similar to a linked list. Each concrete class that inherits from CondimentDecorator has a link
		//Beverage that can be attached to another concrete CondimentDecorator class. But only
		//one beverage with DarkRoast, Decaf, Ecpresso or HouseBlend can be linked
		//to a beverage.
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
}
