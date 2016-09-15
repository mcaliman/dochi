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

    @Override
    public void visit(String content) {
        System.out.println(content);
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

        visitGlossariesAndBibliographiesAndIndicesList(book.getGlossariesAndBibliographiesAndIndices());

        book.getHref();

        String id = book.getId();

        book.getInfo();

        book.getLabel();
        book.getLinkend();
        book.getOs();
        book.getRemap();
        book.getRevisionflag();
        book.getRole();
        book.getSecurity();
        book.getShow();
        book.getStatus();
        visitTitlesAndTitleabbrevsAndSubtitlesList(book.getTitlesAndTitleabbrevsAndSubtitles());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Abstract abstr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Accel accel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Acknowledgements acknowledgements) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Acronym acronym) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Address element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Affiliation element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Alt element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Anchor element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Annotation element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Answer element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Appendix element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Application element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Arc element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Area element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Areaset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Areaspec element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Arg element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Artpagenums element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Attribution element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Audiodata element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Audioobject element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Authorgroup element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Authorinitials element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Author element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliocoverage element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliodiv element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Biblioentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliography element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Biblioid element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliolist element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliomisc element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliomixed element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliomset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Biblioref element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliorelation element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Biblioset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bibliosource element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Blockquote element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Bridgehead element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Callout element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Calloutlist element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Caption element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Caution element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Citation element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Citebiblioid element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Citerefentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Citetitle element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(City element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Classname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Classsynopsisinfo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Classsynopsis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Cmdsynopsis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Code element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Co element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Colgroup element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Col element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Collab element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Colophon element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Colspec element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Command element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Computeroutput element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Confdates element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Confgroup element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Confnum element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Confsponsor element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Conftitle element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Constant element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Constraintdef element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Constraint element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Constructorsynopsis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Contractnum element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Contractsponsor element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Contrib element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Copyright element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Coref element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Country element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Cover element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Database element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Date element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Dedication element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Destructorsynopsis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Edition element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Editor element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Email element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Emphasis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Entry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Entrytbl element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Envar element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Epigraph element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Equation element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Errorcode element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Errorname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Errortext element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Errortype element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Example element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Exceptionname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Extendedlink element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Fax element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Fieldsynopsis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Figure element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Filename element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Firstname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Firstterm element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Footnote element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Footnoteref element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Foreignphrase element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Formalpara element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Funcdef element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Funcparams element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Funcprototype element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Funcsynopsisinfo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Funcsynopsis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Function element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Glossary element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Glossdef element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Glossdiv element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Glossentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Glosslist element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Glossseealso element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Glosssee element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Glossterm element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Group element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Guibutton element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Guiicon element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Guilabel element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Guimenuitem element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Guimenu element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Guisubmenu element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Hardware element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Holder element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Honorific element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Imagedata element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Imageobjectco element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Imageobject element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Important element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Indexdiv element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Indexentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Index element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Indexterm element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Info element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Informalequation element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Informalexample element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Informalfigure element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Informaltable element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Initializer element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Inlineequation element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Inlinemediaobject element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Interfacename element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Issuenum element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Itemizedlist element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Itermset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Jobtitle element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Keycap element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Keycode element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Keycombo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Keysym element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Keyword element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Keywordset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Label element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Legalnotice element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Lhs element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Lineage element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Lineannotation element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Link element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Listitem element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Literal element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Literallayout element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Locator element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Manvolnum element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Markup element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Mathphrase element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Mediaobject element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Member element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Menuchoice element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Methodname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Methodparam element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Methodsynopsis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Modifier element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Mousebutton element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgaud element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgexplan element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msginfo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msg element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msglevel element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgmain element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgorig element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgrel element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgsub element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Msgtext element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Nonterminal element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Note element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Olink element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Ooclass element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Ooexception element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Oointerface element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Optional element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Option element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Orderedlist element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Orgdiv element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Org element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Orgname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Otheraddr element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Othercredit element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Othername element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Package element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Pagenums element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Paramdef element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Parameter element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Partintro element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Part element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Personblurb element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Person element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Personname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Phone element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Phrase element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Pob element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Postcode element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Preface element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Primaryie element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Primary element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Printhistory element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Procedure element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Production element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Productionrecap element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Productionset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Productname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Productnumber element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Programlistingco element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Programlisting element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Prompt element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Property element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Pubdate element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Publisher element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Publishername element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Qandadiv element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Qandaentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Qandaset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Question element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Quote element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refclass element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refdescriptor element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refentrytitle element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Reference element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refmeta element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refmiscinfo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refnamediv element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refpurpose element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refsect1 element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refsect2 element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refsect3 element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refsection element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Refsynopsisdiv element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Releaseinfo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Remark element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Replaceable element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Returnvalue element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Revdescription element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Revhistory element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Revision element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Revnumber element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Revremark element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Rhs element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Row element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Sbr element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Screenco element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Screen element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Screenshot element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Secondaryie element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Secondary element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Sect1 element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Sect2 element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Sect3 element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Sect4 element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Sect5 element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Section element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Seealsoie element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Seealso element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Seeie element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(See element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Seg element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Seglistitem element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Segmentedlist element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Segtitle element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Seriesvolnums element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Setindex element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Set element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Shortaffil element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Shortcut element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Sidebar element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Simpara element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Simplelist element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Simplemsgentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Simplesect element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Spanspec element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(State element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Stepalternatives element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Step element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Street element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Subject element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Subjectset element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Subjectterm element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Subscript element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Substeps element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Subtitle element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Superscript element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Surname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Symbol element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Synopfragment element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Synopfragmentref element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Synopsis element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Systemitem element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Table element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tag element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Task element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Taskprerequisites element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Taskrelated element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tasksummary element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tbody element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Td element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Termdef element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Term element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tertiaryie element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tertiary element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Textdata element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Textobject element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tfoot element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tgroup element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Thead element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Th element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tip element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Titleabbrev element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tocdiv element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tocentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Toc element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Token element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Trademark element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Tr element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Type element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Uri element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Userinput element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Varargs element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Variablelist element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Varlistentry element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Varname element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Videodata element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Videoobject element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Void element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Volumenum element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Warning element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Wordasword element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Xref element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Year element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
