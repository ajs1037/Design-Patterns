package strategypattern.duck3;

public class MiniDuckSimulator {
	
	public static void main(String[] args)
	{
		//Properties of a MallardDuck
		Duck duck = new MallardDuck();
		duck.display();
		duck.swim();
		duck.flyBehavior.fly();
		duck.quackBehavior.quack();
		
		System.out.println();
		System.out.println();
		
		
		//Properties of a MallardDuck
		duck = new RubberDuck();
		duck.display();
		duck.swim();
		duck.flyBehavior.fly();
		duck.quackBehavior.quack();
		
	}

}
