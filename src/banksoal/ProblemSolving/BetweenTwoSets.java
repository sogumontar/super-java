package banksoal.ProblemSolving;

import banksoal.BaseRequest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : BetweenTwoSets, v 0.1 9/9/22 4:27 PM Sogumontar Hendra Exp $$
 */
public class BetweenTwoSets extends BaseRequest {
    public static void main(String[] args) {
        int aa =singleIntegerRequest();
        int bb =singleIntegerRequest();
        List<Integer> a = listOfIntegerRequest(aa);
        List<Integer> b = listOfIntegerRequest(bb);
        System.out.println(getTotalX(a,b));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result =0;
        Collections.sort(a, Collections.reverseOrder());
        Collections.sort(b);
        List<Integer> list = new ArrayList<>();
        for(int i=a.get(0) ; i<=b.get(0) ; i++){
            for(int j=0 ; j<a.size() ; j++) {
                if (i % a.get(j) !=0 ){
                    break;
                }
                if(j == a.size()-1){
                    list.add(i);
                }
            }
        }
        for(int i =0 ; i<list.size() ; i++){
            for(int j=0 ; j<b.size() ; j++){
                if(b.get(j)%list.get(i) != 0 ){
                    break;
                }
                if(j == b.size()-1){
                    result++;
                }
            }
        }
        return result;

    }

}
