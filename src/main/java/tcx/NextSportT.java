//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.05.12 um 07:36:01 PM CEST 
//


package tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NextSport_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NextSport_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transition" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityLap_t" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Activity_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextSport_t", propOrder = {
    "transition",
    "activity"
})
public class NextSportT {

    @XmlElement(name = "Transition")
    protected ActivityLapT transition;
    @XmlElement(name = "Activity", required = true)
    protected ActivityT activity;

    /**
     * Ruft den Wert der transition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLapT }
     *     
     */
    public ActivityLapT getTransition() {
        return transition;
    }

    /**
     * Legt den Wert der transition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLapT }
     *     
     */
    public void setTransition(ActivityLapT value) {
        this.transition = value;
    }

    /**
     * Ruft den Wert der activity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivityT }
     *     
     */
    public ActivityT getActivity() {
        return activity;
    }

    /**
     * Legt den Wert der activity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityT }
     *     
     */
    public void setActivity(ActivityT value) {
        this.activity = value;
    }

}
