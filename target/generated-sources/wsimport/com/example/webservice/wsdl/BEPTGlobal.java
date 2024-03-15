
package com.example.webservice.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BEPTGlobal", targetNamespace = "http://globalservice.ws.bept.ids.by/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BEPTGlobal {


    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetPartyByGLNResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPartyByGLN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetPartyByGLN")
    @ResponseWrapper(localName = "getPartyByGLNResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetPartyByGLNResponse")
    public GetPartyByGLNResp getPartyByGLN(
        @WebParam(name = "request", targetNamespace = "")
        GetPartyByGLNReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.CleanTradeitemsOfPoolByDeleteTimeResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cleanTradeitemsOfPoolByDeleteTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.CleanTradeitemsOfPoolByDeleteTime")
    @ResponseWrapper(localName = "cleanTradeitemsOfPoolByDeleteTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.CleanTradeitemsOfPoolByDeleteTimeResponse")
    public CleanTradeitemsOfPoolByDeleteTimeResp cleanTradeitemsOfPoolByDeleteTime(
        @WebParam(name = "request", targetNamespace = "")
        CleanTradeitemsOfPoolByDeleteTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetCheckGTIN29Resp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCheckGTIN29", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetCheckGTIN29")
    @ResponseWrapper(localName = "getCheckGTIN29Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetCheckGTIN29Response")
    public GetCheckGTIN29Resp getCheckGTIN29(
        @WebParam(name = "request", targetNamespace = "")
        GetCheckGTIN29Req request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetClassificatorResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClassificator", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetClassificator")
    @ResponseWrapper(localName = "getClassificatorResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetClassificatorResponse")
    public GetClassificatorResp getClassificator(
        @WebParam(name = "request", targetNamespace = "")
        GetClassificatorReq request);

    /**
     * 
     * @param request
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetCurrentTime")
    @ResponseWrapper(localName = "getCurrentTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetCurrentTimeResponse")
    public XMLGregorianCalendar getCurrentTime(
        @WebParam(name = "request", targetNamespace = "")
        String request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetFullPartyByGLNResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFullPartyByGLN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetFullPartyByGLN")
    @ResponseWrapper(localName = "getFullPartyByGLNResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetFullPartyByGLNResponse")
    public GetFullPartyByGLNResp getFullPartyByGLN(
        @WebParam(name = "request", targetNamespace = "")
        GetFullPartyByGLNReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetFunctionalnameByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFunctionalnameByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetFunctionalnameByGTIN")
    @ResponseWrapper(localName = "getFunctionalnameByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetFunctionalnameByGTINResponse")
    public GetFunctionalnameByGTINResp getFunctionalnameByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        GetFunctionalnameByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetFunctionalnameByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFunctionalnameByGTIN2", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetFunctionalnameByGTIN2")
    @ResponseWrapper(localName = "getFunctionalnameByGTIN2Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetFunctionalnameByGTIN2Response")
    public GetFunctionalnameByGTINResp getFunctionalnameByGTIN2(
        @WebParam(name = "request", targetNamespace = "")
        GetFunctionalnameByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.ApiHeaderResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOldHeaderResp", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetOldHeaderResp")
    @ResponseWrapper(localName = "getOldHeaderRespResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetOldHeaderRespResponse")
    public ApiHeaderResponse getOldHeaderResp(
        @WebParam(name = "request", targetNamespace = "")
        ApiHeaderResponse request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.Party
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOldParty", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetOldParty")
    @ResponseWrapper(localName = "getOldPartyResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetOldPartyResponse")
    public Party getOldParty(
        @WebParam(name = "request", targetNamespace = "")
        GetFullPartyByGLNReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.Tradeitem
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOldTradeitem", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetOldTradeitem")
    @ResponseWrapper(localName = "getOldTradeitemResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetOldTradeitemResponse")
    public Tradeitem getOldTradeitem(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetPartyByUNPResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPartyByUNP", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetPartyByUNP")
    @ResponseWrapper(localName = "getPartyByUNPResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetPartyByUNPResponse")
    public GetPartyByUNPResp getPartyByUNP(
        @WebParam(name = "request", targetNamespace = "")
        GetPartyByUNPReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetQuotaImportInfoResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuotaImportInfo", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetQuotaImportInfo")
    @ResponseWrapper(localName = "getQuotaImportInfoResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetQuotaImportInfoResponse")
    public GetQuotaImportInfoResp getQuotaImportInfo(
        @WebParam(name = "request", targetNamespace = "")
        GetQuotaImportInfoReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetSimpleTradeitemsByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSimpleTradeitemsByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetSimpleTradeitemsByGTIN")
    @ResponseWrapper(localName = "getSimpleTradeitemsByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetSimpleTradeitemsByGTINResponse")
    public GetSimpleTradeitemsByGTINResp getSimpleTradeitemsByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        GetSimpleTradeitemsByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetTIImageKindsByGTINsResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTIImageKindsByGTINs", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTIImageKindsByGTINs")
    @ResponseWrapper(localName = "getTIImageKindsByGTINsResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTIImageKindsByGTINsResponse")
    public GetTIImageKindsByGTINsResp getTIImageKindsByGTINs(
        @WebParam(name = "request", targetNamespace = "")
        GetTIImageKindsByGTINsReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetTradeitemByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemByGTIN")
    @ResponseWrapper(localName = "getTradeitemByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemByGTINResponse")
    public GetTradeitemByGTINResp getTradeitemByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetTradeitemsByGTINsShortResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemsByGTINsShort", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemsByGTINsShort")
    @ResponseWrapper(localName = "getTradeitemsByGTINsShortResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemsByGTINsShortResponse")
    public GetTradeitemsByGTINsShortResp getTradeitemsByGTINsShort(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemsByGTINsShortReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetTradeitemsOfPoolByModifiedTimeResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemsOfPoolByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemsOfPoolByModifiedTime")
    @ResponseWrapper(localName = "getTradeitemsOfPoolByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemsOfPoolByModifiedTimeResponse")
    public GetTradeitemsOfPoolByModifiedTimeResp getTradeitemsOfPoolByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemsOfPoolByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetVariantByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVariantByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetVariantByGTIN")
    @ResponseWrapper(localName = "getVariantByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetVariantByGTINResponse")
    public GetVariantByGTINResp getVariantByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        GetVariantByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchSimpleImportTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchGTINfromDatamarkSystemByModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchGTINfromDatamarkSystemByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchGTINfromDatamarkSystemByModifiedTime")
    @ResponseWrapper(localName = "SearchGTINfromDatamarkSystemByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchGTINfromDatamarkSystemByModifiedTimeResponse")
    public SearchSimpleImportTradeitemsByModifiedTimeResp searchGTINfromDatamarkSystemByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchSimpleImportTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchPartiesByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchPartiesByModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchPartiesByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchPartiesByModifiedTime")
    @ResponseWrapper(localName = "SearchPartiesByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchPartiesByModifiedTimeResponse")
    public SearchPartiesByModifiedTimeResp searchPartiesByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchPartiesByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchSimpleTradeitemsByModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchSimpleTradeitemsByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTime")
    @ResponseWrapper(localName = "SearchSimpleTradeitemsByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTimeResponse")
    public SearchSimpleTradeitemsByModifiedTimeResp searchSimpleTradeitemsByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchSimpleTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchSimpleTradeitemsByModifiedTime2")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchSimpleTradeitemsByModifiedTime2", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTime2")
    @ResponseWrapper(localName = "SearchSimpleTradeitemsByModifiedTime2Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTime2Response")
    public SearchSimpleTradeitemsByModifiedTimeResp searchSimpleTradeitemsByModifiedTime2(
        @WebParam(name = "request", targetNamespace = "")
        SearchSimpleTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchSimpleTradeitemsByModifiedTime3")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchSimpleTradeitemsByModifiedTime3", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTime3")
    @ResponseWrapper(localName = "SearchSimpleTradeitemsByModifiedTime3Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchSimpleTradeitemsByModifiedTime3Response")
    public SearchSimpleTradeitemsByModifiedTimeResp searchSimpleTradeitemsByModifiedTime3(
        @WebParam(name = "request", targetNamespace = "")
        SearchSimpleTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchTradeitemsByGLNResp
     */
    @WebMethod(operationName = "SearchTradeitemsByGLN")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByGLN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByGLN")
    @ResponseWrapper(localName = "SearchTradeitemsByGLNResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByGLNResponse")
    public SearchTradeitemsByGLNResp searchTradeitemsByGLN(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByGLNReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchTradeitemsByGLNAndModifiedTimeResp
     */
    @WebMethod(operationName = "SearchTradeitemsByGLNAndModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByGLNAndModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByGLNAndModifiedTime")
    @ResponseWrapper(localName = "SearchTradeitemsByGLNAndModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByGLNAndModifiedTimeResponse")
    public SearchTradeitemsByGLNAndModifiedTimeResp searchTradeitemsByGLNAndModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByGLNAndModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchTradeitemsByModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByModifiedTime")
    @ResponseWrapper(localName = "SearchTradeitemsByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByModifiedTimeResponse")
    public SearchTradeitemsByModifiedTimeResp searchTradeitemsByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchTradeitemsByNameResp
     */
    @WebMethod(operationName = "SearchTradeitemsByName")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByName", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByName")
    @ResponseWrapper(localName = "SearchTradeitemsByNameResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByNameResponse")
    public SearchTradeitemsByNameResp searchTradeitemsByName(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByNameReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchTradeitemsByOKRB007Resp
     */
    @WebMethod(operationName = "SearchTradeitemsByOKRB007")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByOKRB007", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByOKRB007")
    @ResponseWrapper(localName = "SearchTradeitemsByOKRB007Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByOKRB007Response")
    public SearchTradeitemsByOKRB007Resp searchTradeitemsByOKRB007(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByOKRB007Req request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchTradeitemsByTNVEDResp
     */
    @WebMethod(operationName = "SearchTradeitemsByTNVED")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByTNVED", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByTNVED")
    @ResponseWrapper(localName = "SearchTradeitemsByTNVEDResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchTradeitemsByTNVEDResponse")
    public SearchTradeitemsByTNVEDResp searchTradeitemsByTNVED(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByTNVEDReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetTradeitemsByGTINsResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemsByGTINs", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemsByGTINs")
    @ResponseWrapper(localName = "getTradeitemsByGTINsResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemsByGTINsResponse")
    public GetTradeitemsByGTINsResp getTradeitemsByGTINs(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemsByGTINsReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.LogoutResp
     */
    @WebMethod(operationName = "Logout")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Logout", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.Logout")
    @ResponseWrapper(localName = "LogoutResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.LogoutResponse")
    public LogoutResp logout(
        @WebParam(name = "request", targetNamespace = "")
        LogoutReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.LoginResp
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.LoginResponse")
    public LoginResp login(
        @WebParam(name = "request", targetNamespace = "")
        LoginReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.GetShortTradeitemByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemByGTINshort", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemByGTINshort")
    @ResponseWrapper(localName = "getTradeitemByGTINshortResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetTradeitemByGTINshortResponse")
    public GetShortTradeitemByGTINResp getTradeitemByGTINshort(
        @WebParam(name = "request", targetNamespace = "")
        GetShortTradeitemByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.ApiHeaderRequest
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOldHeaderReq", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetOldHeaderReq")
    @ResponseWrapper(localName = "getOldHeaderReqResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.GetOldHeaderReqResponse")
    public ApiHeaderRequest getOldHeaderReq(
        @WebParam(name = "request", targetNamespace = "")
        ApiHeaderRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.webservice.wsdl.SearchGTINfromDatamarkSystemByGTINResp
     */
    @WebMethod(operationName = "SearchGTINfromDatamarkSystemByGTIN")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchGTINfromDatamarkSystemByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchGTINfromDatamarkSystemByGTIN")
    @ResponseWrapper(localName = "SearchGTINfromDatamarkSystemByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.webservice.wsdl.SearchGTINfromDatamarkSystemByGTINResponse")
    public SearchGTINfromDatamarkSystemByGTINResp searchGTINfromDatamarkSystemByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        SearchGTINfromDatamarkSystemByGTINReq request);

}
