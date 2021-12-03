package banksoal;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        char charSArray[] = s.toCharArray();
        char charTArray[] = t.toCharArray();
        Arrays.sort(charSArray);
        Arrays.sort(charTArray);
        String resS = new String(charSArray);
        String resT = new String(charTArray);
        if( resS.equals(resT)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
    public static String isAnagram(String firstWord, String secondWord){
        char charSArray[] = firstWord.toCharArray();
        char charTArray[] = secondWord.toCharArray();
        Arrays.sort(charSArray);
        Arrays.sort(charTArray);
        String resS = new String(charSArray);
        String resT = new String(charTArray);
        if( resS.equals(resT)){
            return "true";
        }else{
            return "false";
        }
    }
}
