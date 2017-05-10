package cafe;

//Singleton Pattern 사용해보기
public class Americano {
	
	private static Americano instance = new Americano();
	private static int price = 2500;
	
	private Americano() { }
	
	public static Americano getlnstance() {
		if(instance == null)
			instance = new Americano();
		return instance;
	}
	
	//public void Americano() { }
	
	public void info() {
		System.out.printf("       Americano : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
