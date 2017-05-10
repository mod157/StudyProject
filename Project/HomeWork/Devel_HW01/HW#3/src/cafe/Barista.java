package cafe;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Barista {
	
	Scanner scan = new Scanner(System.in);
	
	//클래스들 쓸라면 뭐 다 성언애 줘야지뭐....
	Coffee co = new Coffee();
	Americano am = Americano.getlnstance();
	Espresso es = Espresso.getlnstance();
	Cappuccino cp = Cappuccino.getlnstance();
	CaramelMacchiato cm = CaramelMacchiato.getlnstance();
	
	public int editprice = 0;
	public int order = 1;
	String[] coffees;
	String[] drinks;
	String[] sizes;
	String[] tempers;
	int[] prices;
	
	public Barista() { }
	
	//주문을 시작합니다~~
	public void detailorder() {
		
		editprice = 0;
		
		System.out.println("\nHello~!!! I'm Barista~!!!!");
		System.out.println("How many will you order?");
		
		order = scan.nextInt();
		
		coffees = new String[order];
		drinks = new String[order];
		sizes = new String[order];
		tempers = new String[order];
		prices = new int[order]; 
		
		if(order == 1)
			singleorder(); //단품주문으로 고고
		else
			pluralorder(); //많이 주문하는 곳으로 고고
	}
	
	//단품 주문할 떄
	public void singleorder() {
		
		//커피의 종류를 먼저 물어보고
		System.out.println("what do you want to drink?");
		drinks[0] = scan.next();
		
		//커피 종류에 맞는 가격을 가져오고
		prices[0] = co.coffeekind(drinks[0]);
		
		//주문한 커피의 사이즈를 물어보고
		System.out.println("choose the size of the drink( S(-500) / M / L(+500) )");
		sizes[0] = scan.next();
		
		//사이즈가 작은거면 -500원 해주는 거야
		if(sizes[0].equals("S") || sizes[0].equals("s")) {
			prices[0] += -500;
		}
		//사이즈가 큰 거면 이자식 많이 먹는데 +500 추가!!!!!!!
		else if(sizes[0].equals("L") || sizes[0].equals("l")) {
			prices[0] += +500;
		}
		//변동된 가격을 명시해 주고
		editprice += prices[0];
		
		//주문한 음료 따뜻하게 먹을거냐 차갑게 먹을거냐 물어봄
		System.out.println("choose the temperature of the drink(HOT, COLD)");
		tempers[0] = scan.next();
		
		//주문 끝 이제 주러가
		endorder(editprice);
	}
		
	//여러개 주문 할 떄
	public void pluralorder() {
		
		System.out.println("input what you want to drink");
		System.out.println("ex. (drink name),(S(-500),M,L(+500)),(Hot,Cold)");
		System.out.println("    Americano,L,cold");

		for(int i=0;i<order;i++) {
			
			coffees[i] = scan.next();
			
			StringTokenizer token = new StringTokenizer(coffees[i]);
			
			drinks[i] = token.nextToken(",");
			sizes[i] = token.nextToken(",");
			tempers[i] = token.nextToken(",");			
			
			prices[i] = co.coffeekind(drinks[i]);
			
			if(sizes[i].equals("S") || sizes[i].equals("s")) {
				prices[i] += -500;
			}
			else if(sizes[i].equals("L") || sizes[i].equals("l")) {
				prices[i] += +500;
			}
			
			editprice += prices[i];
		}
		endorder(editprice);
	}
	
	//커피 내어주기 울랄ㄹ라라ㅏㅏㅏ~~
	public void endorder(int num) {
		
		for(int i=0; i<order; i++) {
			System.out.printf("Here is your %5s %3s %17s...%6s\n",tempers[i],sizes[i],drinks[i],prices[i]);
		}
		
		System.out.println("총 금액은 ..........."+editprice+" 원 입니다.");
		
		//Customer(editprice);
	}
}
