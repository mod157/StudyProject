package Coffee;

public class Customer {
	public void getcoffee(Coffee coffee){
		
	}
	public void order(String menuname, Menu menu, Barista barista){
		MenuItem menuItem = menu.choose(menuname);
		Coffee coffee = barista.makecoffee(menuItem);
		this.getcoffee(coffee);
	}
}
