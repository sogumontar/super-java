package banksoal;

import java.util.Collections;
import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/26/2021.
 */
public class MinimumNumberOfDev extends BaseRequest{
  public static void main(String[] args) {
    int a =singleIntegerRequest();
    List<Integer> inp = listOfIntegerRequest(a);
    int b = singleIntegerRequest();
    System.out.println(Solution(inp, b));
  }
  public static int Solution(List<Integer> tasks, int limit){
    int result=0;
    Collections.sort(tasks, Collections.reverseOrder());
    if(tasks.get(0)> limit){
      return -1;
    }
    int ind=0;
    int temp=0;
    for(int i=0 ; i< tasks.size(); i++){
      temp +=tasks.get(i);
      tasks.remove(i);
      ind++;
      if(ind==1){
        ind=0;
        int need = limit - temp;
        if(need> tasks.get(tasks.size()/2)){
          for(int j=0 ; j<tasks.size()/2 ; j++){
            if(need<=tasks.get(j)){
              result++;
              tasks.remove(j);
              break;
            }
          }
        }else if(need == tasks.get(tasks.size()/2)){
              result++;
              tasks.remove(tasks.size()/2);
        }else{
          for(int j=tasks.size()/2 ; j<tasks.size()-1 ; j++){
            if(need<=tasks.get(j)){
              result++;
              tasks.remove(j);
              break;
            }
          }
        }
        temp=0;
      }
    }
    return result;
  }
}
