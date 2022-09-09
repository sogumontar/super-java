package banksoal.Pattern;

import banksoal.BaseRequest;

import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 7/31/2021.
 */
public class NumberPattern extends BaseRequest {
  public static void main(String[] args) {
    int start = singleIntegerRequest();
    int end = singleIntegerRequest();
    int ind=0;
    int val=0;
    for(int i=start ; i<=end ; i++){
      val=i;
      for(int j=i ; j<=end+ind; j++){
        if(val > end){
          val=start;
        }
        System.out.print(val);
        val++;
      }
      ind++;
      System.out.println();
    }
  }
}
