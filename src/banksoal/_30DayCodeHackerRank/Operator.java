package banksoal._30DayCodeHackerRank;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Operator, v 0.1 2/3/22 9:28 PM Sogumontar Hendra Exp $$
 */
import java.io.*;
class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double a =(meal_cost * tip_percent / 100);
        double b =(tax_percent * tip_percent) ;
        double result = a + b/100 + meal_cost;
        System.out.println(meal_cost + " " + tip_percent + " " + tax_percent);
        System.out.println(a);
        System.out.println(b/100);
        System.out.println(result);
    }

}

public class Operator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
