package banksoal.ProblemSolving;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : TimeConversion, v 0.1 8/4/22 10:41 PM Sogumontar Hendra Exp $$
 */
public class TimeConversion {
    // Replace with KK:mma if you want 0-11 interval
    private static final DateFormat TWELVE_TF      = new SimpleDateFormat("hh:mm:ssa");
    // Replace with kk:mm if you want 1-24 interval
    private static final DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println(convertTime(sc.next()));

    }

    public static String convertTime(String time) throws ParseException {

        return TWENTY_FOUR_TF.format(TWELVE_TF.parse(time));
    }
}
