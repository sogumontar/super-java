/**
 * Dana.id
 * Copyright (c) 2017-2022 All Rights Reserved.
 */
package banksoal.soap.trimobile;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmad Isyfalana Amin
 * @version $Id: SoapReadRequestForMock2.java, v 0.1 2022-10-18  09.04 Ahmad Isyfalana Amin Exp $
 */
public class SoapRequestForMockTriMobile {
    public static String FILE;
    private static Map<String, String> httpResponseCodeMap = new HashMap(){{
        put("1", "1");
    }};

    static {
        FILE = "soap_request_query_order_tri.xml";
    }

    public static void main(String[] args) throws FileNotFoundException {
//        File initialFile = new File(FILE);
//        InputStream targetStream = new FileInputStream(initialFile);
//
//        Document document = null;
//        try {
//            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(targetStream);
//        } catch (SAXException | IOException | ParserConfigurationException e) {
//            e.printStackTrace();
//        }

        // Read from string
        String xmlStringRequest = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sch=\"http://www.tibco.com/schemas/HCPT_ANGIE/Shared_Resources/XML/CRM/Schema.xsd3\"><soapenv:Header/><soapenv:Body><sch:GetEVCPurchaseTxnReq><sch:KeyId></sch:KeyId><sch:ExtTxnId>227992895307</sch:ExtTxnId><sch:Source>ServerPlayer</sch:Source><sch:FromDate>19/8/2022</sch:FromDate><sch:ToDate>19/9/2022</sch:ToDate><sch:MSISDN>62895384100117</sch:MSISDN><sch:RETAILERMSISDN></sch:RETAILERMSISDN></sch:GetEVCPurchaseTxnReq></soapenv:Body></soapenv:Envelope>";
        String xmlString2nd = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sch=\"http://www.tibco.com/schemas/HCPT_ANGIEShared_Resources/XML/CRM/Schema.xsd3\"><soapenv:Header/><soapenv:Body><sch:GetEVCPurchaseTxnReq><sch:KeyId></sch:KeyId><sch:ExtTxnId>227992895307</sch:ExtTxnId><sch:Source>ServerPlayer</sch:Source><sch:FromDate>19/8/2022</sch:FromDate><sch:ToDate>19/9/2022</sch:ToDate><sch:MSISDN>62895384100117</sch:MSISDN><sch:RETAILERMSISDN></sch:RETAILERMSISDN></sch:GetEVCPurchaseTxnReq><req:ExtentedRequest><cus:QueryRecommendationPackageRequest><cus:MSISDN>6282728212123</cus:MSISDN></cus:QueryRecommendationPackageRequest></req:ExtentedRequest></soapenv:Body></soapenv:Envelope>";
        String xmlString3nd = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://cps.huawei.com/synccpsinterface/api_requestmgr\" xmlns:req=\"http://cps.huawei.com/synccpsinterface/request\" xmlns:com=\"http://cps.huawei.com/synccpsinterface/common\" xmlns:cus=\"http://cps.huawei.com/cpsinterface/customizedrequest\"\t> <soapenv:Header/><soapenv:Body><api:Request><req:Header><req:Version>1.0</req:Version><req:CommandID>QueryRecommendationPackage</req:CommandID><req:Caller><req:CallerType>2</req:CallerType><req:ThirdPartyID>test</req:ThirdPartyID><req:Password>gMMqGGrKxsE=</req:Password><req:ResultURL>http://10.66.53.77:8088/mockAPIResultMgrBinding</req:ResultURL></req:Caller><req:KeyOwner>1</req:KeyOwner><req:Timestamp>20160101010102</req:Timestamp></req:Header><req:Body><req:Identity><req:Initiator><req:IdentifierType>12</req:IdentifierType><req:Identifier>app01</req:Identifier><req:SecurityCredential>kMhIAmNE4h8=</req:SecurityCredential><req:ShortCode>Dapp111</req:ShortCode></req:Initiator></req:Identity><req:ExtentedRequest><cus:QueryRecommendationPackageRequest><cus:MSISDN>hendra</cus:MSISDN></cus:QueryRecommendationPackageRequest></req:ExtentedRequest></req:Body></api:Request></soapenv:Body></soapenv:Envelope> \n";

        Document document = null;
        Document documentt = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(xmlStringRequest.getBytes(StandardCharsets.UTF_8)));
            documentt = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(xmlString3nd.getBytes(StandardCharsets.UTF_8)));
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }

        Map<String, String> requestMap = new HashMap<>();

        String KeyId          = document.getElementsByTagName("sch:KeyId").item(0).getTextContent().trim();
        String ExtTxnId       = document.getElementsByTagName("sch:ExtTxnId").item(0).getTextContent().trim();
        String Source         = document.getElementsByTagName("sch:Source").item(0).getTextContent().trim();
        String FromDate       = document.getElementsByTagName("sch:FromDate").item(0).getTextContent().trim();
        String ToDate         = document.getElementsByTagName("sch:ToDate").item(0).getTextContent().trim();
        String MSISDN         = document.getElementsByTagName("sch:MSISDN").item(0).getTextContent().trim();
        String RETAILERMSISDN = document.getElementsByTagName("sch:RETAILERMSISDN").item(0).getTextContent().trim();

        String mssidnd = documentt.getElementsByTagName("cus:MSISDN").item(0).getTextContent().trim();
        requestMap.put("KeyId", KeyId);
        requestMap.put("ExtTxnId", ExtTxnId);
        requestMap.put("Source", Source);
        requestMap.put("FromDate", FromDate);
        requestMap.put("ToDate", ToDate);
        requestMap.put("MSISDN", MSISDN);
        requestMap.put("RETAILERMSISDN", RETAILERMSISDN);

        System.out.println(mssidnd);
        System.out.println(requestMap);

    }
}