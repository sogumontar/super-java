package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : TheHurdleRace, v 0.1 7/31/22 4:44 PM Sogumontar Hendra Exp $$
 */
public class TheHurdleRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int inp = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0 ; i<inp ; i++){
            list.add(sc.nextInt());
        }

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
