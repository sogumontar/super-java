package banksoal._30DayCodeHackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
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

