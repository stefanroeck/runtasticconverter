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
 * <p>Java-Klasse für Workouts_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Workouts_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Running" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutFolder_t"/>
 *         &lt;element name="Biking" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutFolder_t"/>
 *         &lt;element name="Other" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutFolder_t"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workouts_t", propOrder = {
    "running",
    "biking",
    "other",
    "extensions"
})
public class WorkoutsT {

    @XmlElement(name = "Running", required = true)
    protected WorkoutFolderT running;
    @XmlElement(name = "Biking", required = true)
    protected WorkoutFolderT biking;
    @XmlElement(name = "Other", required = true)
    protected WorkoutFolderT other;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Ruft den Wert der running-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutFolderT }
     *     
     */
    public WorkoutFolderT getRunning() {
        return running;
    }

    /**
     * Legt den Wert der running-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutFolderT }
     *     
     */
    public void setRunning(WorkoutFolderT value) {
        this.running = value;
    }

    /**
     * Ruft den Wert der biking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutFolderT }
     *     
     */
    public WorkoutFolderT getBiking() {
        return biking;
    }

    /**
     * Legt den Wert der biking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutFolderT }
     *     
     */
    public void setBiking(WorkoutFolderT value) {
        this.biking = value;
    }

    /**
     * Ruft den Wert der other-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutFolderT }
     *     
     */
    public WorkoutFolderT getOther() {
        return other;
    }

    /**
     * Legt den Wert der other-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutFolderT }
     *     
     */
    public void setOther(WorkoutFolderT value) {
        this.other = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

}
