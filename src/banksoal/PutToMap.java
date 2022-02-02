package banksoal;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : PutToMap, v 0.1 1/19/22 1:22 PM Sogumontar Hendra Exp $$
 */
public class PutToMap {
    public static void main(String[] args) throws IllegalAccessException {
        Map<String, String> map = new HashMap<String,String>();
        model m = new model();
        m.setAge("12");
        m.setName("Hendra");
        map.put("asd","dss");
        map.put("age","123");
        fillIfNotExists(map, m);
        System.out.println(map);

    }

    private static void fillIfNotExists(Map<String, String> map, model m)
            throws IllegalAccessException {
        Field[] namesList = m.getClass().getDeclaredFields();
        for (Field field : namesList) {
            // Dynamically read Attribute Name
            System.out.println("ATTRIBUTE NAME: " + field.getName());
            Object value = field.get(m);
            if(!map.containsKey(field.getName())) {
                map.put(field.getName(), value.toString());
            }
        }
    }

    public static class model{
        String name;
        String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override public String toString() {
            return "model{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }
}


//
//    private static void putValueIfNotDuplicate(Map<String, String> promotionPassThruMap,
//                                               String extendInfo) throws IllegalAccessException {
//
//        Gson g = new Gson();
//
//        SubscriptionPayInfoDTO subscriptionPayInfoDTO = g.fromJson(extendInfo, SubscriptionPayInfoDTO.class);
//
//        Field[] subsInfoAttr = subscriptionPayInfoDTO.getClass().getDeclaredFields();
//
//        for (Field field : subsInfoAttr) {
//
//            if(!promotionPassThruMap.containsKey(field.getName())){
//
//                Object value = field.get(subscriptionPayInfoDTO);
//                promotionPassThruMap.put(field.getName(), value.toString());
//
//            }
//        }
//    }
