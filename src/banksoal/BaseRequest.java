package banksoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : BaseRequest, v 0.1 9/9/22 2:39 PM Sogumontar Hendra Exp $$
 */
public class BaseRequest {
    static Scanner scanner = new Scanner(System.in);

    public static int singleIntegerRequest(){
        return scanner.nextInt();
    }

    public static String singleStringRequest(){
        return scanner.next();
    }

    public static List<Integer> listOfIntegerRequest(int num){
        List<Integer> listOfInteger = new ArrayList<>();
        for(int i=0 ; i<num ; i++){
            listOfInteger.add(scanner.nextInt());
        }
        return listOfInteger;
    }

    static List<String> listOfStringRequest(int num){
        List<String> listOfString = new ArrayList<>();
        for(int i=0 ; i<num ; i++){
            listOfString.add(scanner.next());
        }
        return listOfString;
    }

}
