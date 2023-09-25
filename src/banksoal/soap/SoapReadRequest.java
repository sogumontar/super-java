/**
 * Dana.id
 * Copyright (c) 2017-2022 All Rights Reserved.
 */
package banksoal.soap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: SoapReadRequest.java, v 0.1 2022-10-06  22.07 Ahmad Isyfalana Amin Exp $
 */
public class SoapReadRequest {

    public static String FILE;
    private static Map<String, String> httpResponseCodeMap = new HashMap(){{
        put("1", "1");
    }};

    static {
        FILE = "soap_request.xml";
    }

    public static void main(String[] args) throws IOException, SOAPException {
        File initialFile = new File(FILE);
        InputStream targetStream = new FileInputStream(initialFile);

        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage(new MimeHeaders(), targetStream);
        SOAPPart part           = soapMessage.getSOAPPart();
        SOAPEnvelope envelope   = part.getEnvelope();
        SOAPBody soapBody       = envelope.getBody();

        NodeList apiRequest = soapBody.getElementsByTagName("api:Request").item(0).getChildNodes();
        NodeList reqHeader  = apiRequest.item(0).getChildNodes();
        NodeList reqBody    = apiRequest.item(1).getChildNodes();

        //  req:Body => req:TransactionRequest => <req:Parameters> => <req:Parameter> -> <com:Value>
        String msisdn       = reqBody.item(1).getFirstChild().getFirstChild().getLastChild().getTextContent();
        String packageCode  = reqBody.item(1).getFirstChild().getLastChild().getLastChild().getTextContent();



        System.out.println(msisdn);
        System.out.println(packageCode);

        String name = null;

//        if (name == null || name.isEmpty()) {
//            throw new IllegalArgumentException("name is empty");
//        }
    }

    @Override
    public String toString() {
        return "SoapReadRequest{}";
    }
}