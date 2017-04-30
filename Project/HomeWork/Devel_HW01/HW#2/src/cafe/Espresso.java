package cafe;

public class Espresso {

	private static final int price = 2000;
	
	public void Espresso() { }
	
	public static void info() {
		System.out.printf("        Espresso : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
