
package com.example.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userpools complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userpools"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://globalservice.ws.bept.ids.by/}tradeitemAddons"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userpoolsPK" type="{http://globalservice.ws.bept.ids.by/}userpoolsPK" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastmodified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="securityusers" type="{http://globalservice.ws.bept.ids.by/}securityusers" minOccurs="0"/&gt;
 *         &lt;element name="userpoolscontentCollection" type="{http://globalservice.ws.bept.ids.by/}userpoolscontent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userpools", propOrder = {
    "userpoolsPK",
    "created",
    "lastmodified",
    "securityusers",
    "userpoolscontentCollection"
})
public class Userpools
    extends TradeitemAddons
{

    protected UserpoolsPK userpoolsPK;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastmodified;
    protected Securityusers securityusers;
    @XmlElement(nillable = true)
    protected List<Userpoolscontent> userpoolscontentCollection;

    /**
     * Gets the value of the userpoolsPK property.
     * 
     * @return
     *     possible object is
     *     {@link UserpoolsPK }
     *     
     */
    public UserpoolsPK getUserpoolsPK() {
        return userpoolsPK;
    }

    /**
     * Sets the value of the userpoolsPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserpoolsPK }
     *     
     */
    public void setUserpoolsPK(UserpoolsPK value) {
        this.userpoolsPK = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastmodified() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastmodified(XMLGregorianCalendar value) {
        this.lastmodified = value;
    }

    /**
     * Gets the value of the securityusers property.
     * 
     * @return
     *     possible object is
     *     {@link Securityusers }
     *     
     */
    public Securityusers getSecurityusers() {
        return securityusers;
    }

    /**
     * Sets the value of the securityusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Securityusers }
     *     
     */
    public void setSecurityusers(Securityusers value) {
        this.securityusers = value;
    }

    /**
     * Gets the value of the userpoolscontentCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the userpoolscontentCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserpoolscontentCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Userpoolscontent }
     * 
     * 
     */
    public List<Userpoolscontent> getUserpoolscontentCollection() {
        if (userpoolscontentCollection == null) {
            userpoolscontentCollection = new ArrayList<Userpoolscontent>();
        }
        return this.userpoolscontentCollection;
    }

}
