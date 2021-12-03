package banksoal;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/19/2021.
 */
public class PerfectNumber {
  private static Scanner sc;

  public static void main(String[] args) {
    int i, Number, Sum = 0 ;
    sc = new Scanner(System.in);
    Number = sc.nextInt();

    for(i = 1 ; i < Number ; i++) {
      if(Number % i == 0)  {
        Sum = Sum + i;
      }
    }
    if (Sum == Number) {
      System.out.format("% d perfect\n", Number);
    }
    else {
      System.out.format("=% dnot perfect\n", Number);
    }
  }
}