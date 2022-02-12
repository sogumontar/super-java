package banksoal.ProblemSolving;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : NumberLineJumps, v 0.1 2/12/22 4:15 PM Sogumontar Hendra Exp $$
 */
public class NumberLineJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        System.out.println(kangaroo(x1,v1,x2,v2));

    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int vdiff = v1 - v2;
        if (vdiff <= 0) {
            return "NO";
        }else{
            int xdiff = x1 - x2;
            return (xdiff % vdiff == 0 ? "YES" : "NO");
        }
    }
}
