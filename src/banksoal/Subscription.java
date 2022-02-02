//package com.alipay.ap.acquirecenter.biz.service.impl.subscription;
//
//import com.alibaba.common.lang.StringUtil;
//import com.alibaba.fastjson.JSONObject;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Sogumontar Hendra Simangunsong
// * @version : Ttest, v 0.1 1/19/22 4:23 PM Sogumontar Hendra Exp $$
// */
//public class Ttest {
//    public static void main(String[] args) {
//
//        Map<String, String> promotionPassThruMap = new HashMap<String, String>();
//        SubscriptionPayInfoDTO s = new SubscriptionPayInfoDTO();
//
//        String subscriptionPayInfo = null;
//        System.out.println(subscriptionPayInfo);
//        if(StringUtil.isNotBlank(subscriptionPayInfo)) {
//            Map<String, String> subsPayInfo = decomposeSubscriptionPayInfo(subscriptionPayInfo);
//
//            for (Map.Entry<String, String> data : subsPayInfo.entrySet()) {
//                if (!promotionPassThruMap.containsKey(data.getValue())) {
//                    promotionPassThruMap.put(data.getKey(), data.getValue());
//                }
//            }
//        }
//        String test ="";
//        test.concat("-").concat(s.getMap().get("a"));
//        promotionPassThruMap.put("goodsType", "hendra");
//        System.out.println(promotionPassThruMap);
//    }
//    private static Map<String, String> decomposeSubscriptionPayInfo(String subscriptionPayInfo){
//        SubscriptionPayInfoDTO obj = JSONObject.parseObject(subscriptionPayInfo, SubscriptionPayInfoDTO.class);
//        Map<String, String> result = new HashMap<>();
//
//        result.put("paymentMethod", obj.getPaymentMethod());
//        result.put("recurringType", obj.getRecurringType());
//        result.put("goodsType", obj.getGoodsType());
//        result.put("goodsId", obj.getGoodsId());
//
//        return result;
//    }
//
//    public static class SubscriptionPayInfoDTO{
//        String goodsId;
//        String goodsType;
//        String paymentMethod;
//        String recurringType;
//        Map<String,String>map;
//
//        public Map<String, String> getMap() {
//            return map;
//        }
//
//        public void setMap(Map<String, String> map) {
//            this.map = map;
//        }
//
//        public String getGoodsId() {
//            return goodsId;
//        }
//
//        public void setGoodsId(String goodsId) {
//            this.goodsId = goodsId;
//        }
//
//        public String getGoodsType() {
//            return goodsType;
//        }
//
//        public void setGoodsType(String goodsType) {
//            this.goodsType = goodsType;
//        }
//
//        public String getPaymentMethod() {
//            return paymentMethod;
//        }
//
//        public void setPaymentMethod(String paymentMethod) {
//            this.paymentMethod = paymentMethod;
//        }
//
//        public String getRecurringType() {
//            return recurringType;
//        }
//
//        public void setRecurringType(String recurringType) {
//            this.recurringType = recurringType;
//        }
//    }
//}
