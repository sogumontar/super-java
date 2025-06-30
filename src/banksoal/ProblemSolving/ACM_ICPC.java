/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2025 All Rights Reserved.
 */
package banksoal.ProblemSolving;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: ACM_ICPC.java, v 0.1 2025‐06‐30 17.43
 */
public class ACM_ICPC {
    public static void main(String[] args) {
        List<String> datas = new ArrayList<>();
        datas.add("11101");
        datas.add("10101");
        datas.add("11001");
        datas.add("10111");
        datas.add("10000");
        datas.add("01110");
        System.out.println(acmTeam(datas));
    }
    public static List<Integer> acmTeam(List<String> topic) {
        List<Integer> result = new ArrayList<>();
        int teams = 0;
        int maxTopics = 0;
        for (int i = 0; i < topic.size() - 1; i++) {
            for (int z = i + 1; z < topic.size(); z++) {
                String dataFirst = topic.get(i);
                String dataSecond = topic.get(z);
                int totalTopics =getTotalTopics(dataFirst, dataSecond);
                if (totalTopics > maxTopics) {
                    teams = 0;
                    maxTopics = totalTopics;
                }
                if (totalTopics == maxTopics) {
                    teams++;
                }
            }
        }
        result.add(maxTopics);
        result.add(teams);
        return result;
    }

    public static int getTotalTopics(String dataFirst, String dataSecond){
        int totalTopics = 0;
        for (int j = 0; j < dataFirst.length(); j++) {
            boolean isKnown = dataFirst.charAt(j) == '1' || dataSecond.charAt(j) == '1';
            if (isKnown) {
                totalTopics++;
            }
        }
        return totalTopics;
    }
}
