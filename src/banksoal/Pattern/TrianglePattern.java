package banksoal.Pattern;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 6/30/2021.
 */
public class TrianglePattern {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris: ");
    int x=inp.nextInt();
    for (int i = 1; i <= x; i++){
      for (int j = x; j >= i; j--) {
        System.out.print(' ');
      }
      for (int k = 1; k <= i; k++){
        System.out.print('*');
      }
      for (int l = 1; l <= i - 1; l++){
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
