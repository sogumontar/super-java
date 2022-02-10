package banksoal._30DayCodeHackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Looping, v 0.1 2/10/22 8:17 PM Sogumontar Hendra Exp $$
 */
public class Looping {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());
            for(int i=1 ; i<=10 ; i++){
                System.out.println(n + " x " + i + " = " + n*i);
            }
            bufferedReader.close();
    }

}
