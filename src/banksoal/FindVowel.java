package banksoal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sogumontar Hendra Simangunsong on 10/18/2021.
 */
public class FindVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        List<Character> vowel = new ArrayList<Character>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        List<Character> res = new ArrayList<Character>();
        for(int i=0 ; i<inp.length() ; i++){
            if(vowel.contains(inp.charAt(i))){
                res.add(inp.charAt(i));
            }
        }
        Collections.sort(res);
        for(int i=0 ; i<res.size() ; i++) {
            System.out.print(res.get(i));
        }

    }
}
