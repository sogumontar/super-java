package banksoal.ProblemSolving;

import java.util.Arrays;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : ElectronicsShop, v 0.1 4/3/23 10:51 AM Sogumontar Hendra Exp $$
 */
public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        /*
         * Write your code here.
         */
        int sum=0;
        for(int i=0 ; i<drives.length ; i++){
            for(int j=0 ; j<keyboards.length ; j++ ){
                int sumTemp = keyboards[j] + drives[i];
                if(sumTemp > b){
                    break;
                }
                if(sumTemp > sum){
                    sum = sumTemp;
                }
            }
        }
        return sum != 0 ? sum : -1;

    }

    public static void main(String[] args) {
        int[] keyboards = { 3, 1};
        int[] drives = {  2, 2, 8 };
        int b = 10;
        System.out.println(getMoneySpent(keyboards, drives, b));

    }
}
