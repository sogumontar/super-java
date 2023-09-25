/**
 * Dana.id
 * Copyright (c) 2017-2022 All Rights Reserved.
 */
package banksoal.soap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: SoapReadRequestForMock2.java, v 0.1 2022-10-18  09.04 Ahmad Isyfalana Amin Exp $
 */
public class SoapReadRequestForMock2 {
    public static String FILE;
    private static Map<String, String> httpResponseCodeMap = new HashMap(){{
        put("1", "1");
    }};

    static {
        FILE = "soap_request.xml";
    }

    public static void main(String[] args) throws FileNotFoundException {
        File initialFile = new File(FILE);
        InputStream targetStream = new FileInputStream(initialFile);

        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(targetStream);
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }

        Map<String, String> requestMap = new HashMap<>();

        Element reqHeader = (Element) document.getElementsByTagName("req:Header").item(0);
        Element reqBody   = (Element) document.getElementsByTagName("req:Body").item(0);

        System.out.println(reqHeader.getElementsByTagName("req:OriginatorConversationID").item(0).getTextContent());

        Element reqTransactionRequest = (Element) reqBody.getElementsByTagName("req:TransactionRequest").item(0);
        NodeList reqParameters = reqTransactionRequest.getElementsByTagName("req:Parameter");

        for (int i = 0; i < reqParameters.getLength(); i++) {
            Element reqParameter = (Element) reqParameters.item(i);
            requestMap.put(reqParameter.getElementsByTagName("com:Key").item(0).getTextContent().trim(),
                    reqParameter.getElementsByTagName("com:Value").item(0).getTextContent().trim());
        }

        System.out.println(reqParameters.getLength());
        System.out.println(requestMap);
    }
}