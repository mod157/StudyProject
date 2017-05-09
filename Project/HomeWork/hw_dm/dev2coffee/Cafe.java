
import java.util.*;

public class Cafe{

  public static void main(String[] args){


     String visit,totalm;
     int totalp=0;

    Scanner scan = new Scanner(System.in);

    System.out.println("카페에 방문 하시겠습니까? (y/n)");
    visit= scan.nextLine();
    Client client = new Client(visit);
    if(client.info()){
      Menu menu = new Menu();
      menu.show();

      totalm=menu.getcofee();
      totalp=menu.gettotal();

      Barista brista = new Barista(totalm,totalp);
      brista.makecoffee();
    }



  }

}

class Coffee{

  private String cf_name;
  private String cf_plus;
  private int price;
  private String temp;// 커피 온도?
  private int ad; // 추가
  private String order; // 최종 주문메뉴

  Scanner scan = new Scanner(System.in);

  public enum Add{
    SHOT(1000),
    WIPPING(500),
    ICE_CREAM(500),
    SYRUP(0),
    CINNAMON(300);

  private int value;
  private Add(int value){
    this.value = value;
  }
  public int getValue(){
    return this.value;
  }
}
//  커피이름 enum
//  커피샷 휘핑 등추가 enum
    public Coffee(String n,int price){
      cf_name=n;// 제조할 커피이름
      this.price= price; // 커피가격
      order = "";
      temp = "hot";
    }

    public void inCoffee(){//추가 주문


      if(!cf_name.equals("EXPRESSO"))
      {
      System.out.println("hot or ice ? (ice는 500원 추가 됩니다.)");
      temp= scan.nextLine();
      }

      System.out.println("커피에 추가할 항목을 선택 하세요");
      System.out.println("1 "+Add.SHOT +" "+Add.SHOT.getValue() );
      System.out.println("2 " +Add.WIPPING +" "+Add.WIPPING.getValue() );
      System.out.println("3 "+Add.ICE_CREAM +" "+Add.ICE_CREAM.getValue() );
      System.out.println("4 "+Add.SYRUP +" "+Add.SYRUP.getValue() );
      System.out.println("5 "+Add.CINNAMON +" "+Add.CINNAMON.getValue() );
      ad=scan.nextInt();

    }

    public int total(){ // 총 가격 & 주문내역

      if(temp.equals("ice")){
      price +=500;
      order = "Ice ";
    }
    else order = "Hot ";
      order += cf_name;
      switch(ad){
        case 1:
          order +=" with "+Add.SHOT;
          price +=1000;
          break;
        case 2:
          order +=" with "+Add.WIPPING;
          price +=500;
          break;
        case 3:
          order +=" with "+Add.ICE_CREAM;
          price +=500;
          break;
        case 4:
          order +=" with "+Add.SYRUP;
          break;
        case 5:
          order +=" with "+Add.CINNAMON;
          price +=300;
          break;
      }

      return price;
    }

    public String order()
    {
      return order;
    }

}

class Barista{
  private String order;
  private int price;

  public Barista(String order,int price){
    this.order= order; // 주문메뉴
    this.price = price;//가격
  }

  public void makecoffee(){
    System.out.println("주문하신 "+order+ " 나왔습니다.");
    System.out.println(price+"원 결제 해 드리겠습니다.");
    System.out.println("감사합니다 또 오세요");
  }


}

class Client{

  private String clientinfo;

  public Client(String n){
    clientinfo= n;
  }


  public boolean info(){
    if(clientinfo.equals("y"))
    {
      System.out.println("주문주문!");
      return true;
    }
    else{
    System.out.println("다음에 올게요");
    return false;
    }
  }

}

class Menu{

  //private Client ct;
  Scanner scan = new Scanner(System.in);

  public enum Menuprice {
    AMERICANO(1500),
    CAPPUCCINO(2000),
    CARAMEL_MACCHIATO(2500),
    EXPRESSO(1000);

    private int value;
    private Menuprice(int value){
      this.value = value;
    }
    public int getValue(){
      return this.value;
    }
  };
  private String order;//주문
  private int cofee_name;//커피이름
  private int totalprice; // 총 가격

  public Menu(){
    //ct=client; //손님이 오면 메뉴판을 보여준다
    totalprice = 0;
  }

  public void show(){ //메뉴판
    System.out.println("============MENU============");
    System.out.println(" 1. AMERICANO           1,500");
    System.out.println(" 2. CAPPUCCINO             2,000");
    System.out.println(" 3. CARAMEL_MACCHIATO        2,500");
    System.out.println(" 4. EXPRESSO           1,000");
    System.out.println("주문하시겠습니까?(y/n)");
    order = scan.nextLine();
    if(order.equals("y")){
    select();
    }
    else
    {
      System.out.println("감사합니다. 안녕히가세요");
      return;
    }
  }


  public void select(){//메뉴선택
    System.out.println("어떤 메뉴를 선택하시겠습니까?(번호로 입력 ex) 아메리카노 -> 1)");
    cofee_name=scan.nextInt();
    switch(cofee_name){
      case 1:
      Coffee coffee1 = new Coffee("AMERICANO",Menuprice.AMERICANO.getValue());
      coffee1.inCoffee();
      totalprice=coffee1.total();//가격
      order=coffee1.order();//주문내역
      break;

      case 2:
      Coffee coffee2 = new Coffee("CAPPUCCINO",Menuprice.CAPPUCCINO.getValue());
      coffee2.inCoffee();
      totalprice=coffee2.total();//가격
      order=coffee2.order();//주문내역
      break;

      case 3:
      Coffee coffee3 = new Coffee("CARAMEL_MACCHIATO",Menuprice.CARAMEL_MACCHIATO.getValue());
      coffee3.inCoffee();
      totalprice=coffee3.total();//가격
      order=coffee3.order();//주문내역
      break;

      case 4:
      Coffee coffee4 = new Coffee("EXPRESSO",Menuprice.EXPRESSO.getValue());
      coffee4.inCoffee();
      totalprice=coffee4.total();//가격
      order=coffee4.order();//주문내역
      break;

    }
  }

  public String getcofee(){
    return order;
  }
  public int gettotal(){
    return totalprice;
  }
}
