package org.jsoup.parser;

import org.jsoup.internal.C12757d;
import org.jsoup.nodes.C12767b;

/* renamed from: org.jsoup.parser.d */
public class C12891d {

    /* renamed from: c */
    public static final C12891d f31853c = new C12891d(false, false);

    /* renamed from: d */
    public static final C12891d f31854d = new C12891d(true, true);

    /* renamed from: a */
    public final boolean f31855a;

    /* renamed from: b */
    public final boolean f31856b;

    public C12891d(boolean z, boolean z2) {
        this.f31855a = z;
        this.f31856b = z2;
    }

    /* renamed from: a */
    public static String m55921a(String str) {
        return C12757d.m55098a(str.trim());
    }

    /* renamed from: b */
    public String mo30169b(String str) {
        String trim = str.trim();
        if (!this.f31856b) {
            return C12757d.m55098a(trim);
        }
        return trim;
    }

    /* renamed from: c */
    public C12767b mo30170c(C12767b bVar) {
        if (bVar != null && !this.f31856b) {
            bVar.mo29845I0();
        }
        return bVar;
    }

    /* renamed from: d */
    public String mo30171d(String str) {
        String trim = str.trim();
        if (!this.f31855a) {
            return C12757d.m55098a(trim);
        }
        return trim;
    }

    /* renamed from: e */
    public boolean mo30172e() {
        return this.f31856b;
    }

    /* renamed from: f */
    public boolean mo30173f() {
        return this.f31855a;
    }

    public C12891d(C12891d dVar) {
        this(dVar.f31855a, dVar.f31856b);
    }
}
