/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2025 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: JumpingOnClouds.java, v 0.1 2025‐01‐03 17.49
 */
public class JumpingOnClouds {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        System.out.println(jumpingOnClouds(list));
    }
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int result =0;
        int starting = c.get(0) == 1 ? 1 : 0;
        for(int i=starting ; i<c.size()-1; i++){
            if(i <= c.size()-3 && c.get(i+2) == 0){
                i++;
            }
            result ++;
        }
        return result;
    }
}
