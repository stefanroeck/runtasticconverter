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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractStep_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractStep_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StepId" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}StepId_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractStep_t", propOrder = {
    "stepId"
})
@XmlSeeAlso({
    RepeatT.class,
    StepT.class
})
public abstract class AbstractStepT {

    @XmlElement(name = "StepId")
    @XmlSchemaType(name = "positiveInteger")
    protected int stepId;

    /**
     * Ruft den Wert der stepId-Eigenschaft ab.
     * 
     */
    public int getStepId() {
        return stepId;
    }

    /**
     * Legt den Wert der stepId-Eigenschaft fest.
     * 
     */
    public void setStepId(int value) {
        this.stepId = value;
    }

}
