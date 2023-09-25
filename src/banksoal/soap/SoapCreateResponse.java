/**
 * Dana.id
 * Copyright (c) 2017-2022 All Rights Reserved.
 */
package banksoal.soap;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: SoapCreateResponse.java, v 0.1 2022-10-06  23.44 Ahmad Isyfalana Amin Exp $
 */
public class SoapCreateResponse {
    public static void main(String[] args) throws SOAPException, IOException {
        UUID.randomUUID().toString();

        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage soapMessage = factory.createMessage();
        soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION, "true");
        SOAPPart part = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = part.getEnvelope();
        envelope.setPrefix("soapenv");

        envelope.addAttribute(QName.valueOf("xmlns:soapenv"), "http://schemas.xmlsoap.org/soap/envelope/");
        envelope.addAttribute(QName.valueOf("xmlns:api"), "http://cps.huawei.com/cpsinterface/api_resultmgr");
        envelope.addAttribute(QName.valueOf("xmlns:res"), "http://cps.huawei.com/cpsinterface/result");
        envelope.addAttribute(QName.valueOf("xmlns:com"), "http://cps.huawei.com/cpsinterface/common");
        envelope.addAttribute(QName.valueOf("xmlns:MobileAgentAPI"), "urn:openApi");

        // SOAPHeader header = envelope.getHeader();
        // header.setPrefix("soapenv");

        SOAPBody body = envelope.getBody();
        body.setPrefix("soapenv");

        SOAPElement apiResult = body.addChildElement("api:Result");

        SOAPElement resHeader = apiResult.addChildElement("Header", "res");
        resHeader.addChildElement("Version", "res").setValue("1.0");
        resHeader.addChildElement("OriginatorConversationID", "res").setValue("1.0");
        resHeader.addChildElement("ConversationID", "res").setValue("1.0");

        SOAPElement resBody = apiResult.addChildElement("Body", "res");
        resBody.addChildElement("ResultType", "res").setValue("0");
        resBody.addChildElement("ResultCode", "res").setValue("0");
        resBody.addChildElement("ResultDesc", "res").setValue("Process service request successfully.");

        SOAPElement transactionResult = resBody.addChildElement("TransactionResult", "res");
        transactionResult.addChildElement("TransactionID", "res").setValue("02000000000001234567");

        SOAPElement resultParameters = transactionResult.addChildElement("ResultParameters", "res");
        SOAPElement resultParameter1 = resultParameters.addChildElement("ResultParameter", "res");
        resultParameter1.addChildElement("Key", "com").setValue("Balance");
        resultParameter1.addChildElement("Value", "com").setValue("943250.00");

        SOAPElement resultParameter2 = resultParameters.addChildElement("ResultParameter", "res");
        resultParameter2.addChildElement("Key", "com").setValue("Amount");
        resultParameter2.addChildElement("Value", "com").setValue("5000.00");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapMessage.writeTo(out);

        String validateRs = out.toString();

        System.out.println(validateRs);
    }
}