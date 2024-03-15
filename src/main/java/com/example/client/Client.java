package com.example.client;

import com.example.webservice.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Client extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(Client.class);

    public SearchPartiesByModifiedTimeResp SearchPartiesByModifiedTime(ApiHeaderRequest header,
                                                                       Date fromDate,
                                                                       Date toDate,
                                                                       Integer recordCount,
                                                                       Integer startRecord){
        SearchPartiesByModifiedTimeReq request = new SearchPartiesByModifiedTimeReq();
        request.setHeader(header);
        request.setFromDate(convertDateToXMLGregorianCalendar(fromDate));
        request.setToDate(convertDateToXMLGregorianCalendar(toDate));
        request.setRecordCount(recordCount);
        request.setStartRecord(startRecord);
        SearchPartiesByModifiedTimeResp responce = (SearchPartiesByModifiedTimeResp) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.epass.by:80/BEPTGlobalService",request,
                        new SoapActionCallback("http://globalservice.ws.bept.ids.by/SearchPartiesByModifiedTimeReq"));
        return responce;
    }
    public SearchSimpleTradeitemsByModifiedTime3Response SearchSimpleTradeitemsByModifiedTime3(ApiHeaderRequest header,
                                                                       Date fromDate,
                                                                       Date toDate,
                                                                       Integer recordCount,
                                                                       Integer startRecord){
        SearchSimpleTradeitemsByModifiedTimeReq request = new SearchSimpleTradeitemsByModifiedTimeReq();
        request.setHeader(header);
        request.setFromDate(convertDateToXMLGregorianCalendar(fromDate));
        request.setToDate(convertDateToXMLGregorianCalendar(toDate));
        request.setRecordCount(recordCount);
        request.setStartRecord(startRecord);
        SearchSimpleTradeitemsByModifiedTime3Response responce = (SearchSimpleTradeitemsByModifiedTime3Response) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.epass.by:80/BEPTGlobalService",request,
                        new SoapActionCallback("http://globalservice.ws.bept.ids.by/SearchSimpleTradeitemsByModifiedTime3"));
        return responce;
    }

    public GetFullPartyByGLNResp getFullPartyByGLN(ApiHeaderRequest header, Long gln){
        GetFullPartyByGLNReq request = new GetFullPartyByGLNReq();
        request.setHeader(header);
        request.setGln(gln);
        GetFullPartyByGLNResp responce = (GetFullPartyByGLNResp) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.epass.by:80/BEPTGlobalService",request,
                        new SoapActionCallback("http://globalservice.ws.bept.ids.by/getFullPartyByGLN"));
        return responce;
    }

    public LoginResp Login(String username, String password){
        LoginReq request = new LoginReq();
        request.setUsername(username);
        request.setPassword(password);
        LoginResp responce = (LoginResp) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.epass.by:80/BEPTGlobalService",request,
                        new SoapActionCallback("http://globalservice.ws.bept.ids.by/Login"));
        return responce;
    }


        public static XMLGregorianCalendar convertDateToXMLGregorianCalendar(Date date) {
            try {
                GregorianCalendar calendar = new GregorianCalendar();
                calendar.setTime(date);
                return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
                // Обработка ошибки конвертации
            }
            return null;
        }
}
