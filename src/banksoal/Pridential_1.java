package banksoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/26/2021.
 */
public class Pridential_1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inp = scan.nextInt();
    int inp2 = scan.nextInt();
    List<String> data = new ArrayList<>();
    for(int i=0 ; i<inp2 ; i++){
      data.add(scan.next());
    }
    System.out.println(maxStreak(inp2, data));
  }
  public static int maxStreak(int m, List<String> data){
    int result =0;
    for(String temp: data){
      if(!temp.contains("N")){
        result++;
      }
    }
    return result;
  }
}
