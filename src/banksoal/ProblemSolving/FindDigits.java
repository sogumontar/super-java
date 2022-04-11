package banksoal.ProblemSolving;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : FindDigits, v 0.1 4/11/22 10:22 AM Sogumontar Hendra Exp $$
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            System.out.println(findDigits(sc.nextInt()));
        }

    }
    public static int findDigits(int n) {
        // Write your code here
        String temp = String.valueOf(n);
        int digits=0;
        temp = temp.replace("0","");
        for(int i=0 ; i<temp.length() ; i++){
            int a =Integer.parseInt(String.valueOf(temp.charAt(i)));
            if(n%a == 0){
                digits++;
            }
        }
        return digits;
    }
}
