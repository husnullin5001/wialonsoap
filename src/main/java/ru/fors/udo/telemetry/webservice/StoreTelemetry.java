//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.20 at 05:37:34 PM EEST 
//


package ru.fors.udo.telemetry.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeTelemetry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeTelemetry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="telemetry" type="{http://webservice.telemetry.udo.fors.ru/}telemetryBa" minOccurs="0"/&gt;
 *         &lt;element name="telemetryDetails" type="{http://webservice.telemetry.udo.fors.ru/}telemetryDetailBa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeTelemetry", propOrder = {
    "telemetry",
    "telemetryDetails"
})
public class StoreTelemetry {

    protected TelemetryBa telemetry;
    protected List<TelemetryDetailBa> telemetryDetails;

    /**
     * Gets the value of the telemetry property.
     * 
     * @return
     *     possible object is
     *     {@link TelemetryBa }
     *     
     */
    public TelemetryBa getTelemetry() {
        return telemetry;
    }

    /**
     * Sets the value of the telemetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelemetryBa }
     *     
     */
    public void setTelemetry(TelemetryBa value) {
        this.telemetry = value;
    }

    /**
     * Gets the value of the telemetryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telemetryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelemetryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelemetryDetailBa }
     * 
     * 
     */
    public List<TelemetryDetailBa> getTelemetryDetails() {
        if (telemetryDetails == null) {
            telemetryDetails = new ArrayList<TelemetryDetailBa>();
        }
        return this.telemetryDetails;
    }

}
