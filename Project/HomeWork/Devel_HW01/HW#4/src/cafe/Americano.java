package cafe;

//Singleton Pattern ����غ���
public class Americano {
	
	private static Americano instance = new Americano();
	private static int price = 2500;
	private String string;
	
	public Americano() { }
	
	//Adapter ������ ����� ���� �ʸ� �߰��ߵ�.
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
