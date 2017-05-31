package Coffee;

public class Coffee {
	private String name;
	private int price;
	public Coffee(MenuItem menuItem){
		this.name = menuItem.name();
		this.price = menuItem.cost();
	}
}
