package banksoal.ProblemSolving;

import banksoal.BaseRequest;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : CatAndMouse, v 0.1 2/24/22 9:45 AM Sogumontar Hendra Exp $$
 */
public class CatAndMouse extends BaseRequest {
    public static void main(String[] args) {
        List<Integer> list = listOfIntegerRequest(3);
        System.out.println(catAndMouse(list.get(0),list.get(1),list.get(2)));
    }
    static String catAndMouse(int x, int y, int z) {
        String result = "Cat A";
        int catB = Math.abs(y-z);
        int catA = Math.abs(z-x);
        if( catA == catB){
            result = "Mouse C";
        }else{
            if(catA > catB){
                result = "Cat B";
            }
        }

        return result;

    }
}
