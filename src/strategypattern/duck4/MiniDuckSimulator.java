package strategypattern.duck4;

//import strategypattern.duck4.flybehavior.*;

public class MiniDuckSimulator {
	
	public static void main(String[] args)
	{
		//Properties of a MallardDuck
		Duck duck = new MallardDuck();
		duck.display();
		duck.swim();
		duck.getFlyBehavior().fly();
		duck.getQuackBehavior().quack();
		System.out.println();
		System.out.println();
			
		//Properties of a MallardDuck
		duck = new RubberDuck();
		duck.display();
		duck.swim();
		duck.getFlyBehavior().fly();
		duck.getQuackBehavior().quack();
		
		System.out.println();
		System.out.println();
		
		//properties of a ModelDuck
		duck = new ModelDuck();
		duck.display();
		duck.performFly();
		//print the fly behavior
		duck.getFlyBehavior().fly();
		//Need to import the package
		//duck.setFlyBehavior(new FlyRocketPowered());
		duck.setFlyBehavior(new strategypattern.duck4.flybehavior.FlyRocketPowered());
		//duck.performFly();
		//print the fly behavior
		duck.getFlyBehavior().fly();
	}

}
