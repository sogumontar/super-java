package banksoal.Segari;

import banksoal.BaseRequest;

import java.util.*;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : checkCumulateResult, v 0.1 6/30/22 4:13 PM Sogumontar Hendra Exp $$
 */
public class checkCumulateResult extends BaseRequest {

    public static void main(String[] args) {
        int num1 = singleIntegerRequest();
        List<Integer> data1 = listOfIntegerRequest(num1);

        int num2 = singleIntegerRequest();

        Collections.sort(data1);
        for(int i=0 ; i<num2 ; i++){
            checkResultCumulate(data1, singleIntegerRequest());
        }

    }
    public static void checkResultCumulate(List<Integer> list, int num){
        for(int i=0 ; i<list.size() ; i++) {
            for (int j = i; j < list.size() - 1; j++) {
                int resCount = list.get(i) + list.get(j + 1);
                if (resCount == num) {
                    System.out.println(list.get(i) + " " + list.get(j + 1));
                }
                if (resCount > num) {
                    break;
                }

            }
        }
    }


}
