package banksoal.ProblemSolving;

import banksoal.BaseRequest;

import java.util.Collections;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : TheHurdleRace, v 0.1 7/31/22 4:44 PM Sogumontar Hendra Exp $$
 */
public class TheHurdleRace extends BaseRequest {
    public static void main(String[] args) {
        int inp = singleIntegerRequest();
        int k = singleIntegerRequest();
        List<Integer> list = listOfIntegerRequest(inp);
        System.out.println(hurdleRace(k,list));

    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Collections.sort(height, Collections.reverseOrder());
        if(k>height.get(0)){
            return 0;
        }

        return height.get(0)-k;

    }
}
