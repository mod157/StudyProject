package cafe;

public class Coffee {
	
	Americano am = new Americano();
	Espresso es = new Espresso();
	Cappuccino cp = new Cappuccino();
	CaramelMacchiato cm = new CaramelMacchiato();
	
	//커피 종류에 따른 가격 확인하기
	public int coffeekind(String drinks) {
			
		int price = 0;
			
		if(drinks.equals("Americano")) {
			price = am.getprice();
		}
		else if(drinks.equals("Espresso")) {
			price = es.getprice();
		}
		else if(drinks.equals("Cappuccino")) {
			price = cp.getprice();
		}
		else if(drinks.equals("CaramelMacchiato")) {
			price = cm.getprice();
		}
		return price;
	}
	
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
