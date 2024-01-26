//package banksoal.soap.indosat;
//
///**
// * @author Sogumontar Hendra Simangunsong
// * @version : IndosatGoodsRecommendationQuery, v 0.1 8/25/23 5:48 PM Sogumontar Hendra Exp $$
// */
//package http;
//
//import org.w3c.dom.Document;
//import org.xml.sax.SAXException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.xml.namespace.QName;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.soap.*;
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Sogumontar Hendra Simangunsong
// * @version : IndosatGoodsRecommendationQueryMock, v 0.1 8/25/23 11:04 AM Sogumontar Hendra Exp $$
// */
//public class IndosatGoodsRecommendationyMock {
//    private static Map<String, String> mockValues = new HashMap<>();
//    private static Map<String, String> mockSecondValues = new HashMap<>();
//
//
//    private static void populateSingleData(){
//        mockValues.put("BundleId", "10031001");
//        mockValues.put("BundleName", "External Bundle 1 ");
//        mockValues.put("Description", "External Bundle");
//        mockValues.put("BundleType", "External Bundle");
//        mockValues.put("BundleProvider", "101");
//        mockValues.put("IdentityType", "5000");
//        mockValues.put("BeginValidityPeriod", "20230801");
//        mockValues.put("ExpirationDate", "20230922");
//        mockValues.put("Currency", "IDR");
//        mockValues.put("ExternalPrice", "150.00");
//        mockValues.put("Status", "30");
//        mockValues.put("ThirdPartyCode", "1000");
//        mockValues.put("ElementName", "External Element");
//        mockValues.put("ElementType", "SMS Only");
//        mockValues.put("ElementIdentifier", "1");
//        mockValues.put("BundleCategory", "2");
//    }
//    private static void populatemultipleData(){
//        mockSecondValues.put("BundleId", "10031001");
//        mockSecondValues.put("BundleName", "External Bundle 1 ");
//        mockSecondValues.put("Description", "External Bundle");
//        mockSecondValues.put("BundleType", "External Bundle");
//        mockSecondValues.put("BundleProvider", "101");
//        mockSecondValues.put("IdentityType", "5000");
//        mockSecondValues.put("BeginValidityPeriod", "20230801");
//        mockSecondValues.put("ExpirationDate", "20230922");
//        mockSecondValues.put("Currency", "IDR");
//        mockSecondValues.put("ExternalPrice", "150.00");
//        mockSecondValues.put("Status", "30");
//        mockSecondValues.put("ThirdPartyCode", "1000");
//        mockSecondValues.put("ElementName", "External Element");
//        mockSecondValues.put("ElementType", "SMS Only");
//        mockSecondValues.put("ElementIdentifier", "1");
//        mockSecondValues.put("BundleCategory", "2");
//    }
//
//    private class Request {
//        String msisdn;
//
//        private Request(HttpServletRequest httpServletRequest) throws Exception  {
//            String inputString = getInputString(httpServletRequest);
//            Document document = null;
//            try {
//                document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
//                        .parse(new ByteArrayInputStream(inputString.getBytes(StandardCharsets.UTF_8)));
//            } catch (SAXException | IOException | ParserConfigurationException e) {
//                e.printStackTrace();
//            }
//
//            this.msisdn = document.getElementsByTagName("cus:MSISDN").item(0).getTextContent().trim();
//
//            if (msisdn == null || msisdn.isEmpty()) {
//                throw new IllegalArgumentException("msisdn is empty");
//            }
//
//        }
//    }
//
//    private class HttpResponse {
//        private int    httpStatusCode;
//        private String httpStatusMessage;
//
//        private HttpResponse(int httpStatusCode, String httpStatusMessage) {
//            this.httpStatusCode    = httpStatusCode;
//            this.httpStatusMessage = httpStatusMessage;
//        }
//    }
//
//
//    private class Response {
//        String resultType    = "";
//        String resultCode    = "";
//        String resultDesc    = "";
//
//        ByteArrayOutputStream outputStreamresponse;
//        private Response(IndosatGoodsRecommendationyMock.Request request) throws Exception {
//            if (request.msisdn.equals("08000000000000")) {
//                this.resultType  = "0";
//                this.resultCode  = "2006";
//                this.resultDesc  = "Insufficient balance";
//            }  else {
//                this.resultType  = "0";
//                this.resultCode  = "0";
//                this.resultDesc  = "Process service request successfully.";
//                builXMLResponse(request.msisdn);
//            }
//
//        }
//
//        private void composeResultParameters(SOAPElement resultParameters, Map<String, String> valuesMap) throws
//                                                                                                          SOAPException {
//            for(String key: valuesMap.keySet()){
//                resultParameters.addChildElement(key, "cus").setValue(valuesMap.get(key));
//            }
//        }
//
//        public void builXMLResponse(String msisdn) throws Exception {
//            MessageFactory factory = MessageFactory.newInstance();
//            SOAPMessage soapMessage = factory.createMessage();
//            soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
//            SOAPPart part = soapMessage.getSOAPPart();
//
//            SOAPEnvelope envelope = part.getEnvelope();
//            envelope.setPrefix("soapenv");
//
//            envelope.addAttribute(QName.valueOf("xmlns:soapenv"), "http://schemas.xmlsoap.org/soap/envelope/");
//
//            SOAPBody body = envelope.getBody();
//            body.setPrefix("soapenv");
//
//            SOAPElement apiResult = body.addChildElement("api:Result");
//            apiResult.addAttribute(QName.valueOf("xmlns:api"), "http://cps.huawei.com/cpsinterface/api_resultmgr");
//            apiResult.addAttribute(QName.valueOf("xmlns:res"), "http://cps.huawei.com/cpsinterface/result");
//            apiResult.addAttribute(QName.valueOf("xmlns:cus"), "http://cps.huawei.com/synccpsinterface/result");
//
//            SOAPElement resHeader = apiResult.addChildElement("Header", "res");
//            resHeader.addChildElement("Version", "res").setValue("1.0");
//            resHeader.addChildElement("OriginatorConversationID", "res").setValue("dsa");
//            resHeader.addChildElement("ConversationID", "res").setValue("asd");
//
//            SOAPElement resBody = apiResult.addChildElement("Body", "res");
//            resBody.addChildElement("ResultType", "res").setValue("type");
//            resBody.addChildElement("ResultCode", "res").setValue("code");
//            resBody.addChildElement("ResultDesc", "res").setValue("desc");
//
//            SOAPElement customizedRsult = resBody.addChildElement("CustomizedRsult", "res");
//            SOAPElement queryRecommendationPackageResult = customizedRsult.addChildElement("QueryRecommendationPackageResult","cus");
//            SOAPElement sPBundleList = queryRecommendationPackageResult.addChildElement("SPBundleList","cus");
//            SOAPElement sPBundle = sPBundleList.addChildElement("SPBundle","cus");
//
//            populateSingleData();
//            if(msisdn.equals("0812345678900")){
//
//                SOAPElement sPBundle2 = sPBundleList.addChildElement("SPBundle","cus");
//                populatemultipleData();
//                composeResultParameters(sPBundle2, mockValues);
//            }
//            composeResultParameters(sPBundle, mockValues);
//            this.outputStreamresponse = new ByteArrayOutputStream();
//            soapMessage.writeTo(this.outputStreamresponse);
//        }
//
//
//        @Override
//        public String toString() {
//            return outputStreamresponse.toString();
//        }
//    }
//
//    private class Transaction {
//        private IndosatGoodsRecommendationyMock.Request      request;
//        private IndosatGoodsRecommendationyMock.Response     response;
//        private IndosatGoodsRecommendationyMock.HttpResponse httpResponse;
//
//        public Transaction(IndosatGoodsRecommendationyMock.Request request, IndosatGoodsRecommendationyMock.Response response) {
//            this.request = request;
//            this.httpResponse = new IndosatGoodsRecommendationyMock.HttpResponse(200, "Success");
//            this.response     = response;
//        }
//    }
//
//    public IndosatGoodsRecommendationyMock.Transaction createTransaction(HttpServletRequest httpServletRequest) throws Exception {
//        IndosatGoodsRecommendationyMock.Request request = new IndosatGoodsRecommendationyMock.Request(httpServletRequest);
//        IndosatGoodsRecommendationyMock.Response response = new IndosatGoodsRecommendationyMock.Response(request);
//
//        return new IndosatGoodsRecommendationyMock.Transaction(request, response);
//    }
//
//
//    /**
//     * Main
//     *
//     * @param request
//     * @param response
//     * @return
//     * @throws Exception
//     */
//    public void action(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        try {
//            IndosatGoodsRecommendationyMock.Transaction transaction = createTransaction(request);
//
//            if (transaction.httpResponse.httpStatusCode != 200) {
//                response.setContentType("UTF-8");
//                response.setStatus(transaction.httpResponse.httpStatusCode);
//                response.getWriter().write(transaction.httpResponse.httpStatusMessage);
//                return;
//            }
//
//            String responseStr = transaction.response.toString();
//
//            response.setContentType("text/xml");
//            response.setStatus(transaction.httpResponse.httpStatusCode);
//            response.getWriter().write(responseStr);
//
//        } catch(Exception e) {
//            response.setContentType("text/plain");
//            response.setStatus(500);
//            response.getWriter().write(e.getMessage());
//        }
//    }
//
//    private String getInputString(HttpServletRequest request) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
//        String line;
//        StringBuilder sb = new StringBuilder();
//        while ((line = br.readLine()) != null) {
//            sb.append(line);
//        }
//        return sb.toString();
//    }
//}
