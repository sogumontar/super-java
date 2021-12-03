package banksoal;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 6/30/2021.
 */
public class BusNeeded {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan jumlah penumpang: ");
    double x = inp.nextInt();
    double res = Math.ceil(x/8);
    System.out.println("Jumlah bus yang diperlukan : " + (int)res);
  }
}
