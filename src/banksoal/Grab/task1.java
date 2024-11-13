/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.Grab;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: task1.java, v 0.1 2024‐11‐13 07.10 dongsheng.hds Exp $$
 */
public class task1 {
    public static void main(String[] args) {
        int[] data = {130,191,200,10};
        System.out.println(solution(data));
    }
    public static int solution(int[] A) {
        Map<String, Integer> map = new HashMap<>();
        int result = -1;
        for(int num : A){
            String numStr = Integer.toString(num);
            String key = new String(new char[]{numStr.charAt(0) , numStr.charAt(numStr.length()-1)});
            Integer val = num;
            if(map.get(key)!=null){
                result = map.get(key) + num;
                val= Math.max(map.get(key), num);
            }
            map.put(key, val);
        }
        return result;
        // Implement your solution here
    }
}