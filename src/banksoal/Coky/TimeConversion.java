package banksoal.Coky;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : TimeConversion, v 0.1 2/3/23 1:32 PM Sogumontar Hendra Exp $$
 */
public class TimeConversion {
    public static String convertTime(int num){
        String hour = "";
        String minute = "";

        if(num<60){
            hour = "0";
            minute = String.valueOf(num);
        }else{
            int hours = num/60;
            hour = String.valueOf(num/60);
            minute = String.valueOf(num - (hours*60));
        }

        return hour + ":" + minute;
    }

    public static void main(String[] args) {
        System.out.println(convertTime(22));
    }
}
