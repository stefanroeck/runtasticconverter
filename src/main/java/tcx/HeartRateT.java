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
 * <p>Java-Klasse für HeartRate_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeartRate_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Target_t">
 *       &lt;sequence>
 *         &lt;element name="HeartRateZone" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Zone_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeartRate_t", propOrder = {
    "heartRateZone"
})
public class HeartRateT
    extends TargetT
{

    @XmlElement(name = "HeartRateZone", required = true)
    protected ZoneT heartRateZone;

    /**
     * Ruft den Wert der heartRateZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneT }
     *     
     */
    public ZoneT getHeartRateZone() {
        return heartRateZone;
    }

    /**
     * Legt den Wert der heartRateZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneT }
     *     
     */
    public void setHeartRateZone(ZoneT value) {
        this.heartRateZone = value;
    }

}
