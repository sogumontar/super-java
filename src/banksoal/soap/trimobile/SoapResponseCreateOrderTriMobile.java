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
import javax.xml.soap.SOAPHeader;
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

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: SoapCreateResponse.java, v 0.1 2022-10-06  23.44 Ahmad Isyfalana Amin Exp $
 */
public class SoapResponseCreateOrderTriMobile {

    public static final String PREFIX = "";

    public static final String SOAP_PREFIX = "soapenv";

    public static void main(String[] args) throws SOAPException, IOException {
//        successResponse();
//        failedResponse();
//        internalErrorResponse();

        System.out.println(prettyPrintByTransformer(successResponse(), 3, false));
    }


    public static String successResponse() throws SOAPException, IOException  {
        MessageFactory factory  = MessageFactory.newInstance();
        SOAPMessage soapMessage = factory.createMessage();
        soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");

        SOAPHeader   soapHeader = soapMessage.getSOAPHeader();
        SOAPBody     soapBody   = soapMessage.getSOAPBody();
        SOAPPart     soapPart   = soapMessage.getSOAPPart();
        SOAPEnvelope envelope   = soapPart.getEnvelope();

        // Change Prefix
        envelope.removeNamespaceDeclaration(envelope.getPrefix());
        envelope.setPrefix(SOAP_PREFIX);
        soapHeader.setPrefix(SOAP_PREFIX);
        soapBody.setPrefix(SOAP_PREFIX);


        envelope.addNamespaceDeclaration(SOAP_PREFIX, "http://schemas.xmlsoap.org/soap/envelope/");
//        envelope.setPrefix("SOAP-ENV");
//        envelope.addAttribute(QName.valueOf("xmlns:SOAP-ENV"), "http://schemas.xmlsoap.org/soap/envelope/");




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

        return out.toString();
    }


    public static String failedResponse() throws SOAPException, IOException  {
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

        return out.toString();
    }

    public static String internalErrorResponse() throws SOAPException, IOException  {
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

        return out.toString();
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