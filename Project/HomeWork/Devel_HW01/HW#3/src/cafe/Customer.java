package cafe;

import java.util.Scanner;

public class Customer {

	Scanner scan = new Scanner(System.in);
	
	Barista ba = new Barista();
	Coffee co = new Coffee();
	
	private int doact = 0;
	private static int money = 0;
	private int recharge = 0;
	
	//customer �����ϸ� ���� �����ִ� ����
	public Customer() {
		
		money = 10000;
	}
	
	//���� �ֹ��� �ϵ� �׳� ������ ���� �ϴ� ���� �׼��� ���ϰ���~!?!!
	public void doaction() {
				
		while(true) {
			
			if(money<0) {
				System.out.println("�ʿ��� �ݾ� : "+ (-money));
				System.out.println("���� ���ڸ��� ���� �� �̾ƿ�~!");
				
				//�� �̴� Ŭ���� ���� ����� �������� �����Ƽ� ������� ��
				System.out.println("�����Ѵ�(1), ���Ѵ�(2) ������ ��ȸ�� �ش� ����");
				recharge = scan.nextInt();
				if(recharge == 1) {
					//�����Ϸ� ���
					System.out.println("���Ҳ���? ");
					recharge = scan.nextInt();
					money += recharge;
				}
				else {
					System.out.println("������ ���ϰ� ���� �����鼭 �� ����� �����׳� �� ���Ⱦ�");
					break;
				}
			}
			
			System.out.println("���� ���� ���� "+ money + " �� �Դϴ�.");
			
			System.out.println("\n1choose what you will do~!");
			System.out.print("1. Order 2. Exit            ");
			doact = scan.nextInt();
			
			//�ֹ��� �ϰڴٰ� �Ѵ�.
			if(doact == 1) {
				
				//�޴����� ���� �����ش�.
				co.showmenu();
				//�ٸ���Ÿ�� ���� �ֹ��� �޴´� ���!!
				ba.detailorder();
			}
			
			//�׳� �����ڴٰ� �Ѵ�.
			else if(doact == 2) {
				
				System.out.println("\nGooooooooooood Byyyyyyyeeeeeeeeeee~~!!!!");
				break;				
			}
			
			//�� �Ҹ��� �Ѵ� �̷� �۫���!!!!!!!!!!
			else {
				
				System.out.println("\nwrong input.. choose again!!!");
				doaction();
			}
			
			int number = ba.editprice;
			money -= number;
		}
	}
}
