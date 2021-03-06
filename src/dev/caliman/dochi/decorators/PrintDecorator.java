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
package dev.caliman.dochi.decorators;

import java.util.List;
import org.docbook.ns.docbook.Article;
import org.docbook.ns.docbook.Para;
import org.docbook.ns.docbook.Productname;
import org.docbook.ns.docbook.Productnumber;
import org.docbook.ns.docbook.Subtitle;
import org.docbook.ns.docbook.Title;
import org.docbook.ns.docbook.Xref;
import org.docbook.ns.docbook.Year;

/**
 * Appendix Article Book Chapter Glossary Part Refentry Section
 *
 * @author Massimo Caliman
 */
public class PrintDecorator implements Decorator {

    @Override
    public void print(Article article) {

    }
     @Override
    public void print(Title title) {
        println("Title: "+getContent(title.getContent()));
    }
    @Override
    public void print(Subtitle subtitle) {
        println("Subtitle: "+getContent(subtitle.getContent()));
    }
    @Override
    public void print(Para para) {
       println("Para: "+getContent(para.getContent()));
    }

    @Override
    public void print(String string) {
        System.out.print(string);
    }

    @Override
    public void println(String string) {
        System.out.println(string);
    }

    @Override
    public void print(Year year) {
        println("year:" + getContent(year.getContent()));
    }

    private StringBuilder getContent(List<Object> content) {
        StringBuilder string = new StringBuilder();
        for (Object obj : content) {
            if (obj != null && obj instanceof String) {
                string.append(obj);
            }
        }
        return string;
    }

    @Override
    public void print(Xref xref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Productname productname) {
        print("Productname:"+getContent(productname.getContent()));
    }
    @Override
    public void visit(Productnumber productnumber) {
        print("Productnumber:"+getContent(productnumber.getContent()));
    }

}
