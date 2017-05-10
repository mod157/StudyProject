package cafe;

//Singleton Pattern 사용해보기
public class Cappuccino {
	
	private static Cappuccino instance = new Cappuccino();
	private static int price = 3000;
	
	private Cappuccino() { }
	
	public static Cappuccino getlnstance() {
		if(instance == null)
			instance = new Cappuccino();
		return instance;
	}
	
	//public void Cappuccino() { }
	
	public static void info() {
		System.out.printf("      Cappuccino : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
