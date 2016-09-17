/*
 The MIT License (MIT)

 Copyright (c) 2015 Massimo Caliman

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

import java.util.List;

import java.util.logging.Logger;
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
 * Appendix Article Book Chapter Glossary Part Refentry Section
 *
 * @author Massimo Caliman
 */
public class DefaultDocbookVisitor extends AbstractDocbookVisitor {

    private final static Logger logger = Logger.getLogger(DefaultDocbookVisitor.class.getName());

    private long numberOfChapters;
    private long numberOfPara;

    public DefaultDocbookVisitor() {

    }

    private void label(String string) {
        System.out.println(string);
    }

    private void value(String string) {
        System.out.println(string);
    }

    private void print(String string) {
        System.out.print(string);
    }

    private void println(String string) {
        System.out.println(string);
    }

    public void visit(String content) {
        println(content);
    }

    public void visit(Title title) {
        label("Title");
        List<Object> list = title.getContent();
        for (Object object : list) {
            visitElement(object);
        }
    }

    public void visit(Article article) {
        label("Article");

        article.getTitlesAndTitleabbrevsAndSubtitles();
        article.getGlossariesAndBibliographiesAndIndices();
    }

    public void visit(Book book) {
        label("Book");
        String actuate = book.getActuate();
        String annotations = book.getAnnotations();
        String arch = book.getArch();
        String arcrole = book.getArcrole();
        String audience = book.getAudience();
        String base = book.getBase();
        String commonRevision = book.getCommonRevision();
        String commonVersion = book.getCommonVersion();
        String condition = book.getCondition();
        String conformance = book.getConformance();
        String dir = book.getDir();
        String href = book.getHref();
        String id = book.getId();
        String label = book.getLabel();
        Object linkend = book.getLinkend();
        String os = book.getOs();
        String remap = book.getRemap();
        String revisionflag = book.getRevisionflag();
        String role = book.getRole();
        String security = book.getSecurity();
        String show = book.getShow();
        String status = book.getStatus();
        String userlevel = book.getUserlevel();
        String vendor = book.getVendor();
        String wordsize = book.getWordsize();
        String xlinkRole = book.getXlinkRole();
        String xlinkTitle = book.getXlinkTitle();
        String xlinkType = book.getXlinkType();
        String xmlLang = book.getXmlLang();
        String xreflabel = book.getXreflabel();

        visit(book.getInfo());
        visitObjectList(book.getTitlesAndTitleabbrevsAndSubtitles());
        visitObjectList(book.getGlossariesAndBibliographiesAndIndices());

        //TODO Complete counters
        System.out.println("=========================================");
        System.out.println("Number Of Chapters:" + this.numberOfChapters);
        System.out.println("Number Of Para:" + this.numberOfPara);
        System.out.println("=========================================");
    }

    //Experiment: show how to remove multiple if (severals if) and instanceof? (List<Object> is the prob.)
    public void visit(Para para) {
        label("Para");
        this.numberOfPara++;
        List<Object> list = para.getContent();
        for (Object object : list) {
            visitElement(object);
        }
    }

    public void visit(Chapter chapter) {
        label("Chapter");
        this.numberOfChapters++;
        visitObjectList(chapter.getTitlesAndTitleabbrevsAndSubtitles());
        visitObjectList(chapter.getGlossariesAndBibliographiesAndIndices());
    }

    public void visit(Abbrev abbrev) {
        label("Abbrev");
        this.visitObjectList(abbrev.getContent());
    }

    public void visit(Abstract abstr) {
        label("Abstract");
        this.visit(abstr.getInfo());
        this.visitObjectList(abstr.getTitlesAndTitleabbrevs());
        this.visitObjectList(abstr.getAnchorsAndParasAndFormalparas());
    }

    public void visit(Accel accel) {
        label("Accel");
        visitObjectList(accel.getContent());
    }

    public void visit(Acknowledgements acknowledgements) {
        label("Acknowledgements");
    }

    public void visit(Acronym acronym) {
        label("Acknowledgements");
    }

    public void visit(Address element) {
        label("Address");
        List<Object> content = element.getContent();
        for (Object object : content) {
            visitElement(object);
        }
    }

    public void visit(Affiliation affiliation) {
        label("Affiliation");
        List<Address> addresses = affiliation.getAddresses();
        for (Address address : addresses) {
            visit(address);
        }
        List<Jobtitle> jobtitles = affiliation.getJobtitles();
        for (Jobtitle jobtitle : jobtitles) {
            visit(jobtitle);
        }
        Shortaffil shortaffil = affiliation.getShortaffil();
        visit(shortaffil);
    }

    public void visit(Alt element) {
        label("Alt");
        visitObjectList(element.getContent());
    }

    public void visit(Anchor element) {
        label("Anchor");
        //TODO
    }

    public void visit(Annotation element) {
        label("Annotation");
        visitObjectList(element.getTitlesAndTitleabbrevs());
        visitObjectList(element.getItemizedlistsAndOrderedlistsAndProcedures());        
    }

    public void visit(Answer element) {
        label("Answer");
        visitObjectList(element.getItemizedlistsAndOrderedlistsAndProcedures());
    }

    public void visit(Appendix element) {
        label("Appendix");
        visitObjectList(element.getTitlesAndTitleabbrevsAndSubtitles());
        visitObjectList(element.getGlossariesAndBibliographiesAndIndices());
    }

    public void visit(Application element) {
        label("Application");
        visitObjectList(element.getContent());
    }

    public void visit(Arc element) {
        label("Arc");
        //TODO
    }

    public void visit(Area element) {
        label("Area");
        //TODO
    }

    public void visit(Areaset element) {
        label("Areaset");
        List<Area> areas = element.getAreas();
        for (Area area : areas) {
            visit(area);
        }
        //TODO
    }

    public void visit(Areaspec element) {
        label("Areaspec");
    }

    public void visit(Arg element) {
        label("Arg");
    }

    public void visit(Artpagenums element) {
        label("Artpagenums");
    }

    public void visit(Attribution element) {
        label("Attribution");
    }

    public void visit(Audiodata element) {
        label("Audiodata");
    }

    public void visit(Audioobject element) {
        label("Audioobject");
    }

    public void visit(Authorgroup element) {
        label("Authorgroup");
    }

    public void visit(Authorinitials element) {
        label("Authorinitials");
    }

    public void visit(Author element) {
        label("Author");
        visit(element.getPersonname());
        visitObjectList(element.getPersonblurbsAndAffiliationsAndEmails());
    }

    public void visit(Bibliocoverage element) {
        label("Bibliocoverage");
    }

    public void visit(Bibliodiv element) {
        label("Bibliodiv");
    }

    public void visit(Biblioentry element) {
        label("Biblioentry");
    }

    public void visit(Bibliography element) {
        label("Bibliography");
    }

    public void visit(Biblioid element) {
        label("Biblioid");
    }

    public void visit(Bibliolist element) {
        label("Bibliolist");
    }

    public void visit(Bibliomisc element) {
        label("Bibliomisc");
    }

    public void visit(Bibliomixed element) {
        label("Bibliomixed");
    }

    public void visit(Bibliomset element) {
        label("Bibliomset");
    }

    public void visit(Biblioref element) {
        label("Biblioref");
    }

    public void visit(Bibliorelation element) {
        label("Bibliorelation");
    }

    public void visit(Biblioset element) {
        label("Biblioset");
    }

    public void visit(Bibliosource element) {
        label("Bibliosource");
    }

    public void visit(Blockquote element) {
        label("Blockquote");
    }

    public void visit(Bridgehead element) {
        label("Bridgehead");
    }

    public void visit(Callout element) {
        label("Callout");
    }

    public void visit(Calloutlist element) {
        label("Calloutlist");
    }

    public void visit(Caption element) {
        label("Caption");
    }

    public void visit(Caution element) {
        label("Caution");
    }

    public void visit(Citation element) {
        label("Citation");
    }

    public void visit(Citebiblioid element) {
        label("Citebiblioid");
    }

    public void visit(Citerefentry element) {
        label("Citerefentry");
    }

    public void visit(Citetitle element) {
        label("Citetitle");
    }

    public void visit(City element) {
        label("City");
        visitObjectList(element.getContent());        
    }

    public void visit(Classname element) {
        label("Classname");
        visitObjectList(element.getContent());
    }

    public void visit(Classsynopsisinfo element) {
        label("Classsynopsisinfo");
        visitObjectList(element.getContent());
    }

    public void visit(Classsynopsis element) {
        label("Classsynopsis");
    }

    public void visit(Cmdsynopsis element) {
        label("Cmdsynopsis");
    }

    public void visit(Code element) {
        label("Code");
    }

    public void visit(Co element) {
        //TODO
    }

    public void visit(Colgroup element) {
        //TODO
    }

    public void visit(Col element) {
        //TODO
    }

    public void visit(Collab element) {
        //TODO
    }

    public void visit(Colophon element) {
        //TODO
    }

    public void visit(Colspec element) {
        //TODO
    }

    public void visit(Command element) {
        //TODO
    }

    public void visit(Computeroutput element) {
        //TODO
    }

    public void visit(Confdates element) {
        //TODO
    }

    public void visit(Confgroup element) {
        //TODO
    }

    public void visit(Confnum element) {
        //TODO
    }

    public void visit(Confsponsor element) {
        //TODO
    }

    public void visit(Conftitle element) {
        //TODO
    }

    public void visit(Constant element) {
        //TODO
    }

    public void visit(Constraintdef element) {
        //TODO
    }

    public void visit(Constraint element) {
        //TODO
    }

    public void visit(Constructorsynopsis element) {
        //TODO
    }

    public void visit(Contractnum element) {
        //TODO
    }

    public void visit(Contractsponsor element) {
        //TODO
    }

    public void visit(Contrib element) {
        //TODO
    }

    public void visit(Copyright element) {
        //TODO
    }

    public void visit(Coref element) {
        //TODO
    }

    public void visit(Country element) {
        //TODO
    }

    public void visit(Cover element) {
        //TODO
    }

    public void visit(Database element) {
        //TODO
    }

    public void visit(Date element) {
        //TODO
    }

    public void visit(Dedication element) {
        //TODO
    }

    public void visit(Destructorsynopsis element) {
        //TODO
    }

    public void visit(Edition element) {
        //TODO
    }

    public void visit(Editor element) {
        //TODO
    }

    public void visit(Email element) {
        //TODO
    }

    public void visit(Emphasis element) {
        //TODO
    }

    public void visit(Entry element) {
        //TODO
    }

    public void visit(Entrytbl element) {
        //TODO
    }

    public void visit(Envar element) {
        //TODO
    }

    public void visit(Epigraph element) {
        //TODO
    }

    public void visit(Equation element) {
        //TODO
    }

    public void visit(Errorcode element) {
        //TODO
    }

    public void visit(Errorname element) {
        //TODO
    }

    public void visit(Errortext element) {
        //TODO
    }

    public void visit(Errortype element) {
        //TODO
    }

    public void visit(Example element) {
        //TODO
    }

    public void visit(Exceptionname element) {
        //TODO
    }

    public void visit(Extendedlink element) {
        //TODO
    }

    public void visit(Fax element) {
        //TODO
    }

    public void visit(Fieldsynopsis element) {
        //TODO
    }

    public void visit(Figure element) {
        //TODO
    }

    public void visit(Filename element) {
        //TODO
    }

    public void visit(Firstname element) {
        label("Firstname");
        visitObjectList(element.getContent());
    }

    public void visit(Firstterm element) {
        //TODO
    }

    public void visit(Footnote element) {
        //TODO
    }

    public void visit(Footnoteref element) {
        //TODO
    }

    public void visit(Foreignphrase element) {
        //TODO
    }

    public void visit(Formalpara element) {
        //TODO
    }

    public void visit(Funcdef element) {
        //TODO
    }

    public void visit(Funcparams element) {
        //TODO
    }

    public void visit(Funcprototype element) {
        //TODO
    }

    public void visit(Funcsynopsisinfo element) {
        //TODO
    }

    public void visit(Funcsynopsis element) {
        //TODO
    }

    public void visit(Function element) {
        //TODO
    }

    public void visit(Glossary element) {
        //TODO
    }

    public void visit(Glossdef element) {
        //TODO
    }

    public void visit(Glossdiv element) {
        //TODO
    }

    public void visit(Glossentry element) {
        //TODO
    }

    public void visit(Glosslist element) {
        //TODO
    }

    public void visit(Glossseealso element) {
        //TODO
    }

    public void visit(Glosssee element) {
        //TODO
    }

    public void visit(Glossterm element) {
        //TODO
    }

    public void visit(Group element) {
        //TODO
    }

    public void visit(Guibutton element) {
        //TODO
    }

    public void visit(Guiicon element) {
        //TODO
    }

    public void visit(Guilabel element) {
        //TODO
    }

    public void visit(Guimenuitem element) {
        //TODO
    }

    public void visit(Guimenu element) {
        //TODO
    }

    public void visit(Guisubmenu element) {
        //TODO
    }

    public void visit(Hardware element) {
        //TODO
    }

    public void visit(Holder element) {
        //TODO
    }

    public void visit(Honorific element) {
        //TODO
    }

    public void visit(Imagedata element) {
        //TODO
    }

    public void visit(Imageobjectco element) {
        //TODO
    }

    public void visit(Imageobject element) {
        //TODO
    }

    public void visit(Important element) {
        //TODO
    }

    public void visit(Indexdiv element) {
        //TODO
    }

    public void visit(Indexentry element) {
        //TODO
    }

    public void visit(Index element) {
        //TODO
    }

    public void visit(Indexterm element) {
        //TODO
    }

    public void visit(Info info) {
        if (info == null) {
            return;
        }
        visitObjectList(info.getTitlesAndTitleabbrevsAndSubtitles());
    }

    public void visit(Informalequation element) {
        //TODO
    }

    public void visit(Informalexample element) {
        //TODO
    }

    public void visit(Informalfigure element) {
        //TODO
    }

    public void visit(Informaltable element) {
        //TODO
    }

    public void visit(Initializer element) {
        //TODO
    }

    public void visit(Inlineequation element) {
        //TODO
    }

    public void visit(Inlinemediaobject element) {
        //TODO
    }

    public void visit(Interfacename element) {
        //TODO
    }

    public void visit(Issuenum element) {
        //TODO
    }

    public void visit(Itemizedlist element) {
        //TODO
    }

    public void visit(Itermset element) {
        //TODO
    }

    public void visit(Jobtitle element) {
        //TODO
    }

    public void visit(Keycap element) {
        //TODO
    }

    public void visit(Keycode element) {
        //TODO
    }

    public void visit(Keycombo element) {
        //TODO
    }

    public void visit(Keysym element) {
        //TODO
    }

    public void visit(Keyword element) {
        //TODO
    }

    public void visit(Keywordset element) {
        //TODO
    }

    public void visit(Label element) {
        //TODO
    }

    public void visit(Legalnotice element) {
        //TODO
    }

    public void visit(Lhs element) {
        //TODO
    }

    public void visit(Lineage element) {
        //TODO
    }

    public void visit(Lineannotation element) {
        //TODO
    }

    public void visit(Link element) {
        //TODO
    }

    public void visit(Listitem element) {
        //TODO
    }

    public void visit(Literal element) {
        //TODO
    }

    public void visit(Literallayout element) {
        //TODO
    }

    public void visit(Locator element) {
        //TODO
    }

    public void visit(Manvolnum element) {
        //TODO
    }

    public void visit(Markup element) {
        //TODO
    }

    public void visit(Mathphrase element) {
        //TODO
    }

    public void visit(Mediaobject element) {
        //TODO
    }

    public void visit(Member element) {
        //TODO
    }

    public void visit(Menuchoice element) {
        //TODO
    }

    public void visit(Methodname element) {
        //TODO
    }

    public void visit(Methodparam element) {
        //TODO
    }

    public void visit(Methodsynopsis element) {
        //TODO
    }

    public void visit(Modifier element) {
        //TODO
    }

    public void visit(Mousebutton element) {
        //TODO
    }

    public void visit(Msgaud element) {
        //TODO
    }

    public void visit(Msgentry element) {
        //TODO
    }

    public void visit(Msgexplan element) {
        //TODO
    }

    public void visit(Msginfo element) {
        //TODO
    }

    public void visit(Msg element) {
        //TODO
    }

    public void visit(Msglevel element) {
        //TODO
    }

    public void visit(Msgmain element) {
        //TODO
    }

    public void visit(Msgorig element) {
        //TODO
    }

    public void visit(Msgrel element) {
        //TODO
    }

    public void visit(Msgset element) {
        //TODO
    }

    public void visit(Msgsub element) {
        //TODO
    }

    public void visit(Msgtext element) {
        //TODO
    }

    public void visit(Nonterminal element) {
        //TODO
    }

    public void visit(Note element) {
        //TODO
    }

    public void visit(Olink element) {
        //TODO
    }

    public void visit(Ooclass element) {
        //TODO
    }

    public void visit(Ooexception element) {
        //TODO
    }

    public void visit(Oointerface element) {
        //TODO
    }

    public void visit(Optional element) {
        //TODO
    }

    public void visit(Option element) {
        //TODO
    }

    public void visit(Orderedlist element) {
        //TODO
    }

    public void visit(Orgdiv element) {
        //TODO
    }

    public void visit(Org element) {
        //TODO
    }

    public void visit(Orgname element) {
        //TODO
    }

    public void visit(Otheraddr element) {
        //TODO
    }

    public void visit(Othercredit element) {
        //TODO
    }

    public void visit(Othername element) {
        //TODO
    }

    public void visit(Package element) {
        //TODO
    }

    public void visit(Pagenums element) {
        //TODO
    }

    public void visit(Paramdef element) {
        //TODO
    }

    public void visit(Parameter element) {
        //TODO
    }

    public void visit(Partintro element) {
        print("Partinto:");
    }

    public void visit(Part element) {
        //TODO
    }

    public void visit(Personblurb element) {
        //TODO
    }

    public void visit(Person element) {
        //TODO
    }

    public void visit(Personname element) {
        label("Personname");
        visitObjectList(element.getContent());
    }

    public void visit(Phone element) {
        //TODO
    }

    public void visit(Phrase element) {
        //TODO
    }

    public void visit(Pob element) {
        //TODO
    }

    public void visit(Postcode element) {
        //TODO
    }

    public void visit(Preface element) {
        //TODO
    }

    public void visit(Primaryie element) {
        //TODO
    }

    public void visit(Primary element) {
        //TODO
    }

    public void visit(Printhistory element) {
        //TODO
    }

    public void visit(Procedure element) {
        //TODO
    }

    public void visit(Production element) {
        //TODO
    }

    public void visit(Productionrecap element) {
        //TODO
    }

    public void visit(Productionset element) {
        //TODO
    }

    public void visit(Productname element) {
        //TODO
    }

    public void visit(Productnumber element) {
        //TODO
    }

    public void visit(Programlistingco element) {
        //TODO
    }

    public void visit(Programlisting element) {
        //TODO
    }

    public void visit(Prompt element) {
        //TODO
    }

    public void visit(Property element) {
        //TODO
    }

    public void visit(Pubdate element) {
        //TODO
    }

    public void visit(Publisher element) {
        //TODO
    }

    public void visit(Publishername element) {
        //TODO
    }

    public void visit(Qandadiv element) {
        //TODO
    }

    public void visit(Qandaentry element) {
        //TODO
    }

    public void visit(Qandaset element) {
        //TODO
    }

    public void visit(Question element) {
        //TODO
    }

    public void visit(Quote element) {
        //TODO
    }

    public void visit(Refclass element) {
        //TODO
    }

    public void visit(Refdescriptor element) {
        //TODO
    }

    public void visit(Refentry element) {
        this.visit(element.getInfo());
        this.visitRefsectionList(element.getRefsections());
    }

    public void visit(Refentrytitle element) {
        //TODO
    }

    public void visit(Reference element) {
        print("Reference:");
        this.visitObjectList(element.getTitlesAndTitleabbrevsAndSubtitles());
        this.visitRefentryList(element.getRefentries());
        //element.getPartintro();
    }

    public void visit(Refmeta element) {
        //TODO
    }

    public void visit(Refmiscinfo element) {
        //TODO
    }

    public void visit(Refnamediv element) {
        //TODO
    }

    public void visit(Refname element) {
        //TODO
    }

    public void visit(Refpurpose element) {
        //TODO
    }

    public void visit(Refsect1 element) {
        //TODO
    }

    public void visit(Refsect2 element) {
        //TODO
    }

    public void visit(Refsect3 element) {
        //TODO
    }

    public void visit(Refsection refsection) {
        visitObjectList(refsection.getTitlesAndTitleabbrevsAndSubtitles());
        visitObjectList(refsection.getItemizedlistsAndOrderedlistsAndProcedures());
        visitRefsectionList(refsection.getRefsections());
    }

    public void visit(Refsynopsisdiv element) {
        //TODO
    }

    public void visit(Releaseinfo element) {
        //TODO
    }

    public void visit(Remark element) {
        //TODO
    }

    public void visit(Replaceable element) {
        //TODO
    }

    public void visit(Returnvalue element) {
        //TODO
    }

    public void visit(Revdescription element) {
        //TODO
    }

    public void visit(Revhistory element) {
        //TODO
    }

    public void visit(Revision element) {
        //TODO
    }

    public void visit(Revnumber element) {
        //TODO
    }

    public void visit(Revremark element) {
        //TODO
    }

    public void visit(Rhs element) {
        //TODO
    }

    public void visit(Row element) {
        //TODO
    }

    public void visit(Sbr element) {
        //TODO
    }

    public void visit(Screenco element) {
        //TODO
    }

    public void visit(Screen element) {
        //TODO
    }

    public void visit(Screenshot element) {
        //TODO
    }

    public void visit(Secondaryie element) {
        //TODO
    }

    public void visit(Secondary element) {
        //TODO
    }

    public void visit(Sect1 element) {
        //TODO
    }

    public void visit(Sect2 element) {
        //TODO
    }

    public void visit(Sect3 element) {
        //TODO
    }

    public void visit(Sect4 element) {
        //TODO
    }

    public void visit(Sect5 element) {
        //TODO
    }

    public void visit(Section element) {
        //TODO
    }

    public void visit(Seealsoie element) {
        //TODO
    }

    public void visit(Seealso element) {
        //TODO
    }

    public void visit(Seeie element) {
        //TODO
    }

    public void visit(See element) {
        //TODO
    }

    public void visit(Seg element) {
        //TODO
    }

    public void visit(Seglistitem element) {
        //TODO
    }

    public void visit(Segmentedlist element) {
        //TODO
    }

    public void visit(Segtitle element) {
        //TODO
    }

    public void visit(Seriesvolnums element) {
        //TODO
    }

    public void visit(Setindex element) {
        //TODO
    }

    public void visit(Set element) {
        //TODO
    }

    public void visit(Shortaffil element) {
        //TODO
    }

    public void visit(Shortcut element) {
        //TODO
    }

    public void visit(Sidebar element) {
        //TODO
    }

    public void visit(Simpara element) {
        //TODO
    }

    public void visit(Simplelist element) {
        //TODO
    }

    public void visit(Simplemsgentry element) {
        //TODO
    }

    public void visit(Simplesect element) {
        //TODO
    }

    public void visit(Spanspec element) {
        //TODO
    }

    public void visit(State element) {
        //TODO
    }

    public void visit(Stepalternatives element) {
        //TODO
    }

    public void visit(Step element) {
        //TODO
    }

    public void visit(Street element) {
        //TODO
    }

    public void visit(Subject element) {
        //TODO
    }

    public void visit(Subjectset element) {
        //TODO
    }

    public void visit(Subjectterm element) {
        //TODO
    }

    public void visit(Subscript element) {
        //TODO
    }

    public void visit(Substeps element) {
        //TODO
    }

    public void visit(Subtitle element) {
        //TODO
    }

    public void visit(Superscript element) {
        //TODO
    }

    public void visit(Surname element) {
        label("Surname");
        visitObjectList(element.getContent());
    }

    public void visit(Symbol element) {
        //TODO
    }

    public void visit(Synopfragment element) {
        //TODO
    }

    public void visit(Synopfragmentref element) {
        //TODO
    }

    public void visit(Synopsis element) {
        //TODO
    }

    public void visit(Systemitem element) {
        //TODO
    }

    public void visit(Table element) {
        //TODO
    }

    public void visit(Tag element) {
        //TODO
    }

    public void visit(Task element) {
        //TODO
    }

    public void visit(Taskprerequisites element) {
        //TODO
    }

    public void visit(Taskrelated element) {
        //TODO
    }

    public void visit(Tasksummary element) {
        //TODO
    }

    public void visit(Tbody element) {
        //TODO
    }

    public void visit(Td element) {
        //TODO
    }

    public void visit(Termdef element) {
        //TODO
    }

    public void visit(Term element) {
        //TODO
    }

    public void visit(Tertiaryie element) {
        //TODO
    }

    public void visit(Tertiary element) {
        //TODO
    }

    public void visit(Textdata element) {
        //TODO
    }

    public void visit(Textobject element) {
        //TODO
    }

    public void visit(Tfoot element) {
        //TODO
    }

    public void visit(Tgroup element) {
        //TODO
    }

    public void visit(Thead element) {
        //TODO
    }

    public void visit(Th element) {
        //TODO
    }

    public void visit(Tip element) {
        //TODO
    }

    public void visit(Titleabbrev element) {
        //TODO
    }

    public void visit(Tocdiv element) {
        //TODO
    }

    public void visit(Tocentry element) {
        //TODO
    }

    public void visit(Toc element) {
        //TODO
    }

    public void visit(Token element) {
        //TODO
    }

    public void visit(Trademark element) {
        //TODO
    }

    public void visit(Tr element) {
        //TODO
    }

    public void visit(Type element) {
        //TODO
    }

    public void visit(Uri element) {
        //TODO
    }

    public void visit(Userinput element) {
        //TODO
    }

    public void visit(Varargs element) {
        //TODO
    }

    public void visit(Variablelist element) {
        //TODO
    }

    public void visit(Varlistentry element) {
        //TODO
    }

    public void visit(Varname element) {
        //TODO
    }

    public void visit(Videodata element) {
        //TODO
    }

    public void visit(Videoobject element) {
        //TODO
    }

    public void visit(Void element) {
        //TODO
    }

    public void visit(Volumenum element) {
        //TODO
    }

    public void visit(Warning element) {
        //TODO
    }

    public void visit(Wordasword element) {
        //TODO
    }

    public void visit(Xref element) {
        //TODO
    }

    public void visit(Year year) {
        label("Year");
        visitObjectList(year.getContent());
    }

}
