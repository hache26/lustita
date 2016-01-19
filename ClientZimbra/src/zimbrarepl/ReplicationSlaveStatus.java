
package zimbrarepl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicationSlaveStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replicationSlaveStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catchupStatus" type="{urn:zimbraRepl}replicationSlaveCatchupStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replicationSlaveStatus", propOrder = {
    "catchupStatus"
})
public class ReplicationSlaveStatus {

    protected ReplicationSlaveCatchupStatus catchupStatus;

    /**
     * Gets the value of the catchupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationSlaveCatchupStatus }
     *     
     */
    public ReplicationSlaveCatchupStatus getCatchupStatus() {
        return catchupStatus;
    }

    /**
     * Sets the value of the catchupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationSlaveCatchupStatus }
     *     
     */
    public void setCatchupStatus(ReplicationSlaveCatchupStatus value) {
        this.catchupStatus = value;
    }

}
