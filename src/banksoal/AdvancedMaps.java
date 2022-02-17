package banksoal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : AdvancedMaps, v 0.1 2/16/22 2:11 PM Sogumontar Hendra Exp $$
 */
public class AdvancedMaps {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Map<String,String> mapB = new HashMap<>();
        map.put("a","" );


        String[] a = map.get("a").replaceAll("\"","").replaceAll(" ", "").split(":");
        for (int i=0 ; i<a.length-1 ; i+=2) {
            mapB.put(a[i],a[i+1]);
//            System.out.println(a[i] + "    h    " + a[i+1]);
        }
        System.out.println(mapB.get(a[0]));
//        System.out.println(mapB);

    }
}
