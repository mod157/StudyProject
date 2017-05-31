package cafe;

public class Cappuccino {
	
	private static final int price = 3000;
	
	public void Cappuccino() { }
	
	public static void info() {
		System.out.printf("      Cappuccino : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
