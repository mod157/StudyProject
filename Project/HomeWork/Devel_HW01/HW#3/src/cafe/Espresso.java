package cafe;

//Singleton Pattern 사용해보기
public class Espresso {
	
	private static Espresso instance = new Espresso();
	private static int price = 2000;
	
	private Espresso() { }
	
	public static Espresso getlnstance() {
		if(instance == null)
			instance = new Espresso();
		return instance;
	}
	
	//public void Espresso() { }
	
	public static void info() {
		System.out.printf("        Espresso : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
