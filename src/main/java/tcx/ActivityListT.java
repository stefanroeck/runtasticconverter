//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.05.12 um 07:36:01 PM CEST 
//


package tcx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActivityList_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActivityList_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Activity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Activity_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MultiSportSession" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}MultiSportSession_t" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityList_t", propOrder = {
    "activity",
    "multiSportSession"
})
public class ActivityListT {

    @XmlElement(name = "Activity")
    protected List<ActivityT> activity;
    @XmlElement(name = "MultiSportSession")
    protected List<MultiSportSessionT> multiSportSession;

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityT }
     * 
     * 
     */
    public List<ActivityT> getActivity() {
        if (activity == null) {
            activity = new ArrayList<ActivityT>();
        }
        return this.activity;
    }

    /**
     * Gets the value of the multiSportSession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiSportSession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiSportSession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiSportSessionT }
     * 
     * 
     */
    public List<MultiSportSessionT> getMultiSportSession() {
        if (multiSportSession == null) {
            multiSportSession = new ArrayList<MultiSportSessionT>();
        }
        return this.multiSportSession;
    }

}
