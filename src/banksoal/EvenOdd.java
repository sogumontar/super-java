package banksoal;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/11/2021.
 */
public class EvenOdd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter First Number");
    int num1=in.nextInt();
    System.out.println("Enter Second Number");
    int num2 =in.nextInt();
    for(int i=num1 ; i<=num2 ; i++ ){
        if(i%2==0){
          System.out.println(i + " is even number");
        }else{
          System.out.println(i + " is odd number");
        }
    }
  }
}
