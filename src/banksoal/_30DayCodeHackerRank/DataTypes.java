package banksoal._30DayCodeHackerRank;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : DataTypes, v 0.1 2/2/22 11:29 PM Sogumontar Hendra Exp $$
 */

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String inp = scan.nextLine();
        System.out.println(a + i);
        System.out.println(b + d);
        System.out.println( s.concat(inp));
        scan.close();
    }
}