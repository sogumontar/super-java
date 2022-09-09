package banksoal.ProblemSolving;

import banksoal.BaseRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : GradingStudents, v 0.1 2/12/22 3:54 PM Sogumontar Hendra Exp $$
 */
public class GradingStudents extends BaseRequest {

    public static void main(String[] args) {
        int inp = singleIntegerRequest();
        List<Integer> grades = listOfIntegerRequest(inp);
        System.out.println(gradingStudents(grades));

    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(int i=0 ; i<grades.size() ; i++){
            if(grades.get(i)<38){
                result.add(grades.get(i));
            }else{
                int sisa = grades.get(i)%5;
                if(sisa >=3){
                    result.add((grades.get(i) + (5-sisa) ));
                }else{
                    result.add((grades.get(i)));
                }
            }
        }
        return result;
    }
}



