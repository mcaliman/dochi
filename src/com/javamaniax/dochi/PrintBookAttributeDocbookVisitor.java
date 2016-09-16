
package com.javamaniax.dochi;

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

public class PrintBookAttributeDocbookVisitor extends AbstractDocbookVisitor {

    public PrintBookAttributeDocbookVisitor() {
    }

    @Override
    public void visit(String string) {
        
    }

    private void println(String string){
        System.out.println(string);
    }
    
    @Override
    public void visit(Book book) {
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
        String label=book.getLabel();
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

    }

    @Override
    public void visit(Article article) {
        
    }

    @Override
    public void visit(Title title) {
        
    }

    @Override
    public void visit(Para para) {
        
    }

    @Override
    public void visit(Chapter chapter) {
        
    }

    @Override
    public void visit(Abbrev abbrev) {
        
    }

    @Override
    public void visit(Abstract abstr) {
        
    }

    @Override
    public void visit(Accel accel) {
        
    }

    @Override
    public void visit(Acknowledgements acknowledgements) {
        
    }

    @Override
    public void visit(Acronym acronym) {
        
    }

    @Override
    public void visit(Address element) {
        
    }

    @Override
    public void visit(Affiliation element) {
        
    }

    @Override
    public void visit(Alt element) {
        
    }

    @Override
    public void visit(Anchor element) {
        
    }

    @Override
    public void visit(Annotation element) {
        
    }

    @Override
    public void visit(Answer element) {
        
    }

    @Override
    public void visit(Appendix element) {
        
    }

    @Override
    public void visit(Application element) {
        
    }

    @Override
    public void visit(Arc element) {
        
    }

    @Override
    public void visit(Area element) {
        
    }

    @Override
    public void visit(Areaset element) {
        
    }

    @Override
    public void visit(Areaspec element) {
        
    }

    @Override
    public void visit(Arg element) {
        
    }

    @Override
    public void visit(Artpagenums element) {
        
    }

    @Override
    public void visit(Attribution element) {
        
    }

    @Override
    public void visit(Audiodata element) {
        
    }

    @Override
    public void visit(Audioobject element) {
        
    }

    @Override
    public void visit(Authorgroup element) {
        
    }

    @Override
    public void visit(Authorinitials element) {
        
    }

    @Override
    public void visit(Author element) {
        
    }

    @Override
    public void visit(Bibliocoverage element) {
        
    }

    @Override
    public void visit(Bibliodiv element) {
        
    }

    @Override
    public void visit(Biblioentry element) {
        
    }

    @Override
    public void visit(Bibliography element) {
        
    }

    @Override
    public void visit(Biblioid element) {
        
    }

    @Override
    public void visit(Bibliolist element) {
        
    }

    @Override
    public void visit(Bibliomisc element) {
        
    }

    @Override
    public void visit(Bibliomixed element) {
        
    }

    @Override
    public void visit(Bibliomset element) {
        
    }

    @Override
    public void visit(Biblioref element) {
        
    }

    @Override
    public void visit(Bibliorelation element) {
        
    }

    @Override
    public void visit(Biblioset element) {
        
    }

    @Override
    public void visit(Bibliosource element) {
        
    }

    @Override
    public void visit(Blockquote element) {
        
    }

    @Override
    public void visit(Bridgehead element) {
        
    }

    @Override
    public void visit(Callout element) {
        
    }

    @Override
    public void visit(Calloutlist element) {
        
    }

    @Override
    public void visit(Caption element) {
        
    }

    @Override
    public void visit(Caution element) {
        
    }

    @Override
    public void visit(Citation element) {
        
    }

    @Override
    public void visit(Citebiblioid element) {
        
    }

    @Override
    public void visit(Citerefentry element) {
        
    }

    @Override
    public void visit(Citetitle element) {
        
    }

    @Override
    public void visit(City element) {
        
    }

    @Override
    public void visit(Classname element) {
        
    }

    @Override
    public void visit(Classsynopsisinfo element) {
        
    }

    @Override
    public void visit(Classsynopsis element) {
        
    }

    @Override
    public void visit(Cmdsynopsis element) {
        
    }

    @Override
    public void visit(Code element) {
        
    }

    @Override
    public void visit(Co element) {
        
    }

    @Override
    public void visit(Colgroup element) {
        
    }

    @Override
    public void visit(Col element) {
        
    }

    @Override
    public void visit(Collab element) {
        
    }

    @Override
    public void visit(Colophon element) {
        
    }

    @Override
    public void visit(Colspec element) {
        
    }

    @Override
    public void visit(Command element) {
        
    }

    @Override
    public void visit(Computeroutput element) {
        
    }

    @Override
    public void visit(Confdates element) {
        
    }

    @Override
    public void visit(Confgroup element) {
        
    }

    @Override
    public void visit(Confnum element) {
        
    }

    @Override
    public void visit(Confsponsor element) {
        
    }

    @Override
    public void visit(Conftitle element) {
        
    }

    @Override
    public void visit(Constant element) {
        
    }

    @Override
    public void visit(Constraintdef element) {
        
    }

    @Override
    public void visit(Constraint element) {
        
    }

    @Override
    public void visit(Constructorsynopsis element) {
        
    }

    @Override
    public void visit(Contractnum element) {
        
    }

    @Override
    public void visit(Contractsponsor element) {
        
    }

    @Override
    public void visit(Contrib element) {
        
    }

    @Override
    public void visit(Copyright element) {
        
    }

    @Override
    public void visit(Coref element) {
        
    }

    @Override
    public void visit(Country element) {
        
    }

    @Override
    public void visit(Cover element) {
        
    }

    @Override
    public void visit(Database element) {
        
    }

    @Override
    public void visit(Date element) {
        
    }

    @Override
    public void visit(Dedication element) {
        
    }

    @Override
    public void visit(Destructorsynopsis element) {
        
    }

    @Override
    public void visit(Edition element) {
        
    }

    @Override
    public void visit(Editor element) {
        
    }

    @Override
    public void visit(Email element) {
        
    }

    @Override
    public void visit(Emphasis element) {
        
    }

    @Override
    public void visit(Entry element) {
        
    }

    @Override
    public void visit(Entrytbl element) {
        
    }

    @Override
    public void visit(Envar element) {
        
    }

    @Override
    public void visit(Epigraph element) {
        
    }

    @Override
    public void visit(Equation element) {
        
    }

    @Override
    public void visit(Errorcode element) {
        
    }

    @Override
    public void visit(Errorname element) {
        
    }

    @Override
    public void visit(Errortext element) {
        
    }

    @Override
    public void visit(Errortype element) {
        
    }

    @Override
    public void visit(Example element) {
        
    }

    @Override
    public void visit(Exceptionname element) {
        
    }

    @Override
    public void visit(Extendedlink element) {
        
    }

    @Override
    public void visit(Fax element) {
        
    }

    @Override
    public void visit(Fieldsynopsis element) {
        
    }

    @Override
    public void visit(Figure element) {
        
    }

    @Override
    public void visit(Filename element) {
        
    }

    @Override
    public void visit(Firstname element) {
        
    }

    @Override
    public void visit(Firstterm element) {
        
    }

    @Override
    public void visit(Footnote element) {
        
    }

    @Override
    public void visit(Footnoteref element) {
        
    }

    @Override
    public void visit(Foreignphrase element) {
        
    }

    @Override
    public void visit(Formalpara element) {
        
    }

    @Override
    public void visit(Funcdef element) {
        
    }

    @Override
    public void visit(Funcparams element) {
        
    }

    @Override
    public void visit(Funcprototype element) {
        
    }

    @Override
    public void visit(Funcsynopsisinfo element) {
        
    }

    @Override
    public void visit(Funcsynopsis element) {
        
    }

    @Override
    public void visit(Function element) {
        
    }

    @Override
    public void visit(Glossary element) {
        
    }

    @Override
    public void visit(Glossdef element) {
        
    }

    @Override
    public void visit(Glossdiv element) {
        
    }

    @Override
    public void visit(Glossentry element) {
        
    }

    @Override
    public void visit(Glosslist element) {
        
    }

    @Override
    public void visit(Glossseealso element) {
        
    }

    @Override
    public void visit(Glosssee element) {
        
    }

    @Override
    public void visit(Glossterm element) {
        
    }

    @Override
    public void visit(Group element) {
        
    }

    @Override
    public void visit(Guibutton element) {
        
    }

    @Override
    public void visit(Guiicon element) {
        
    }

    @Override
    public void visit(Guilabel element) {
        
    }

    @Override
    public void visit(Guimenuitem element) {
        
    }

    @Override
    public void visit(Guimenu element) {
        
    }

    @Override
    public void visit(Guisubmenu element) {
        
    }

    @Override
    public void visit(Hardware element) {
        
    }

    @Override
    public void visit(Holder element) {
        
    }

    @Override
    public void visit(Honorific element) {
        
    }

    @Override
    public void visit(Imagedata element) {
        
    }

    @Override
    public void visit(Imageobjectco element) {
        
    }

    @Override
    public void visit(Imageobject element) {
        
    }

    @Override
    public void visit(Important element) {
        
    }

    @Override
    public void visit(Indexdiv element) {
        
    }

    @Override
    public void visit(Indexentry element) {
        
    }

    @Override
    public void visit(Index element) {
        
    }

    @Override
    public void visit(Indexterm element) {
        
    }

    public void visit(Info info) {
        if (info == null) {
            return;
        }
        visitObjectList(info.getTitlesAndTitleabbrevsAndSubtitles());
    }

    @Override
    public void visit(Informalequation element) {
        
    }

    @Override
    public void visit(Informalexample element) {
        
    }

    @Override
    public void visit(Informalfigure element) {
        
    }

    @Override
    public void visit(Informaltable element) {
        
    }

    @Override
    public void visit(Initializer element) {
        
    }

    @Override
    public void visit(Inlineequation element) {
        
    }

    @Override
    public void visit(Inlinemediaobject element) {
        
    }

    @Override
    public void visit(Interfacename element) {
        
    }

    @Override
    public void visit(Issuenum element) {
        
    }

    @Override
    public void visit(Itemizedlist element) {
        
    }

    @Override
    public void visit(Itermset element) {
        
    }

    @Override
    public void visit(Jobtitle element) {
        
    }

    @Override
    public void visit(Keycap element) {
        
    }

    @Override
    public void visit(Keycode element) {
        
    }

    @Override
    public void visit(Keycombo element) {
        
    }

    @Override
    public void visit(Keysym element) {
        
    }

    @Override
    public void visit(Keyword element) {
        
    }

    @Override
    public void visit(Keywordset element) {
        
    }

    @Override
    public void visit(Label element) {
        
    }

    @Override
    public void visit(Legalnotice element) {
        
    }

    @Override
    public void visit(Lhs element) {
        
    }

    @Override
    public void visit(Lineage element) {
        
    }

    @Override
    public void visit(Lineannotation element) {
        
    }

    @Override
    public void visit(Link element) {
        
    }

    @Override
    public void visit(Listitem element) {
        
    }

    @Override
    public void visit(Literal element) {
        
    }

    @Override
    public void visit(Literallayout element) {
        
    }

    @Override
    public void visit(Locator element) {
        
    }

    @Override
    public void visit(Manvolnum element) {
        
    }

    @Override
    public void visit(Markup element) {
        
    }

    @Override
    public void visit(Mathphrase element) {
        
    }

    @Override
    public void visit(Mediaobject element) {
        
    }

    @Override
    public void visit(Member element) {
        
    }

    @Override
    public void visit(Menuchoice element) {
        
    }

    @Override
    public void visit(Methodname element) {
        
    }

    @Override
    public void visit(Methodparam element) {
        
    }

    @Override
    public void visit(Methodsynopsis element) {
        
    }

    @Override
    public void visit(Modifier element) {
        
    }

    @Override
    public void visit(Mousebutton element) {
        
    }

    @Override
    public void visit(Msgaud element) {
        
    }

    @Override
    public void visit(Msgentry element) {
        
    }

    @Override
    public void visit(Msgexplan element) {
        
    }

    @Override
    public void visit(Msginfo element) {
        
    }

    @Override
    public void visit(Msg element) {
        
    }

    @Override
    public void visit(Msglevel element) {
        
    }

    @Override
    public void visit(Msgmain element) {
        
    }

    @Override
    public void visit(Msgorig element) {
        
    }

    @Override
    public void visit(Msgrel element) {
        
    }

    @Override
    public void visit(Msgset element) {
        
    }

    @Override
    public void visit(Msgsub element) {
        
    }

    @Override
    public void visit(Msgtext element) {
        
    }

    @Override
    public void visit(Nonterminal element) {
        
    }

    @Override
    public void visit(Note element) {
        
    }

    @Override
    public void visit(Olink element) {
        
    }

    @Override
    public void visit(Ooclass element) {
        
    }

    @Override
    public void visit(Ooexception element) {
        
    }

    @Override
    public void visit(Oointerface element) {
        
    }

    @Override
    public void visit(Optional element) {
        
    }

    @Override
    public void visit(Option element) {
        
    }

    @Override
    public void visit(Orderedlist element) {
        
    }

    @Override
    public void visit(Orgdiv element) {
        
    }

    @Override
    public void visit(Org element) {
        
    }

    @Override
    public void visit(Orgname element) {
        
    }

    @Override
    public void visit(Otheraddr element) {
        
    }

    @Override
    public void visit(Othercredit element) {
        
    }

    @Override
    public void visit(Othername element) {
        
    }

    @Override
    public void visit(Package element) {
        
    }

    @Override
    public void visit(Pagenums element) {
        
    }

    @Override
    public void visit(Paramdef element) {
        
    }

    @Override
    public void visit(Parameter element) {
        
    }

    @Override
    public void visit(Partintro element) {
        
    }

    @Override
    public void visit(Part element) {
        
    }

    @Override
    public void visit(Personblurb element) {
        
    }

    @Override
    public void visit(Person element) {
        
    }

    @Override
    public void visit(Personname element) {
        
    }

    @Override
    public void visit(Phone element) {
        
    }

    @Override
    public void visit(Phrase element) {
        
    }

    @Override
    public void visit(Pob element) {
        
    }

    @Override
    public void visit(Postcode element) {
        
    }

    @Override
    public void visit(Preface element) {
        
    }

    @Override
    public void visit(Primaryie element) {
        
    }

    @Override
    public void visit(Primary element) {
        
    }

    @Override
    public void visit(Printhistory element) {
        
    }

    @Override
    public void visit(Procedure element) {
        
    }

    @Override
    public void visit(Production element) {
        
    }

    @Override
    public void visit(Productionrecap element) {
        
    }

    @Override
    public void visit(Productionset element) {
        
    }

    @Override
    public void visit(Productname element) {
        
    }

    @Override
    public void visit(Productnumber element) {
        
    }

    @Override
    public void visit(Programlistingco element) {
        
    }

    @Override
    public void visit(Programlisting element) {
        
    }

    @Override
    public void visit(Prompt element) {
        
    }

    @Override
    public void visit(Property element) {
        
    }

    @Override
    public void visit(Pubdate element) {
        
    }

    @Override
    public void visit(Publisher element) {
        
    }

    @Override
    public void visit(Publishername element) {
        
    }

    @Override
    public void visit(Qandadiv element) {
        
    }

    @Override
    public void visit(Qandaentry element) {
        
    }

    @Override
    public void visit(Qandaset element) {
        
    }

    @Override
    public void visit(Question element) {
        
    }

    @Override
    public void visit(Quote element) {
        
    }

    @Override
    public void visit(Refclass element) {
        
    }

    @Override
    public void visit(Refdescriptor element) {
        
    }

    @Override
    public void visit(Refentry element) {
        
    }

    @Override
    public void visit(Refentrytitle element) {
        
    }

    @Override
    public void visit(Reference element) {
        
    }

    @Override
    public void visit(Refmeta element) {
        
    }

    @Override
    public void visit(Refmiscinfo element) {
        
    }

    @Override
    public void visit(Refnamediv element) {
        
    }

    @Override
    public void visit(Refname element) {
        
    }

    @Override
    public void visit(Refpurpose element) {
        
    }

    @Override
    public void visit(Refsect1 element) {
        
    }

    @Override
    public void visit(Refsect2 element) {
        
    }

    @Override
    public void visit(Refsect3 element) {
        
    }

    @Override
    public void visit(Refsection refsection) {
        
    }

    @Override
    public void visit(Refsynopsisdiv element) {
        
    }

    @Override
    public void visit(Releaseinfo element) {
        
    }

    @Override
    public void visit(Remark element) {
        
    }

    @Override
    public void visit(Replaceable element) {
        
    }

    @Override
    public void visit(Returnvalue element) {
        
    }

    @Override
    public void visit(Revdescription element) {
        
    }

    @Override
    public void visit(Revhistory element) {
        
    }

    @Override
    public void visit(Revision element) {
        
    }

    @Override
    public void visit(Revnumber element) {
        
    }

    @Override
    public void visit(Revremark element) {
        
    }

    @Override
    public void visit(Rhs element) {
        
    }

    @Override
    public void visit(Row element) {
        
    }

    @Override
    public void visit(Sbr element) {
        
    }

    @Override
    public void visit(Screenco element) {
        
    }

    @Override
    public void visit(Screen element) {
        
    }

    @Override
    public void visit(Screenshot element) {
        
    }

    @Override
    public void visit(Secondaryie element) {
        
    }

    @Override
    public void visit(Secondary element) {
        
    }

    @Override
    public void visit(Sect1 element) {
        
    }

    @Override
    public void visit(Sect2 element) {
        
    }

    @Override
    public void visit(Sect3 element) {
        
    }

    @Override
    public void visit(Sect4 element) {
        
    }

    @Override
    public void visit(Sect5 element) {
        
    }

    @Override
    public void visit(Section element) {
        
    }

    @Override
    public void visit(Seealsoie element) {
        
    }

    @Override
    public void visit(Seealso element) {
        
    }

    @Override
    public void visit(Seeie element) {
        
    }

    @Override
    public void visit(See element) {
        
    }

    @Override
    public void visit(Seg element) {
        
    }

    @Override
    public void visit(Seglistitem element) {
        
    }

    @Override
    public void visit(Segmentedlist element) {
        
    }

    @Override
    public void visit(Segtitle element) {
        
    }

    @Override
    public void visit(Seriesvolnums element) {
        
    }

    @Override
    public void visit(Setindex element) {
        
    }

    @Override
    public void visit(Set element) {
        
    }

    @Override
    public void visit(Shortaffil element) {
        
    }

    @Override
    public void visit(Shortcut element) {
        
    }

    @Override
    public void visit(Sidebar element) {
        
    }

    @Override
    public void visit(Simpara element) {
        
    }

    @Override
    public void visit(Simplelist element) {
        
    }

    @Override
    public void visit(Simplemsgentry element) {
        
    }

    @Override
    public void visit(Simplesect element) {
        
    }

    @Override
    public void visit(Spanspec element) {
        
    }

    @Override
    public void visit(State element) {
        
    }

    @Override
    public void visit(Stepalternatives element) {
        
    }

    @Override
    public void visit(Step element) {
        
    }

    @Override
    public void visit(Street element) {
        
    }

    @Override
    public void visit(Subject element) {
        
    }

    @Override
    public void visit(Subjectset element) {
        
    }

    @Override
    public void visit(Subjectterm element) {
        
    }

    @Override
    public void visit(Subscript element) {
        
    }

    @Override
    public void visit(Substeps element) {
        
    }

    @Override
    public void visit(Subtitle element) {
        
    }

    @Override
    public void visit(Superscript element) {
        
    }

    @Override
    public void visit(Surname element) {
        
    }

    @Override
    public void visit(Symbol element) {
        
    }

    @Override
    public void visit(Synopfragment element) {
        
    }

    @Override
    public void visit(Synopfragmentref element) {
        
    }

    @Override
    public void visit(Synopsis element) {
        
    }

    @Override
    public void visit(Systemitem element) {
        
    }

    @Override
    public void visit(Table element) {
        
    }

    @Override
    public void visit(Tag element) {
        
    }

    @Override
    public void visit(Task element) {
        
    }

    @Override
    public void visit(Taskprerequisites element) {
        
    }

    @Override
    public void visit(Taskrelated element) {
        
    }

    @Override
    public void visit(Tasksummary element) {
        
    }

    @Override
    public void visit(Tbody element) {
        
    }

    @Override
    public void visit(Td element) {
        
    }

    @Override
    public void visit(Termdef element) {
        
    }

    @Override
    public void visit(Term element) {
        
    }

    @Override
    public void visit(Tertiaryie element) {
        
    }

    @Override
    public void visit(Tertiary element) {
        
    }

    @Override
    public void visit(Textdata element) {
        
    }

    @Override
    public void visit(Textobject element) {
        
    }

    @Override
    public void visit(Tfoot element) {
        
    }

    @Override
    public void visit(Tgroup element) {
        
    }

    @Override
    public void visit(Thead element) {
        
    }

    @Override
    public void visit(Th element) {
        
    }

    @Override
    public void visit(Tip element) {
        
    }

    @Override
    public void visit(Titleabbrev element) {
        
    }

    @Override
    public void visit(Tocdiv element) {
        
    }

    @Override
    public void visit(Tocentry element) {
        
    }

    @Override
    public void visit(Toc element) {
        
    }

    @Override
    public void visit(Token element) {
        
    }

    @Override
    public void visit(Trademark element) {
        
    }

    @Override
    public void visit(Tr element) {
        
    }

    @Override
    public void visit(Type element) {
        
    }

    @Override
    public void visit(Uri element) {
        
    }

    @Override
    public void visit(Userinput element) {
        
    }

    @Override
    public void visit(Varargs element) {
        
    }

    @Override
    public void visit(Variablelist element) {
        
    }

    @Override
    public void visit(Varlistentry element) {
        
    }

    @Override
    public void visit(Varname element) {
        
    }

    @Override
    public void visit(Videodata element) {
        
    }

    @Override
    public void visit(Videoobject element) {
        
    }

    @Override
    public void visit(Void element) {
        
    }

    @Override
    public void visit(Volumenum element) {
        
    }

    @Override
    public void visit(Warning element) {
        
    }

    @Override
    public void visit(Wordasword element) {
        
    }

    @Override
    public void visit(Xref element) {
        
    }

    @Override
    public void visit(Year year) {
        
    }
    
}
