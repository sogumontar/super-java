/**
 * Dana.id
 * Copyright (c) 2017-2022 All Rights Reserved.
 */
package banksoal.soap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: SoapReadResponse.java, v 0.1 2022-10-07  21.37 Ahmad Isyfalana Amin Exp $
 */
public class SoapReadResponse {
    public static String FILE = "indosat_mobile_data_response.xml";

    public static void main(String[] args) throws IOException, SOAPException {
        File initialFile = new File(FILE);
        InputStream targetStream = new FileInputStream(initialFile);

        // ---------

        Map<String, String> responseMap = new HashMap<String, String>();

//        InputStream inputStream = new ByteArrayInputStream(targetStream);
        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage(null, targetStream);
        SOAPPart part           = soapMessage.getSOAPPart();
        SOAPEnvelope envelope   = part.getEnvelope();
        SOAPBody soapBody       = envelope.getBody();

        NodeList apiRequest     = soapBody.getElementsByTagName("api:Result").item(0).getChildNodes();
        NodeList resHeader      = apiRequest.item(0).getChildNodes();
        NodeList resBody        = apiRequest.item(1).getChildNodes();

        // Extract res:Header
        String originatorConversationID  = resHeader.item(1).getTextContent();
        String conversationID            = resHeader.item(2).getTextContent();

        System.out.println("Header");
        System.out.println(originatorConversationID);
        System.out.println(conversationID);

        System.out.println("\nBody");

        // Extract res:Body
        String resultType            = resBody.item(0).getTextContent();
        String resultCode            = resBody.item(1).getTextContent();
        String resultDesc            = resBody.item(2).getTextContent();

        NodeList transactionResult = resBody.item(3).getChildNodes();
        String transactionID = transactionResult.item(0).getFirstChild().getTextContent();

        NodeList resultParameters = transactionResult.item(1).getChildNodes();
        String amount  = resultParameters.item(0).getLastChild().getFirstChild().getNodeValue();
        String balance = resultParameters.item(1).getLastChild().getFirstChild().getNodeValue();

        System.out.println(resultType);
        System.out.println(resultCode);
        System.out.println(resultDesc);
        System.out.println(transactionID);
        System.out.println(amount);
        System.out.println(balance);

    }


}