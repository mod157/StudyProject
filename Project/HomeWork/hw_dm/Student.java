
import java.util.*;

class Student_Info{


  String name;

  String[] names=new String[100];
  int[] score_sum=new int[100];
  int[] numbers=new int[100];
  int[] grades=new int[100];
  String yorn;

  int i=0;
  Scanner scan = new Scanner(System.in);

  public Student_Info(){


    grades=new int[100];
    numbers=new int[100];
    score_sum=new int[100];
    names=new String[100];

  }

  public void st_information(String name){//학생정보입력


       names[i]=name;
        if(search(name)!=0){ //해당 학생의 정보가 없을때 신규등록

        names[i]=name;
        System.out.println(name+"님의 학생 정보를 입력하세요");
        System.out.println("학번:");
        numbers[i] = scan.nextInt();
        System.out.println("학년:");
        grades[i] = scan.nextInt();
        System.out.println("누적점수:");
        score_sum[i] = scan.nextInt();
        i++;
     }


  }



  public int search(String n){ //학생검색
    for(int j=0;j<i;j++){
      if(n.equals(names[j]))
      {
        System.out.println("학생의 정보가 있습니다. 수정하시겠습니까? y/n");
        yorn = scan.nextLine();
          if(yorn.equals("y")){
              System.out.println("학번:");
              numbers[j] = scan.nextInt();
              System.out.println("학년:");
              grades[j] = scan.nextInt();
              System.out.println("누적점수:");
              score_sum[j] = scan.nextInt();
              return 0;
            }

          else{
            System.out.println("이름: "+names[j]+"학년: "+grades[j]+"학번: "+numbers[j]+"누적점수: "+score_sum[j]);
            return 0;
          }
      }

  }
   System.out.println("해당학생의 정보는 없습니다.");
   return -1;
 }



  public void st_print(){ //모든학생정보출력
    System.out.println("============================================");
    System.out.println("모든 학생의 정보를 출력합니다");
    for(int j=0;j<i;j++){
      System.out.println("이름: "+names[j]+"학년: "+grades[j]+"학번: "+numbers[j]+"누적점수: "+score_sum[j]);

    }

  }



}

public class Student{

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Student_Info st_Info = new Student_Info(); //객체 생성

    String st_name,q;

    for(int k=0;k<100;k++){

    System.out.println("조회할 학생의 이름을 입력하세요 : ");
    st_name = scan.nextLine();

    st_Info.st_information(st_name);

    System.out.println("다른 학생의 정보를 입력하시겠습니까? y/n");
    q=scan.nextLine();
    if(q.equals("n"))
      break;
    }

    st_Info.st_print();

  }

}
