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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element ref="{http://docbook.org/ns/docbook}itemizedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}orderedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}procedure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}simplelist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}variablelist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}segmentedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}glosslist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bibliolist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}calloutlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}qandaset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}caution"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}important"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}note"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}tip"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}warning"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}example"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}figure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}table"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalexample"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalfigure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informaltable"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}sidebar"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}blockquote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}address"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}epigraph"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}mediaobject"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screenshot"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}task"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productionset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}constraintdef"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}msgset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}programlisting"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screen"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}literallayout"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}synopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}programlistingco"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screenco"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}cmdsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}funcsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}classsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}methodsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}constructorsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}destructorsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}fieldsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bridgehead"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}remark"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}revhistory"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}indexterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}equation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalequation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}anchor"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}para"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}formalpara"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}simpara"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}annotation"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.linking.attributes"/>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onclick" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ondblclick" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmousedown" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmouseup" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmouseover" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmousemove" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmouseout" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onkeypress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onkeydown" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onkeyup" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "caption")
public class Caption {

    @XmlElementRefs({
        @XmlElementRef(name = "productionset", namespace = "http://docbook.org/ns/docbook", type = Productionset.class, required = false),
        @XmlElementRef(name = "cmdsynopsis", namespace = "http://docbook.org/ns/docbook", type = Cmdsynopsis.class, required = false),
        @XmlElementRef(name = "sidebar", namespace = "http://docbook.org/ns/docbook", type = Sidebar.class, required = false),
        @XmlElementRef(name = "screenco", namespace = "http://docbook.org/ns/docbook", type = Screenco.class, required = false),
        @XmlElementRef(name = "informaltable", namespace = "http://docbook.org/ns/docbook", type = Informaltable.class, required = false),
        @XmlElementRef(name = "fieldsynopsis", namespace = "http://docbook.org/ns/docbook", type = Fieldsynopsis.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://docbook.org/ns/docbook", type = Remark.class, required = false),
        @XmlElementRef(name = "classsynopsis", namespace = "http://docbook.org/ns/docbook", type = Classsynopsis.class, required = false),
        @XmlElementRef(name = "programlisting", namespace = "http://docbook.org/ns/docbook", type = Programlisting.class, required = false),
        @XmlElementRef(name = "constructorsynopsis", namespace = "http://docbook.org/ns/docbook", type = Constructorsynopsis.class, required = false),
        @XmlElementRef(name = "destructorsynopsis", namespace = "http://docbook.org/ns/docbook", type = Destructorsynopsis.class, required = false),
        @XmlElementRef(name = "task", namespace = "http://docbook.org/ns/docbook", type = Task.class, required = false),
        @XmlElementRef(name = "equation", namespace = "http://docbook.org/ns/docbook", type = Equation.class, required = false),
        @XmlElementRef(name = "synopsis", namespace = "http://docbook.org/ns/docbook", type = Synopsis.class, required = false),
        @XmlElementRef(name = "anchor", namespace = "http://docbook.org/ns/docbook", type = Anchor.class, required = false),
        @XmlElementRef(name = "orderedlist", namespace = "http://docbook.org/ns/docbook", type = Orderedlist.class, required = false),
        @XmlElementRef(name = "informalequation", namespace = "http://docbook.org/ns/docbook", type = Informalequation.class, required = false),
        @XmlElementRef(name = "screen", namespace = "http://docbook.org/ns/docbook", type = Screen.class, required = false),
        @XmlElementRef(name = "bibliolist", namespace = "http://docbook.org/ns/docbook", type = Bibliolist.class, required = false),
        @XmlElementRef(name = "qandaset", namespace = "http://docbook.org/ns/docbook", type = Qandaset.class, required = false),
        @XmlElementRef(name = "simpara", namespace = "http://docbook.org/ns/docbook", type = Simpara.class, required = false),
        @XmlElementRef(name = "informalfigure", namespace = "http://docbook.org/ns/docbook", type = Informalfigure.class, required = false),
        @XmlElementRef(name = "programlistingco", namespace = "http://docbook.org/ns/docbook", type = Programlistingco.class, required = false),
        @XmlElementRef(name = "para", namespace = "http://docbook.org/ns/docbook", type = Para.class, required = false),
        @XmlElementRef(name = "glosslist", namespace = "http://docbook.org/ns/docbook", type = Glosslist.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://docbook.org/ns/docbook", type = Annotation.class, required = false),
        @XmlElementRef(name = "msgset", namespace = "http://docbook.org/ns/docbook", type = Msgset.class, required = false),
        @XmlElementRef(name = "literallayout", namespace = "http://docbook.org/ns/docbook", type = Literallayout.class, required = false),
        @XmlElementRef(name = "methodsynopsis", namespace = "http://docbook.org/ns/docbook", type = Methodsynopsis.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://docbook.org/ns/docbook", type = Blockquote.class, required = false),
        @XmlElementRef(name = "variablelist", namespace = "http://docbook.org/ns/docbook", type = Variablelist.class, required = false),
        @XmlElementRef(name = "calloutlist", namespace = "http://docbook.org/ns/docbook", type = Calloutlist.class, required = false),
        @XmlElementRef(name = "indexterm", namespace = "http://docbook.org/ns/docbook", type = Indexterm.class, required = false),
        @XmlElementRef(name = "caution", namespace = "http://docbook.org/ns/docbook", type = Caution.class, required = false),
        @XmlElementRef(name = "itemizedlist", namespace = "http://docbook.org/ns/docbook", type = Itemizedlist.class, required = false),
        @XmlElementRef(name = "segmentedlist", namespace = "http://docbook.org/ns/docbook", type = Segmentedlist.class, required = false),
        @XmlElementRef(name = "example", namespace = "http://docbook.org/ns/docbook", type = Example.class, required = false),
        @XmlElementRef(name = "mediaobject", namespace = "http://docbook.org/ns/docbook", type = Mediaobject.class, required = false),
        @XmlElementRef(name = "simplelist", namespace = "http://docbook.org/ns/docbook", type = Simplelist.class, required = false),
        @XmlElementRef(name = "note", namespace = "http://docbook.org/ns/docbook", type = Note.class, required = false),
        @XmlElementRef(name = "formalpara", namespace = "http://docbook.org/ns/docbook", type = Formalpara.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://docbook.org/ns/docbook", type = Table.class, required = false),
        @XmlElementRef(name = "epigraph", namespace = "http://docbook.org/ns/docbook", type = Epigraph.class, required = false),
        @XmlElementRef(name = "important", namespace = "http://docbook.org/ns/docbook", type = Important.class, required = false),
        @XmlElementRef(name = "tip", namespace = "http://docbook.org/ns/docbook", type = Tip.class, required = false),
        @XmlElementRef(name = "funcsynopsis", namespace = "http://docbook.org/ns/docbook", type = Funcsynopsis.class, required = false),
        @XmlElementRef(name = "constraintdef", namespace = "http://docbook.org/ns/docbook", type = Constraintdef.class, required = false),
        @XmlElementRef(name = "figure", namespace = "http://docbook.org/ns/docbook", type = Figure.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://docbook.org/ns/docbook", type = Address.class, required = false),
        @XmlElementRef(name = "revhistory", namespace = "http://docbook.org/ns/docbook", type = Revhistory.class, required = false),
        @XmlElementRef(name = "procedure", namespace = "http://docbook.org/ns/docbook", type = Procedure.class, required = false),
        @XmlElementRef(name = "bridgehead", namespace = "http://docbook.org/ns/docbook", type = Bridgehead.class, required = false),
        @XmlElementRef(name = "screenshot", namespace = "http://docbook.org/ns/docbook", type = Screenshot.class, required = false),
        @XmlElementRef(name = "warning", namespace = "http://docbook.org/ns/docbook", type = Warning.class, required = false),
        @XmlElementRef(name = "informalexample", namespace = "http://docbook.org/ns/docbook", type = Informalexample.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "style")
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "title")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(name = "lang")
    @XmlSchemaType(name = "anySimpleType")
    protected String lang;
    @XmlAttribute(name = "onclick")
    @XmlSchemaType(name = "anySimpleType")
    protected String onclick;
    @XmlAttribute(name = "ondblclick")
    @XmlSchemaType(name = "anySimpleType")
    protected String ondblclick;
    @XmlAttribute(name = "onmousedown")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmousedown;
    @XmlAttribute(name = "onmouseup")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseup;
    @XmlAttribute(name = "onmouseover")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseover;
    @XmlAttribute(name = "onmousemove")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmousemove;
    @XmlAttribute(name = "onmouseout")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseout;
    @XmlAttribute(name = "onkeypress")
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeypress;
    @XmlAttribute(name = "onkeydown")
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeydown;
    @XmlAttribute(name = "onkeyup")
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeyup;
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
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Productionset }
     * {@link Cmdsynopsis }
     * {@link Sidebar }
     * {@link Screenco }
     * {@link Informaltable }
     * {@link Fieldsynopsis }
     * {@link Remark }
     * {@link Classsynopsis }
     * {@link Programlisting }
     * {@link Constructorsynopsis }
     * {@link Destructorsynopsis }
     * {@link Task }
     * {@link Equation }
     * {@link Synopsis }
     * {@link Anchor }
     * {@link Orderedlist }
     * {@link Informalequation }
     * {@link Screen }
     * {@link Bibliolist }
     * {@link Qandaset }
     * {@link Simpara }
     * {@link Informalfigure }
     * {@link Programlistingco }
     * {@link Para }
     * {@link Glosslist }
     * {@link Annotation }
     * {@link Msgset }
     * {@link Literallayout }
     * {@link Methodsynopsis }
     * {@link Blockquote }
     * {@link Variablelist }
     * {@link Calloutlist }
     * {@link Indexterm }
     * {@link Caution }
     * {@link Itemizedlist }
     * {@link Segmentedlist }
     * {@link Example }
     * {@link Mediaobject }
     * {@link Simplelist }
     * {@link Note }
     * {@link Formalpara }
     * {@link Table }
     * {@link Epigraph }
     * {@link Important }
     * {@link Tip }
     * {@link Funcsynopsis }
     * {@link Constraintdef }
     * {@link Figure }
     * {@link Address }
     * {@link Revhistory }
     * {@link Procedure }
     * {@link Bridgehead }
     * {@link String }
     * {@link Screenshot }
     * {@link Warning }
     * {@link Informalexample }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Recupera il valore della proprietà clazz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Imposta il valore della proprietà clazz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Recupera il valore della proprietà style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Imposta il valore della proprietà style.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Recupera il valore della proprietà title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Imposta il valore della proprietà title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Recupera il valore della proprietà lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Imposta il valore della proprietà lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Recupera il valore della proprietà onclick.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnclick() {
        return onclick;
    }

    /**
     * Imposta il valore della proprietà onclick.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnclick(String value) {
        this.onclick = value;
    }

    /**
     * Recupera il valore della proprietà ondblclick.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndblclick() {
        return ondblclick;
    }

    /**
     * Imposta il valore della proprietà ondblclick.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndblclick(String value) {
        this.ondblclick = value;
    }

    /**
     * Recupera il valore della proprietà onmousedown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousedown() {
        return onmousedown;
    }

    /**
     * Imposta il valore della proprietà onmousedown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousedown(String value) {
        this.onmousedown = value;
    }

    /**
     * Recupera il valore della proprietà onmouseup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseup() {
        return onmouseup;
    }

    /**
     * Imposta il valore della proprietà onmouseup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseup(String value) {
        this.onmouseup = value;
    }

    /**
     * Recupera il valore della proprietà onmouseover.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseover() {
        return onmouseover;
    }

    /**
     * Imposta il valore della proprietà onmouseover.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseover(String value) {
        this.onmouseover = value;
    }

    /**
     * Recupera il valore della proprietà onmousemove.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousemove() {
        return onmousemove;
    }

    /**
     * Imposta il valore della proprietà onmousemove.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousemove(String value) {
        this.onmousemove = value;
    }

    /**
     * Recupera il valore della proprietà onmouseout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseout() {
        return onmouseout;
    }

    /**
     * Imposta il valore della proprietà onmouseout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseout(String value) {
        this.onmouseout = value;
    }

    /**
     * Recupera il valore della proprietà onkeypress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeypress() {
        return onkeypress;
    }

    /**
     * Imposta il valore della proprietà onkeypress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeypress(String value) {
        this.onkeypress = value;
    }

    /**
     * Recupera il valore della proprietà onkeydown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeydown() {
        return onkeydown;
    }

    /**
     * Imposta il valore della proprietà onkeydown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeydown(String value) {
        this.onkeydown = value;
    }

    /**
     * Recupera il valore della proprietà onkeyup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeyup() {
        return onkeyup;
    }

    /**
     * Imposta il valore della proprietà onkeyup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeyup(String value) {
        this.onkeyup = value;
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
