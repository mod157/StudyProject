package cafe;

public class Coffee {
	
	Americano am = new Americano();
	Espresso es = new Espresso();
	Cappuccino cp = new Cappuccino();
	CaramelMacchiato cm = new CaramelMacchiato();
	
	//메뉴판 보여주는 거이이이이ㅣ임
	public void showmenu() {
		
		System.out.print("\n********************************\n");
		System.out.print("* "); am.info(); System.out.println(" *");
		System.out.print("* "); es.info(); System.out.println(" *");
		System.out.print("* "); cp.info(); System.out.println(" *");
		System.out.print("* "); cm.info(); System.out.println(" *");
		System.out.print("********************************\n");
	}
}
