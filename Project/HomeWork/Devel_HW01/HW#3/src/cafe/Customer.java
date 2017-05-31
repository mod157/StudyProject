package cafe;

import java.util.Scanner;

public class Customer {

	Scanner scan = new Scanner(System.in);
	
	Barista ba = new Barista();
	Coffee co = new Coffee();
	
	private int doact = 0;
	private static int money = 0;
	private int recharge = 0;
	
	//customer 생성하면 돈은 만원있는 상태
	public Customer() {
		
		money = 10000;
	}
	
	//고객이 주문을 하든 그냥 나가든 먼저 일단 뭔가 액션을 취하겠지~!?!!
	public void doaction() {
				
		while(true) {
			
			if(money<0) {
				System.out.println("필요한 금액 : "+ (-money));
				System.out.println("돈이 모자르다 고객아 돈 뽑아와~!");
				
				//돈 뽑는 클래스 따로 만들면 좋겟지만 귀찮아서 여기까지 끝
				System.out.println("충전한다(1), 안한다(2) 선택해 기회를 준다 내가");
				recharge = scan.nextInt();
				if(recharge == 1) {
					//충전하러 고고
					System.out.println("얼마할껀대? ");
					recharge = scan.nextInt();
					money += recharge;
				}
				else {
					System.out.println("충전도 안하고 돈도 없으면서 뭘 살라구해 나가그냥 끝 안팔아");
					break;
				}
			}
			
			System.out.println("고객이 가진 돈은 "+ money + " 원 입니다.");
			
			System.out.println("\n1choose what you will do~!");
			System.out.print("1. Order 2. Exit            ");
			doact = scan.nextInt();
			
			//주문을 하겠다고 한다.
			if(doact == 1) {
				
				//메뉴판을 먼저 보여준다.
				co.showmenu();
				//바리스타가 이제 주문을 받는다 고고!!
				ba.detailorder();
			}
			
			//그냥 나가겠다고 한다.
			else if(doact == 2) {
				
				System.out.println("\nGooooooooooood Byyyyyyyeeeeeeeeeee~~!!!!");
				break;				
			}
			
			//딴 소리를 한다 이런 멍쳥이!!!!!!!!!!
			else {
				
				System.out.println("\nwrong input.. choose again!!!");
				doaction();
			}
			
			int number = ba.editprice;
			money -= number;
		}
	}
}
