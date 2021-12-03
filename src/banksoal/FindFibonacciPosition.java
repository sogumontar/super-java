package banksoal; /**
 * Created by Sogumontar Hendra Simangunsong on 9/17/2021.
 */

import java.util.Scanner;

//input 3
//output : 0 1 1 2
public class FindFibonacciPosition {
  public static void main(String[] args) {
    int num1= 0, num2 = 1;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();


    for(int i=0;i<=n;i++){
      if(i == n){
        System.out.println(num1);
      }
      int num3 = num2 +num1;
      num1 = num2;
      num2=num3;

    }
  }
  //harusnya 0

}
