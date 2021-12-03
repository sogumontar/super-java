package banksoal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/3/2021.
 */
public class UcokDanBernyanyi {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
    map.put(1, "Selamat");  //Put elements in Map
    map.put(2, "ulang");
    map.put(3, "tahun,");
    map.put(4, "selamat");
    map.put(5, "ulang");
    map.put(6, "tahun,");
    map.put(7, "selamat");
    map.put(8, "ulang");
    map.put(9, "tahun");
    map.put(10, "untuk");
    map.put(11, "Ucok,");
    map.put(12, "selamat");
    map.put(13, "ulang");
    map.put(14, "tahun ...");
    Scanner inp = new Scanner(System.in);
    int inputan = inp.nextInt();

    int count = (int) Math.ceil(inputan/14) +1;
    List data = new ArrayList<>();
    for( int i=0 ; i<inputan ; i++ ){
      data.add(inp.next());
    }

    int indikator=0;
    if(inputan >14){
      int indikator2=1;
      for (int i = 1; i <= count*14; i++) {
        System.out.println(data.get(indikator) + ":" + map.get(indikator2));
        if(indikator2 == 14){
         indikator2=1;
        }else {
          indikator2++;
        }
        if (indikator == inputan - 1) {
          indikator = 0;
        } else {
          indikator++;
        }
      }
    }else {
      for (int i = 1; i <= 14; i++) {
        System.out.println(data.get(indikator) + ":" + map.get(i));
        if (indikator == inputan - 1) {
          indikator = 0;
        } else {
          indikator++;
        }
      }
    }
  }
}
