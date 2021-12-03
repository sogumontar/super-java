package banksoal;

/**
 * Created by Sogumontar Hendra Simangunsong on 3/3/2021.
 */
public class FindPairs {
  public static void main(String[] args) {
    int[] arr = {1, 2,3,4,5,6,7,8,9,10};
    findPairs(arr,8);

  }

  public static void findPairs(int[]arr, int k){
    for(int i=0 ; i<arr.length ; i++ ){
      for(int j=i+1 ; j<arr.length ; j++){
        if(arr[i]+arr[j] == k){
          System.out.println(arr[i] + " , " + arr[j]);
        }
      }
    }
  }
}
