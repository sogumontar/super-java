package banksoal.ProblemSolving;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : GradingStudents, v 0.1 2/12/22 3:54 PM Sogumontar Hendra Exp $$
 */
public class GradingStudents {

    public static void main(String[] args) throws IOException {
        List<Integer> grades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        for(int i=0 ; i<inp ; i++){
            grades.add(sc.nextInt());
        }
        List<Integer> result = gradingStudents(grades);
        System.out.println(result);

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



