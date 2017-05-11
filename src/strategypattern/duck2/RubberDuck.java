package strategypattern.duck2;

public class RubberDuck extends Duck{

	public void display()
	{
		System.out.println(" Looks like a Rubber duckie");
	}

	public void swim()
	{
		System.out.println(" Can swim");
	}

	public void quack()
	{
		System.out.println(" Can quack");
	}

	public void fly()
	{
		//Incorrect as rubber duckie cannot fly
		//Method has to be defined
		//Can con by not printing anything out
		//System.out.println(" Can Fly");
	}

}
