
package com.inssjp.webservice.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para catalogoGLNResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="catalogoGLNResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantPaginas" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="erroresWS" type="{http://business.webservice.inssjp.com/}webServiceError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hay_error" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lstAgentes" type="{http://business.webservice.inssjp.com/}agenteDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogoGLNResponse", propOrder = {
    "cantPaginas",
    "erroresWS",
    "hayError",
    "lstAgentes"
})
public class CatalogoGLNResponse {

    protected Long cantPaginas;
    @XmlElement(nillable = true)
    protected List<WebServiceError> erroresWS;
    @XmlElement(name = "hay_error")
    protected Boolean hayError;
    @XmlElement(nillable = true)
    protected List<AgenteDTO> lstAgentes;

    /**
     * Obtiene el valor de la propiedad cantPaginas.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCantPaginas() {
        return cantPaginas;
    }

    /**
     * Define el valor de la propiedad cantPaginas.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCantPaginas(Long value) {
        this.cantPaginas = value;
    }

    /**
     * Gets the value of the erroresWS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erroresWS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErroresWS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebServiceError }
     * 
     * 
     */
    public List<WebServiceError> getErroresWS() {
        if (erroresWS == null) {
            erroresWS = new ArrayList<WebServiceError>();
        }
        return this.erroresWS;
    }

    /**
     * Obtiene el valor de la propiedad hayError.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHayError() {
        return hayError;
    }

    /**
     * Define el valor de la propiedad hayError.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHayError(Boolean value) {
        this.hayError = value;
    }

    /**
     * Gets the value of the lstAgentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstAgentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstAgentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgenteDTO }
     * 
     * 
     */
    public List<AgenteDTO> getLstAgentes() {
        if (lstAgentes == null) {
            lstAgentes = new ArrayList<AgenteDTO>();
        }
        return this.lstAgentes;
    }

}
