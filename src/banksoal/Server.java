package banksoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/19/2021.
 */
public class Server extends BaseRequest{
  public static void main(String[] args) {
    int a = singleIntegerRequest();
    int b = singleIntegerRequest();
    List<Integer> data = listOfIntegerRequest(a);
    System.out.println(cek(a,b,data));
  }
  public static int cek(int a, int b, List data){
    int indikator=0;
    for(int i=0 ; i<a ; i++){
      if(b - (int)data.get(i) <= 0){
        return indikator;
      }
      indikator++;
    }
    return indikator;
  }
}
