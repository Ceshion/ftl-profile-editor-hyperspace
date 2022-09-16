//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.15 at 05:23:14 PM EDT 
//


package net.ceshion.ftl.xml.hyperspace;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boostType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="shipTarget" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="crewTarget" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="affectsSelf" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="whiteList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="human" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="medic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="engineer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="soldier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="mfk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="detective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="tully" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="jerry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="jerryg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ponyj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ponycj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="engi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="separatist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="defend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="turzil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="blackList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="hatch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="spider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="weaver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="queen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "boostType",
    "amount",
    "shipTarget",
    "crewTarget",
    "affectsSelf",
    "priority",
    "whiteList",
    "blackList"
})
public class StatBoost2 {

    @XmlElement(required = true)
    protected String boostType;
    protected float amount;
    @XmlElement(required = true)
    protected String shipTarget;
    @XmlElement(required = true)
    protected String crewTarget;
    @XmlElement(required = true)
    protected String affectsSelf;
    protected byte priority;
    protected WhiteList2 whiteList;
    protected BlackList2 blackList;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the boostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoostType() {
        return boostType;
    }

    /**
     * Sets the value of the boostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoostType(String value) {
        this.boostType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the shipTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipTarget() {
        return shipTarget;
    }

    /**
     * Sets the value of the shipTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipTarget(String value) {
        this.shipTarget = value;
    }

    /**
     * Gets the value of the crewTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewTarget() {
        return crewTarget;
    }

    /**
     * Sets the value of the crewTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewTarget(String value) {
        this.crewTarget = value;
    }

    /**
     * Gets the value of the affectsSelf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectsSelf() {
        return affectsSelf;
    }

    /**
     * Sets the value of the affectsSelf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectsSelf(String value) {
        this.affectsSelf = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public byte getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(byte value) {
        this.priority = value;
    }

    /**
     * Gets the value of the whiteList property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteList2 }
     *     
     */
    public WhiteList2 getWhiteList() {
        return whiteList;
    }

    /**
     * Sets the value of the whiteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteList2 }
     *     
     */
    public void setWhiteList(WhiteList2 value) {
        this.whiteList = value;
    }

    /**
     * Gets the value of the blackList property.
     * 
     * @return
     *     possible object is
     *     {@link BlackList2 }
     *     
     */
    public BlackList2 getBlackList() {
        return blackList;
    }

    /**
     * Sets the value of the blackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlackList2 }
     *     
     */
    public void setBlackList(BlackList2 value) {
        this.blackList = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}