//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.05.12 um 07:36:01 PM CEST 
//


package tcx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Gender_t.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Gender_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Male"/>
 *     &lt;enumeration value="Female"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Gender_t")
@XmlEnum
public enum GenderT {

    @XmlEnumValue("Male")
    MALE("Male"),
    @XmlEnumValue("Female")
    FEMALE("Female");
    private final String value;

    GenderT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderT fromValue(String v) {
        for (GenderT c: GenderT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
