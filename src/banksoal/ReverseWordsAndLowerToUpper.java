package banksoal;


/**
 * Created by Sogumontar Hendra Simangunsong on 9/3/2021.
 */
public class ReverseWordsAndLowerToUpper {
    public static void  main(String[] args) {
        String text = "Hello World";
            String[] tempText = text.split(" ");

            for(int j = 0 ; j<tempText.length ; j++){
                for(int i=tempText[j].length()-1 ; i>=0;i--){
                    if(Character.isLowerCase(tempText[j].charAt(i))){
                        System.out.print(Character.toUpperCase(tempText[j].charAt(i)));
                    }else{
                        System.out.print(Character.toLowerCase(tempText[j].charAt(i)));
                    }
                }
                System.out.print(" ");
            }
            System.out.println();

    }
}
