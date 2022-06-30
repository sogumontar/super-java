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
        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index = a.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;

    }
}
