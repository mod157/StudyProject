package cafe;

public class Americano {
	
	private static final int price = 2500;
	
	public void Americano() { }
	
	public static void info() {
		System.out.printf("       Americano : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
