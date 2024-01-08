/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: MigratoryBird.java, v 0.1 2024‐01‐08 09.07 dongsheng.hds Exp $$
 */
public class MigratoryBird {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            int val = 1;
            if(map.get(num) != null){
                val = map.get(num)+1;
            }
            map.put(num,val);
        }
        int result = 0;
        int count = 0;
        for(int num : arr){
            if(map.get(num) > count ){
                count = map.get(num);
                result = num;
            }
        }
        return result;
    }
}