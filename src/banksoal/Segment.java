package banksoal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 8/21/2021.
 */
public class Segment extends BaseRequest{
  public static int segment(int x, List<Integer> arr) {
    // Write your code here
    List<Integer> result = new ArrayList<>();
    for(int i=0 ; i<=arr.size()-x ; i++){
      int temp=arr.get(i);
      for(int j=i ; j< x+i ; j++){
        if(temp< arr.get(j)){
          temp= arr.get(j);
        }
      }
      result.add(temp);
    }
    System.out.println(result);
    return Collections.max(result,null);
  }
  public static void main(String[] args) {
    int x = singleIntegerRequest();
    int n = singleIntegerRequest();
    List<Integer> list = listOfIntegerRequest(n);
    System.out.println(segment(x, list));
  }
}
