package strategypattern.duck4;


import strategypattern.duck4.flybehavior.*;
import strategypattern.duck4.quackbehavior.*;

public class ModelDuck extends Duck {

		public ModelDuck() {	
			this.setQuackBehavior(new Quack());
			this.setFlyBehavior(new FlyNoWay());
		}
		
		public void swim() {
			System.out.println("Can swim");
		}
		
		public void display() {
			System.out.println("I'm a model Duck");
		}
	
}
