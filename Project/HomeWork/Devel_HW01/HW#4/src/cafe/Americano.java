package cafe;

//Singleton Pattern 사용해보기
public class Americano {
	
	private static Americano instance = new Americano();
	private static int price = 2500;
	private String string;
	
	public Americano() { }
	
	//Adapter 패턴을 만들기 위해 너를 추가했따.
	public Americano(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
	}

	public static Americano getlnstance() {
		if(instance == null)
			instance = new Americano();
		return instance;
	}
	
	public void info() {
		System.out.printf("       Americano : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
