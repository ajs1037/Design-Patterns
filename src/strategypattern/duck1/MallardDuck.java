package strategypattern.duck1;

public class MallardDuck implements Duck{

 public void display()
 {
		 System.out.println(" Looks like a Mallard");
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
	 System.out.println(" Can Fly");
 }
}
