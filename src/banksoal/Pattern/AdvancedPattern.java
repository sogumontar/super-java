package banksoal.Pattern;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/3/2021.
 */
public class AdvancedPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputan = sc.nextInt();
    for (int i = 1; i <= inputan; i++) {
      for (int k = 0; k < 5; k++) {
        for (int x = 0; x < i; x++) {
          for (int f = 0; f < 5; f++) {
            if (f <= k) {
              System.out.print("#");
            } else {
              System.out.print(" ");
            }
          }
        }
        System.out.println("");
      }
      System.out.println("");
    }

  }
}
