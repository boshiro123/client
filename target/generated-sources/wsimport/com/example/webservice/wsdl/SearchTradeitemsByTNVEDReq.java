
package com.example.webservice.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchTradeitemsByTNVEDReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchTradeitemsByTNVEDReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderRequest" minOccurs="0"/&gt;
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startRecord" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tnvedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchTradeitemsByTNVEDReq", propOrder = {
    "header",
    "recordCount",
    "startRecord",
    "tnvedCode"
})
public class SearchTradeitemsByTNVEDReq {

    protected ApiHeaderRequest header;
    protected int recordCount;
    protected int startRecord;
    protected String tnvedCode;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ApiHeaderRequest }
     *     
     */
    public ApiHeaderRequest getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiHeaderRequest }
     *     
     */
    public void setHeader(ApiHeaderRequest value) {
        this.header = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the startRecord property.
     * 
     */
    public int getStartRecord() {
        return startRecord;
    }

    /**
     * Sets the value of the startRecord property.
     * 
     */
    public void setStartRecord(int value) {
        this.startRecord = value;
    }

    /**
     * Gets the value of the tnvedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnvedCode() {
        return tnvedCode;
    }

    /**
     * Sets the value of the tnvedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnvedCode(String value) {
        this.tnvedCode = value;
    }

}
