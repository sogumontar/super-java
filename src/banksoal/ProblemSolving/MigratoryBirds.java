package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : MigratoryBirds, v 0.1 2/18/22 9:26 AM Sogumontar Hendra Exp $$
 */
public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int result =0;
        int maxNow =0;
        int count =0;
        int lastCount =0;
        Collections.sort(arr);
        for(int i=0 ; i<arr.size()-1 ; i++){
            if(arr.get(i)==arr.get(i+1)){
                maxNow=arr.get(i);
                count++;
            }else{
                count++;
                if(count>lastCount){
                    result = arr.get(i);
                    lastCount=count;
                }
                count=0;
            }
        }
        if(lastCount==0){
            result=arr.get(0);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        for(int i=0 ; i<inp ; i++){
            data.add(sc.nextInt());
        }
        Integer result =  migratoryBirds(data);
        System.out.println(result);
    }
}
