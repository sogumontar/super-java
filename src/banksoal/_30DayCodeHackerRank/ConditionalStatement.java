package banksoal._30DayCodeHackerRank;

import java.io.*;
/**
 * @author Sogumontar Hendra Simangunsong
 * @version : ConditionalStatement, v 0.1 2/9/22 1:37 PM Sogumontar Hendra Exp $$
 */
public class ConditionalStatement {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if(N %2 ==0){
            if(N>=6 && N<=20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}

