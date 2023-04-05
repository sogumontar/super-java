package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : AngryProfessor, v 0.1 4/5/23 10:00 AM Sogumontar Hendra Exp $$
 */
public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {

        Collections.sort(a);
        int count=0;
        for(int i=0 ; i<a.size() ; i++){
            if(a.get(i)>0){
                return count >= k ? "NO" : "YES" ;
            }
            count++;
        }
        return count >= k ? "NO" : "YES" ;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-3);
        list.add(4);
        list.add(2);
        System.out.println(angryProfessor(3, list));
    }

}
