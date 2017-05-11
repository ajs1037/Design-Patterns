package observerpattern.weather4;

public interface DisplayElement {
	
	//Includes just one method display(), that will be called when
	//the display element needs to be displayed.
	//All display elements will inherit this class.
	public void display();

}
