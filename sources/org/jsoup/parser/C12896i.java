package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.jsoup.helper.C12750d;
import org.jsoup.nodes.C12767b;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

/* renamed from: org.jsoup.parser.i */
public abstract class C12896i {

    /* renamed from: a */
    public C12892e f31902a;

    /* renamed from: b */
    public C12888a f31903b;

    /* renamed from: c */
    public C12895h f31904c;

    /* renamed from: d */
    public Document f31905d;

    /* renamed from: e */
    public ArrayList<Element> f31906e;

    /* renamed from: f */
    public String f31907f;

    /* renamed from: g */
    public Token f31908g;

    /* renamed from: h */
    public C12891d f31909h;

    /* renamed from: i */
    public Map<String, C12893f> f31910i;

    /* renamed from: j */
    public Token.C12819h f31911j = new Token.C12819h();

    /* renamed from: k */
    public Token.C12818g f31912k = new Token.C12818g();

    /* renamed from: a */
    public Element mo30262a() {
        int size = this.f31906e.size();
        if (size > 0) {
            return this.f31906e.get(size - 1);
        }
        return this.f31905d;
    }

    /* renamed from: b */
    public boolean mo30263b(String str) {
        Element a;
        if (this.f31906e.size() == 0 || (a = mo30262a()) == null || !a.mo29799r2().equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract C12891d mo30124c();

    /* renamed from: d */
    public void mo30264d(String str) {
        mo30265e(str, (Object[]) null);
    }

    /* renamed from: e */
    public void mo30265e(String str, Object... objArr) {
        ParseErrorList a = this.f31902a.mo30174a();
        if (a.mo29973e()) {
            a.add(new C12890c(this.f31903b, str, objArr));
        }
    }

    @ParametersAreNonnullByDefault
    /* renamed from: f */
    public void mo30128f(Reader reader, String str, C12892e eVar) {
        C12750d.m55074k(reader, "String input must not be null");
        C12750d.m55074k(str, "BaseURI must not be null");
        C12750d.m55073j(eVar);
        Document document = new Document(str);
        this.f31905d = document;
        document.mo29642B3(eVar);
        this.f31902a = eVar;
        this.f31909h = eVar.mo30184q();
        C12888a aVar = new C12888a(reader);
        this.f31903b = aVar;
        aVar.mo30047T(eVar.mo30177e());
        this.f31908g = null;
        this.f31904c = new C12895h(this.f31903b, eVar.mo30174a());
        this.f31906e = new ArrayList<>(32);
        this.f31910i = new HashMap();
        this.f31907f = str;
    }

    /* renamed from: g */
    public boolean mo30130g(String str) {
        return false;
    }

    /* renamed from: h */
    public abstract C12896i mo30132h();

    @ParametersAreNonnullByDefault
    /* renamed from: i */
    public Document mo30266i(Reader reader, String str, C12892e eVar) {
        mo30128f(reader, str, eVar);
        mo30269o();
        this.f31903b.mo30052d();
        this.f31903b = null;
        this.f31904c = null;
        this.f31906e = null;
        this.f31910i = null;
        return this.f31905d;
    }

    /* renamed from: j */
    public abstract List<C12779j> mo30135j(String str, Element element, String str2, C12892e eVar);

    /* renamed from: k */
    public abstract boolean mo30137k(Token token);

    /* renamed from: l */
    public boolean mo30267l(String str) {
        Token token = this.f31908g;
        Token.C12818g gVar = this.f31912k;
        if (token == gVar) {
            return mo30137k(new Token.C12818g().mo30011E(str));
        }
        return mo30137k(gVar.mo29987m().mo30011E(str));
    }

    /* renamed from: m */
    public boolean mo30268m(String str) {
        Token.C12819h hVar = this.f31911j;
        if (this.f31908g == hVar) {
            return mo30137k(new Token.C12819h().mo30011E(str));
        }
        return mo30137k(hVar.mo29987m().mo30011E(str));
    }

    /* renamed from: n */
    public boolean mo30141n(String str, C12767b bVar) {
        Token.C12819h hVar = this.f31911j;
        if (this.f31908g == hVar) {
            return mo30137k(new Token.C12819h().mo30006K(str, bVar));
        }
        hVar.mo29987m();
        hVar.mo30006K(str, bVar);
        return mo30137k(hVar);
    }

    /* renamed from: o */
    public void mo30269o() {
        Token A;
        C12895h hVar = this.f31904c;
        Token.TokenType tokenType = Token.TokenType.EOF;
        do {
            A = hVar.mo30233A();
            mo30137k(A);
            A.mo29987m();
        } while (A.f31702a != tokenType);
    }

    /* renamed from: p */
    public C12893f mo30270p(String str, C12891d dVar) {
        C12893f fVar = this.f31910i.get(str);
        if (fVar != null) {
            return fVar;
        }
        C12893f x = C12893f.m55950x(str, dVar);
        this.f31910i.put(str, x);
        return x;
    }
}
