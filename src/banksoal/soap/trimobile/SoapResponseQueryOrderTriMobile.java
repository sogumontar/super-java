/**
 * Dana.id
 * Copyright (c) 2017-2022 All Rights Reserved.
 */
package banksoal.soap.trimobile;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: SoapCreateResponse.java, v 0.1 2022-10-06  23.44 Ahmad Isyfalana Amin Exp $
 */
public class SoapResponseQueryOrderTriMobile {

    private static Map<String, String> mockValues = new HashMap<>();
    private static Map<String, String> mockSecondValues = new HashMap<>();
    public static final String PREFIX = "res";
    public static final String PREFIX_2 = "cus";
    public static final String PREFIX_3 = "api";

    private static void populateSingleData(){
        mockValues.put("BundleId", "10031001");
        mockValues.put("BundleName", "External Bundle 1 ");
        mockValues.put("Description", "External Bundle");
        mockValues.put("BundleType", "External Bundle");
        mockValues.put("BundleProvider", "101");
        mockValues.put("IdentityType", "5000");
        mockValues.put("BeginValidityPeriod", "20230801");
        mockValues.put("ExpirationDate", "20230922");
        mockValues.put("Currency", "IDR");
        mockValues.put("ExternalPrice", "150.00");
        mockValues.put("Status", "30");
        mockValues.put("ThirdPartyCode", "1000");
        mockValues.put("ElementName", "External Element");
        mockValues.put("ElementType", "SMS Only");
        mockValues.put("ElementIdentifier", "1");
        mockValues.put("BundleCategory", "2");
    }
    private static void populatemultipleData(){
        mockSecondValues.put("BundleId", "10031001");
        mockSecondValues.put("BundleName", "External Bundle 1 ");
        mockSecondValues.put("Description", "External Bundle");
        mockSecondValues.put("BundleType", "External Bundle");
        mockSecondValues.put("BundleProvider", "101");
        mockSecondValues.put("IdentityType", "5000");
        mockSecondValues.put("BeginValidityPeriod", "20230801");
        mockSecondValues.put("ExpirationDate", "20230922");
        mockSecondValues.put("Currency", "IDR");
        mockSecondValues.put("ExternalPrice", "150.00");
        mockSecondValues.put("Status", "30");
        mockSecondValues.put("ThirdPartyCode", "1000");
        mockSecondValues.put("ElementName", "External Element");
        mockSecondValues.put("ElementType", "SMS Only");
        mockSecondValues.put("ElementIdentifier", "1");
        mockSecondValues.put("BundleCategory", "2");
    }

    public static void main(String[] args) throws SOAPException, IOException {
//        successResponse();
//        failedResponse();
//        internalErrorResponse();
        indosatSuccessResponse();
//        fix();
    }
    public static void fix()throws SOAPException, IOException {
        MessageFactory factory  = MessageFactory.newInstance();
        SOAPMessage soapMessage = factory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = soapPart.getEnvelope();

        SOAPBody soapBody = envelope.getBody();
        SOAPElement apiResult = soapBody.addChildElement("Result", PREFIX_3, "http://cps.huawei.com/synccpsinterface/api_requestmgr");

        SOAPElement header = apiResult.addChildElement("Header", PREFIX_3);
        header.setPrefix(PREFIX);

        SOAPElement version = header.addChildElement("Version", PREFIX_3);
        version.setPrefix(PREFIX);
        version.setValue("1.0");

        SOAPElement originatorConversationId = header.addChildElement("OriginatorConversationID", PREFIX_3);
        originatorConversationId.setPrefix(PREFIX);
        originatorConversationId.setValue("S_X2013012921001");


        SOAPElement conversationID = header.addChildElement("ConversationID", PREFIX_3);
        conversationID.setPrefix(PREFIX);
        conversationID.setValue("AG_20130129T102103");

        SOAPElement body = apiResult.addChildElement("Body", PREFIX_3);
        body.setPrefix(PREFIX);

        SOAPElement resultType = body.addChildElement("ResultType",PREFIX_3);
        resultType.setPrefix(PREFIX);
        resultType.setValue("0");
        SOAPElement resultCode = body.addChildElement("ResultCode",PREFIX_3);
        resultCode.setPrefix(PREFIX);
        resultCode.setValue("0");
        SOAPElement resultDesc = body.addChildElement("ResultDesc",PREFIX_3);
        resultDesc.setPrefix(PREFIX);
        resultDesc.setValue("Process service request successfully.");

        SOAPElement customizedResult = body.addChildElement("CustomizedRsult", PREFIX_3);
        customizedResult.setPrefix(PREFIX);
        SOAPElement queryRecommendationPackageResult = customizedResult.addChildElement("QueryRecommendationPackageResult", PREFIX_3);
        queryRecommendationPackageResult.setPrefix(PREFIX_2);
        SOAPElement spBundleList = queryRecommendationPackageResult.addChildElement("SPBundleList", PREFIX_3);
        spBundleList.setPrefix(PREFIX_2);

        SOAPElement spBundle = spBundleList.addChildElement("SPBundle",PREFIX_3);
        spBundle.setPrefix(PREFIX_2);

        SOAPElement bundleId = spBundle.addChildElement("BundleId", PREFIX_3);
        bundleId.setValue("10031001");
        bundleId.setPrefix(PREFIX_2);

        SOAPElement bundleName = spBundle.addChildElement("BundleName", PREFIX_3);
        bundleName.setValue("10031001");
        bundleName.setPrefix(PREFIX_2);

        SOAPElement description = spBundle.addChildElement("Description", PREFIX_3);
        description.setValue("10031001");
        description.setPrefix(PREFIX_2);

        SOAPElement bundleType = spBundle.addChildElement("BundleType", PREFIX_3);
        bundleType.setValue("10031001");
        bundleType.setPrefix(PREFIX_2);

        SOAPElement bundleProvider = spBundle.addChildElement("BundleProvider", PREFIX_3);
        bundleProvider.setValue("10031001");
        bundleProvider.setPrefix(PREFIX_2);

        SOAPElement identityType = spBundle.addChildElement("IdentityType", PREFIX_3);
        identityType.setValue("10031001");
        identityType.setPrefix(PREFIX_2);

        SOAPElement beginValidityPeriod = spBundle.addChildElement("BeginValidityPeriod", PREFIX_3);
        beginValidityPeriod.setValue("10031001");
        beginValidityPeriod.setPrefix(PREFIX_2);

        SOAPElement expirationDate = spBundle.addChildElement("ExpirationDate", PREFIX_3);
        expirationDate.setValue("10031001");
        expirationDate.setPrefix(PREFIX_2);

        SOAPElement currency = spBundle.addChildElement("Currency", PREFIX_3);
        currency.setValue("10031001");
        currency.setPrefix(PREFIX_2);

        SOAPElement externalPrice = spBundle.addChildElement("ExternalPrice", PREFIX_3);
        externalPrice.setValue("10031001");
        externalPrice.setPrefix(PREFIX_2);

        SOAPElement status = spBundle.addChildElement("Status", PREFIX_3);
        status.setValue("10031001");
        status.setPrefix(PREFIX_2);

        SOAPElement thirdPartyCode = spBundle.addChildElement("ThirdPartyCode", PREFIX_3);
        thirdPartyCode.setValue("10031001");
        thirdPartyCode.setPrefix(PREFIX_2);

        SOAPElement elementType = spBundle.addChildElement("ElementType", PREFIX_3);
        elementType.setValue("10031001");
        elementType.setPrefix(PREFIX_2);

        SOAPElement elementIdentifier = spBundle.addChildElement("ElementIdentifier", PREFIX_3);
        elementIdentifier.setValue("10031001");
        elementIdentifier.setPrefix(PREFIX_2);

        SOAPElement bundleCategory = spBundle.addChildElement("BundleCategory", PREFIX_3);
        bundleCategory.setValue("10031001");
        bundleCategory.setPrefix(PREFIX_2);

    }

    public static void indosatSuccessResponse() throws SOAPException, IOException  {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage soapMessage = factory.createMessage();
        soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
        SOAPPart part = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = part.getEnvelope();
        envelope.setPrefix("soapenv");

        envelope.addAttribute(QName.valueOf("xmlns:soapenv"), "http://schemas.xmlsoap.org/soap/envelope/");

        SOAPBody body = envelope.getBody();
        body.setPrefix("soapenv");

        SOAPElement apiResult = body.addChildElement("api:Result");
        apiResult.addAttribute(QName.valueOf("xmlns:api"), "http://cps.huawei.com/cpsinterface/api_resultmgr");
        apiResult.addAttribute(QName.valueOf("xmlns:res"), "http://cps.huawei.com/cpsinterface/result");
        apiResult.addAttribute(QName.valueOf("xmlns:cus"), "http://cps.huawei.com/synccpsinterface/result");

        SOAPElement resHeader = apiResult.addChildElement("Header", "res");
        resHeader.addChildElement("Version", "res").setValue("1.0");
        resHeader.addChildElement("OriginatorConversationID", "res").setValue("dsa");
        resHeader.addChildElement("ConversationID", "res").setValue("asd");

        SOAPElement resBody = apiResult.addChildElement("Body", "res");
        resBody.addChildElement("ResultType", "res").setValue("type");
        resBody.addChildElement("ResultCode", "res").setValue("code");
        resBody.addChildElement("ResultDesc", "res").setValue("desc");

        SOAPElement customizedRsult = resBody.addChildElement("CustomizedRsult", "res");
        SOAPElement queryRecommendationPackageResult = customizedRsult.addChildElement("QueryRecommendationPackageResult","cus");
        SOAPElement sPBundleList = queryRecommendationPackageResult.addChildElement("SPBundleList","cus");
        SOAPElement sPBundle = sPBundleList.addChildElement("SPBundle","cus");
        SOAPElement sPBundle2 = sPBundleList.addChildElement("SPBundle","cus");

        populateSingleData();
        populatemultipleData();
        composeResultParameters(sPBundle, mockValues);
        composeResultParameters(sPBundle2, mockSecondValues);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapMessage.writeTo(out);

        String validateRs = out.toString();

        System.out.println(validateRs);
    }
    private static void composeResultParameters(SOAPElement resultParameters, Map<String, String> valuesMap) throws
                                                                                                      SOAPException {
        for(String key: valuesMap.keySet()){
            SOAPElement node = resultParameters.addChildElement(key,"cus" );

            node.setValue(valuesMap.get(key));
        }
    }

    public static void successResponse() throws SOAPException, IOException  {
        MessageFactory factory  = MessageFactory.newInstance();
        SOAPMessage soapMessage = factory.createMessage();
        soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.setPrefix("SOAP-ENV");
        envelope.addAttribute(QName.valueOf("xmlns:SOAP-ENV"), "http://schemas.xmlsoap.org/soap/envelope/");

        SOAPBody soapBody = envelope.getBody();
        SOAPElement getEVCPurchaseTxnResp = soapBody.addChildElement("GetEVCPurchaseTxnResp", PREFIX, "http://www.tibco.com/schemas/HCPT_ANGIE/Shared_Resources/XML/CRM/Schema.xsd3");

        SOAPElement responseCode = getEVCPurchaseTxnResp.addChildElement("ResponseCode", PREFIX);
        responseCode.setValue("00000");
        SOAPElement responseDesc = getEVCPurchaseTxnResp.addChildElement("ResponseDesc", PREFIX);
        responseDesc.setValue("SUCCESS");

        SOAPElement transactionDetails = getEVCPurchaseTxnResp.addChildElement("TransactionDetails", PREFIX);
        transactionDetails.setPrefix("ns0");
        transactionDetails.addChildElement("MSISDN", PREFIX).setValue("895384100117");
        transactionDetails.addChildElement("TransactionDate", PREFIX).setValue("28/08/22 22:44:06");
        transactionDetails.addChildElement("TransactionId", PREFIX).setValue("R220828.2244.200014");
        transactionDetails.addChildElement("TransactionStatus", PREFIX).setValue("SUCCESS");
        transactionDetails.addChildElement("Amount", PREFIX).setValue("2000");
        transactionDetails.addChildElement("ProductId", PREFIX).setValue("2000");
        transactionDetails.addChildElement("ProductName", PREFIX).setValue("2000");
        transactionDetails.addChildElement("PaymentGWName", PREFIX).setValue("895338885367");
        transactionDetails.addChildElement("PaymentGWChannel", PREFIX).setValue("Shopee 2");
        transactionDetails.addChildElement("PaymentGWStatus", PREFIX).setValue("SUCCESS");
        transactionDetails.addChildElement("PaymentGWRefId", PREFIX).setValue("R220828.2244.200014");
        transactionDetails.addChildElement("ProductCode", PREFIX).setValue("ETOPUP");
        transactionDetails.addChildElement("ReqSource", PREFIX).setValue("ServerPlayer");
        transactionDetails.addChildElement("ReferenceId", PREFIX).setValue("227992895307");
        transactionDetails.addChildElement("InterfaceReferenceId", PREFIX).setValue("E8SM44200014");
        transactionDetails.addChildElement("RequestGatewayCode", PREFIX).setValue("SPEXTGW");
        transactionDetails.addChildElement("DenomDescription", PREFIX).setValue("Reg Bal 1000 to 2000");
        transactionDetails.addChildElement("FailureDescription", PREFIX);
        transactionDetails.addChildElement("TxnDate", PREFIX).setValue("28/08/22 22:44:06");
        transactionDetails.addChildElement("Info1", PREFIX);
        transactionDetails.addChildElement("Info2", PREFIX);
        transactionDetails.addChildElement("InterfaceStatus", PREFIX).setValue("00000");
        transactionDetails.addChildElement("SystemTraceId", PREFIX);
        transactionDetails.addChildElement("ReversalId", PREFIX);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapMessage.writeTo(out);

        String validateRs = out.toString();

        System.out.println(validateRs);
    }

    public static void failedResponse() throws SOAPException, IOException  {
        MessageFactory factory  = MessageFactory.newInstance();
        SOAPMessage soapMessage = factory.createMessage();
        soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.setPrefix("SOAP-ENV");
        envelope.addAttribute(QName.valueOf("xmlns:SOAP-ENV"), "http://schemas.xmlsoap.org/soap/envelope/");

        SOAPBody soapBody = envelope.getBody();
        SOAPElement getEVCPurchaseTxnResp = soapBody.addChildElement("GetEVCPurchaseTxnResp", PREFIX, "http://www.tibco.com/schemas/HCPT_ANGIE/Shared_Resources/XML/CRM/Schema.xsd3");

        SOAPElement responseCode = getEVCPurchaseTxnResp.addChildElement("ResponseCode", PREFIX);
        responseCode.setValue("44444");
        SOAPElement responseDesc = getEVCPurchaseTxnResp.addChildElement("ResponseDesc", PREFIX);
        responseDesc.setValue("Transaction ID not found");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapMessage.writeTo(out);

        String validateRs = out.toString();

//        System.out.println(prettyPrintByTransformer(validateRs, 3, false));
        System.out.println(validateRs);
    }

    public static void internalErrorResponse() throws SOAPException, IOException  {
        MessageFactory factory  = MessageFactory.newInstance();
        SOAPMessage soapMessage = factory.createMessage();
        soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.setPrefix("SOAP-ENV");
        envelope.addAttribute(QName.valueOf("xmlns:SOAP-ENV"), "http://schemas.xmlsoap.org/soap/envelope/");

        SOAPBody soapBody = envelope.getBody();
        SOAPElement fault = soapBody.addChildElement("Fault", "SOAP-ENV");

        fault.addChildElement("faultcode").setValue("SOAP-ENV:Server");
        fault.addChildElement("faultstring").setValue("Internal Error");
        SOAPElement detail = fault.addChildElement("detail");
        SOAPElement data   = detail.addChildElement("Data");

        SOAPElement getEVCPurchaseTxnReq = data.addChildElement("GetEVCPurchaseTxnReq", "ns0", "http://xmlns.example.com/1414055361784");

        SOAPElement request = getEVCPurchaseTxnReq.addChildElement("Request");
        SOAPElement schGetEVCPurchaseTxnReq = request.addChildElement("GetEVCPurchaseTxnReq", "sch", "http://www.tibco.com/schemas/HCPT_ANGIE/Shared_Resources/XML/CRM/Schema.xsd3");
        schGetEVCPurchaseTxnReq.addAttribute(QName.valueOf("xmlns:soapenv"), "http://schemas.xmlsoap.org/soap/envelope/");
        String PREFIX_SCH = "sch";
        schGetEVCPurchaseTxnReq.addChildElement("KeyId", PREFIX_SCH);
        schGetEVCPurchaseTxnReq.addChildElement("ExtTxnId", PREFIX_SCH).setValue("EVC_82");
        schGetEVCPurchaseTxnReq.addChildElement("Source", PREFIX_SCH).setValue("ServerPlayer");
        schGetEVCPurchaseTxnReq.addChildElement("FromDate", PREFIX_SCH).setValue("01/08/2022");
        schGetEVCPurchaseTxnReq.addChildElement("ToDate", PREFIX_SCH).setValue("23/08/2022");
        schGetEVCPurchaseTxnReq.addChildElement("MSISDN", PREFIX_SCH).setValue("089688048550");
        schGetEVCPurchaseTxnReq.addChildElement("RETAILERMSISDN", PREFIX_SCH);


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapMessage.writeTo(out);

        String validateRs = out.toString();

//        System.out.println(prettyPrintByTransformer(validateRs, 3, false));
        System.out.println(validateRs);
    }

    public static String prettyPrintByTransformer(String xmlString, int indent, boolean ignoreDeclaration) {

        try {
            InputSource src = new InputSource(new StringReader(xmlString));
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", indent);
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, ignoreDeclaration ? "yes" : "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            Writer out = new StringWriter();
            transformer.transform(new DOMSource(document), new StreamResult(out));
            return out.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error occurs when pretty-printing xml:\n" + xmlString, e);
        }
    }
}