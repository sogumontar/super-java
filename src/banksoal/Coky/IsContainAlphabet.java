package banksoal.Coky;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : IsContainAlphabet, v 0.1 2/3/23 1:21 PM Sogumontar Hendra Exp $$
 */
public class IsContainAlphabet {
    public static void main(String[] args) {
        System.out.println(isContainAlphabet("abcedfghijklnmopqrstuvwxyz"));
    }
    public static boolean isContainAlphabet(String str){
        return str.toLowerCase()
                            .replaceAll("[^a-z]", "")
                            .replaceAll("(.)(?=.*\\1)", "")
                            .length() == 26;
    }
}
