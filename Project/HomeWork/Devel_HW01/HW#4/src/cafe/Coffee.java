package cafe;

//Adapter 패턴을 적용해보쟈아아아아아아
public class Coffee extends Americano implements InterfaceAme {
	
	//요기까지는 말이죠 Adapter 패턴을 적용하기 위해 만들어 놓은 것이죠 근데 이렇게 해도되는것인가..//*
	public Coffee(String string) { super(); }                         //*
	public void printprice() {										  //*
		getprice();													  //*
	}																  //*
	//****************************************************************//*
	
	Americano am = Americano.getlnstance();
	Espresso es = Espresso.getlnstance();
	Cappuccino cp = Cappuccino.getlnstance();
	CaramelMacchiato cm = CaramelMacchiato.getlnstance();
	
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
