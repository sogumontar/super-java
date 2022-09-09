package banksoal;

import java.util.HashMap;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/3/2021.
 */
public class LupaBulan extends BaseRequest{
  public static void main(String args[]) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
    map.put(1, "Januari");  //Put elements in Map
    map.put(2, "Februari");
    map.put(3, "Maret");
    map.put(4, "April");
    map.put(5, "Mei");
    map.put(6, "Juni");
    map.put(7, "Juli");
    map.put(8, "Agustus");
    map.put(9, "September");
    map.put(10, "Oktober");
    map.put(11, "November");
    map.put(12, "Desember");

    int inputan = singleIntegerRequest();
    int depan = inputan - 1;
    int belakang = inputan + 1;

    if (depan == 0) {
      depan = 12;
    } else if (depan == 13) {
      belakang = 1;
    }
    if (belakang == 13) {
      belakang = 1;
    } else if (belakang == 0) {
      belakang = 12;
    }
    System.out.println(map.get(depan) + " " + map.get(belakang));
  }
}
