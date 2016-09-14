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
package com.javamaniax.docbook5;

import java.io.File;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.docbook.ns.docbook.Book;
import org.docbook.ns.docbook.Chapter;
import org.docbook.ns.docbook.Para;
import org.docbook.ns.docbook.Title;

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
    public Book visit(File file) {
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

}
