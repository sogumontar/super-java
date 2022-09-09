package banksoal.SeaLabs;

import banksoal.BaseRequest;

import java.util.Arrays;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : TakeTheMin, v 0.1 8/13/22 10:14 AM Sogumontar Hendra Exp $$
 */
public class TakeTheMin extends BaseRequest {
    public static void main(String[] args) {
        int M = singleIntegerRequest();
        int dataLength = singleIntegerRequest();
        int datas[] = new int[100];
        for(int i=0 ; i<dataLength ; i++){
            datas[i]= singleIntegerRequest();
        }
        System.out.println(maxValue(M,datas));
    }

    private static Integer maxValue(int M, int[] arr){
        int result =0;
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length ; i++){
            if(M>0 && arr[i]<0){
                result+= Math.abs(arr[i]);
                M--;
            }
        }
        return result;
    }
}
