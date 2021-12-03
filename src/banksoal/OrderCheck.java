package banksoal;

import java.util.Arrays;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/23/2021.
 */
public class OrderCheck {
  public static void main(String[] args) {
    int arr[] = {1,1,3,3,4,1};
    int arr2[]= Arrays.copyOf(arr, arr.length);
    int temp=0;
    for(int i=0 ; i<arr.length ; i++){
      for(int j=i+1 ; j<arr.length ; j++){
        if(arr[j]< arr[i]){
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    int result=0;
    for(int i=0 ; i<arr.length ; i++){
      if(arr[i] != arr2[i]){
        result++;
      }
    }
    System.out.println(result);
  }
}
