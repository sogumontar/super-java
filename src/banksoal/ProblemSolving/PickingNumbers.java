package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : PickingNumbers, v 0.1 3/2/22 5:58 PM Sogumontar Hendra Exp $$
 */
public class PickingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++ ){
            list.add(sc.nextInt());
        }
        System.out.println(pickingNumbers(list));
    }
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int counter=0;
        int result =0;
        Collections.sort(a);
        System.out.println(a);
        for(int i=0 ; i <a.size()-1 ; i++){
            int comparation = a.get(i+1) - a.get(i);
            System.out.println(counter + "   " + result + "    " + i + "   " + comparation);
            if(comparation <= 1){
                counter++;
            }else{
                counter=0;
            }
            if(result< counter){
                result = counter;
            }
        }
        return result;

    }
}
