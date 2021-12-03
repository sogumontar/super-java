package banksoal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sogumontar Hendra Simangunsong on 9/3/2021.
 */
public class ChangeDateFormat {
  public static void main(String[] args) throws ParseException {
    String OLD_FORMAT = "dd/MM/yyyy";
    String NEW_FORMAT = "yyyy/MM/dd";

    // August 12, 2010
    String oldDateString = "12/08/2010";
    String newDateString;

    SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);

    Date d = sdf.parse(oldDateString);
    sdf.applyPattern(NEW_FORMAT);
    newDateString = sdf.format(d);
    System.out.println(sdf.format(d));
  }
}
