/**
 * Dana.id
 * Copyright (c) 2017-2023 All Rights Reserved.
 */
package banksoal.soap.trimobile.readresponse;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: TriQueryOrderResponseParser.java, v 0.1 2023-07-03  10.14 Ahmad Isyfalana Amin Exp $
 */
public class TriQueryOrderResponseParser {

    public static final String SUCCESS_RESPONSE_CODE = "00000";

    public static void main(String[] args) {
        String successResponseQueryOrder       = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"><SOAP-ENV:Body><ns0:GetEVCPurchaseTxnResp xmlns:ns0=\"http://www.tibco.com/schemas/HCPT_ANGIE/Shared_Resources/XML/CRM/Schema.xsd3\"><ns0:ResponseCode>00000</ns0:ResponseCode><ns0:ResponseDesc>SUCCESS</ns0:ResponseDesc><ns0:TransactionDetails><ns0:MSISDN>895384100117</ns0:MSISDN><ns0:TransactionDate>28/08/22 22:44:06</ns0:TransactionDate><ns0:TransactionId>R220828.2244.200014</ns0:TransactionId><ns0:TransactionStatus>SUCCESS</ns0:TransactionStatus><ns0:Amount>2000</ns0:Amount><ns0:ProductId>2000</ns0:ProductId><ns0:ProductName>2000</ns0:ProductName><ns0:PaymentGWName>895338885367</ns0:PaymentGWName><ns0:PaymentGWChannel>Shopee 2</ns0:PaymentGWChannel><ns0:PaymentGWStatus>SUCCESS</ns0:PaymentGWStatus><ns0:PaymentGWRefId>R220828.2244.200014</ns0:PaymentGWRefId><ns0:ProductCode>ETOPUP</ns0:ProductCode><ns0:ReqSource>ServerPlayer</ns0:ReqSource><ns0:ReferenceId>227992895307</ns0:ReferenceId><ns0:InterfaceReferenceId>E8SM44200014</ns0:InterfaceReferenceId><ns0:RequestGatewayCode>SPEXTGW</ns0:RequestGatewayCode><ns0:DenomDescription>Reg Bal 1000 to 2000</ns0:DenomDescription><ns0:FailureDescription/><ns0:TxnDate>28/08/22 22:44:06</ns0:TxnDate><ns0:Info1/><ns0:Info2/><ns0:InterfaceStatus>00000</ns0:InterfaceStatus><ns0:SystemTraceId/><ns0:ReversalId/></ns0:TransactionDetails></ns0:GetEVCPurchaseTxnResp></SOAP-ENV:Body></SOAP-ENV:Envelope>";
        String failedResponseQueryOrder        = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"><SOAP-ENV:Body><ns0:GetEVCPurchaseTxnResp xmlns:ns0=\"http://www.tibco.com/schemas/HCPT_ANGIE/Shared_Resources/XML/CRM/Schema.xsd3\"><ns0:ResponseCode>44444</ns0:ResponseCode><ns0:ResponseDesc>Transaction ID not found</ns0:ResponseDesc></ns0:GetEVCPurchaseTxnResp></SOAP-ENV:Body></SOAP-ENV:Envelope>";
        String internalErrorResponseQueryOrder = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"><SOAP-ENV:Body><SOAP-ENV:Fault><faultcode>SOAP-ENV:Server</faultcode><faultstring>Internal Error</faultstring><detail><Data><ns0:GetEVCPurchaseTxnReq xmlns:ns0=\"http://xmlns.example.com/1414055361784\"><Request><sch:GetEVCPurchaseTxnReq xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sch=\"http://www.tibco.com/schemas/HCPT_ANGIE/Shared_Resources/XML/CRM/Schema.xsd3\"><sch:KeyId/><sch:ExtTxnId>EVC_82</sch:ExtTxnId><sch:Source>ServerPlayer</sch:Source><sch:FromDate>01/08/2022</sch:FromDate><sch:ToDate>23/08/2022</sch:ToDate><sch:MSISDN>089688048550</sch:MSISDN><sch:RETAILERMSISDN/></sch:GetEVCPurchaseTxnReq></Request></ns0:GetEVCPurchaseTxnReq></Data></detail></SOAP-ENV:Fault></SOAP-ENV:Body></SOAP-ENV:Envelope>";

        try {
            parse(internalErrorResponseQueryOrder);
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void parse(String text) throws SOAPException, IOException {
        Map<String, String> responseMap = new HashMap<String, String>();

        InputStream inputStream = new ByteArrayInputStream(text.getBytes());
        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage(null, inputStream);
        SOAPPart part           = soapMessage.getSOAPPart();
        SOAPEnvelope envelope   = part.getEnvelope();
        SOAPBody soapBody       = envelope.getBody();


        // Handle Internal Error Response
        SOAPFault soapFault = soapMessage.getSOAPBody().getFault();
        if (soapFault != null) {
            System.out.println(soapFault.getFaultCode());
            System.out.println(soapFault.getFaultString());
            return;
        }

        String responseCode = soapBody.getElementsByTagName("ns0:ResponseCode").item(0).getTextContent();
        String responseDesc = soapBody.getElementsByTagName("ns0:ResponseDesc").item(0).getTextContent();


        // Handle Failed Response
        if (!SUCCESS_RESPONSE_CODE.equals(responseCode)) {
            System.out.println(responseCode);
            System.out.println(responseDesc);
            return;
        }

        // Handle Success Response
        if (SUCCESS_RESPONSE_CODE.equals(responseCode)) {
            NodeList transactionDetails = soapBody.getElementsByTagName("ns0:TransactionDetails").item(0).getChildNodes();

            System.out.println(transactionDetails.getLength());

            for (int i = 0; i < transactionDetails.getLength(); i++) {
                Node item = transactionDetails.item(i);
                responseMap.put(item.getLocalName(), item.getTextContent());
            }
            System.out.println(responseCode);
            System.out.println(responseDesc);
            System.out.println();
            System.out.println(responseMap);
        }



//        NodeList invokeReturn   = transactionDetails.item(0).getChildNodes();
//        NodeList values         = invokeReturn.item(0).getChildNodes();
//
//        for (int i = 0; i < values.getLength(); i++) {
//            NodeList item = values.item(i).getChildNodes();
//            responseMap.put(item.item(0).getTextContent(), item.item(1).getTextContent());
//        }


    }

}