package cafe;

//Singleton Pattern 사용해보기
public class CaramelMacchiato {
	
	private static CaramelMacchiato instance = new CaramelMacchiato();
	private static int price = 3500;
	
	private CaramelMacchiato() { }
	
	public static CaramelMacchiato getlnstance() {
		if(instance == null)
			instance = new CaramelMacchiato();
		return instance;
	}
	
	//public void CaramelMacchiato() { }
	
	public static void info() {
		System.out.printf("CaramelMacchiato : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
