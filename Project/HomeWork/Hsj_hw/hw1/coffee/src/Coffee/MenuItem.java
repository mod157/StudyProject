package Coffee;

public class MenuItem {
	private String menuname;
	private int price;
	public MenuItem(String menuname_,int price_){
		this.menuname = menuname_;
		this.price = price_;
	}
	public int cost(){
		return this.price;
	}
	public String name(){
		return this.menuname;
	}
}
