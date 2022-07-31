package banksoal.ProblemSolving;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : DayOfTheProgrammer, v 0.1 7/1/22 3:41 PM Sogumontar Hendra Exp $$
 */
public class DayOfTheProgrammer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(dayOfProgrammer(sc.nextInt()));
    }
    public static String dayOfProgrammer(int year) {
        int totalDays =0;
        for(int i=1 ; i<=8 ; i++){
            YearMonth yearMonthObject = YearMonth.of(year, i);
            totalDays += yearMonthObject.lengthOfMonth();
        }
        if(year>= 1700 && year <= 1917){
            if ((year % 4 == 0)  || (year%400 == 0)){
                totalDays+=1;
            }
        }
        int date = 256-totalDays;
        return date + ".09." + year;
        // Write your code here

    }
}
