package banksoal._30DayCodeHackerRank;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : LetsReview, v 0.1 2/11/22 12:23 PM Sogumontar Hendra Exp $$
 */
public class LetsReview {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int inp = sc.nextInt();
            for(int i=0 ; i<inp ; i++){
                String str = sc.next();
                int length = (str.length())/2;
                for( int k=0 ; k<2 ; k++) {
                    for (int j = k; j < str.length(); j+=2) {
                        System.out.print(str.charAt(j));
                    }
                    if(k==0) {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

    }
}
