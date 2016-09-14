//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.09.12 alle 10:18:45 PM CEST 
//


package org.docbook.ns.docbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docbook.org/ns/docbook}title"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}titleabbrev"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}subtitle"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docbook.org/ns/docbook}abstract"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}address"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}artpagenums"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}author"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}authorgroup"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}authorinitials"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliocoverage"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}biblioid"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliosource"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}collab"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}confgroup"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}contractsponsor"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}contractnum"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}copyright"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}cover"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}date"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}edition"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}editor"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}issuenum"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}keywordset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}legalnotice"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}mediaobject"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}org"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}orgname"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}othercredit"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}pagenums"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}printhistory"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}pubdate"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}publisher"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}publishername"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}releaseinfo"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}revhistory"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}seriesvolnums"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}subjectset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}volumenum"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}annotation"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}extendedlink"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliomisc"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliomset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliorelation"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}biblioset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}itermset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}productname"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}productnumber"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "titlesAndTitleabbrevsAndSubtitles"
})
@XmlRootElement(name = "info")
public class Info {

    @XmlElements({
        @XmlElement(name = "title", type = Title.class),
        @XmlElement(name = "titleabbrev", type = Titleabbrev.class),
        @XmlElement(name = "subtitle", type = Subtitle.class),
        @XmlElement(name = "abstract", type = Abstract.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "artpagenums", type = Artpagenums.class),
        @XmlElement(name = "author", type = Author.class),
        @XmlElement(name = "authorgroup", type = Authorgroup.class),
        @XmlElement(name = "authorinitials", type = Authorinitials.class),
        @XmlElement(name = "bibliocoverage", type = Bibliocoverage.class),
        @XmlElement(name = "biblioid", type = Biblioid.class),
        @XmlElement(name = "bibliosource", type = Bibliosource.class),
        @XmlElement(name = "collab", type = Collab.class),
        @XmlElement(name = "confgroup", type = Confgroup.class),
        @XmlElement(name = "contractsponsor", type = Contractsponsor.class),
        @XmlElement(name = "contractnum", type = Contractnum.class),
        @XmlElement(name = "copyright", type = Copyright.class),
        @XmlElement(name = "cover", type = Cover.class),
        @XmlElement(name = "date", type = Date.class),
        @XmlElement(name = "edition", type = Edition.class),
        @XmlElement(name = "editor", type = Editor.class),
        @XmlElement(name = "issuenum", type = Issuenum.class),
        @XmlElement(name = "keywordset", type = Keywordset.class),
        @XmlElement(name = "legalnotice", type = Legalnotice.class),
        @XmlElement(name = "mediaobject", type = Mediaobject.class),
        @XmlElement(name = "org", type = Org.class),
        @XmlElement(name = "orgname", type = Orgname.class),
        @XmlElement(name = "othercredit", type = Othercredit.class),
        @XmlElement(name = "pagenums", type = Pagenums.class),
        @XmlElement(name = "printhistory", type = Printhistory.class),
        @XmlElement(name = "pubdate", type = Pubdate.class),
        @XmlElement(name = "publisher", type = Publisher.class),
        @XmlElement(name = "publishername", type = Publishername.class),
        @XmlElement(name = "releaseinfo", type = Releaseinfo.class),
        @XmlElement(name = "revhistory", type = Revhistory.class),
        @XmlElement(name = "seriesvolnums", type = Seriesvolnums.class),
        @XmlElement(name = "subjectset", type = Subjectset.class),
        @XmlElement(name = "volumenum", type = Volumenum.class),
        @XmlElement(name = "annotation", type = Annotation.class),
        @XmlElement(name = "extendedlink", type = Extendedlink.class),
        @XmlElement(name = "bibliomisc", type = Bibliomisc.class),
        @XmlElement(name = "bibliomset", type = Bibliomset.class),
        @XmlElement(name = "bibliorelation", type = Bibliorelation.class),
        @XmlElement(name = "biblioset", type = Biblioset.class),
        @XmlElement(name = "itermset", type = Itermset.class),
        @XmlElement(name = "productname", type = Productname.class),
        @XmlElement(name = "productnumber", type = Productnumber.class)
    })
    protected List<Object> titlesAndTitleabbrevsAndSubtitles;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version")
    @XmlSchemaType(name = "anySimpleType")
    protected String commonVersion;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String xmlLang;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String base;
    @XmlAttribute(name = "remap")
    @XmlSchemaType(name = "anySimpleType")
    protected String remap;
    @XmlAttribute(name = "xreflabel")
    @XmlSchemaType(name = "anySimpleType")
    protected String xreflabel;
    @XmlAttribute(name = "revisionflag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String revisionflag;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "arch")
    @XmlSchemaType(name = "anySimpleType")
    protected String arch;
    @XmlAttribute(name = "audience")
    @XmlSchemaType(name = "anySimpleType")
    protected String audience;
    @XmlAttribute(name = "condition")
    @XmlSchemaType(name = "anySimpleType")
    protected String condition;
    @XmlAttribute(name = "conformance")
    @XmlSchemaType(name = "anySimpleType")
    protected String conformance;
    @XmlAttribute(name = "os")
    @XmlSchemaType(name = "anySimpleType")
    protected String os;
    @XmlAttribute(name = "revision")
    @XmlSchemaType(name = "anySimpleType")
    protected String commonRevision;
    @XmlAttribute(name = "security")
    @XmlSchemaType(name = "anySimpleType")
    protected String security;
    @XmlAttribute(name = "userlevel")
    @XmlSchemaType(name = "anySimpleType")
    protected String userlevel;
    @XmlAttribute(name = "vendor")
    @XmlSchemaType(name = "anySimpleType")
    protected String vendor;
    @XmlAttribute(name = "wordsize")
    @XmlSchemaType(name = "anySimpleType")
    protected String wordsize;
    @XmlAttribute(name = "annotations")
    @XmlSchemaType(name = "anySimpleType")
    protected String annotations;

    /**
     * Gets the value of the titlesAndTitleabbrevsAndSubtitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titlesAndTitleabbrevsAndSubtitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitlesAndTitleabbrevsAndSubtitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * {@link Titleabbrev }
     * {@link Subtitle }
     * {@link Abstract }
     * {@link Address }
     * {@link Artpagenums }
     * {@link Author }
     * {@link Authorgroup }
     * {@link Authorinitials }
     * {@link Bibliocoverage }
     * {@link Biblioid }
     * {@link Bibliosource }
     * {@link Collab }
     * {@link Confgroup }
     * {@link Contractsponsor }
     * {@link Contractnum }
     * {@link Copyright }
     * {@link Cover }
     * {@link Date }
     * {@link Edition }
     * {@link Editor }
     * {@link Issuenum }
     * {@link Keywordset }
     * {@link Legalnotice }
     * {@link Mediaobject }
     * {@link Org }
     * {@link Orgname }
     * {@link Othercredit }
     * {@link Pagenums }
     * {@link Printhistory }
     * {@link Pubdate }
     * {@link Publisher }
     * {@link Publishername }
     * {@link Releaseinfo }
     * {@link Revhistory }
     * {@link Seriesvolnums }
     * {@link Subjectset }
     * {@link Volumenum }
     * {@link Annotation }
     * {@link Extendedlink }
     * {@link Bibliomisc }
     * {@link Bibliomset }
     * {@link Bibliorelation }
     * {@link Biblioset }
     * {@link Itermset }
     * {@link Productname }
     * {@link Productnumber }
     * 
     * 
     */
    public List<Object> getTitlesAndTitleabbrevsAndSubtitles() {
        if (titlesAndTitleabbrevsAndSubtitles == null) {
            titlesAndTitleabbrevsAndSubtitles = new ArrayList<Object>();
        }
        return this.titlesAndTitleabbrevsAndSubtitles;
    }

    /**
     * Recupera il valore della proprietà role.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Imposta il valore della proprietà role.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà commonVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonVersion() {
        return commonVersion;
    }

    /**
     * Imposta il valore della proprietà commonVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonVersion(String value) {
        this.commonVersion = value;
    }

    /**
     * Recupera il valore della proprietà xmlLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Imposta il valore della proprietà xmlLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Recupera il valore della proprietà base.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Imposta il valore della proprietà base.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Recupera il valore della proprietà remap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemap() {
        return remap;
    }

    /**
     * Imposta il valore della proprietà remap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemap(String value) {
        this.remap = value;
    }

    /**
     * Recupera il valore della proprietà xreflabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXreflabel() {
        return xreflabel;
    }

    /**
     * Imposta il valore della proprietà xreflabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXreflabel(String value) {
        this.xreflabel = value;
    }

    /**
     * Recupera il valore della proprietà revisionflag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionflag() {
        return revisionflag;
    }

    /**
     * Imposta il valore della proprietà revisionflag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionflag(String value) {
        this.revisionflag = value;
    }

    /**
     * Recupera il valore della proprietà dir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Imposta il valore della proprietà dir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Recupera il valore della proprietà arch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArch() {
        return arch;
    }

    /**
     * Imposta il valore della proprietà arch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArch(String value) {
        this.arch = value;
    }

    /**
     * Recupera il valore della proprietà audience.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Imposta il valore della proprietà audience.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

    /**
     * Recupera il valore della proprietà condition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Imposta il valore della proprietà condition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Recupera il valore della proprietà conformance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformance() {
        return conformance;
    }

    /**
     * Imposta il valore della proprietà conformance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformance(String value) {
        this.conformance = value;
    }

    /**
     * Recupera il valore della proprietà os.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Imposta il valore della proprietà os.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Recupera il valore della proprietà commonRevision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonRevision() {
        return commonRevision;
    }

    /**
     * Imposta il valore della proprietà commonRevision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonRevision(String value) {
        this.commonRevision = value;
    }

    /**
     * Recupera il valore della proprietà security.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Imposta il valore della proprietà security.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * Recupera il valore della proprietà userlevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserlevel() {
        return userlevel;
    }

    /**
     * Imposta il valore della proprietà userlevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserlevel(String value) {
        this.userlevel = value;
    }

    /**
     * Recupera il valore della proprietà vendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Imposta il valore della proprietà vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Recupera il valore della proprietà wordsize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordsize() {
        return wordsize;
    }

    /**
     * Imposta il valore della proprietà wordsize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordsize(String value) {
        this.wordsize = value;
    }

    /**
     * Recupera il valore della proprietà annotations.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotations() {
        return annotations;
    }

    /**
     * Imposta il valore della proprietà annotations.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotations(String value) {
        this.annotations = value;
    }

}
