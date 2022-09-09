package banksoal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/3/2021.
 */
public class Bababibi extends BaseRequest{
  public static void main(String[] args) {
    int inp = singleIntegerRequest();
    List<Integer> numbers = listOfIntegerRequest(inp);
    List<Integer> odd = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    for (int i=0 ; i<inp ; i++){
      if(numbers.get(i)%2==0){
        odd.add(numbers.get(i));
      }else{
        even.add(numbers.get(i));
      }
    }
    Collections.sort(odd);
    Collections.sort(even);
    if(odd.size()<2){
      System.out.println(-1);
    }else{
      int result = odd.get(odd.size()-1) + odd.get(odd.size()-2);
      int resultEven = even.get(even.size()-1) + even.get(even.size()-2);
      if(result >= resultEven){
        System.out.println(result);
      }else{
        System.out.println(resultEven);
      }
    }
  }

}
