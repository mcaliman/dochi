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
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://docbook.org/ns/docbook}title"/>
 *             &lt;element ref="{http://docbook.org/ns/docbook}titleabbrev"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://docbook.org/ns/docbook}info" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docbook.org/ns/docbook}itemizedlist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}orderedlist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}procedure"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}simplelist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}variablelist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}segmentedlist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}glosslist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliolist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}calloutlist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}qandaset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}example"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}figure"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}table"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}equation"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}informalexample"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}informalfigure"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}informaltable"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}informalequation"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}sidebar"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}blockquote"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}address"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}epigraph"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}mediaobject"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}screenshot"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}task"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}productionset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}constraintdef"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}msgset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}screen"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}literallayout"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}programlistingco"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}screenco"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}programlisting"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}synopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bridgehead"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}remark"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}revhistory"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}indexterm"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}funcsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}classsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}methodsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}constructorsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}destructorsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}fieldsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}cmdsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}caution"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}important"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}note"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}tip"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}warning"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}anchor"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}para"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}formalpara"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}simpara"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}annotation"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://docbook.org/ns/docbook}glossentry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.linking.attributes"/>
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
    "titlesAndTitleabbrevs",
    "info",
    "itemizedlistsAndOrderedlistsAndProcedures",
    "glossentries"
})
@XmlRootElement(name = "glosslist")
public class Glosslist {

    @XmlElements({
        @XmlElement(name = "title", type = Title.class),
        @XmlElement(name = "titleabbrev", type = Titleabbrev.class)
    })
    protected List<Object> titlesAndTitleabbrevs;
    protected Info info;
    @XmlElements({
        @XmlElement(name = "itemizedlist", type = Itemizedlist.class),
        @XmlElement(name = "orderedlist", type = Orderedlist.class),
        @XmlElement(name = "procedure", type = Procedure.class),
        @XmlElement(name = "simplelist", type = Simplelist.class),
        @XmlElement(name = "variablelist", type = Variablelist.class),
        @XmlElement(name = "segmentedlist", type = Segmentedlist.class),
        @XmlElement(name = "glosslist", type = Glosslist.class),
        @XmlElement(name = "bibliolist", type = Bibliolist.class),
        @XmlElement(name = "calloutlist", type = Calloutlist.class),
        @XmlElement(name = "qandaset", type = Qandaset.class),
        @XmlElement(name = "example", type = Example.class),
        @XmlElement(name = "figure", type = Figure.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "equation", type = Equation.class),
        @XmlElement(name = "informalexample", type = Informalexample.class),
        @XmlElement(name = "informalfigure", type = Informalfigure.class),
        @XmlElement(name = "informaltable", type = Informaltable.class),
        @XmlElement(name = "informalequation", type = Informalequation.class),
        @XmlElement(name = "sidebar", type = Sidebar.class),
        @XmlElement(name = "blockquote", type = Blockquote.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "epigraph", type = Epigraph.class),
        @XmlElement(name = "mediaobject", type = Mediaobject.class),
        @XmlElement(name = "screenshot", type = Screenshot.class),
        @XmlElement(name = "task", type = Task.class),
        @XmlElement(name = "productionset", type = Productionset.class),
        @XmlElement(name = "constraintdef", type = Constraintdef.class),
        @XmlElement(name = "msgset", type = Msgset.class),
        @XmlElement(name = "screen", type = Screen.class),
        @XmlElement(name = "literallayout", type = Literallayout.class),
        @XmlElement(name = "programlistingco", type = Programlistingco.class),
        @XmlElement(name = "screenco", type = Screenco.class),
        @XmlElement(name = "programlisting", type = Programlisting.class),
        @XmlElement(name = "synopsis", type = Synopsis.class),
        @XmlElement(name = "bridgehead", type = Bridgehead.class),
        @XmlElement(name = "remark", type = Remark.class),
        @XmlElement(name = "revhistory", type = Revhistory.class),
        @XmlElement(name = "indexterm", type = Indexterm.class),
        @XmlElement(name = "funcsynopsis", type = Funcsynopsis.class),
        @XmlElement(name = "classsynopsis", type = Classsynopsis.class),
        @XmlElement(name = "methodsynopsis", type = Methodsynopsis.class),
        @XmlElement(name = "constructorsynopsis", type = Constructorsynopsis.class),
        @XmlElement(name = "destructorsynopsis", type = Destructorsynopsis.class),
        @XmlElement(name = "fieldsynopsis", type = Fieldsynopsis.class),
        @XmlElement(name = "cmdsynopsis", type = Cmdsynopsis.class),
        @XmlElement(name = "caution", type = Caution.class),
        @XmlElement(name = "important", type = Important.class),
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "tip", type = Tip.class),
        @XmlElement(name = "warning", type = Warning.class),
        @XmlElement(name = "anchor", type = Anchor.class),
        @XmlElement(name = "para", type = Para.class),
        @XmlElement(name = "formalpara", type = Formalpara.class),
        @XmlElement(name = "simpara", type = Simpara.class),
        @XmlElement(name = "annotation", type = Annotation.class)
    })
    protected List<Object> itemizedlistsAndOrderedlistsAndProcedures;
    @XmlElement(name = "glossentry", required = true)
    protected List<Glossentry> glossentries;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "linkend")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkend;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String xlinkType;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String xlinkRole;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String xlinkTitle;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;
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
     * Gets the value of the titlesAndTitleabbrevs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titlesAndTitleabbrevs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitlesAndTitleabbrevs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * {@link Titleabbrev }
     * 
     * 
     */
    public List<Object> getTitlesAndTitleabbrevs() {
        if (titlesAndTitleabbrevs == null) {
            titlesAndTitleabbrevs = new ArrayList<Object>();
        }
        return this.titlesAndTitleabbrevs;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the itemizedlistsAndOrderedlistsAndProcedures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedlistsAndOrderedlistsAndProcedures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedlistsAndOrderedlistsAndProcedures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itemizedlist }
     * {@link Orderedlist }
     * {@link Procedure }
     * {@link Simplelist }
     * {@link Variablelist }
     * {@link Segmentedlist }
     * {@link Glosslist }
     * {@link Bibliolist }
     * {@link Calloutlist }
     * {@link Qandaset }
     * {@link Example }
     * {@link Figure }
     * {@link Table }
     * {@link Equation }
     * {@link Informalexample }
     * {@link Informalfigure }
     * {@link Informaltable }
     * {@link Informalequation }
     * {@link Sidebar }
     * {@link Blockquote }
     * {@link Address }
     * {@link Epigraph }
     * {@link Mediaobject }
     * {@link Screenshot }
     * {@link Task }
     * {@link Productionset }
     * {@link Constraintdef }
     * {@link Msgset }
     * {@link Screen }
     * {@link Literallayout }
     * {@link Programlistingco }
     * {@link Screenco }
     * {@link Programlisting }
     * {@link Synopsis }
     * {@link Bridgehead }
     * {@link Remark }
     * {@link Revhistory }
     * {@link Indexterm }
     * {@link Funcsynopsis }
     * {@link Classsynopsis }
     * {@link Methodsynopsis }
     * {@link Constructorsynopsis }
     * {@link Destructorsynopsis }
     * {@link Fieldsynopsis }
     * {@link Cmdsynopsis }
     * {@link Caution }
     * {@link Important }
     * {@link Note }
     * {@link Tip }
     * {@link Warning }
     * {@link Anchor }
     * {@link Para }
     * {@link Formalpara }
     * {@link Simpara }
     * {@link Annotation }
     * 
     * 
     */
    public List<Object> getItemizedlistsAndOrderedlistsAndProcedures() {
        if (itemizedlistsAndOrderedlistsAndProcedures == null) {
            itemizedlistsAndOrderedlistsAndProcedures = new ArrayList<Object>();
        }
        return this.itemizedlistsAndOrderedlistsAndProcedures;
    }

    /**
     * Gets the value of the glossentries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glossentries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlossentries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Glossentry }
     * 
     * 
     */
    public List<Glossentry> getGlossentries() {
        if (glossentries == null) {
            glossentries = new ArrayList<Glossentry>();
        }
        return this.glossentries;
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
     * Recupera il valore della proprietà linkend.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLinkend() {
        return linkend;
    }

    /**
     * Imposta il valore della proprietà linkend.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkend(Object value) {
        this.linkend = value;
    }

    /**
     * Recupera il valore della proprietà href.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Imposta il valore della proprietà href.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Recupera il valore della proprietà xlinkType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkType() {
        return xlinkType;
    }

    /**
     * Imposta il valore della proprietà xlinkType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkType(String value) {
        this.xlinkType = value;
    }

    /**
     * Recupera il valore della proprietà xlinkRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkRole() {
        return xlinkRole;
    }

    /**
     * Imposta il valore della proprietà xlinkRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkRole(String value) {
        this.xlinkRole = value;
    }

    /**
     * Recupera il valore della proprietà arcrole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Imposta il valore della proprietà arcrole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Recupera il valore della proprietà xlinkTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkTitle() {
        return xlinkTitle;
    }

    /**
     * Imposta il valore della proprietà xlinkTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkTitle(String value) {
        this.xlinkTitle = value;
    }

    /**
     * Recupera il valore della proprietà show.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Imposta il valore della proprietà show.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Recupera il valore della proprietà actuate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Imposta il valore della proprietà actuate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
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
