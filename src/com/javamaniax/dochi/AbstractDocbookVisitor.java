/*
 The MIT License (MIT)

 Copyright (c) 2016 Massimo Caliman

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */
package com.javamaniax.dochi;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.docbook.ns.docbook.Abbrev;
import org.docbook.ns.docbook.Abstract;
import org.docbook.ns.docbook.Accel;
import org.docbook.ns.docbook.Acknowledgements;
import org.docbook.ns.docbook.Acronym;
import org.docbook.ns.docbook.Address;
import org.docbook.ns.docbook.Affiliation;
import org.docbook.ns.docbook.Alt;
import org.docbook.ns.docbook.Anchor;
import org.docbook.ns.docbook.Annotation;
import org.docbook.ns.docbook.Answer;
import org.docbook.ns.docbook.Appendix;
import org.docbook.ns.docbook.Application;
import org.docbook.ns.docbook.Arc;
import org.docbook.ns.docbook.Area;
import org.docbook.ns.docbook.Areaset;
import org.docbook.ns.docbook.Areaspec;
import org.docbook.ns.docbook.Arg;
import org.docbook.ns.docbook.Article;
import org.docbook.ns.docbook.Artpagenums;
import org.docbook.ns.docbook.Attribution;
import org.docbook.ns.docbook.Audiodata;
import org.docbook.ns.docbook.Audioobject;
import org.docbook.ns.docbook.Author;
import org.docbook.ns.docbook.Authorgroup;
import org.docbook.ns.docbook.Authorinitials;
import org.docbook.ns.docbook.Bibliocoverage;
import org.docbook.ns.docbook.Bibliodiv;
import org.docbook.ns.docbook.Biblioentry;
import org.docbook.ns.docbook.Bibliography;
import org.docbook.ns.docbook.Biblioid;
import org.docbook.ns.docbook.Bibliolist;
import org.docbook.ns.docbook.Bibliomisc;
import org.docbook.ns.docbook.Bibliomixed;
import org.docbook.ns.docbook.Bibliomset;
import org.docbook.ns.docbook.Biblioref;
import org.docbook.ns.docbook.Bibliorelation;
import org.docbook.ns.docbook.Biblioset;
import org.docbook.ns.docbook.Bibliosource;
import org.docbook.ns.docbook.Blockquote;
import org.docbook.ns.docbook.Book;
import org.docbook.ns.docbook.Bridgehead;
import org.docbook.ns.docbook.Callout;
import org.docbook.ns.docbook.Calloutlist;
import org.docbook.ns.docbook.Caption;
import org.docbook.ns.docbook.Caution;
import org.docbook.ns.docbook.Chapter;
import org.docbook.ns.docbook.Citation;
import org.docbook.ns.docbook.Citebiblioid;
import org.docbook.ns.docbook.Citerefentry;
import org.docbook.ns.docbook.Citetitle;
import org.docbook.ns.docbook.City;
import org.docbook.ns.docbook.Classname;
import org.docbook.ns.docbook.Classsynopsis;
import org.docbook.ns.docbook.Classsynopsisinfo;
import org.docbook.ns.docbook.Cmdsynopsis;
import org.docbook.ns.docbook.Co;
import org.docbook.ns.docbook.Code;
import org.docbook.ns.docbook.Col;
import org.docbook.ns.docbook.Colgroup;
import org.docbook.ns.docbook.Collab;
import org.docbook.ns.docbook.Colophon;
import org.docbook.ns.docbook.Colspec;
import org.docbook.ns.docbook.Command;
import org.docbook.ns.docbook.Computeroutput;
import org.docbook.ns.docbook.Confdates;
import org.docbook.ns.docbook.Confgroup;
import org.docbook.ns.docbook.Confnum;
import org.docbook.ns.docbook.Confsponsor;
import org.docbook.ns.docbook.Conftitle;
import org.docbook.ns.docbook.Constant;
import org.docbook.ns.docbook.Constraint;
import org.docbook.ns.docbook.Constraintdef;
import org.docbook.ns.docbook.Constructorsynopsis;
import org.docbook.ns.docbook.Contractnum;
import org.docbook.ns.docbook.Contractsponsor;
import org.docbook.ns.docbook.Contrib;
import org.docbook.ns.docbook.Copyright;
import org.docbook.ns.docbook.Coref;
import org.docbook.ns.docbook.Country;
import org.docbook.ns.docbook.Cover;
import org.docbook.ns.docbook.Database;
import org.docbook.ns.docbook.Date;
import org.docbook.ns.docbook.Dedication;
import org.docbook.ns.docbook.Destructorsynopsis;
import org.docbook.ns.docbook.Edition;
import org.docbook.ns.docbook.Editor;
import org.docbook.ns.docbook.Email;
import org.docbook.ns.docbook.Emphasis;
import org.docbook.ns.docbook.Entry;
import org.docbook.ns.docbook.Entrytbl;
import org.docbook.ns.docbook.Envar;
import org.docbook.ns.docbook.Epigraph;
import org.docbook.ns.docbook.Equation;
import org.docbook.ns.docbook.Errorcode;
import org.docbook.ns.docbook.Errorname;
import org.docbook.ns.docbook.Errortext;
import org.docbook.ns.docbook.Errortype;
import org.docbook.ns.docbook.Example;
import org.docbook.ns.docbook.Exceptionname;
import org.docbook.ns.docbook.Extendedlink;
import org.docbook.ns.docbook.Fax;
import org.docbook.ns.docbook.Fieldsynopsis;
import org.docbook.ns.docbook.Figure;
import org.docbook.ns.docbook.Filename;
import org.docbook.ns.docbook.Firstname;
import org.docbook.ns.docbook.Firstterm;
import org.docbook.ns.docbook.Footnote;
import org.docbook.ns.docbook.Footnoteref;
import org.docbook.ns.docbook.Foreignphrase;
import org.docbook.ns.docbook.Formalpara;
import org.docbook.ns.docbook.Funcdef;
import org.docbook.ns.docbook.Funcparams;
import org.docbook.ns.docbook.Funcprototype;
import org.docbook.ns.docbook.Funcsynopsis;
import org.docbook.ns.docbook.Funcsynopsisinfo;
import org.docbook.ns.docbook.Function;
import org.docbook.ns.docbook.Glossary;
import org.docbook.ns.docbook.Glossdef;
import org.docbook.ns.docbook.Glossdiv;
import org.docbook.ns.docbook.Glossentry;
import org.docbook.ns.docbook.Glosslist;
import org.docbook.ns.docbook.Glosssee;
import org.docbook.ns.docbook.Glossseealso;
import org.docbook.ns.docbook.Glossterm;
import org.docbook.ns.docbook.Group;
import org.docbook.ns.docbook.Guibutton;
import org.docbook.ns.docbook.Guiicon;
import org.docbook.ns.docbook.Guilabel;
import org.docbook.ns.docbook.Guimenu;
import org.docbook.ns.docbook.Guimenuitem;
import org.docbook.ns.docbook.Guisubmenu;
import org.docbook.ns.docbook.Hardware;
import org.docbook.ns.docbook.Holder;
import org.docbook.ns.docbook.Honorific;
import org.docbook.ns.docbook.Imagedata;
import org.docbook.ns.docbook.Imageobject;
import org.docbook.ns.docbook.Imageobjectco;
import org.docbook.ns.docbook.Important;
import org.docbook.ns.docbook.Index;
import org.docbook.ns.docbook.Indexdiv;
import org.docbook.ns.docbook.Indexentry;
import org.docbook.ns.docbook.Indexterm;
import org.docbook.ns.docbook.Info;
import org.docbook.ns.docbook.Informalequation;
import org.docbook.ns.docbook.Informalexample;
import org.docbook.ns.docbook.Informalfigure;
import org.docbook.ns.docbook.Informaltable;
import org.docbook.ns.docbook.Initializer;
import org.docbook.ns.docbook.Inlineequation;
import org.docbook.ns.docbook.Inlinemediaobject;
import org.docbook.ns.docbook.Interfacename;
import org.docbook.ns.docbook.Issuenum;
import org.docbook.ns.docbook.Itemizedlist;
import org.docbook.ns.docbook.Itermset;
import org.docbook.ns.docbook.Jobtitle;
import org.docbook.ns.docbook.Keycap;
import org.docbook.ns.docbook.Keycode;
import org.docbook.ns.docbook.Keycombo;
import org.docbook.ns.docbook.Keysym;
import org.docbook.ns.docbook.Keyword;
import org.docbook.ns.docbook.Keywordset;
import org.docbook.ns.docbook.Label;
import org.docbook.ns.docbook.Legalnotice;
import org.docbook.ns.docbook.Lhs;
import org.docbook.ns.docbook.Lineage;
import org.docbook.ns.docbook.Lineannotation;
import org.docbook.ns.docbook.Link;
import org.docbook.ns.docbook.Listitem;
import org.docbook.ns.docbook.Literal;
import org.docbook.ns.docbook.Literallayout;
import org.docbook.ns.docbook.Locator;
import org.docbook.ns.docbook.Manvolnum;
import org.docbook.ns.docbook.Markup;
import org.docbook.ns.docbook.Mathphrase;
import org.docbook.ns.docbook.Mediaobject;
import org.docbook.ns.docbook.Member;
import org.docbook.ns.docbook.Menuchoice;
import org.docbook.ns.docbook.Methodname;
import org.docbook.ns.docbook.Methodparam;
import org.docbook.ns.docbook.Methodsynopsis;
import org.docbook.ns.docbook.Modifier;
import org.docbook.ns.docbook.Mousebutton;
import org.docbook.ns.docbook.Msg;
import org.docbook.ns.docbook.Msgaud;
import org.docbook.ns.docbook.Msgentry;
import org.docbook.ns.docbook.Msgexplan;
import org.docbook.ns.docbook.Msginfo;
import org.docbook.ns.docbook.Msglevel;
import org.docbook.ns.docbook.Msgmain;
import org.docbook.ns.docbook.Msgorig;
import org.docbook.ns.docbook.Msgrel;
import org.docbook.ns.docbook.Msgset;
import org.docbook.ns.docbook.Msgsub;
import org.docbook.ns.docbook.Msgtext;
import org.docbook.ns.docbook.Nonterminal;
import org.docbook.ns.docbook.Note;
import org.docbook.ns.docbook.Olink;
import org.docbook.ns.docbook.Ooclass;
import org.docbook.ns.docbook.Ooexception;
import org.docbook.ns.docbook.Oointerface;
import org.docbook.ns.docbook.Option;
import org.docbook.ns.docbook.Optional;
import org.docbook.ns.docbook.Orderedlist;
import org.docbook.ns.docbook.Org;
import org.docbook.ns.docbook.Orgdiv;
import org.docbook.ns.docbook.Orgname;
import org.docbook.ns.docbook.Otheraddr;
import org.docbook.ns.docbook.Othercredit;
import org.docbook.ns.docbook.Othername;
import org.docbook.ns.docbook.Pagenums;
import org.docbook.ns.docbook.Para;
import org.docbook.ns.docbook.Paramdef;
import org.docbook.ns.docbook.Parameter;
import org.docbook.ns.docbook.Part;
import org.docbook.ns.docbook.Partintro;
import org.docbook.ns.docbook.Person;
import org.docbook.ns.docbook.Personblurb;
import org.docbook.ns.docbook.Personname;
import org.docbook.ns.docbook.Phone;
import org.docbook.ns.docbook.Phrase;
import org.docbook.ns.docbook.Pob;
import org.docbook.ns.docbook.Postcode;
import org.docbook.ns.docbook.Preface;
import org.docbook.ns.docbook.Primary;
import org.docbook.ns.docbook.Primaryie;
import org.docbook.ns.docbook.Printhistory;
import org.docbook.ns.docbook.Procedure;
import org.docbook.ns.docbook.Production;
import org.docbook.ns.docbook.Productionrecap;
import org.docbook.ns.docbook.Productionset;
import org.docbook.ns.docbook.Productname;
import org.docbook.ns.docbook.Productnumber;
import org.docbook.ns.docbook.Programlisting;
import org.docbook.ns.docbook.Programlistingco;
import org.docbook.ns.docbook.Prompt;
import org.docbook.ns.docbook.Property;
import org.docbook.ns.docbook.Pubdate;
import org.docbook.ns.docbook.Publisher;
import org.docbook.ns.docbook.Publishername;
import org.docbook.ns.docbook.Qandadiv;
import org.docbook.ns.docbook.Qandaentry;
import org.docbook.ns.docbook.Qandaset;
import org.docbook.ns.docbook.Question;
import org.docbook.ns.docbook.Quote;
import org.docbook.ns.docbook.Refclass;
import org.docbook.ns.docbook.Refdescriptor;
import org.docbook.ns.docbook.Refentry;
import org.docbook.ns.docbook.Refentrytitle;
import org.docbook.ns.docbook.Reference;
import org.docbook.ns.docbook.Refmeta;
import org.docbook.ns.docbook.Refmiscinfo;
import org.docbook.ns.docbook.Refname;
import org.docbook.ns.docbook.Refnamediv;
import org.docbook.ns.docbook.Refpurpose;
import org.docbook.ns.docbook.Refsect1;
import org.docbook.ns.docbook.Refsect2;
import org.docbook.ns.docbook.Refsect3;
import org.docbook.ns.docbook.Refsection;
import org.docbook.ns.docbook.Refsynopsisdiv;
import org.docbook.ns.docbook.Releaseinfo;
import org.docbook.ns.docbook.Remark;
import org.docbook.ns.docbook.Replaceable;
import org.docbook.ns.docbook.Returnvalue;
import org.docbook.ns.docbook.Revdescription;
import org.docbook.ns.docbook.Revhistory;
import org.docbook.ns.docbook.Revision;
import org.docbook.ns.docbook.Revnumber;
import org.docbook.ns.docbook.Revremark;
import org.docbook.ns.docbook.Rhs;
import org.docbook.ns.docbook.Row;
import org.docbook.ns.docbook.Sbr;
import org.docbook.ns.docbook.Screen;
import org.docbook.ns.docbook.Screenco;
import org.docbook.ns.docbook.Screenshot;
import org.docbook.ns.docbook.Secondary;
import org.docbook.ns.docbook.Secondaryie;
import org.docbook.ns.docbook.Sect1;
import org.docbook.ns.docbook.Sect2;
import org.docbook.ns.docbook.Sect3;
import org.docbook.ns.docbook.Sect4;
import org.docbook.ns.docbook.Sect5;
import org.docbook.ns.docbook.Section;
import org.docbook.ns.docbook.See;
import org.docbook.ns.docbook.Seealso;
import org.docbook.ns.docbook.Seealsoie;
import org.docbook.ns.docbook.Seeie;
import org.docbook.ns.docbook.Seg;
import org.docbook.ns.docbook.Seglistitem;
import org.docbook.ns.docbook.Segmentedlist;
import org.docbook.ns.docbook.Segtitle;
import org.docbook.ns.docbook.Seriesvolnums;
import org.docbook.ns.docbook.Set;
import org.docbook.ns.docbook.Setindex;
import org.docbook.ns.docbook.Shortaffil;
import org.docbook.ns.docbook.Shortcut;
import org.docbook.ns.docbook.Sidebar;
import org.docbook.ns.docbook.Simpara;
import org.docbook.ns.docbook.Simplelist;
import org.docbook.ns.docbook.Simplemsgentry;
import org.docbook.ns.docbook.Simplesect;
import org.docbook.ns.docbook.Spanspec;
import org.docbook.ns.docbook.State;
import org.docbook.ns.docbook.Step;
import org.docbook.ns.docbook.Stepalternatives;
import org.docbook.ns.docbook.Street;
import org.docbook.ns.docbook.Subject;
import org.docbook.ns.docbook.Subjectset;
import org.docbook.ns.docbook.Subjectterm;
import org.docbook.ns.docbook.Subscript;
import org.docbook.ns.docbook.Substeps;
import org.docbook.ns.docbook.Subtitle;
import org.docbook.ns.docbook.Superscript;
import org.docbook.ns.docbook.Surname;
import org.docbook.ns.docbook.Symbol;
import org.docbook.ns.docbook.Synopfragment;
import org.docbook.ns.docbook.Synopfragmentref;
import org.docbook.ns.docbook.Synopsis;
import org.docbook.ns.docbook.Systemitem;
import org.docbook.ns.docbook.Table;
import org.docbook.ns.docbook.Tag;
import org.docbook.ns.docbook.Task;
import org.docbook.ns.docbook.Taskprerequisites;
import org.docbook.ns.docbook.Taskrelated;
import org.docbook.ns.docbook.Tasksummary;
import org.docbook.ns.docbook.Tbody;
import org.docbook.ns.docbook.Td;
import org.docbook.ns.docbook.Term;
import org.docbook.ns.docbook.Termdef;
import org.docbook.ns.docbook.Tertiary;
import org.docbook.ns.docbook.Tertiaryie;
import org.docbook.ns.docbook.Textdata;
import org.docbook.ns.docbook.Textobject;
import org.docbook.ns.docbook.Tfoot;
import org.docbook.ns.docbook.Tgroup;
import org.docbook.ns.docbook.Th;
import org.docbook.ns.docbook.Thead;
import org.docbook.ns.docbook.Tip;
import org.docbook.ns.docbook.Title;
import org.docbook.ns.docbook.Titleabbrev;
import org.docbook.ns.docbook.Toc;
import org.docbook.ns.docbook.Tocdiv;
import org.docbook.ns.docbook.Tocentry;
import org.docbook.ns.docbook.Token;
import org.docbook.ns.docbook.Tr;
import org.docbook.ns.docbook.Trademark;
import org.docbook.ns.docbook.Type;
import org.docbook.ns.docbook.Uri;
import org.docbook.ns.docbook.Userinput;
import org.docbook.ns.docbook.Varargs;
import org.docbook.ns.docbook.Variablelist;
import org.docbook.ns.docbook.Varlistentry;
import org.docbook.ns.docbook.Varname;
import org.docbook.ns.docbook.Videodata;
import org.docbook.ns.docbook.Videoobject;
import org.docbook.ns.docbook.Volumenum;
import org.docbook.ns.docbook.Warning;
import org.docbook.ns.docbook.Wordasword;
import org.docbook.ns.docbook.Xref;
import org.docbook.ns.docbook.Year;

/**
 * TODO
 *
 * @author Massimo Caliman
 */
public abstract class AbstractDocbookVisitor {

    private static final Logger LOG = Logger.getLogger(AbstractDocbookVisitor.class.getName());

    public void visitBookFile(File file) {
        Book book = new Book();
        try {
            JAXBContext jaxbCtx = JAXBContext.newInstance(book.getClass());
            Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            Source source = new StreamSource(file);
            book = (Book) unmarshaller.unmarshal(source);
            visit(book);
        } catch (JAXBException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    public void visitArticleFile(File file) {
        Article article = new Article();
        try {
            JAXBContext jaxbCtx = JAXBContext.newInstance(article.getClass());
            Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            Source source = new StreamSource(file);
            article = (Article) unmarshaller.unmarshal(source);
            visit(article);
        } catch (JAXBException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    public void visitObjectList(List<Object> list) {
        for (Object object : list) {
            visitElement(object);
        }
    }

    public void visitRefsectionList(List<Refsection> list) {
        for (Refsection refsection : list) {
            visit(refsection);
        }
    }

    public void visitRefentryList(List<Refentry> list) {
        for (Refentry refentry : list) {
            visitRefsectionList(refentry.getRefsections());
        }
    }

    
 
    //TODO Classical example need Chain-of-responsibility pattern!!!! (next release)
    public void visitElement(Object element) {
        if (element instanceof Abbrev) {
        } else if (element instanceof Abstract) {
            visit((Abstract) element);
        } else if (element instanceof Accel) {
            visit((Accel) element);
        } else if (element instanceof Acknowledgements) {
            visit((Acknowledgements) element);
        } else if (element instanceof Acronym) {
            visit((Acronym) element);
        } else if (element instanceof Address) {
            visit((Address) element);
        } else if (element instanceof Affiliation) {
            visit((Affiliation) element);
        } else if (element instanceof Alt) {
            visit((Alt) element);
        } else if (element instanceof Anchor) {
            visit((Anchor) element);
        } else if (element instanceof Annotation) {
            visit((Annotation) element);
        } else if (element instanceof Answer) {
            visit((Answer) element);
        } else if (element instanceof Appendix) {
            visit((Appendix) element);
        } else if (element instanceof Application) {
            visit((Application) element);
        } else if (element instanceof Arc) {
            visit((Arc) element);
        } else if (element instanceof Area) {
            visit((Area) element);
        } else if (element instanceof Areaset) {
            visit((Areaset) element);
        } else if (element instanceof Areaspec) {
            visit((Areaspec) element);
        } else if (element instanceof Arg) {
            visit((Arg) element);
        } else if (element instanceof Article) {
            visit((Article) element);
        } else if (element instanceof Artpagenums) {
            visit((Artpagenums) element);
        } else if (element instanceof Attribution) {
            visit((Attribution) element);
        } else if (element instanceof Audiodata) {
            visit((Audiodata) element);
        } else if (element instanceof Audioobject) {
            visit((Audioobject) element);
        } else if (element instanceof Author) {
            visit((Author) element);
        } else if (element instanceof Authorgroup) {
            visit((Authorgroup) element);
        } else if (element instanceof Authorinitials) {
            visit((Authorinitials) element);
        } else if (element instanceof Bibliocoverage) {
            visit((Bibliocoverage) element);
        } else if (element instanceof Bibliodiv) {
            visit((Bibliodiv) element);
        } else if (element instanceof Biblioentry) {
            visit((Biblioentry) element);
        } else if (element instanceof Bibliography) {
            visit((Bibliography) element);
        } else if (element instanceof Biblioid) {
            visit((Biblioid) element);
        } else if (element instanceof Bibliolist) {
            visit((Biblioid) element);
        } else if (element instanceof Bibliomisc) {
            visit((Bibliomisc) element);
        } else if (element instanceof Bibliomixed) {
            visit((Bibliomixed) element);
        } else if (element instanceof Bibliomset) {
            visit((Bibliomset) element);
        } else if (element instanceof Biblioref) {
            visit((Biblioref) element);
        } else if (element instanceof Bibliorelation) {
            visit((Bibliorelation) element);
        } else if (element instanceof Biblioset) {
            visit((Biblioset) element);
        } else if (element instanceof Bibliosource) {
            visit((Bibliosource) element);
        } else if (element instanceof Blockquote) {
            visit((Blockquote) element);
        } else if (element instanceof Book) {
            visit((Book) element);
        } else if (element instanceof Bridgehead) {
            visit((Bridgehead) element);
        } else if (element instanceof Callout) {
            visit((Callout) element);
        } else if (element instanceof Calloutlist) {
            visit((Calloutlist) element);
        } else if (element instanceof Caption) {
            visit((Caption) element);
        } else if (element instanceof Caution) {
            visit((Caution) element);
        } else if (element instanceof Chapter) {
            visit((Chapter) element);
        } else if (element instanceof Citation) {
            visit((Citation) element);
        } else if (element instanceof Citebiblioid) {
            visit((Citebiblioid) element);
        } else if (element instanceof Citerefentry) {
            visit((Citerefentry) element);
        } else if (element instanceof Citetitle) {
            visit((Citetitle) element);
        } else if (element instanceof City) {
            visit((City) element);
        } else if (element instanceof Classname) {
            visit((Classname) element);
        } else if (element instanceof Classsynopsis) {
            visit((Classsynopsis) element);
        } else if (element instanceof Classsynopsisinfo) {
            visit((Classsynopsisinfo) element);
        } else if (element instanceof Cmdsynopsis) {
            visit((Cmdsynopsis) element);
        } else if (element instanceof Co) {
            visit((Co) element);
        } else if (element instanceof Code) {
            visit((Code) element);
        } else if (element instanceof Col) {
            visit((Col) element);
        } else if (element instanceof Colgroup) {
            visit((Colgroup) element);
        } else if (element instanceof Collab) {
            visit((Collab) element);
        } else if (element instanceof Colophon) {
            visit((Colophon) element);
        } else if (element instanceof Colspec) {
            visit((Colspec) element);
        } else if (element instanceof Command) {
            visit((Command) element);
        } else if (element instanceof Computeroutput) {
            visit((Computeroutput) element);
        } else if (element instanceof Confdates) {
            visit((Confdates) element);
        } else if (element instanceof Confgroup) {
            visit((Confgroup) element);
        } else if (element instanceof Confnum) {
            visit((Confnum) element);
        } else if (element instanceof Confsponsor) {
            visit((Confsponsor) element);
        } else if (element instanceof Conftitle) {
            visit((Conftitle) element);
        } else if (element instanceof Constant) {
            visit((Constant) element);
        } else if (element instanceof Constraint) {
            visit((Constraint) element);
        } else if (element instanceof Constraintdef) {
            visit((Constraintdef) element);
        } else if (element instanceof Constructorsynopsis) {
            visit((Constructorsynopsis) element);
        } else if (element instanceof Contractnum) {
            visit((Contractnum) element);
        } else if (element instanceof Contractsponsor) {
            visit((Contractsponsor) element);
        } else if (element instanceof Contrib) {
            visit((Contrib) element);
        } else if (element instanceof Copyright) {
            visit((Copyright) element);
        } else if (element instanceof Coref) {
            visit((Coref) element);
        } else if (element instanceof Country) {
            visit((Country) element);
        } else if (element instanceof Cover) {
            visit((Cover) element);
        } else if (element instanceof Database) {
            visit((Database) element);
        } else if (element instanceof Date) {
            visit((Date) element);
        } else if (element instanceof Dedication) {
            visit((Dedication) element);
        } else if (element instanceof Destructorsynopsis) {
            visit((Destructorsynopsis) element);
        } else if (element instanceof Edition) {
            visit((Edition) element);
        } else if (element instanceof Editor) {
            visit((Editor) element);
        } else if (element instanceof Email) {
            visit((Email) element);
        } else if (element instanceof Emphasis) {
            visit((Emphasis) element);
        } else if (element instanceof Entry) {
            visit((Entry) element);
        } else if (element instanceof Entrytbl) {
            visit((Entrytbl) element);
        } else if (element instanceof Envar) {
            visit((Envar) element);
        } else if (element instanceof Epigraph) {
            visit((Epigraph) element);
        } else if (element instanceof Equation) {
            visit((Equation) element);
        } else if (element instanceof Errorcode) {
            visit((Errorcode) element);
        } else if (element instanceof Errorname) {
            visit((Errorname) element);
        } else if (element instanceof Errortext) {
            visit((Errortext) element);
        } else if (element instanceof Errortype) {
            visit((Errortype) element);
        } else if (element instanceof Example) {
            visit((Example) element);
        } else if (element instanceof Exceptionname) {
            visit((Exceptionname) element);
        } else if (element instanceof Extendedlink) {
            visit((Extendedlink) element);
        } else if (element instanceof Fax) {
            visit((Fax) element);
        } else if (element instanceof Fieldsynopsis) {
            visit((Fieldsynopsis) element);
        } else if (element instanceof Figure) {
            visit((Figure) element);
        } else if (element instanceof Filename) {
            visit((Filename) element);
        } else if (element instanceof Firstname) {
            visit((Firstname) element);
        } else if (element instanceof Firstterm) {
            visit((Firstterm) element);
        } else if (element instanceof Footnote) {
            visit((Footnote) element);
        } else if (element instanceof Footnoteref) {
            visit((Footnoteref) element);
        } else if (element instanceof Foreignphrase) {
            visit((Foreignphrase) element);
        } else if (element instanceof Formalpara) {
            visit((Formalpara) element);
        } else if (element instanceof Funcdef) {
            visit((Funcdef) element);
        } else if (element instanceof Funcparams) {
            visit((Funcparams) element);
        } else if (element instanceof Funcprototype) {
            visit((Funcprototype) element);
        } else if (element instanceof Funcsynopsis) {
            visit((Funcsynopsis) element);
        } else if (element instanceof Funcsynopsisinfo) {
            visit((Funcsynopsisinfo) element);
        } else if (element instanceof Function) {
            visit((Function) element);
        } else if (element instanceof Glossary) {
            visit((Glossary) element);
        } else if (element instanceof Glossdef) {
            visit((Glossdef) element);
        } else if (element instanceof Glossdiv) {
            visit((Glossdiv) element);
        } else if (element instanceof Glossentry) {
            visit((Glossentry) element);
        } else if (element instanceof Glosslist) {
            visit((Glosslist) element);
        } else if (element instanceof Glosssee) {
            visit((Glosssee) element);
        } else if (element instanceof Glossseealso) {
            visit((Glossseealso) element);
        } else if (element instanceof Glossterm) {
            visit((Glossterm) element);
        } else if (element instanceof Group) {
            visit((Group) element);
        } else if (element instanceof Guibutton) {
            visit((Guibutton) element);
        } else if (element instanceof Guiicon) {
            visit((Guiicon) element);
        } else if (element instanceof Guilabel) {
            visit((Guilabel) element);
        } else if (element instanceof Guimenu) {
            visit((Guimenu) element);
        } else if (element instanceof Guimenuitem) {
            visit((Guimenuitem) element);
        } else if (element instanceof Guisubmenu) {
            visit((Guisubmenu) element);
        } else if (element instanceof Hardware) {
            visit((Hardware) element);
        } else if (element instanceof Holder) {
            visit((Holder) element);
        } else if (element instanceof Honorific) {
            visit((Honorific) element);
        } else if (element instanceof Imagedata) {
            visit((Imagedata) element);
        } else if (element instanceof Imageobject) {
            visit((Imageobject) element);
        } else if (element instanceof Imageobjectco) {
            visit((Imageobjectco) element);
        } else if (element instanceof Important) {
            visit((Important) element);
        } else if (element instanceof Index) {
            visit((Index) element);
        } else if (element instanceof Indexdiv) {
            visit((Indexdiv) element);
        } else if (element instanceof Indexentry) {
            visit((Indexentry) element);
        } else if (element instanceof Indexterm) {
            visit((Indexterm) element);
        } else if (element instanceof Info) {
            visit((Info) element);
        } else if (element instanceof Informalequation) {
            visit((Informalequation) element);
        } else if (element instanceof Informalexample) {
            visit((Informalexample) element);
        } else if (element instanceof Informalfigure) {
            visit((Informalfigure) element);
        } else if (element instanceof Informaltable) {
            visit((Informaltable) element);
        } else if (element instanceof Initializer) {
            visit((Initializer) element);
        } else if (element instanceof Inlineequation) {
            visit((Inlineequation) element);
        } else if (element instanceof Inlinemediaobject) {
            visit((Inlinemediaobject) element);
        } else if (element instanceof Interfacename) {
            visit((Interfacename) element);
        } else if (element instanceof Issuenum) {
            visit((Issuenum) element);
        } else if (element instanceof Itemizedlist) {
            visit((Itemizedlist) element);
        } else if (element instanceof Itermset) {
            visit((Itermset) element);
        } else if (element instanceof Jobtitle) {
            visit((Jobtitle) element);
        } else if (element instanceof Keycap) {
            visit((Keycap) element);
        } else if (element instanceof Keycode) {
            visit((Keycode) element);
        } else if (element instanceof Keycombo) {
            visit((Keycombo) element);
        } else if (element instanceof Keysym) {
            visit((Keysym) element);
        } else if (element instanceof Keyword) {
            visit((Keyword) element);
        } else if (element instanceof Keywordset) {
            visit((Keywordset) element);
        } else if (element instanceof Label) {
            visit((Label) element);
        } else if (element instanceof Legalnotice) {
            visit((Legalnotice) element);
        } else if (element instanceof Lhs) {
            visit((Lhs) element);
        } else if (element instanceof Lineage) {
            visit((Lineage) element);
        } else if (element instanceof Lineannotation) {
            visit((Lineannotation) element);
        } else if (element instanceof Link) {
            visit((Link) element);
        } else if (element instanceof Listitem) {
            visit((Listitem) element);
        } else if (element instanceof Literal) {
            visit((Literal) element);
        } else if (element instanceof Literallayout) {
            visit((Literallayout) element);
        } else if (element instanceof Locator) {
            visit((Literallayout) element);
        } else if (element instanceof Manvolnum) {
            visit((Manvolnum) element);
        } else if (element instanceof Markup) {
            visit((Markup) element);
        } else if (element instanceof Mathphrase) {
            visit((Mathphrase) element);
        } else if (element instanceof Mediaobject) {
            visit((Mediaobject) element);
        } else if (element instanceof Member) {
            visit((Member) element);
        } else if (element instanceof Menuchoice) {
            visit((Menuchoice) element);
        } else if (element instanceof Methodname) {
            visit((Methodname) element);
        } else if (element instanceof Methodparam) {
            visit((Methodparam) element);
        } else if (element instanceof Methodsynopsis) {
            visit((Methodsynopsis) element);
        } else if (element instanceof Modifier) {
        } else if (element instanceof Mousebutton) {
        } else if (element instanceof Msg) {
        } else if (element instanceof Msgaud) {
        } else if (element instanceof Msgentry) {
        } else if (element instanceof Msgexplan) {
        } else if (element instanceof Msginfo) {
        } else if (element instanceof Msglevel) {
        } else if (element instanceof Msgmain) {
        } else if (element instanceof Msgorig) {
        } else if (element instanceof Msgrel) {
        } else if (element instanceof Msgset) {
        } else if (element instanceof Msgsub) {
        } else if (element instanceof Msgtext) {
        } else if (element instanceof Nonterminal) {
        } else if (element instanceof Note) {
            visit((Note) element);
        } else if (element instanceof Olink) {
        } else if (element instanceof Ooclass) {
        } else if (element instanceof Ooexception) {
        } else if (element instanceof Oointerface) {
        } else if (element instanceof Option) {
        } else if (element instanceof Optional) {
        } else if (element instanceof Orderedlist) {
        } else if (element instanceof Org) {
        } else if (element instanceof Orgdiv) {
        } else if (element instanceof Orgname) {
        } else if (element instanceof Otheraddr) {
        } else if (element instanceof Othercredit) {
        } else if (element instanceof Othername) {
        } else if (element instanceof Pagenums) {
        } else if (element instanceof Para) {
            visit((Para) element);
        } else if (element instanceof Paramdef) {
        } else if (element instanceof Parameter) {
        } else if (element instanceof Part) {
            visit((Part) element);
        } else if (element instanceof Partintro) {
            visit((Partintro) element);
        } else if (element instanceof Person) {
            visit((Person) element);
        } else if (element instanceof Personblurb) {
            visit((Personblurb) element);
        } else if (element instanceof Personname) {
        } else if (element instanceof Phone) {
        } else if (element instanceof Phrase) {
        } else if (element instanceof Pob) {
        } else if (element instanceof Postcode) {
        } else if (element instanceof Preface) {
        } else if (element instanceof Primary) {
        } else if (element instanceof Primaryie) {
        } else if (element instanceof Printhistory) {
        } else if (element instanceof Procedure) {
        } else if (element instanceof Production) {
        } else if (element instanceof Productionrecap) {
        } else if (element instanceof Productionset) {
        } else if (element instanceof Productname) {
        } else if (element instanceof Productnumber) {
        } else if (element instanceof Programlisting) {
        } else if (element instanceof Programlistingco) {
        } else if (element instanceof Prompt) {
        } else if (element instanceof Property) {
        } else if (element instanceof Pubdate) {
        } else if (element instanceof Publisher) {
        } else if (element instanceof Publishername) {
        } else if (element instanceof Qandadiv) {
        } else if (element instanceof Qandaentry) {
        } else if (element instanceof Qandaset) {
        } else if (element instanceof Question) {
        } else if (element instanceof Quote) {
        } else if (element instanceof Refclass) {
            visit((Refclass) element);
        } else if (element instanceof Refdescriptor) {
            visit((Refdescriptor) element);
        } else if (element instanceof Refentry) {
            visit((Refentry) element);
        } else if (element instanceof Refentrytitle) {
            visit((Refentrytitle) element);
        } else if (element instanceof Reference) {
            visit((Reference) element);
        } else if (element instanceof Refmeta) {
            visit((Refmeta) element);
        } else if (element instanceof Refmiscinfo) {
            visit((Refmiscinfo) element);
        } else if (element instanceof Refname) {
            visit((Refname) element);
        } else if (element instanceof Refnamediv) {
            visit((Refnamediv) element);
        } else if (element instanceof Refpurpose) {
            visit((Refpurpose) element);
        } else if (element instanceof Refsect1) {
            visit((Refsect1) element);
        } else if (element instanceof Refsect2) {
            visit((Refsect2) element);
        } else if (element instanceof Refsect3) {
            visit((Refsect3) element);
        } else if (element instanceof Refsection) {
            visit((Refsection) element);
        } else if (element instanceof Refsynopsisdiv) {
            visit((Refsynopsisdiv) element);
        } else if (element instanceof Releaseinfo) {
            visit((Releaseinfo) element);
        } else if (element instanceof Remark) {
            visit((Remark) element);
        } else if (element instanceof Replaceable) {
            visit((Replaceable) element);
        } else if (element instanceof Returnvalue) {
            visit((Returnvalue) element);
        } else if (element instanceof Revdescription) {
            visit((Revdescription) element);
        } else if (element instanceof Revhistory) {
            visit((Revhistory) element);
        } else if (element instanceof Revision) {
            visit((Revision) element);
        } else if (element instanceof Revnumber) {
            visit((Revnumber) element);
        } else if (element instanceof Revremark) {
            visit((Revremark) element);
        } else if (element instanceof Rhs) {
            visit((Rhs) element);
        } else if (element instanceof Row) {
            visit((Row) element);
        } else if (element instanceof Sbr) {
        } else if (element instanceof Screen) {
        } else if (element instanceof Screenco) {
        } else if (element instanceof Screenshot) {
        } else if (element instanceof Secondary) {
        } else if (element instanceof Secondaryie) {
        } else if (element instanceof Sect1) {
        } else if (element instanceof Sect2) {
        } else if (element instanceof Sect3) {
        } else if (element instanceof Sect4) {
        } else if (element instanceof Sect5) {
        } else if (element instanceof Section) {
        } else if (element instanceof See) {
        } else if (element instanceof Seealso) {
        } else if (element instanceof Seealsoie) {
        } else if (element instanceof Seeie) {
        } else if (element instanceof Seg) {
        } else if (element instanceof Seglistitem) {
        } else if (element instanceof Segmentedlist) {
        } else if (element instanceof Segtitle) {
        } else if (element instanceof Seriesvolnums) {
        } else if (element instanceof Set) {
        } else if (element instanceof Setindex) {
        } else if (element instanceof Shortaffil) {
        } else if (element instanceof Shortcut) {
        } else if (element instanceof Sidebar) {
        } else if (element instanceof Simpara) {
        } else if (element instanceof Simplelist) {
        } else if (element instanceof Simplemsgentry) {
        } else if (element instanceof Simplesect) {
        } else if (element instanceof Spanspec) {
        } else if (element instanceof State) {
        } else if (element instanceof Step) {
        } else if (element instanceof Stepalternatives) {
        } else if (element instanceof Street) {
        } else if (element instanceof Subject) {
        } else if (element instanceof Subjectset) {
        } else if (element instanceof Subjectterm) {
        } else if (element instanceof Subscript) {
        } else if (element instanceof Substeps) {
        } else if (element instanceof Subtitle) {
        } else if (element instanceof Superscript) {
        } else if (element instanceof Surname) {
        } else if (element instanceof Symbol) {
        } else if (element instanceof Synopfragment) {
        } else if (element instanceof Synopfragmentref) {
        } else if (element instanceof Synopsis) {
        } else if (element instanceof Systemitem) {
        } else if (element instanceof Table) {
        } else if (element instanceof Tag) {
        } else if (element instanceof Task) {
        } else if (element instanceof Taskprerequisites) {
        } else if (element instanceof Taskrelated) {
        } else if (element instanceof Tasksummary) {
        } else if (element instanceof Tbody) {
        } else if (element instanceof Td) {
        } else if (element instanceof Term) {
        } else if (element instanceof Termdef) {
        } else if (element instanceof Tertiary) {
        } else if (element instanceof Tertiaryie) {
        } else if (element instanceof Textdata) {
        } else if (element instanceof Textobject) {
        } else if (element instanceof Tfoot) {
        } else if (element instanceof Tgroup) {
        } else if (element instanceof Th) {
        } else if (element instanceof Thead) {
        } else if (element instanceof Tip) {
        } else if (element instanceof Title) {
            visit((Title) element);
        } else if (element instanceof Titleabbrev) {
        } else if (element instanceof Toc) {
        } else if (element instanceof Tocdiv) {
        } else if (element instanceof Tocentry) {
        } else if (element instanceof Token) {
        } else if (element instanceof Tr) {
        } else if (element instanceof Trademark) {
        } else if (element instanceof Type) {
        } else if (element instanceof Uri) {
        } else if (element instanceof Userinput) {
        } else if (element instanceof Varargs) {
        } else if (element instanceof Variablelist) {
        } else if (element instanceof Varlistentry) {
        } else if (element instanceof Varname) {
        } else if (element instanceof Videodata) {
        } else if (element instanceof Videoobject) {
        } else if (element instanceof Volumenum) {
        } else if (element instanceof Warning) {
        } else if (element instanceof Wordasword) {
        } else if (element instanceof Xref) {
        } else if (element instanceof Year) {
        } else if (element instanceof String) {
            visit((String) element);
        }

    }

    public abstract void visit(String string);

    public abstract void visit(Book book);

    public abstract void visit(Article article);

    public abstract void visit(Title title);

    public abstract void visit(Para para);

    public abstract void visit(Chapter chapter);

    public abstract void visit(Abbrev abbrev);

    public abstract void visit(Abstract abstr);

    public abstract void visit(Accel accel);

    public abstract void visit(Acknowledgements acknowledgements);

    public abstract void visit(Acronym acronym);

    public abstract void visit(Address element);

    public abstract void visit(Affiliation element);

    public abstract void visit(Alt element);

    public abstract void visit(Anchor element);

    public abstract void visit(Annotation element);

    public abstract void visit(Answer element);

    public abstract void visit(Appendix element);

    public abstract void visit(Application element);

    public abstract void visit(Arc element);

    public abstract void visit(Area element);

    public abstract void visit(Areaset element);

    public abstract void visit(Areaspec element);

    public abstract void visit(Arg element);

    public abstract void visit(Artpagenums element);

    public abstract void visit(Attribution element);

    public abstract void visit(Audiodata element);

    public abstract void visit(Audioobject element);

    public abstract void visit(Authorgroup element);

    public abstract void visit(Authorinitials element);

    public abstract void visit(Author element);

    public abstract void visit(Bibliocoverage element);

    public abstract void visit(Bibliodiv element);

    public abstract void visit(Biblioentry element);

    public abstract void visit(Bibliography element);

    public abstract void visit(Biblioid element);

    public abstract void visit(Bibliolist element);

    public abstract void visit(Bibliomisc element);

    public abstract void visit(Bibliomixed element);

    public abstract void visit(Bibliomset element);

    public abstract void visit(Biblioref element);

    public abstract void visit(Bibliorelation element);

    public abstract void visit(Biblioset element);

    public abstract void visit(Bibliosource element);

    public abstract void visit(Blockquote element);

    public abstract void visit(Bridgehead element);

    public abstract void visit(Callout element);

    public abstract void visit(Calloutlist element);

    public abstract void visit(Caption element);

    public abstract void visit(Caution element);

    public abstract void visit(Citation element);

    public abstract void visit(Citebiblioid element);

    public abstract void visit(Citerefentry element);

    public abstract void visit(Citetitle element);

    public abstract void visit(City element);

    public abstract void visit(Classname element);

    public abstract void visit(Classsynopsisinfo element);

    public abstract void visit(Classsynopsis element);

    public abstract void visit(Cmdsynopsis element);

    public abstract void visit(Code element);

    public abstract void visit(Co element);

    public abstract void visit(Colgroup element);

    public abstract void visit(Col element);

    public abstract void visit(Collab element);

    public abstract void visit(Colophon element);

    public abstract void visit(Colspec element);

    public abstract void visit(Command element);

    public abstract void visit(Computeroutput element);

    public abstract void visit(Confdates element);

    public abstract void visit(Confgroup element);

    public abstract void visit(Confnum element);

    public abstract void visit(Confsponsor element);

    public abstract void visit(Conftitle element);

    public abstract void visit(Constant element);

    public abstract void visit(Constraintdef element);

    public abstract void visit(Constraint element);

    public abstract void visit(Constructorsynopsis element);

    public abstract void visit(Contractnum element);

    public abstract void visit(Contractsponsor element);

    public abstract void visit(Contrib element);

    public abstract void visit(Copyright element);

    public abstract void visit(Coref element);

    public abstract void visit(Country element);

    public abstract void visit(Cover element);

    public abstract void visit(Database element);

    public abstract void visit(Date element);

    public abstract void visit(Dedication element);

    public abstract void visit(Destructorsynopsis element);

    public abstract void visit(Edition element);

    public abstract void visit(Editor element);

    public abstract void visit(Email element);

    public abstract void visit(Emphasis element);

    public abstract void visit(Entry element);

    public abstract void visit(Entrytbl element);

    public abstract void visit(Envar element);

    public abstract void visit(Epigraph element);

    public abstract void visit(Equation element);

    public abstract void visit(Errorcode element);

    public abstract void visit(Errorname element);

    public abstract void visit(Errortext element);

    public abstract void visit(Errortype element);

    public abstract void visit(Example element);

    public abstract void visit(Exceptionname element);

    public abstract void visit(Extendedlink element);

    public abstract void visit(Fax element);

    public abstract void visit(Fieldsynopsis element);

    public abstract void visit(Figure element);

    public abstract void visit(Filename element);

    public abstract void visit(Firstname element);

    public abstract void visit(Firstterm element);

    public abstract void visit(Footnote element);

    public abstract void visit(Footnoteref element);

    public abstract void visit(Foreignphrase element);

    public abstract void visit(Formalpara element);

    public abstract void visit(Funcdef element);

    public abstract void visit(Funcparams element);

    public abstract void visit(Funcprototype element);

    public abstract void visit(Funcsynopsisinfo element);

    public abstract void visit(Funcsynopsis element);

    public abstract void visit(Function element);

    public abstract void visit(Glossary element);

    public abstract void visit(Glossdef element);

    public abstract void visit(Glossdiv element);

    public abstract void visit(Glossentry element);

    public abstract void visit(Glosslist element);

    public abstract void visit(Glossseealso element);

    public abstract void visit(Glosssee element);

    public abstract void visit(Glossterm element);

    public abstract void visit(Group element);

    public abstract void visit(Guibutton element);

    public abstract void visit(Guiicon element);

    public abstract void visit(Guilabel element);

    public abstract void visit(Guimenuitem element);

    public abstract void visit(Guimenu element);

    public abstract void visit(Guisubmenu element);

    public abstract void visit(Hardware element);

    public abstract void visit(Holder element);

    public abstract void visit(Honorific element);

    public abstract void visit(Imagedata element);

    public abstract void visit(Imageobjectco element);

    public abstract void visit(Imageobject element);

    public abstract void visit(Important element);

    public abstract void visit(Indexdiv element);

    public abstract void visit(Indexentry element);

    public abstract void visit(Index element);

    public abstract void visit(Indexterm element);

    public abstract void visit(Info info);

    public abstract void visit(Informalequation element);

    public abstract void visit(Informalexample element);

    public abstract void visit(Informalfigure element);

    public abstract void visit(Informaltable element);

    public abstract void visit(Initializer element);

    public abstract void visit(Inlineequation element);

    public abstract void visit(Inlinemediaobject element);

    public abstract void visit(Interfacename element);

    public abstract void visit(Issuenum element);

    public abstract void visit(Itemizedlist element);

    public abstract void visit(Itermset element);

    public abstract void visit(Jobtitle element);

    public abstract void visit(Keycap element);

    public abstract void visit(Keycode element);

    public abstract void visit(Keycombo element);

    public abstract void visit(Keysym element);

    public abstract void visit(Keyword element);

    public abstract void visit(Keywordset element);

    public abstract void visit(Label element);

    public abstract void visit(Legalnotice element);

    public abstract void visit(Lhs element);

    public abstract void visit(Lineage element);

    public abstract void visit(Lineannotation element);

    public abstract void visit(Link element);

    public abstract void visit(Listitem element);

    public abstract void visit(Literal element);

    public abstract void visit(Literallayout element);

    public abstract void visit(Locator element);

    public abstract void visit(Manvolnum element);

    public abstract void visit(Markup element);

    public abstract void visit(Mathphrase element);

    public abstract void visit(Mediaobject element);

    public abstract void visit(Member element);

    public abstract void visit(Menuchoice element);

    public abstract void visit(Methodname element);

    public abstract void visit(Methodparam element);

    public abstract void visit(Methodsynopsis element);

    public abstract void visit(Modifier element);

    public abstract void visit(Mousebutton element);

    public abstract void visit(Msgaud element);

    public abstract void visit(Msgentry element);

    public abstract void visit(Msgexplan element);

    public abstract void visit(Msginfo element);

    public abstract void visit(Msg element);

    public abstract void visit(Msglevel element);

    public abstract void visit(Msgmain element);

    public abstract void visit(Msgorig element);

    public abstract void visit(Msgrel element);

    public abstract void visit(Msgset element);

    public abstract void visit(Msgsub element);

    public abstract void visit(Msgtext element);

    public abstract void visit(Nonterminal element);

    public abstract void visit(Note element);

    public abstract void visit(Olink element);

    public abstract void visit(Ooclass element);

    public abstract void visit(Ooexception element);

    public abstract void visit(Oointerface element);

    public abstract void visit(Optional element);

    public abstract void visit(Option element);

    public abstract void visit(Orderedlist element);

    public abstract void visit(Orgdiv element);

    public abstract void visit(Org element);

    public abstract void visit(Orgname element);

    public abstract void visit(Otheraddr element);

    public abstract void visit(Othercredit element);

    public abstract void visit(Othername element);

    public abstract void visit(Package element);

    public abstract void visit(Pagenums element);

    public abstract void visit(Paramdef element);

    public abstract void visit(Parameter element);

    public abstract void visit(Partintro element);

    public abstract void visit(Part element);

    public abstract void visit(Personblurb element);

    public abstract void visit(Person element);

    public abstract void visit(Personname element);

    public abstract void visit(Phone element);

    public abstract void visit(Phrase element);

    public abstract void visit(Pob element);

    public abstract void visit(Postcode element);

    public abstract void visit(Preface element);

    public abstract void visit(Primaryie element);

    public abstract void visit(Primary element);

    public abstract void visit(Printhistory element);

    public abstract void visit(Procedure element);

    public abstract void visit(Production element);

    public abstract void visit(Productionrecap element);

    public abstract void visit(Productionset element);

    public abstract void visit(Productname element);

    public abstract void visit(Productnumber element);

    public abstract void visit(Programlistingco element);

    public abstract void visit(Programlisting element);

    public abstract void visit(Prompt element);

    public abstract void visit(Property element);

    public abstract void visit(Pubdate element);

    public abstract void visit(Publisher element);

    public abstract void visit(Publishername element);

    public abstract void visit(Qandadiv element);

    public abstract void visit(Qandaentry element);

    public abstract void visit(Qandaset element);

    public abstract void visit(Question element);

    public abstract void visit(Quote element);

    public abstract void visit(Refclass element);

    public abstract void visit(Refdescriptor element);

    public abstract void visit(Refentry element);

    public abstract void visit(Refentrytitle element);

    public abstract void visit(Reference element);

    public abstract void visit(Refmeta element);

    public abstract void visit(Refmiscinfo element);

    public abstract void visit(Refnamediv element);

    public abstract void visit(Refname element);

    public abstract void visit(Refpurpose element);

    public abstract void visit(Refsect1 element);

    public abstract void visit(Refsect2 element);

    public abstract void visit(Refsect3 element);

    public abstract void visit(Refsection refsection);

    public abstract void visit(Refsynopsisdiv element);

    public abstract void visit(Releaseinfo element);

    public abstract void visit(Remark element);

    public abstract void visit(Replaceable element);

    public abstract void visit(Returnvalue element);

    public abstract void visit(Revdescription element);

    public abstract void visit(Revhistory element);

    public abstract void visit(Revision element);

    public abstract void visit(Revnumber element);

    public abstract void visit(Revremark element);

    public abstract void visit(Rhs element);

    public abstract void visit(Row element);

    public abstract void visit(Sbr element);

    public abstract void visit(Screenco element);

    public abstract void visit(Screen element);

    public abstract void visit(Screenshot element);

    public abstract void visit(Secondaryie element);

    public abstract void visit(Secondary element);

    public abstract void visit(Sect1 element);

    public abstract void visit(Sect2 element);

    public abstract void visit(Sect3 element);

    public abstract void visit(Sect4 element);

    public abstract void visit(Sect5 element);

    public abstract void visit(Section element);

    public abstract void visit(Seealsoie element);

    public abstract void visit(Seealso element);

    public abstract void visit(Seeie element);

    public abstract void visit(See element);

    public abstract void visit(Seg element);

    public abstract void visit(Seglistitem element);

    public abstract void visit(Segmentedlist element);

    public abstract void visit(Segtitle element);

    public abstract void visit(Seriesvolnums element);

    public abstract void visit(Setindex element);

    public abstract void visit(Set element);

    public abstract void visit(Shortaffil element);

    public abstract void visit(Shortcut element);

    public abstract void visit(Sidebar element);

    public abstract void visit(Simpara element);

    public abstract void visit(Simplelist element);

    public abstract void visit(Simplemsgentry element);

    public abstract void visit(Simplesect element);

    public abstract void visit(Spanspec element);

    public abstract void visit(State element);

    public abstract void visit(Stepalternatives element);

    public abstract void visit(Step element);

    public abstract void visit(Street element);

    public abstract void visit(Subject element);

    public abstract void visit(Subjectset element);

    public abstract void visit(Subjectterm element);

    public abstract void visit(Subscript element);

    public abstract void visit(Substeps element);

    public abstract void visit(Subtitle element);

    public abstract void visit(Superscript element);

    public abstract void visit(Surname element);

    public abstract void visit(Symbol element);

    public abstract void visit(Synopfragment element);

    public abstract void visit(Synopfragmentref element);

    public abstract void visit(Synopsis element);

    public abstract void visit(Systemitem element);

    public abstract void visit(Table element);

    public abstract void visit(Tag element);

    public abstract void visit(Task element);

    public abstract void visit(Taskprerequisites element);

    public abstract void visit(Taskrelated element);

    public abstract void visit(Tasksummary element);

    public abstract void visit(Tbody element);

    public abstract void visit(Td element);

    public abstract void visit(Termdef element);

    public abstract void visit(Term element);

    public abstract void visit(Tertiaryie element);

    public abstract void visit(Tertiary element);

    public abstract void visit(Textdata element);

    public abstract void visit(Textobject element);

    public abstract void visit(Tfoot element);

    public abstract void visit(Tgroup element);

    public abstract void visit(Thead element);

    public abstract void visit(Th element);

    public abstract void visit(Tip element);

    public abstract void visit(Titleabbrev element);

    public abstract void visit(Tocdiv element);

    public abstract void visit(Tocentry element);

    public abstract void visit(Toc element);

    public abstract void visit(Token element);

    public abstract void visit(Trademark element);

    public abstract void visit(Tr element);

    public abstract void visit(Type element);

    public abstract void visit(Uri element);

    public abstract void visit(Userinput element);

    public abstract void visit(Varargs element);

    public abstract void visit(Variablelist element);

    public abstract void visit(Varlistentry element);

    public abstract void visit(Varname element);

    public abstract void visit(Videodata element);

    public abstract void visit(Videoobject element);

    public abstract void visit(Void element);

    public abstract void visit(Volumenum element);

    public abstract void visit(Warning element);

    public abstract void visit(Wordasword element);

    public abstract void visit(Xref element);

    public abstract void visit(Year year);

}
