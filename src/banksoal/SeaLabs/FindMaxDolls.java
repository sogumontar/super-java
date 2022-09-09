package banksoal.SeaLabs;


import banksoal.BaseRequest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : FindMaxDolls, v 0.1 9/2/22 10:50 AM Sogumontar Hendra Exp $$
 */
public class FindMaxDolls extends BaseRequest {
    static int result=0;
    public static void main(String[] args) {
        int N = singleIntegerRequest();
        List<Integer> list = listOfIntegerRequest(N);
        Collections.sort(list);
        System.out.println(findMaxDoll(list));
    }

    static int findMaxDoll(List<Integer> list){
        int curr=list.get(0);
        list.remove(0);
        System.out.println(Arrays.toString(list.toArray()));
        for(int i=0 ; i<list.size() ; i++){

            if(list.get(i).equals(list.get(list.size() - 1))){
                result++;
                list.remove(i);
                break;
            }

            if(curr<list.get(i)){
                curr = list.get(i);
                list.remove(i);
                i--;
            }

        }

        if(list.size()==0){
            return result;
        }
        return findMaxDoll(list);
    }




}
