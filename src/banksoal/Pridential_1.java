package banksoal;

import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/26/2021.
 */
public class Pridential_1 extends BaseRequest{

  public static void main(String[] args) {
    int inp2 = singleIntegerRequest();
    List<String> data = listOfStringRequest(inp2);
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
