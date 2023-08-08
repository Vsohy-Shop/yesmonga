package org.jsoup.parser;

import java.util.ArrayList;

public class ParseErrorList extends ArrayList<C12890c> {

    /* renamed from: a */
    public static final int f31701a = 16;
    private final int initialCapacity;
    private final int maxSize;

    public ParseErrorList(int i, int i2) {
        super(i);
        this.initialCapacity = i;
        this.maxSize = i2;
    }

    /* renamed from: i */
    public static ParseErrorList m55640i() {
        return new ParseErrorList(0, 0);
    }

    /* renamed from: k */
    public static ParseErrorList m55641k(int i) {
        return new ParseErrorList(16, i);
    }

    /* renamed from: e */
    public boolean mo29973e() {
        return size() < this.maxSize;
    }

    /* renamed from: h */
    public int mo29974h() {
        return this.maxSize;
    }

    public ParseErrorList(ParseErrorList parseErrorList) {
        this(parseErrorList.initialCapacity, parseErrorList.maxSize);
    }
}
