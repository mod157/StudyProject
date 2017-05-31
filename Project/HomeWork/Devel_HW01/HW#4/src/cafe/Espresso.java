package cafe;

//Singleton Pattern ����غ���
//����� strategy pattern �� ����� ���Ҵ�.
public class Espresso extends StrategyCoffee{
	
	private static Espresso instance = new Espresso();
	private static int price = 2000;
	
	private Espresso() { 
		sugar = new Nosugar();
	}
	
	public static Espresso getlnstance() {
		if(instance == null)
			instance = new Espresso();
		return instance;
	}
	
	//public void Espresso() { }
	
	public void info() {
		System.out.printf("        Espresso : %5s KRW",price);
	}
	
	public int getprice() {
		return price;
	}
}
