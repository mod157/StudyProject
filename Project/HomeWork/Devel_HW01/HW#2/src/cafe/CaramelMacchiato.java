package cafe;

public class CaramelMacchiato {
	
	private static final int price = 3500;
	
	public void CaramelMacchiato() { }
	
	public static void info() {
		System.out.printf("CaramelMacchiato : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
