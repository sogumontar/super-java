/**
 * Dana.id
 * Copyright (c) 2017-2022 All Rights Reserved.
 */
package banksoal.soap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: ReadSoapResponseNewMethod.java, v 0.1 2022-10-07  22.29 Ahmad Isyfalana Amin Exp $
 */
public class ReadSoapResponseNewMethod {

    public static String FILE = "indosat_mobile_data_response.xml";

    public static String ORIGINATOR_CONVERSATION_ID = "OriginatorConversationID";
    public static String CONVERSATION_ID            = "ConversationID";
    public static String RESULT_TYPE                = "ResultType";
    public static String RESULT_CODE                = "ResultCode";
    public static String RESULT_DESC                = "ResultDesc";
    public static String TRANSACTION_ID             = "TransactionID";
    public static String AMOUNT                     = "Amount";
    public static String BALANCE                    = "Balance";


    public static void main(String[] args) throws FileNotFoundException {
        File initialFile = new File(FILE);
        InputStream targetStream = new FileInputStream(initialFile);

        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(targetStream);
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }


        Map<String, String> responseMap = new HashMap<>();

        Element resHeader = (Element) document.getElementsByTagName("res:Header").item(0);
        Element resBody   = (Element) document.getElementsByTagName("res:Body").item(0);
        Element resTransactionResult = (Element) resBody.getElementsByTagName("res:TransactionResult").item(0);
        NodeList resResultParameters = resTransactionResult.getElementsByTagName("res:ResultParameter");

        for (int i = 0; i < resResultParameters.getLength(); i++) {
            Element resultParameter = (Element) resResultParameters.item(i);
            responseMap.put(resultParameter.getElementsByTagName("com:Key").item(0).getTextContent().trim(),
                    resultParameter.getElementsByTagName("com:Value").item(0).getTextContent().trim());
        }

        responseMap.put(ORIGINATOR_CONVERSATION_ID, getText(resHeader, "res:OriginatorConversationID"));
        responseMap.put(CONVERSATION_ID,            getText(resHeader, "res:ConversationID"));
        responseMap.put(TRANSACTION_ID,             getText(resTransactionResult, "res:TransactionID"));

        responseMap.put(RESULT_TYPE, getText(resBody, "res:ResultType"));
        responseMap.put(RESULT_CODE, getText(resBody, "res:ResultCode"));
        responseMap.put(RESULT_DESC, getText(resBody, "res:ResultDesc"));

        System.out.println("OriginatorConversationID = " + getText(resHeader, "res:OriginatorConversationID"));
        System.out.println("Version                  = " + getText(resHeader, "res:Version"));
        System.out.println("ConversationID           = " + getText(resHeader, "res:ConversationID"));
        System.out.println();
        System.out.println("ResultType               = " + getText(resBody, "res:ResultType"));
        System.out.println("ResultCode               = " + getText(resBody, "res:ResultCode"));
        System.out.println("ResultDesc               = " + getText(resBody, "res:ResultDesc"));
        System.out.println();
        System.out.println("TransactionID            = " + getText(resTransactionResult, "res:TransactionID"));


        System.out.println("resResultParameters length= " + resResultParameters.getLength());

        for (int i = 0; i < resResultParameters.getLength(); i++) {
            Element resultParameter = (Element) resResultParameters.item(i);
            System.out.println("-> Node Name  : " + resultParameter.getElementsByTagName("com:Key").item(0).getTextContent().trim());
            System.out.println("   Node Value : " + resultParameter.getElementsByTagName("com:Value").item(0).getTextContent().trim());
        }

        System.out.println(responseMap);

        System.out.println(responseMap.get("Amount").replace(".", ""));

    }

    public static String getText(Element element, String tag) {

        String result;
        Node node = element.getElementsByTagName(tag).item(0);

        if (node == null) {
            result = "";
        } else {
            result = node.getTextContent();
        }

        return result;
    }
}