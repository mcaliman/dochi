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
 * Appendix Article Book Chapter Glossary Part Refentry Section
 *
 * @author Massimo Caliman
 */
public class Visitor implements VisitorInterface {

    private final static Logger logger = Logger.getLogger(Visitor.class.getName());

    public long numberOfChapters;
    public long numberOfPara;

    public Visitor() {

    }

    private void print(String string) {
        System.out.print(string);
    }

    private void println(String string) {
        System.out.println(string);
    }

    @Override
    public void visit(String content) {
        println(content);
    }

    @Override
    public void visit(Title title) {
        List<Object> list = title.getContent();
        for (Object object : list) {
            if (object instanceof String) {
                visit((String) object);
            }
        }
    }

    @Override
    public void visitTitlesAndTitleabbrevsAndSubtitlesList(List<Object> titlesAndTitleabbrevsAndSubtitles) {
        if (titlesAndTitleabbrevsAndSubtitles == null) {
            return;
        }
        for (Object object : titlesAndTitleabbrevsAndSubtitles) {
            visitTitlesAndTitleabbrevsAndSubtitles(object);
        }
    }

    @Override
    public void visitTitlesAndTitleabbrevsAndSubtitles(Object object) {
        if (object instanceof Title) {
            visit((Title) object);
        }
    }

    @Override
    public void visit(Para para) {
        this.numberOfPara++;
        String id = para.getId();
        //System.out.println("para_id:" + id);
        List<Object> list = para.getContent();
        for (Object object : list) {
            if (object instanceof String) {
                visit((String) object);
            }
        }
    }

    @Override
    public void visit(Chapter chapter) {
        this.numberOfChapters++;
        String id = chapter.getId();
        //System.out.println("chapter_id:" + id);
        visitTitlesAndTitleabbrevsAndSubtitlesList(chapter.getTitlesAndTitleabbrevsAndSubtitles());
        visitGlossariesAndBibliographiesAndIndicesList(chapter.getGlossariesAndBibliographiesAndIndices());
    }

    @Override
    public void visitGlossariesAndBibliographiesAndIndicesList(List<Object> glossariesAndBibliographiesAndIndices) {
        for (Object object : glossariesAndBibliographiesAndIndices) {
            visitGlossariesAndBibliographiesAndIndices(object);
        }
    }

    @Override
    public void visitGlossariesAndBibliographiesAndIndices(Object object) {
        if (object instanceof Chapter) {
            visit((Chapter) object);
        } else if (object instanceof Para) {
            visit((Para) object);
        }
    }

    @Override
    public void visit(Article article) {
        //TODO
        article.getTitlesAndTitleabbrevsAndSubtitles();
        article.getGlossariesAndBibliographiesAndIndices();
    }

    @Override
    public void visit(Book book) {
        String actuate = book.getActuate();
        String annotations = book.getAnnotations();
        String arch = book.getArch();
        String arcrole = book.getArcrole();
        String audience = book.getAudience();
        String base = book.getBase();
        book.getCommonRevision();

        String commonVersion = book.getCommonVersion();

        book.getCondition();
        book.getConformance();
        book.getDir();
        this.visitTitlesAndTitleabbrevsAndSubtitlesList(book.getTitlesAndTitleabbrevsAndSubtitles());
        this.visitGlossariesAndBibliographiesAndIndicesList(book.getGlossariesAndBibliographiesAndIndices());

        book.getHref();

        String id = book.getId();

        visit(book.getInfo());

        book.getLabel();
        book.getLinkend();
        book.getOs();
        book.getRemap();
        book.getRevisionflag();
        book.getRole();
        book.getSecurity();
        book.getShow();
        book.getStatus();

        book.getUserlevel();
        book.getVendor();
        book.getWordsize();
        book.getXlinkRole();
        book.getXlinkTitle();
        book.getXlinkType();
        book.getXmlLang();
        book.getXreflabel();
        //TODO Complete counters
        System.out.println("=========================================");
        System.out.println("Number Of Chapters:" + this.numberOfChapters);
        System.out.println("Number Of Para:" + this.numberOfPara);
        System.out.println("=========================================");
    }

    @Override
    public Book visitBookFile(File file) {
        Book book = new Book();
        try {
            JAXBContext jaxbCtx = JAXBContext.newInstance(book.getClass());
            Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            Source source = new StreamSource(file);
            book = (Book) unmarshaller.unmarshal(source);
            visit(book);
        } catch (JAXBException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return book;
    }

    @Override
    public Article visitArticleFile(File file) {
        Article article = new Article();
        try {
            JAXBContext jaxbCtx = JAXBContext.newInstance(article.getClass());
            Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            Source source = new StreamSource(file);
            article = (Article) unmarshaller.unmarshal(source);
            visit(article);
        } catch (JAXBException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return article;
    }

    @Override
    public void visit(Abbrev abbrev) {
        //TODO
    }

    @Override
    public void visit(Abstract abstr) {
        //TODO
    }

    @Override
    public void visit(Accel accel) {
        //TODO
    }

    @Override
    public void visit(Acknowledgements acknowledgements) {
        //TODO
    }

    @Override
    public void visit(Acronym acronym) {
        //TODO
    }

    @Override
    public void visit(Address element) {
        //TODO
    }

    @Override
    public void visit(Affiliation element) {
        //TODO
    }

    @Override
    public void visit(Alt element) {
        //TODO
    }

    @Override
    public void visit(Anchor element) {
        //TODO
    }

    @Override
    public void visit(Annotation element) {
        //TODO
    }

    @Override
    public void visit(Answer element) {
        //TODO
    }

    @Override
    public void visit(Appendix element) {
        //TODO
    }

    @Override
    public void visit(Application element) {
        //TODO
    }

    @Override
    public void visit(Arc element) {
        //TODO
    }

    @Override
    public void visit(Area element) {
        //TODO
    }

    @Override
    public void visit(Areaset element) {
        //TODO
    }

    @Override
    public void visit(Areaspec element) {
        //TODO
    }

    @Override
    public void visit(Arg element) {
        //TODO
    }

    @Override
    public void visit(Artpagenums element) {
        //TODO
    }

    @Override
    public void visit(Attribution element) {
        //TODO
    }

    @Override
    public void visit(Audiodata element) {
        //TODO
    }

    @Override
    public void visit(Audioobject element) {
        //TODO
    }

    @Override
    public void visit(Authorgroup element) {
        //TODO
    }

    @Override
    public void visit(Authorinitials element) {
        //TODO
    }

    @Override
    public void visit(Author element) {
        //TODO
    }

    @Override
    public void visit(Bibliocoverage element) {
        //TODO
    }

    @Override
    public void visit(Bibliodiv element) {
        //TODO
    }

    @Override
    public void visit(Biblioentry element) {
        //TODO
    }

    @Override
    public void visit(Bibliography element) {
        //TODO
    }

    @Override
    public void visit(Biblioid element) {
        //TODO
    }

    @Override
    public void visit(Bibliolist element) {
        //TODO
    }

    @Override
    public void visit(Bibliomisc element) {
        //TODO
    }

    @Override
    public void visit(Bibliomixed element) {
        //TODO
    }

    @Override
    public void visit(Bibliomset element) {
        //TODO
    }

    @Override
    public void visit(Biblioref element) {
        //TODO
    }

    @Override
    public void visit(Bibliorelation element) {
        //TODO
    }

    @Override
    public void visit(Biblioset element) {
        //TODO
    }

    @Override
    public void visit(Bibliosource element) {
        //TODO
    }

    @Override
    public void visit(Blockquote element) {
        //TODO
    }

    @Override
    public void visit(Bridgehead element) {
        //TODO
    }

    @Override
    public void visit(Callout element) {
        //TODO
    }

    @Override
    public void visit(Calloutlist element) {
        //TODO
    }

    @Override
    public void visit(Caption element) {
        //TODO
    }

    @Override
    public void visit(Caution element) {
        //TODO
    }

    @Override
    public void visit(Citation element) {
        //TODO
    }

    @Override
    public void visit(Citebiblioid element) {
        //TODO
    }

    @Override
    public void visit(Citerefentry element) {
        //TODO
    }

    @Override
    public void visit(Citetitle element) {
        //TODO
    }

    @Override
    public void visit(City element) {
        //TODO
    }

    @Override
    public void visit(Classname element) {
        //TODO
    }

    @Override
    public void visit(Classsynopsisinfo element) {
        //TODO
    }

    @Override
    public void visit(Classsynopsis element) {
        //TODO
    }

    @Override
    public void visit(Cmdsynopsis element) {
        //TODO
    }

    @Override
    public void visit(Code element) {
        //TODO
    }

    @Override
    public void visit(Co element) {
        //TODO
    }

    @Override
    public void visit(Colgroup element) {
        //TODO
    }

    @Override
    public void visit(Col element) {
        //TODO
    }

    @Override
    public void visit(Collab element) {
        //TODO
    }

    @Override
    public void visit(Colophon element) {
        //TODO
    }

    @Override
    public void visit(Colspec element) {
        //TODO
    }

    @Override
    public void visit(Command element) {
        //TODO
    }

    @Override
    public void visit(Computeroutput element) {
        //TODO
    }

    @Override
    public void visit(Confdates element) {
        //TODO
    }

    @Override
    public void visit(Confgroup element) {
        //TODO
    }

    @Override
    public void visit(Confnum element) {
        //TODO
    }

    @Override
    public void visit(Confsponsor element) {
        //TODO
    }

    @Override
    public void visit(Conftitle element) {
        //TODO
    }

    @Override
    public void visit(Constant element) {
        //TODO
    }

    @Override
    public void visit(Constraintdef element) {
        //TODO
    }

    @Override
    public void visit(Constraint element) {
        //TODO
    }

    @Override
    public void visit(Constructorsynopsis element) {
        //TODO
    }

    @Override
    public void visit(Contractnum element) {
        //TODO
    }

    @Override
    public void visit(Contractsponsor element) {
        //TODO
    }

    @Override
    public void visit(Contrib element) {
        //TODO
    }

    @Override
    public void visit(Copyright element) {
        //TODO
    }

    @Override
    public void visit(Coref element) {
        //TODO
    }

    @Override
    public void visit(Country element) {
        //TODO
    }

    @Override
    public void visit(Cover element) {
        //TODO
    }

    @Override
    public void visit(Database element) {
        //TODO
    }

    @Override
    public void visit(Date element) {
        //TODO
    }

    @Override
    public void visit(Dedication element) {
        //TODO
    }

    @Override
    public void visit(Destructorsynopsis element) {
        //TODO
    }

    @Override
    public void visit(Edition element) {
        //TODO
    }

    @Override
    public void visit(Editor element) {
        //TODO
    }

    @Override
    public void visit(Email element) {
        //TODO
    }

    @Override
    public void visit(Emphasis element) {
        //TODO
    }

    @Override
    public void visit(Entry element) {
        //TODO
    }

    @Override
    public void visit(Entrytbl element) {
        //TODO
    }

    @Override
    public void visit(Envar element) {
        //TODO
    }

    @Override
    public void visit(Epigraph element) {
        //TODO
    }

    @Override
    public void visit(Equation element) {
        //TODO
    }

    @Override
    public void visit(Errorcode element) {
        //TODO
    }

    @Override
    public void visit(Errorname element) {
        //TODO
    }

    @Override
    public void visit(Errortext element) {
        //TODO
    }

    @Override
    public void visit(Errortype element) {
        //TODO
    }

    @Override
    public void visit(Example element) {
        //TODO
    }

    @Override
    public void visit(Exceptionname element) {
        //TODO
    }

    @Override
    public void visit(Extendedlink element) {
        //TODO
    }

    @Override
    public void visit(Fax element) {
        //TODO
    }

    @Override
    public void visit(Fieldsynopsis element) {
        //TODO
    }

    @Override
    public void visit(Figure element) {
        //TODO
    }

    @Override
    public void visit(Filename element) {
        //TODO
    }

    @Override
    public void visit(Firstname element) {
        //TODO
    }

    @Override
    public void visit(Firstterm element) {
        //TODO
    }

    @Override
    public void visit(Footnote element) {
        //TODO
    }

    @Override
    public void visit(Footnoteref element) {
        //TODO
    }

    @Override
    public void visit(Foreignphrase element) {
        //TODO
    }

    @Override
    public void visit(Formalpara element) {
        //TODO
    }

    @Override
    public void visit(Funcdef element) {
        //TODO
    }

    @Override
    public void visit(Funcparams element) {
        //TODO
    }

    @Override
    public void visit(Funcprototype element) {
        //TODO
    }

    @Override
    public void visit(Funcsynopsisinfo element) {
        //TODO
    }

    @Override
    public void visit(Funcsynopsis element) {
        //TODO
    }

    @Override
    public void visit(Function element) {
        //TODO
    }

    @Override
    public void visit(Glossary element) {
        //TODO
    }

    @Override
    public void visit(Glossdef element) {
        //TODO
    }

    @Override
    public void visit(Glossdiv element) {
        //TODO
    }

    @Override
    public void visit(Glossentry element) {
        //TODO
    }

    @Override
    public void visit(Glosslist element) {
        //TODO
    }

    @Override
    public void visit(Glossseealso element) {
        //TODO
    }

    @Override
    public void visit(Glosssee element) {
        //TODO
    }

    @Override
    public void visit(Glossterm element) {
        //TODO
    }

    @Override
    public void visit(Group element) {
        //TODO
    }

    @Override
    public void visit(Guibutton element) {
        //TODO
    }

    @Override
    public void visit(Guiicon element) {
        //TODO
    }

    @Override
    public void visit(Guilabel element) {
        //TODO
    }

    @Override
    public void visit(Guimenuitem element) {
        //TODO
    }

    @Override
    public void visit(Guimenu element) {
        //TODO
    }

    @Override
    public void visit(Guisubmenu element) {
        //TODO
    }

    @Override
    public void visit(Hardware element) {
        //TODO
    }

    @Override
    public void visit(Holder element) {
        //TODO
    }

    @Override
    public void visit(Honorific element) {
        //TODO
    }

    @Override
    public void visit(Imagedata element) {
        //TODO
    }

    @Override
    public void visit(Imageobjectco element) {
        //TODO
    }

    @Override
    public void visit(Imageobject element) {
        //TODO
    }

    @Override
    public void visit(Important element) {
        //TODO
    }

    @Override
    public void visit(Indexdiv element) {
        //TODO
    }

    @Override
    public void visit(Indexentry element) {
        //TODO
    }

    @Override
    public void visit(Index element) {
        //TODO
    }

    @Override
    public void visit(Indexterm element) {
        //TODO
    }

    @Override
    public void visit(Info info) {
        if (info == null) {
            return;
        }
        visitTitlesAndTitleabbrevsAndSubtitlesList(info.getTitlesAndTitleabbrevsAndSubtitles());
    }

    @Override
    public void visit(Informalequation element) {
        //TODO
    }

    @Override
    public void visit(Informalexample element) {
        //TODO
    }

    @Override
    public void visit(Informalfigure element) {
        //TODO
    }

    @Override
    public void visit(Informaltable element) {
        //TODO
    }

    @Override
    public void visit(Initializer element) {
        //TODO
    }

    @Override
    public void visit(Inlineequation element) {
        //TODO
    }

    @Override
    public void visit(Inlinemediaobject element) {
        //TODO
    }

    @Override
    public void visit(Interfacename element) {
        //TODO
    }

    @Override
    public void visit(Issuenum element) {
        //TODO
    }

    @Override
    public void visit(Itemizedlist element) {
        //TODO
    }

    @Override
    public void visit(Itermset element) {
        //TODO
    }

    @Override
    public void visit(Jobtitle element) {
        //TODO
    }

    @Override
    public void visit(Keycap element) {
        //TODO
    }

    @Override
    public void visit(Keycode element) {
        //TODO
    }

    @Override
    public void visit(Keycombo element) {
        //TODO
    }

    @Override
    public void visit(Keysym element) {
        //TODO
    }

    @Override
    public void visit(Keyword element) {
        //TODO
    }

    @Override
    public void visit(Keywordset element) {
        //TODO
    }

    @Override
    public void visit(Label element) {
        //TODO
    }

    @Override
    public void visit(Legalnotice element) {
        //TODO
    }

    @Override
    public void visit(Lhs element) {
        //TODO
    }

    @Override
    public void visit(Lineage element) {
        //TODO
    }

    @Override
    public void visit(Lineannotation element) {
        //TODO
    }

    @Override
    public void visit(Link element) {
        //TODO
    }

    @Override
    public void visit(Listitem element) {
        //TODO
    }

    @Override
    public void visit(Literal element) {
        //TODO
    }

    @Override
    public void visit(Literallayout element) {
        //TODO
    }

    @Override
    public void visit(Locator element) {
        //TODO
    }

    @Override
    public void visit(Manvolnum element) {
        //TODO
    }

    @Override
    public void visit(Markup element) {
        //TODO
    }

    @Override
    public void visit(Mathphrase element) {
        //TODO
    }

    @Override
    public void visit(Mediaobject element) {
        //TODO
    }

    @Override
    public void visit(Member element) {
        //TODO
    }

    @Override
    public void visit(Menuchoice element) {
        //TODO
    }

    @Override
    public void visit(Methodname element) {
        //TODO
    }

    @Override
    public void visit(Methodparam element) {
        //TODO
    }

    @Override
    public void visit(Methodsynopsis element) {
        //TODO
    }

    @Override
    public void visit(Modifier element) {
        //TODO
    }

    @Override
    public void visit(Mousebutton element) {
        //TODO
    }

    @Override
    public void visit(Msgaud element) {
        //TODO
    }

    @Override
    public void visit(Msgentry element) {
        //TODO
    }

    @Override
    public void visit(Msgexplan element) {
        //TODO
    }

    @Override
    public void visit(Msginfo element) {
        //TODO
    }

    @Override
    public void visit(Msg element) {
        //TODO
    }

    @Override
    public void visit(Msglevel element) {
        //TODO
    }

    @Override
    public void visit(Msgmain element) {
        //TODO
    }

    @Override
    public void visit(Msgorig element) {
        //TODO
    }

    @Override
    public void visit(Msgrel element) {
        //TODO
    }

    @Override
    public void visit(Msgset element) {
        //TODO
    }

    @Override
    public void visit(Msgsub element) {
        //TODO
    }

    @Override
    public void visit(Msgtext element) {
        //TODO
    }

    @Override
    public void visit(Nonterminal element) {
        //TODO
    }

    @Override
    public void visit(Note element) {
        //TODO
    }

    @Override
    public void visit(Olink element) {
        //TODO
    }

    @Override
    public void visit(Ooclass element) {
        //TODO
    }

    @Override
    public void visit(Ooexception element) {
        //TODO
    }

    @Override
    public void visit(Oointerface element) {
        //TODO
    }

    @Override
    public void visit(Optional element) {
        //TODO
    }

    @Override
    public void visit(Option element) {
        //TODO
    }

    @Override
    public void visit(Orderedlist element) {
        //TODO
    }

    @Override
    public void visit(Orgdiv element) {
        //TODO
    }

    @Override
    public void visit(Org element) {
        //TODO
    }

    @Override
    public void visit(Orgname element) {
        //TODO
    }

    @Override
    public void visit(Otheraddr element) {
        //TODO
    }

    @Override
    public void visit(Othercredit element) {
        //TODO
    }

    @Override
    public void visit(Othername element) {
        //TODO
    }

    @Override
    public void visit(Package element) {
        //TODO
    }

    @Override
    public void visit(Pagenums element) {
        //TODO
    }

    @Override
    public void visit(Paramdef element) {
        //TODO
    }

    @Override
    public void visit(Parameter element) {
        //TODO
    }

    @Override
    public void visit(Partintro element) {
        //TODO
    }

    @Override
    public void visit(Part element) {
        //TODO
    }

    @Override
    public void visit(Personblurb element) {
        //TODO
    }

    @Override
    public void visit(Person element) {
        //TODO
    }

    @Override
    public void visit(Personname element) {
        //TODO
    }

    @Override
    public void visit(Phone element) {
        //TODO
    }

    @Override
    public void visit(Phrase element) {
        //TODO
    }

    @Override
    public void visit(Pob element) {
        //TODO
    }

    @Override
    public void visit(Postcode element) {
        //TODO
    }

    @Override
    public void visit(Preface element) {
        //TODO
    }

    @Override
    public void visit(Primaryie element) {
        //TODO
    }

    @Override
    public void visit(Primary element) {
        //TODO
    }

    @Override
    public void visit(Printhistory element) {
        //TODO
    }

    @Override
    public void visit(Procedure element) {
        //TODO
    }

    @Override
    public void visit(Production element) {
        //TODO
    }

    @Override
    public void visit(Productionrecap element) {
        //TODO
    }

    @Override
    public void visit(Productionset element) {
        //TODO
    }

    @Override
    public void visit(Productname element) {
        //TODO
    }

    @Override
    public void visit(Productnumber element) {
        //TODO
    }

    @Override
    public void visit(Programlistingco element) {
        //TODO
    }

    @Override
    public void visit(Programlisting element) {
        //TODO
    }

    @Override
    public void visit(Prompt element) {
        //TODO
    }

    @Override
    public void visit(Property element) {
        //TODO
    }

    @Override
    public void visit(Pubdate element) {
        //TODO
    }

    @Override
    public void visit(Publisher element) {
        //TODO
    }

    @Override
    public void visit(Publishername element) {
        //TODO
    }

    @Override
    public void visit(Qandadiv element) {
        //TODO
    }

    @Override
    public void visit(Qandaentry element) {
        //TODO
    }

    @Override
    public void visit(Qandaset element) {
        //TODO
    }

    @Override
    public void visit(Question element) {
        //TODO
    }

    @Override
    public void visit(Quote element) {
        //TODO
    }

    @Override
    public void visit(Refclass element) {
        //TODO
    }

    @Override
    public void visit(Refdescriptor element) {
        //TODO
    }

    @Override
    public void visit(Refentry element) {
        //TODO
    }

    @Override
    public void visit(Refentrytitle element) {
        //TODO
    }

    @Override
    public void visit(Reference element) {
        //TODO
    }

    @Override
    public void visit(Refmeta element) {
        //TODO
    }

    @Override
    public void visit(Refmiscinfo element) {
        //TODO
    }

    @Override
    public void visit(Refnamediv element) {
        //TODO
    }

    @Override
    public void visit(Refname element) {
        //TODO
    }

    @Override
    public void visit(Refpurpose element) {
        //TODO
    }

    @Override
    public void visit(Refsect1 element) {
        //TODO
    }

    @Override
    public void visit(Refsect2 element) {
        //TODO
    }

    @Override
    public void visit(Refsect3 element) {
        //TODO
    }

    @Override
    public void visit(Refsection element) {
        //TODO
    }

    @Override
    public void visit(Refsynopsisdiv element) {
        //TODO
    }

    @Override
    public void visit(Releaseinfo element) {
        //TODO
    }

    @Override
    public void visit(Remark element) {
        //TODO
    }

    @Override
    public void visit(Replaceable element) {
        //TODO
    }

    @Override
    public void visit(Returnvalue element) {
        //TODO
    }

    @Override
    public void visit(Revdescription element) {
        //TODO
    }

    @Override
    public void visit(Revhistory element) {
        //TODO
    }

    @Override
    public void visit(Revision element) {
        //TODO
    }

    @Override
    public void visit(Revnumber element) {
        //TODO
    }

    @Override
    public void visit(Revremark element) {
        //TODO
    }

    @Override
    public void visit(Rhs element) {
        //TODO
    }

    @Override
    public void visit(Row element) {
        //TODO
    }

    @Override
    public void visit(Sbr element) {
        //TODO
    }

    @Override
    public void visit(Screenco element) {
        //TODO
    }

    @Override
    public void visit(Screen element) {
        //TODO
    }

    @Override
    public void visit(Screenshot element) {
        //TODO
    }

    @Override
    public void visit(Secondaryie element) {
        //TODO
    }

    @Override
    public void visit(Secondary element) {
        //TODO
    }

    @Override
    public void visit(Sect1 element) {
        //TODO
    }

    @Override
    public void visit(Sect2 element) {
        //TODO
    }

    @Override
    public void visit(Sect3 element) {
        //TODO
    }

    @Override
    public void visit(Sect4 element) {
        //TODO
    }

    @Override
    public void visit(Sect5 element) {
        //TODO
    }

    @Override
    public void visit(Section element) {
        //TODO
    }

    @Override
    public void visit(Seealsoie element) {
        //TODO
    }

    @Override
    public void visit(Seealso element) {
        //TODO
    }

    @Override
    public void visit(Seeie element) {
        //TODO
    }

    @Override
    public void visit(See element) {
        //TODO
    }

    @Override
    public void visit(Seg element) {
        //TODO
    }

    @Override
    public void visit(Seglistitem element) {
        //TODO
    }

    @Override
    public void visit(Segmentedlist element) {
        //TODO
    }

    @Override
    public void visit(Segtitle element) {
        //TODO
    }

    @Override
    public void visit(Seriesvolnums element) {
        //TODO
    }

    @Override
    public void visit(Setindex element) {
        //TODO
    }

    @Override
    public void visit(Set element) {
        //TODO
    }

    @Override
    public void visit(Shortaffil element) {
        //TODO
    }

    @Override
    public void visit(Shortcut element) {
        //TODO
    }

    @Override
    public void visit(Sidebar element) {
        //TODO
    }

    @Override
    public void visit(Simpara element) {
        //TODO
    }

    @Override
    public void visit(Simplelist element) {
        //TODO
    }

    @Override
    public void visit(Simplemsgentry element) {
        //TODO
    }

    @Override
    public void visit(Simplesect element) {
        //TODO
    }

    @Override
    public void visit(Spanspec element) {
        //TODO
    }

    @Override
    public void visit(State element) {
        //TODO
    }

    @Override
    public void visit(Stepalternatives element) {
        //TODO
    }

    @Override
    public void visit(Step element) {
        //TODO
    }

    @Override
    public void visit(Street element) {
        //TODO
    }

    @Override
    public void visit(Subject element) {
        //TODO
    }

    @Override
    public void visit(Subjectset element) {
        //TODO
    }

    @Override
    public void visit(Subjectterm element) {
        //TODO
    }

    @Override
    public void visit(Subscript element) {
        //TODO
    }

    @Override
    public void visit(Substeps element) {
        //TODO
    }

    @Override
    public void visit(Subtitle element) {
        //TODO
    }

    @Override
    public void visit(Superscript element) {
        //TODO
    }

    @Override
    public void visit(Surname element) {
        //TODO
    }

    @Override
    public void visit(Symbol element) {
        //TODO
    }

    @Override
    public void visit(Synopfragment element) {
        //TODO
    }

    @Override
    public void visit(Synopfragmentref element) {
        //TODO
    }

    @Override
    public void visit(Synopsis element) {
        //TODO
    }

    @Override
    public void visit(Systemitem element) {
        //TODO
    }

    @Override
    public void visit(Table element) {
        //TODO
    }

    @Override
    public void visit(Tag element) {
        //TODO
    }

    @Override
    public void visit(Task element) {
        //TODO
    }

    @Override
    public void visit(Taskprerequisites element) {
        //TODO
    }

    @Override
    public void visit(Taskrelated element) {
        //TODO
    }

    @Override
    public void visit(Tasksummary element) {
        //TODO
    }

    @Override
    public void visit(Tbody element) {
        //TODO
    }

    @Override
    public void visit(Td element) {
        //TODO
    }

    @Override
    public void visit(Termdef element) {
        //TODO
    }

    @Override
    public void visit(Term element) {
        //TODO
    }

    @Override
    public void visit(Tertiaryie element) {
        //TODO
    }

    @Override
    public void visit(Tertiary element) {
        //TODO
    }

    @Override
    public void visit(Textdata element) {
        //TODO
    }

    @Override
    public void visit(Textobject element) {
        //TODO
    }

    @Override
    public void visit(Tfoot element) {
        //TODO
    }

    @Override
    public void visit(Tgroup element) {
        //TODO
    }

    @Override
    public void visit(Thead element) {
        //TODO
    }

    @Override
    public void visit(Th element) {
        //TODO
    }

    @Override
    public void visit(Tip element) {
        //TODO
    }

    @Override
    public void visit(Titleabbrev element) {
        //TODO
    }

    @Override
    public void visit(Tocdiv element) {
        //TODO
    }

    @Override
    public void visit(Tocentry element) {
        //TODO
    }

    @Override
    public void visit(Toc element) {
        //TODO
    }

    @Override
    public void visit(Token element) {
        //TODO
    }

    @Override
    public void visit(Trademark element) {
        //TODO
    }

    @Override
    public void visit(Tr element) {
        //TODO
    }

    @Override
    public void visit(Type element) {
        //TODO
    }

    @Override
    public void visit(Uri element) {
        //TODO
    }

    @Override
    public void visit(Userinput element) {
        //TODO
    }

    @Override
    public void visit(Varargs element) {
        //TODO
    }

    @Override
    public void visit(Variablelist element) {
        //TODO
    }

    @Override
    public void visit(Varlistentry element) {
        //TODO
    }

    @Override
    public void visit(Varname element) {
        //TODO
    }

    @Override
    public void visit(Videodata element) {
        //TODO
    }

    @Override
    public void visit(Videoobject element) {
        //TODO
    }

    @Override
    public void visit(Void element) {
        //TODO
    }

    @Override
    public void visit(Volumenum element) {
        //TODO
    }

    @Override
    public void visit(Warning element) {
        //TODO
    }

    @Override
    public void visit(Wordasword element) {
        //TODO
    }

    @Override
    public void visit(Xref element) {
        //TODO
    }

    @Override
    public void visit(Year year) {
        //TODO
    }

}
