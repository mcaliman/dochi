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
package com.javamaniax.dochi.decorators;

import org.docbook.ns.docbook.Article;
import org.docbook.ns.docbook.Subtitle;
import org.docbook.ns.docbook.Title;
import org.docbook.ns.docbook.Xref;
import org.docbook.ns.docbook.Year;

/**
 * TODO
 *
 * @author Massimo Caliman
 */
public interface Decorator {
    public void print(String string);
    public void println(String string);
    
    public void print(Article article);
    public void print(Title title);
    public void print(Subtitle subtitle);
    //
    
    public void print(Xref xref);
    public void print(Year year);
    
}
