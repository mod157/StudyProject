import java.util.*;



class Revers_all{

  public Revers_all(){

  }

  public void revers_a(int a){
    for(int i=a;i>0; i /=10)
    System.out.print(i%10);
    System.out.println();
  }
  public void revers_a(double d){
    String dtos;
     dtos = d+"";
     for(int i= dtos.length()-1;i>=0;i--)
       System.out.print(dtos.charAt(i));
    System.out.println();
   }



  public void revers_a(String s){
    for(int i= s.length()-1;i>=0;i--)
      System.out.print(s.charAt(i));
    System.out.println();
  }



}



public class Revers{

  public static void main(String[] args) {

    Revers_all revers_all = new Revers_all();
    Scanner scan = new Scanner(System.in);
    String s;
    Double d;
    int i;

    System.out.println("문자열 입력:");
    s = scan.nextLine();
    revers_all.revers_a(s);

    System.out.println("정수 입력:");
    i = scan.nextInt();
    revers_all.revers_a(i);

    System.out.println("실수 입력:");
    d = scan.nextDouble();
    revers_all.revers_a(d);

}
}
