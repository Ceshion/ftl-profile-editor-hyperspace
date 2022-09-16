//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.15 at 05:23:14 PM EDT 
//


package net.ceshion.ftl.xml.hyperspace;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="blueprint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modifier"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *                 &lt;attribute name="flat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "blueprint",
    "modifier",
    "price"
})
public class Item {

    @XmlElement(required = true)
    protected String blueprint;
    @XmlElement(required = true)
    protected Modifier modifier;
    protected byte price;

    /**
     * Gets the value of the blueprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlueprint() {
        return blueprint;
    }

    /**
     * Sets the value of the blueprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlueprint(String value) {
        this.blueprint = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link Modifier }
     *     
     */
    public Modifier getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modifier }
     *     
     */
    public void setModifier(Modifier value) {
        this.modifier = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public byte getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(byte value) {
        this.price = value;
    }

}