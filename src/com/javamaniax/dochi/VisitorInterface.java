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
import org.docbook.ns.docbook.Article;
import org.docbook.ns.docbook.Book;
import org.docbook.ns.docbook.Chapter;
import org.docbook.ns.docbook.Para;
import org.docbook.ns.docbook.Title;

/**
 * Appendix Article Book Chapter Glossary Part Refentry Section
 *
 * @author Massimo Caliman
 */
public interface VisitorInterface {

    public void visit(String content);
    
    public void visit(Title title);

    public void visit(Para para);

    public void visit(Chapter chapter);

    public void visit(Article article);
    
    public void visit(Book book);

    public Book visitBookFile(File file);
    public Article visitArticleFile(File file);

    public void visitGlossariesAndBibliographiesAndIndices(Object object);

    public void visitGlossariesAndBibliographiesAndIndicesList(List<Object> glossariesAndBibliographiesAndIndices);

    public void visitTitlesAndTitleabbrevsAndSubtitles(Object object);

    public void visitTitlesAndTitleabbrevsAndSubtitlesList(List<Object> titlesAndTitleabbrevsAndSubtitles);
 
    //TODO
/*  
     Abbrev
     Abstract
     Accel
     Acknowledgements
     Acronym
     Address
     Affiliation
     Alt
     Anchor
     Annotation
     Answer
     Appendix
     Application
     Arc
     Area
     Areaset
     Areaspec
     Arg
     Article
     Artpagenums
     Attribution
     Audiodata
     Audioobject
     Authorgroup
     Authorinitials
     Author
     Bibliocoverage
     Bibliodiv
     Biblioentry
     Bibliography
     Biblioid
     Bibliolist
     Bibliomisc
     Bibliomixed
     Bibliomset
     Biblioref
     Bibliorelation
     Biblioset
     Bibliosource
     Blockquote
     Book
     Bridgehead
     Callout
     Calloutlist
     Caption
     Caution
     Chapter
     Citation
     Citebiblioid
     Citerefentry
     Citetitle
     City
     Classname
     Classsynopsisinfo
     Classsynopsis
     Cmdsynopsis
     Code
     Co
     Colgroup
     Col
     Collab
     Colophon
     Colspec
     Command
     Computeroutput
     Confdates
     Confgroup
     Confnum
     Confsponsor
     Conftitle
     Constant
     Constraintdef
     Constraint
     Constructorsynopsis
     Contractnum
     Contractsponsor
     Contrib
     Copyright
     Coref
     Country
     Cover
     Database
     Date
     Dedication
     Destructorsynopsis
     Edition
     Editor
     Email
     Emphasis
     Entry
     Entrytbl
     Envar
     Epigraph
     Equation
     Errorcode
     Errorname
     Errortext
     Errortype
     Example
     Exceptionname
     Extendedlink
     Fax
     Fieldsynopsis
     Figure
     Filename
     Firstname
     Firstterm
     Footnote
     Footnoteref
     Foreignphrase
     Formalpara
     Funcdef
     Funcparams
     Funcprototype
     Funcsynopsisinfo
     Funcsynopsis
     Function
     Glossary
     Glossdef
     Glossdiv
     Glossentry
     Glosslist
     Glossseealso
     Glosssee
     Glossterm
     Group
     Guibutton
     Guiicon
     Guilabel
     Guimenuitem
     Guimenu
     Guisubmenu
     Hardware
     Holder
     Honorific
     Imagedata
     Imageobjectco
     Imageobject
     Important
     Indexdiv
     Indexentry
     Index
     Indexterm
     Info
     Informalequation
     Informalexample
     Informalfigure
     Informaltable
     Initializer
     Inlineequation
     Inlinemediaobject
     Interfacename
     Issuenum
     Itemizedlist
     Itermset
     Jobtitle
     Keycap
     Keycode
     Keycombo
     Keysym
     Keyword
     Keywordset
     Label
     Legalnotice
     Lhs
     Lineage
     Lineannotation
     Link
     Listitem
     Literal
     Literallayout
     Locator
     Manvolnum
     Markup
     Mathphrase
     Mediaobject
     Member
     Menuchoice
     Methodname
     Methodparam
     Methodsynopsis
     Modifier
     Mousebutton
     Msgaud
     Msgentry
     Msgexplan
     Msginfo
     Msg
     Msglevel
     Msgmain
     Msgorig
     Msgrel
     Msgset
     Msgsub
     Msgtext
     Nonterminal
     Note
     ObjectFactory
     Olink
     Ooclass
     Ooexception
     Oointerface
     Optional
     Option
     Orderedlist
     Orgdiv
     Org
     Orgname
     Otheraddr
     Othercredit
     Othername
     package-info
     Package
     Pagenums
     Para
     Paramdef
     Parameter
     Partintro
     Part
     Personblurb
     Person
     Personname
     Phone
     Phrase
     Pob
     Postcode
     Preface
     Primaryie
     Primary
     Printhistory
     Procedure
     Production
     Productionrecap
     Productionset
     Productname
     Productnumber
     Programlistingco
     Programlisting
     Prompt
     Property
     Pubdate
     Publisher
     Publishername
     Qandadiv
     Qandaentry
     Qandaset
     Question
     Quote
     Refclass
     Refdescriptor
     Refentry
     Refentrytitle
     Reference
     Refmeta
     Refmiscinfo
     Refnamediv
     Refname
     Refpurpose
     Refsect1
     Refsect2
     Refsect3
     Refsection
     Refsynopsisdiv
     Releaseinfo
     Remark
     Replaceable
     Returnvalue
     Revdescription
     Revhistory
     Revision
     Revnumber
     Revremark
     Rhs
     Row
     Sbr
     Screenco
     Screen
     Screenshot
     Secondaryie
     Secondary
     Sect1
     Sect2
     Sect3
     Sect4
     Sect5
     Section
     Seealsoie
     Seealso
     Seeie
     See
     Seg
     Seglistitem
     Segmentedlist
     Segtitle
     Seriesvolnums
     Setindex
     Set
     Shortaffil
     Shortcut
     Sidebar
     Simpara
     Simplelist
     Simplemsgentry
     Simplesect
     Spanspec
     State
     Stepalternatives
     Step
     Street
     Subject
     Subjectset
     Subjectterm
     Subscript
     Substeps
     Subtitle
     Superscript
     Surname
     Symbol
     Synopfragment
     Synopfragmentref
     Synopsis
     Systemitem
     Table
     Tag
     Task
     Taskprerequisites
     Taskrelated
     Tasksummary
     Tbody
     Td
     Termdef
     Term
     Tertiaryie
     Tertiary
     Textdata
     Textobject
     Tfoot
     Tgroup
     Thead
     Th
     Tip
     Titleabbrev
     Title
     Tocdiv
     Tocentry
     Toc
     Token
     Trademark
     Tr
     Type
     Uri
     Userinput
     Varargs
     Variablelist
     Varlistentry
     Varname
     Videodata
     Videoobject
     Void
     Volumenum
     Warning
     Wordasword
     Xref
     Year
     */

    
}
