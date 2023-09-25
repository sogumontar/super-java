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

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: SoapCreateResponse.java, v 0.1 2022-10-06  23.44 Ahmad Isyfalana Amin Exp $
 */
public class SoapResponseCreateOrderTriMobile2 {

    public static final String PREFIX = "ns0";

    public static final String SOAP_PREFIX = "soapenv";

    public static void main(String[] args) throws SOAPException, IOException {
//        System.out.println(successResponse());
        System.out.println(failedResponse());
//        internalErrorResponse();

//        System.out.println(prettyPrintByTransformer(successResponse(), 3, false));

    }


    public static String successResponse() throws SOAPException, IOException  {
        MessageFactory factory  = MessageFactory.newInstance();
        SOAPMessage soapMessage = factory.createMessage();
        soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.setPrefix("SOAP-ENV");
        envelope.addAttribute(QName.valueOf("xmlns:SOAP-ENV"), "http://schemas.xmlsoap.org/soap/envelope/");

        SOAPBody soapBody = envelope.getBody();

        SOAPElement prepaidRechargeResultMsg = soapBody.addChildElement("PrepaidRechargeResultMsg", "ns0", "http://www.huawei.com/evcinterface/portalmgrmsg");

        String URL_NS1 = "http://www.huawei.com/evcinterface/common";
        SOAPElement resultHeader = prepaidRechargeResultMsg.addChildElement("ResultHeader");
        resultHeader.addChildElement("CommandId", "ns1", URL_NS1).setValue("PrepaidRecharge");
        resultHeader.addChildElement("ResultCode", "ns1", URL_NS1).setValue("0");
        resultHeader.addChildElement("SerialNo", "ns1", URL_NS1).setValue("NG220910121960");
        resultHeader.addChildElement("ResultDesc", "ns1", URL_NS1).setValue("Operation successfully.");

        SOAPElement prepaidRechargeResult = prepaidRechargeResultMsg.addChildElement("PrepaidRechargeResult");
        prepaidRechargeResult.addChildElement("TransactionID", "ns1", "http://www.huawei.com/evcinterface/portalmgr").setValue("1218161622100067");

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

        SOAPElement prepaidRechargeResultMsg = soapBody.addChildElement("PrepaidRechargeResultMsg", "ns0", "http://www.huawei.com/evcinterface/portalmgrmsg");

        String URL_NS1 = "http://www.huawei.com/evcinterface/common";
        SOAPElement resultHeader = prepaidRechargeResultMsg.addChildElement("ResultHeader");
        resultHeader.addChildElement("CommandId", "ns1", URL_NS1).setValue("PrepaidRecharge");
        resultHeader.addChildElement("ResultCode", "ns1", URL_NS1).setValue("2003");
        resultHeader.addChildElement("SerialNo", "ns1", URL_NS1).setValue("238439395");
        resultHeader.addChildElement("ResultDesc", "ns1", URL_NS1).setValue("Sender MSISDN is barred from using the system");

        SOAPElement prepaidRechargeResult = prepaidRechargeResultMsg.addChildElement("PrepaidRechargeResult");
        prepaidRechargeResult.addChildElement("TransactionID", "ns1", "http://www.huawei.com/evcinterface/portalmgr").setValue("");

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