package banksoal.Coky;


/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Password, v 0.1 2/3/23 12:46 PM Sogumontar Hendra Exp $$
 */
public class Password {
    public static String SimplePassword(String str) {
        // code goes here
        boolean isCapital = false;
        boolean isNumber = false;
        boolean isContainPassword = !(str.toLowerCase().contains("password"));
        boolean isCorrectLength = str.length()>7 && str.length()<31;
        String punct = str.replaceAll("\\p{Punct}", "");
        boolean isPunctuaction = punct != str;
        for (int i=0 ; i<str.length() ; i++){
            if(Character.isUpperCase(str.charAt(i))){
                isCapital = true;
            }
            if(isNumeric(String.valueOf(str.charAt(i)))){
                isNumber = true;
            }
        }
        return String.valueOf(isCapital && isNumber && isContainPassword && isCorrectLength && isPunctuaction);
    }
    private static boolean isNumeric (String str){
        int intValue;
        try {
            intValue = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(SimplePassword("!turkey90AAA-"));
    }
}
