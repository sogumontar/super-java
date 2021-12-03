package banksoal;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/3/2021.
 */
public class FindKey {
  public static void main(String[] args) {
    String[] name = {"budi beli buku", "harga buku kuliah mahal", "budi sedang kuliah", "harga telur sedang murah", "budi makan daging sapi"};

    Scanner sc = new Scanner(System.in);
    String inputan = sc.next();

    for(int i=0 ; i<name.length ; i++){
      if(name[i].contains(inputan)){
        System.out.print(i + " ");
      }
    }


  }
}
