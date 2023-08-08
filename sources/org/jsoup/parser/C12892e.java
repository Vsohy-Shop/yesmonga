package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/* renamed from: org.jsoup.parser.e */
public class C12892e {

    /* renamed from: a */
    public C12896i f31857a;

    /* renamed from: b */
    public ParseErrorList f31858b;

    /* renamed from: c */
    public C12891d f31859c;

    public C12892e(C12896i iVar) {
        this.f31857a = iVar;
        this.f31859c = iVar.mo30124c();
        this.f31858b = ParseErrorList.m55640i();
    }

    /* renamed from: c */
    public static C12892e m55927c() {
        return new C12892e((C12896i) new C12889b());
    }

    /* renamed from: g */
    public static Document m55928g(String str, String str2) {
        C12889b bVar = new C12889b();
        return bVar.mo30266i(new StringReader(str), str2, new C12892e((C12896i) bVar));
    }

    /* renamed from: h */
    public static Document m55929h(String str, String str2) {
        Document n3 = Document.m55123n3(str2);
        Element g3 = n3.mo29656g3();
        List<C12779j> i = m55930i(str, g3, str2);
        C12779j[] jVarArr = (C12779j[]) i.toArray(new C12779j[0]);
        for (int length = jVarArr.length - 1; length > 0; length--) {
            jVarArr[length].mo29932h0();
        }
        for (C12779j J0 : jVarArr) {
            g3.mo29713J0(J0);
        }
        return n3;
    }

    /* renamed from: i */
    public static List<C12779j> m55930i(String str, Element element, String str2) {
        C12889b bVar = new C12889b();
        return bVar.mo30135j(str, element, str2, new C12892e((C12896i) bVar));
    }

    /* renamed from: j */
    public static List<C12779j> m55931j(String str, Element element, String str2, ParseErrorList parseErrorList) {
        C12889b bVar = new C12889b();
        C12892e eVar = new C12892e((C12896i) bVar);
        eVar.f31858b = parseErrorList;
        return bVar.mo30135j(str, element, str2, eVar);
    }

    /* renamed from: n */
    public static List<C12779j> m55932n(String str, String str2) {
        C12897j jVar = new C12897j();
        return jVar.mo30279y(str, str2, new C12892e((C12896i) jVar));
    }

    /* renamed from: s */
    public static String m55933s(String str, boolean z) {
        return new C12895h(new C12888a(str), ParseErrorList.m55640i()).mo30235C(z);
    }

    /* renamed from: t */
    public static C12892e m55934t() {
        return new C12892e((C12896i) new C12897j());
    }

    /* renamed from: a */
    public ParseErrorList mo30174a() {
        return this.f31858b;
    }

    /* renamed from: b */
    public C12896i mo30175b() {
        return this.f31857a;
    }

    /* renamed from: d */
    public boolean mo30176d(String str) {
        return mo30175b().mo30130g(str);
    }

    /* renamed from: e */
    public boolean mo30177e() {
        return this.f31858b.mo29974h() > 0;
    }

    /* renamed from: f */
    public C12892e mo30178f() {
        return new C12892e(this);
    }

    /* renamed from: k */
    public List<C12779j> mo30179k(String str, Element element, String str2) {
        return this.f31857a.mo30135j(str, element, str2, this);
    }

    /* renamed from: l */
    public Document mo30180l(Reader reader, String str) {
        return this.f31857a.mo30266i(reader, str, this);
    }

    /* renamed from: m */
    public Document mo30181m(String str, String str2) {
        return this.f31857a.mo30266i(new StringReader(str), str2, this);
    }

    /* renamed from: o */
    public C12892e mo30182o(int i) {
        this.f31858b = i > 0 ? ParseErrorList.m55641k(i) : ParseErrorList.m55640i();
        return this;
    }

    /* renamed from: p */
    public C12892e mo30183p(C12896i iVar) {
        this.f31857a = iVar;
        iVar.f31902a = this;
        return this;
    }

    /* renamed from: q */
    public C12891d mo30184q() {
        return this.f31859c;
    }

    /* renamed from: r */
    public C12892e mo30185r(C12891d dVar) {
        this.f31859c = dVar;
        return this;
    }

    public C12892e(C12892e eVar) {
        this.f31857a = eVar.f31857a.mo30132h();
        this.f31858b = new ParseErrorList(eVar.f31858b);
        this.f31859c = new C12891d(eVar.f31859c);
    }
}
