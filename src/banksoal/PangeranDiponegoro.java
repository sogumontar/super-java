package banksoal;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/3/2021.
 */
public class PangeranDiponegoro {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    BigInteger tim = new BigInteger(String.valueOf(inp.nextInt()));
    BigInteger lawan = new BigInteger(String.valueOf(inp.nextInt()));
    BigInteger result = new BigInteger("0");
    result =tim.subtract(lawan);
    String aksi = "serang";
    int compare = BigInteger.valueOf(199).compareTo(result.abs());
    if ( compare == -1 && (tim.compareTo(lawan)) ==-1) {
      aksi = "putar balik";
    }
    System.out.println(result.abs() + " " + aksi);
  }

}
