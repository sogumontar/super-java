/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.*;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: sequenceEquation.java, v 0.1 2024‐10‐31 22.48 dongsheng.hds Exp $$
 */
public class sequenceEquation {
    public static void main(String[] args) {
        System.out.println(permutationEquation(Arrays.asList(4,3,5,1,2)));
    }
    public static List<Integer> permutationEquation(List<Integer> p) {
        Map<Integer, Integer> mapReverse = new HashMap<>();
        int key =1;
        for(Integer val : p){
            mapReverse.put(val, key);
            key++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1 ; i<=p.size() ; i++){
            result.add(mapReverse.get(mapReverse.get(i)));
        }
        return result;
    }
}