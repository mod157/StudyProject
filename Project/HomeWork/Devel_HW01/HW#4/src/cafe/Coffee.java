package cafe;

//Adapter ������ �����غ���ƾƾƾƾƾ�
public class Coffee extends Americano implements InterfaceAme {
	
	//�������� ������ Adapter ������ �����ϱ� ���� ����� ���� ������ �ٵ� �̷��� �ص��Ǵ°��ΰ�..//*
	public Coffee(String string) { super(); }                         //*
	public void printprice() {										  //*
		getprice();													  //*
	}																  //*
	//****************************************************************//*
	
	Americano am = Americano.getlnstance();
	Espresso es = Espresso.getlnstance();
	Cappuccino cp = Cappuccino.getlnstance();
	CaramelMacchiato cm = CaramelMacchiato.getlnstance();
	
	//Ŀ�� ������ ���� ���� Ȯ���ϱ�
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
	
	//�޴��� �����ִ� ���������̤���
	public void showmenu() {
		
		System.out.print("\n********************************\n");
		System.out.print("* "); am.info(); System.out.println(" *");
		System.out.print("* "); es.info(); System.out.println(" *");
		System.out.print("* "); cp.info(); System.out.println(" *");
		System.out.print("* "); cm.info(); System.out.println(" *");
		System.out.print("********************************\n");
	}
}
