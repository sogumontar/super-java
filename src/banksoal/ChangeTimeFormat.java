package banksoal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/4/2021.
 */
public class ChangeTimeFormat {
  public static void main(String[] args) throws ParseException {
      String input = "07:05:45 PM";
      DateFormat df = new SimpleDateFormat("hh:mm:ss aa");
      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
      Date date = null;
      String output = null;
      date = df.parse(input);
      output = outputformat.format(date);
      System.out.println(output);
  }
}
