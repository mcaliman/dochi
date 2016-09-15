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
public interface VisitorInterface {

    public void visit(String content);

    public Book visitBookFile(File file);

    public Article visitArticleFile(File file);

    public void visitGlossariesAndBibliographiesAndIndices(Object object);

    public void visitGlossariesAndBibliographiesAndIndicesList(List<Object> glossariesAndBibliographiesAndIndices);

    public void visitTitlesAndTitleabbrevsAndSubtitles(Object object);

    public void visitTitlesAndTitleabbrevsAndSubtitlesList(List<Object> titlesAndTitleabbrevsAndSubtitles);

    public void visit(Abbrev abbrev);

    public void visit(Abstract abstr);

    public void visit(Accel accel);

    public void visit(Acknowledgements acknowledgements);

    public void visit(Acronym acronym);

    public void visit(Address element);

    public void visit(Affiliation element);

    public void visit(Alt element);

    public void visit(Anchor element);

    public void visit(Annotation element);

    public void visit(Answer element);

    public void visit(Appendix element);

    public void visit(Application element);

    public void visit(Arc element);

    public void visit(Area element);

    public void visit(Areaset element);

    public void visit(Areaspec element);

    public void visit(Arg element);

    public void visit(Article element);//Implemented.

    public void visit(Artpagenums element);

    public void visit(Attribution element);

    public void visit(Audiodata element);

    public void visit(Audioobject element);

    public void visit(Authorgroup element);

    public void visit(Authorinitials element);

    public void visit(Author element);

    public void visit(Bibliocoverage element);

    public void visit(Bibliodiv element);

    public void visit(Biblioentry element);

    public void visit(Bibliography element);

    public void visit(Biblioid element);

    public void visit(Bibliolist element);

    public void visit(Bibliomisc element);

    public void visit(Bibliomixed element);

    public void visit(Bibliomset element);

    public void visit(Biblioref element);

    public void visit(Bibliorelation element);

    public void visit(Biblioset element);

    public void visit(Bibliosource element);

    public void visit(Blockquote element);

    public void visit(Book element);//Implemented.

    public void visit(Bridgehead element);

    public void visit(Callout element);

    public void visit(Calloutlist element);

    public void visit(Caption element);

    public void visit(Caution element);

    public void visit(Chapter element);//Implemented.

    public void visit(Citation element);

    public void visit(Citebiblioid element);

    public void visit(Citerefentry element);

    public void visit(Citetitle element);

    public void visit(City element);

    public void visit(Classname element);

    public void visit(Classsynopsisinfo element);

    public void visit(Classsynopsis element);

    public void visit(Cmdsynopsis element);

    public void visit(Code element);

    public void visit(Co element);

    public void visit(Colgroup element);

    public void visit(Col element);

    public void visit(Collab element);

    public void visit(Colophon element);

    public void visit(Colspec element);

    public void visit(Command element);

    public void visit(Computeroutput element);

    public void visit(Confdates element);

    public void visit(Confgroup element);

    public void visit(Confnum element);

    public void visit(Confsponsor element);

    public void visit(Conftitle element);

    public void visit(Constant element);

    public void visit(Constraintdef element);

    public void visit(Constraint element);

    public void visit(Constructorsynopsis element);

    public void visit(Contractnum element);

    public void visit(Contractsponsor element);

    public void visit(Contrib element);

    public void visit(Copyright element);

    public void visit(Coref element);

    public void visit(Country element);

    public void visit(Cover element);

    public void visit(Database element);

    public void visit(Date element);

    public void visit(Dedication element);

    public void visit(Destructorsynopsis element);

    public void visit(Edition element);

    public void visit(Editor element);

    public void visit(Email element);

    public void visit(Emphasis element);

    public void visit(Entry element);

    public void visit(Entrytbl element);

    public void visit(Envar element);

    public void visit(Epigraph element);

    public void visit(Equation element);

    public void visit(Errorcode element);

    public void visit(Errorname element);

    public void visit(Errortext element);

    public void visit(Errortype element);

    public void visit(Example element);

    public void visit(Exceptionname element);

    public void visit(Extendedlink element);

    public void visit(Fax element);

    public void visit(Fieldsynopsis element);

    public void visit(Figure element);

    public void visit(Filename element);

    public void visit(Firstname element);

    public void visit(Firstterm element);

    public void visit(Footnote element);

    public void visit(Footnoteref element);

    public void visit(Foreignphrase element);

    public void visit(Formalpara element);

    public void visit(Funcdef element);

    public void visit(Funcparams element);

    public void visit(Funcprototype element);

    public void visit(Funcsynopsisinfo element);

    public void visit(Funcsynopsis element);

    public void visit(Function element);

    public void visit(Glossary element);

    public void visit(Glossdef element);

    public void visit(Glossdiv element);

    public void visit(Glossentry element);

    public void visit(Glosslist element);

    public void visit(Glossseealso element);

    public void visit(Glosssee element);

    public void visit(Glossterm element);

    public void visit(Group element);

    public void visit(Guibutton element);

    public void visit(Guiicon element);

    public void visit(Guilabel element);

    public void visit(Guimenuitem element);

    public void visit(Guimenu element);

    public void visit(Guisubmenu element);

    public void visit(Hardware element);

    public void visit(Holder element);

    public void visit(Honorific element);

    public void visit(Imagedata element);

    public void visit(Imageobjectco element);

    public void visit(Imageobject element);

    public void visit(Important element);

    public void visit(Indexdiv element);

    public void visit(Indexentry element);

    public void visit(Index element);

    public void visit(Indexterm element);

    public void visit(Info element);

    public void visit(Informalequation element);

    public void visit(Informalexample element);

    public void visit(Informalfigure element);

    public void visit(Informaltable element);

    public void visit(Initializer element);

    public void visit(Inlineequation element);

    public void visit(Inlinemediaobject element);

    public void visit(Interfacename element);

    public void visit(Issuenum element);

    public void visit(Itemizedlist element);

    public void visit(Itermset element);

    public void visit(Jobtitle element);

    public void visit(Keycap element);

    public void visit(Keycode element);

    public void visit(Keycombo element);

    public void visit(Keysym element);

    public void visit(Keyword element);

    public void visit(Keywordset element);

    public void visit(Label element);

    public void visit(Legalnotice element);

    public void visit(Lhs element);

    public void visit(Lineage element);

    public void visit(Lineannotation element);

    public void visit(Link element);

    public void visit(Listitem element);

    public void visit(Literal element);

    public void visit(Literallayout element);

    public void visit(Locator element);

    public void visit(Manvolnum element);

    public void visit(Markup element);

    public void visit(Mathphrase element);

    public void visit(Mediaobject element);

    public void visit(Member element);

    public void visit(Menuchoice element);

    public void visit(Methodname element);

    public void visit(Methodparam element);

    public void visit(Methodsynopsis element);

    public void visit(Modifier element);

    public void visit(Mousebutton element);

    public void visit(Msgaud element);

    public void visit(Msgentry element);

    public void visit(Msgexplan element);

    public void visit(Msginfo element);

    public void visit(Msg element);

    public void visit(Msglevel element);

    public void visit(Msgmain element);

    public void visit(Msgorig element);

    public void visit(Msgrel element);

    public void visit(Msgset element);

    public void visit(Msgsub element);

    public void visit(Msgtext element);

    public void visit(Nonterminal element);

    public void visit(Note element);

    public void visit(Olink element);

    public void visit(Ooclass element);

    public void visit(Ooexception element);

    public void visit(Oointerface element);

    public void visit(Optional element);

    public void visit(Option element);

    public void visit(Orderedlist element);

    public void visit(Orgdiv element);

    public void visit(Org element);

    public void visit(Orgname element);

    public void visit(Otheraddr element);

    public void visit(Othercredit element);

    public void visit(Othername element);

    public void visit(Package element);

    public void visit(Pagenums element);

    public void visit(Para element);//Implemented.

    public void visit(Paramdef element);

    public void visit(Parameter element);

    public void visit(Partintro element);

    public void visit(Part element);

    public void visit(Personblurb element);

    public void visit(Person element);

    public void visit(Personname element);

    public void visit(Phone element);

    public void visit(Phrase element);

    public void visit(Pob element);

    public void visit(Postcode element);

    public void visit(Preface element);

    public void visit(Primaryie element);

    public void visit(Primary element);

    public void visit(Printhistory element);

    public void visit(Procedure element);

    public void visit(Production element);

    public void visit(Productionrecap element);

    public void visit(Productionset element);

    public void visit(Productname element);

    public void visit(Productnumber element);

    public void visit(Programlistingco element);

    public void visit(Programlisting element);

    public void visit(Prompt element);

    public void visit(Property element);

    public void visit(Pubdate element);

    public void visit(Publisher element);

    public void visit(Publishername element);

    public void visit(Qandadiv element);

    public void visit(Qandaentry element);

    public void visit(Qandaset element);

    public void visit(Question element);

    public void visit(Quote element);

    public void visit(Refclass element);

    public void visit(Refdescriptor element);

    public void visit(Refentry element);

    public void visit(Refentrytitle element);

    public void visit(Reference element);

    public void visit(Refmeta element);

    public void visit(Refmiscinfo element);

    public void visit(Refnamediv element);

    public void visit(Refname element);

    public void visit(Refpurpose element);

    public void visit(Refsect1 element);

    public void visit(Refsect2 element);

    public void visit(Refsect3 element);

    public void visit(Refsection element);

    public void visit(Refsynopsisdiv element);

    public void visit(Releaseinfo element);

    public void visit(Remark element);

    public void visit(Replaceable element);

    public void visit(Returnvalue element);

    public void visit(Revdescription element);

    public void visit(Revhistory element);

    public void visit(Revision element);

    public void visit(Revnumber element);

    public void visit(Revremark element);

    public void visit(Rhs element);

    public void visit(Row element);

    public void visit(Sbr element);

    public void visit(Screenco element);

    public void visit(Screen element);

    public void visit(Screenshot element);

    public void visit(Secondaryie element);

    public void visit(Secondary element);

    public void visit(Sect1 element);

    public void visit(Sect2 element);

    public void visit(Sect3 element);

    public void visit(Sect4 element);

    public void visit(Sect5 element);

    public void visit(Section element);

    public void visit(Seealsoie element);

    public void visit(Seealso element);

    public void visit(Seeie element);

    public void visit(See element);

    public void visit(Seg element);

    public void visit(Seglistitem element);

    public void visit(Segmentedlist element);

    public void visit(Segtitle element);

    public void visit(Seriesvolnums element);

    public void visit(Setindex element);

    public void visit(Set element);

    public void visit(Shortaffil element);

    public void visit(Shortcut element);

    public void visit(Sidebar element);

    public void visit(Simpara element);

    public void visit(Simplelist element);

    public void visit(Simplemsgentry element);

    public void visit(Simplesect element);

    public void visit(Spanspec element);

    public void visit(State element);

    public void visit(Stepalternatives element);

    public void visit(Step element);

    public void visit(Street element);

    public void visit(Subject element);

    public void visit(Subjectset element);

    public void visit(Subjectterm element);

    public void visit(Subscript element);

    public void visit(Substeps element);

    public void visit(Subtitle element);

    public void visit(Superscript element);

    public void visit(Surname element);

    public void visit(Symbol element);

    public void visit(Synopfragment element);

    public void visit(Synopfragmentref element);

    public void visit(Synopsis element);

    public void visit(Systemitem element);

    public void visit(Table element);

    public void visit(Tag element);

    public void visit(Task element);

    public void visit(Taskprerequisites element);

    public void visit(Taskrelated element);

    public void visit(Tasksummary element);

    public void visit(Tbody element);

    public void visit(Td element);

    public void visit(Termdef element);

    public void visit(Term element);

    public void visit(Tertiaryie element);

    public void visit(Tertiary element);

    public void visit(Textdata element);

    public void visit(Textobject element);

    public void visit(Tfoot element);

    public void visit(Tgroup element);

    public void visit(Thead element);

    public void visit(Th element);

    public void visit(Tip element);

    public void visit(Titleabbrev element);

    public void visit(Title element);//Implemented.

    public void visit(Tocdiv element);

    public void visit(Tocentry element);

    public void visit(Toc element);

    public void visit(Token element);

    public void visit(Trademark element);

    public void visit(Tr element);

    public void visit(Type element);

    public void visit(Uri element);

    public void visit(Userinput element);

    public void visit(Varargs element);

    public void visit(Variablelist element);

    public void visit(Varlistentry element);

    public void visit(Varname element);

    public void visit(Videodata element);

    public void visit(Videoobject element);

    public void visit(Void element);

    public void visit(Volumenum element);

    public void visit(Warning element);

    public void visit(Wordasword element);

    public void visit(Xref element);

    public void visit(Year element);

}
