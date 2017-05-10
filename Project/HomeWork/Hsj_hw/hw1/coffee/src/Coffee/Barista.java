package Coffee;

public class Barista {
	public Coffee makecoffee(MenuItem menuItem){
		Coffee coffee = new Coffee(menuItem);
		return coffee;
	}
}
