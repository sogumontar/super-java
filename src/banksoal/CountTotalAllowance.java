package banksoal;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 6/30/2021.
 */
public class CountTotalAllowance {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan jumlah anak : ");
    int anak = inp.nextInt();
    System.out.print("Masukkan gaji pokok : ");
    double gaji = inp.nextDouble();
    double res =0;
    if(anak>=3){
      res = (30 * gaji)/100;
    }else{
      res = ((anak*10) * gaji)/100;
    }
    System.out.println("Tunjangan anak yang diperoleh adalah  : " + (int)res);
  }
}
