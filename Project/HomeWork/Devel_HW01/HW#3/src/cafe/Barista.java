package cafe;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Barista {
	
	Scanner scan = new Scanner(System.in);
	
	//Ŭ������ ����� �� �� ����� �������....
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
	
	//�ֹ��� �����մϴ�~~
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
			singleorder(); //��ǰ�ֹ����� ���
		else
			pluralorder(); //���� �ֹ��ϴ� ������ ���
	}
	
	//��ǰ �ֹ��� ��
	public void singleorder() {
		
		//Ŀ���� ������ ���� �����
		System.out.println("what do you want to drink?");
		drinks[0] = scan.next();
		
		//Ŀ�� ������ �´� ������ ��������
		prices[0] = co.coffeekind(drinks[0]);
		
		//�ֹ��� Ŀ���� ����� �����
		System.out.println("choose the size of the drink( S(-500) / M / L(+500) )");
		sizes[0] = scan.next();
		
		//����� �����Ÿ� -500�� ���ִ� �ž�
		if(sizes[0].equals("S") || sizes[0].equals("s")) {
			prices[0] += -500;
		}
		//����� ū �Ÿ� ���ڽ� ���� �Դµ� +500 �߰�!!!!!!!
		else if(sizes[0].equals("L") || sizes[0].equals("l")) {
			prices[0] += +500;
		}
		//������ ������ ����� �ְ�
		editprice += prices[0];
		
		//�ֹ��� ���� �����ϰ� �����ų� ������ �����ų� ���
		System.out.println("choose the temperature of the drink(HOT, COLD)");
		tempers[0] = scan.next();
		
		//�ֹ� �� ���� �ַ���
		endorder(editprice);
	}
		
	//������ �ֹ� �� ��
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
	
	//Ŀ�� �����ֱ� �������󤿤���~~
	public void endorder(int num) {
		
		for(int i=0; i<order; i++) {
			System.out.printf("Here is your %5s %3s %17s...%6s\n",tempers[i],sizes[i],drinks[i],prices[i]);
		}
		
		System.out.println("�� �ݾ��� ..........."+editprice+" �� �Դϴ�.");
		
		//Customer(editprice);
	}
}
