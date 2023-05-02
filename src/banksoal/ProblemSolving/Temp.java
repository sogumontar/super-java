//package banksoal.ProblemSolving;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author Sogumontar Hendra Simangunsong
// * @version : Temp, v 0.1 4/11/23 4:58 PM Sogumontar Hendra Exp $$
// */
//public class Temp {
//    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        map.put("LOAN_CREDIT","BALANCE");
//        map.put("COUPON","BALANCE");
//        List<PayOption> listObj = new ArrayList<>();
//        List<PayOption> listObjFinal = new ArrayList<>();
//        listObj.add(new PayOption("LOAN_CREDIT", 3000));
//        listObj.add(new PayOption("COUPON", 200));
//        listObj.add(new PayOption("CC", 100));
//
//        Map<String, Integer> target = new HashMap<>();
//        for(PayOption payOption : listObj){
//            System.out.println(payOption);
//            target.put(map.get(payOption.getPayMethod()), payOption.getOrderAmount());
//        }
//
//        for(PayOption payOption : listObj){
//            System.out.println(payOption);
//            target.put(map.get(payOption.getPayMethod()), payOption.getOrderAmount());
//        }
//
//        Map<String, Object> data = new HashMap<>();
//        for (PayOptionInfo payOptionInfo : payOptionInfos) {
//            Map<String, Object> payOptionInfoData = new HashMap<String, Object>();
//            MultiCurrencyMoney payAmount = #F{getActualPayOptionInfoAmount} (payOptionInfo.getPayAmount(), payOptionInfo.getPayMethod(), @var1.chargeAmount, chargeFeeInfoList);
//            MultiCurrencyMoney transAmount = #F{getActualPayOptionInfoAmount} (payOptionInfo.getTransAmount(), payOptionInfo.getPayMethod(), @var1.chargeAmount, chargeFeeInfoList);
//
//            payOptionInfoData.put("payMethod", payOptionInfo.getPayMethod());
//
//            payOptionInfoData.put("payAmount", #F{convertMoney} (payAmount));
//            payOptionInfoData.put("transAmount", #F{convertMoney} (transAmount));
//            payOptionInfoData.put("chargeAmount", #F{convertMoney} (payOptionInfo.getChargeAmount()));
//
//            payOptionInfoData.put("payOptionBillExtendInfo", JSON.toJSONString(payOptionInfo.getPayOptionBillExtendInfo()));
//
//            payOptionInfoData.put("extendInfo", JSON.toJSONString(payOptionInfo.getExtendInfo()));
//            data.put(payOptionInfo.getPayMethod(), payOptionInfoData);
//
//            payOptionInfoList.add(payOptionInfoData);
//
//        }
//        for(PayOptionInfo payOptionInfo : payOptionInfos){
//            Map<String, Object> payOptionInfoDataSource = (Map<String, Object>) data.get("");
//            Map < String, String > cond = new HashMap < String, String > ();
//            cond.put("source", payOptionInfo.getPayMethod());
//
//            Object param = #F{queryParam}("MaskingPayMethod", cond);
//            if (param != null && param instanceof JSONObject) {
//                JSONObject jsonObject = (JSONObject) param;
//                String source = jsonObject.getString("source");
//                String targets = jsonObject.getString("target");
//                String mode = jsonObject.getString("mode");
//                String whitelist = jsonObject.getString("whitelist");
//                if(data.containsValue(targets)){
//                    Map<String, Object> payOptionInfoData = (Map<String, Object>) data.get(source);
//                    MultiCurrencyMoney orderAmount = payOptionInfoDataSource.get("payAmount");
//                    MultiCurrencyMoney orderAmountTarget = payOptionInfoData.get("payAmount");
//                    orderAmountTarget.getAmount() += orderAmount.getAmount();
//                    payOptionInfoData.get("payAmount") =#F{convertMoney} orderAmountTarget;
//                    data.put(targets, payOptionInfoData);
//                    break;
//                }
//            }
//            payOptionInfoList.add(data.get(payOptionInfo.getPaymentMethod()));
//        }
//
//
//
//    }
//    public static class PayOption{
//        String payMethod;
//        int orderAmount;
//
//        @Override public String toString() {
//            return "PayOption{" + "payMethod='" + payMethod + '\'' + ", orderAmount=" + orderAmount
//                   + '}';
//        }
//
//        public PayOption() {
//        }
//
//        /**
//         * Getter method for property <tt>payMethod</tt>.
//         *
//         * @return property value of payMethod
//         */
//        public String getPayMethod() {
//            return payMethod;
//        }
//
//        public PayOption(String payMethod, int orderAmount) {
//            this.payMethod = payMethod;
//            this.orderAmount = orderAmount;
//        }
//
//        /**
//         * Setter method for property <tt>payMethod</tt>.
//         *
//         * @param payMethod value to be assigned to property payMethod
//         */
//        public void setPayMethod(String payMethod) {
//            this.payMethod = payMethod;
//        }
//
//        /**
//         * Getter method for property <tt>orderAmount</tt>.
//         *
//         * @return property value of orderAmount
//         */
//        public int getOrderAmount() {
//            return orderAmount;
//        }
//
//        /**
//         * Setter method for property <tt>orderAmount</tt>.
//         *
//         * @param orderAmount value to be assigned to property orderAmount
//         */
//        public void setOrderAmount(int orderAmount) {
//            this.orderAmount = orderAmount;
//        }
//    }
//}
