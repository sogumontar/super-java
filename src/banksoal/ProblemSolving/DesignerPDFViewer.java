package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : DesignerPDFViewer, v 0.1 3/7/22 5:34 PM Sogumontar Hendra Exp $$
 */
public class DesignerPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int max=0;
        int length = word.length();
        for(int i=0 ; i< word.length() ; i++){
            int val = Character.getNumericValue(word.charAt(i))-10 ;
            int height = h.get(val);
            if(max<height){
                max=height;
            }
        }
        return (length*max);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> h = new ArrayList<>();
        for(int i=0 ; i<=25 ; i++){
            h.add(sc.nextInt());
        }
        String word = sc.next();
        System.out.println(designerPdfViewer(h,word));

    }
}
