package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.jsoup.C12739a;
import org.jsoup.Connection;
import org.jsoup.helper.C12742b;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.C12891d;
import org.jsoup.parser.C12892e;
import org.jsoup.parser.C12893f;
import org.jsoup.select.C12918c;
import org.jsoup.select.Elements;

public class Document extends Element {

    /* renamed from: G0 */
    public static final C12918c f31543G0 = new C12918c.C12938j0("title");

    /* renamed from: E0 */
    public final String f31544E0;

    /* renamed from: F0 */
    public boolean f31545F0 = false;

    /* renamed from: X */
    public OutputSettings f31546X = new OutputSettings();

    /* renamed from: Y */
    public C12892e f31547Y;

    /* renamed from: Z */
    public QuirksMode f31548Z = QuirksMode.noQuirks;
    @Nullable

    /* renamed from: z */
    public Connection f31549z;

    public static class OutputSettings implements Cloneable {

        /* renamed from: a */
        public Entities.EscapeMode f31550a = Entities.EscapeMode.base;

        /* renamed from: b */
        public Charset f31551b = C12742b.f31461b;

        /* renamed from: c */
        public final ThreadLocal<CharsetEncoder> f31552c = new ThreadLocal<>();
        @Nullable

        /* renamed from: d */
        public Entities.CoreCharset f31553d;

        /* renamed from: e */
        public boolean f31554e = true;

        /* renamed from: f */
        public boolean f31555f = false;

        /* renamed from: g */
        public int f31556g = 1;

        /* renamed from: v */
        public Syntax f31557v = Syntax.html;

        public enum Syntax {
            html,
            xml
        }

        /* renamed from: b */
        public Charset mo29672b() {
            return this.f31551b;
        }

        /* renamed from: c */
        public OutputSettings mo29673c(String str) {
            mo29675e(Charset.forName(str));
            return this;
        }

        /* renamed from: e */
        public OutputSettings mo29675e(Charset charset) {
            this.f31551b = charset;
            return this;
        }

        /* renamed from: f */
        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.mo29673c(this.f31551b.name());
                outputSettings.f31550a = Entities.EscapeMode.valueOf(this.f31550a.name());
                return outputSettings;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: h */
        public CharsetEncoder mo29677h() {
            CharsetEncoder charsetEncoder = this.f31552c.get();
            if (charsetEncoder != null) {
                return charsetEncoder;
            }
            return mo29684o();
        }

        /* renamed from: i */
        public OutputSettings mo29678i(Entities.EscapeMode escapeMode) {
            this.f31550a = escapeMode;
            return this;
        }

        /* renamed from: j */
        public Entities.EscapeMode mo29679j() {
            return this.f31550a;
        }

        /* renamed from: k */
        public int mo29680k() {
            return this.f31556g;
        }

        /* renamed from: l */
        public OutputSettings mo29681l(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            C12750d.m55067d(z);
            this.f31556g = i;
            return this;
        }

        /* renamed from: m */
        public OutputSettings mo29682m(boolean z) {
            this.f31555f = z;
            return this;
        }

        /* renamed from: n */
        public boolean mo29683n() {
            return this.f31555f;
        }

        /* renamed from: o */
        public CharsetEncoder mo29684o() {
            CharsetEncoder newEncoder = this.f31551b.newEncoder();
            this.f31552c.set(newEncoder);
            this.f31553d = Entities.CoreCharset.m55334q(newEncoder.charset().name());
            return newEncoder;
        }

        /* renamed from: s */
        public OutputSettings mo29685s(boolean z) {
            this.f31554e = z;
            return this;
        }

        /* renamed from: t */
        public boolean mo29686t() {
            return this.f31554e;
        }

        /* renamed from: u */
        public Syntax mo29687u() {
            return this.f31557v;
        }

        /* renamed from: v */
        public OutputSettings mo29688v(Syntax syntax) {
            this.f31557v = syntax;
            return this;
        }
    }

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(C12893f.m55950x("#root", C12891d.f31853c), str);
        this.f31544E0 = str;
        this.f31547Y = C12892e.m55927c();
    }

    /* renamed from: n3 */
    public static Document m55123n3(String str) {
        C12750d.m55073j(str);
        Document document = new Document(str);
        document.f31547Y = document.mo29644C3();
        Element M0 = document.mo29720M0("html");
        M0.mo29720M0("head");
        M0.mo29720M0("body");
        return document;
    }

    /* renamed from: A3 */
    public Document mo29641A3(OutputSettings outputSettings) {
        C12750d.m55073j(outputSettings);
        this.f31546X = outputSettings;
        return this;
    }

    /* renamed from: B3 */
    public Document mo29642B3(C12892e eVar) {
        this.f31547Y = eVar;
        return this;
    }

    /* renamed from: C3 */
    public C12892e mo29644C3() {
        return this.f31547Y;
    }

    /* renamed from: D3 */
    public QuirksMode mo29645D3() {
        return this.f31548Z;
    }

    /* renamed from: E3 */
    public Document mo29646E3(QuirksMode quirksMode) {
        this.f31548Z = quirksMode;
        return this;
    }

    /* renamed from: F3 */
    public String mo29647F3() {
        Element O2 = mo29665q3().mo29725O2(f31543G0);
        if (O2 != null) {
            return C12759f.m55114n(O2.mo29750X2()).trim();
        }
        return "";
    }

    /* renamed from: G3 */
    public void mo29648G3(String str) {
        C12750d.m55073j(str);
        Element O2 = mo29665q3().mo29725O2(f31543G0);
        if (O2 == null) {
            O2 = mo29665q3().mo29720M0("title");
        }
        O2.mo29653Y2(str);
    }

    /* renamed from: H3 */
    public void mo29649H3(boolean z) {
        this.f31545F0 = z;
    }

    /* renamed from: I3 */
    public boolean mo29650I3() {
        return this.f31545F0;
    }

    /* renamed from: S */
    public String mo29651S() {
        return "#document";
    }

    /* renamed from: U */
    public String mo29652U() {
        return super.mo29744V1();
    }

    /* renamed from: Y2 */
    public Element mo29653Y2(String str) {
        mo29656g3().mo29653Y2(str);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.nodes.Element mo29656g3() {
        /*
            r5 = this;
            org.jsoup.nodes.Element r0 = r5.mo29666s3()
            java.util.List r1 = r0.mo29749X0()
            java.util.Iterator r1 = r1.iterator()
        L_0x000c:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "body"
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            java.lang.String r4 = r2.mo29799r2()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = "frameset"
            java.lang.String r4 = r2.mo29799r2()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x000c
        L_0x0030:
            return r2
        L_0x0031:
            org.jsoup.nodes.Element r0 = r0.mo29720M0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Document.mo29656g3():org.jsoup.nodes.Element");
    }

    /* renamed from: h3 */
    public Charset mo29657h3() {
        return this.f31546X.mo29672b();
    }

    /* renamed from: i3 */
    public void mo29658i3(Charset charset) {
        mo29649H3(true);
        this.f31546X.mo29675e(charset);
        mo29664p3();
    }

    /* renamed from: j3 */
    public Document mo29655e1() {
        Document document = (Document) super.clone();
        document.f31546X = this.f31546X.clone();
        return document;
    }

    /* renamed from: k3 */
    public Connection mo29660k3() {
        Connection connection = this.f31549z;
        if (connection == null) {
            return C12739a.m54869j();
        }
        return connection;
    }

    /* renamed from: l3 */
    public Document mo29661l3(Connection connection) {
        C12750d.m55073j(connection);
        this.f31549z = connection;
        return this;
    }

    /* renamed from: m3 */
    public Element mo29662m3(String str) {
        return new Element(C12893f.m55950x(str, C12891d.f31854d), mo29787n());
    }

    @Nullable
    /* renamed from: o3 */
    public C12775f mo29663o3() {
        for (C12779j next : this.f31570g) {
            if (next instanceof C12775f) {
                return (C12775f) next;
            }
            if (!(next instanceof C12778i)) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: p3 */
    public final void mo29664p3() {
        if (this.f31545F0) {
            OutputSettings.Syntax u = mo29671z3().mo29687u();
            if (u == OutputSettings.Syntax.html) {
                Element N2 = mo29722N2("meta[charset]");
                if (N2 != null) {
                    N2.mo29782k("charset", mo29657h3().displayName());
                } else {
                    mo29665q3().mo29720M0("meta").mo29782k("charset", mo29657h3().displayName());
                }
                mo29717K2("meta[name=charset]").mo30333b1();
            } else if (u == OutputSettings.Syntax.xml) {
                C12779j jVar = mo29703G().get(0);
                if (jVar instanceof C12784n) {
                    C12784n nVar = (C12784n) jVar;
                    if (nVar.mo29954J0().equals("xml")) {
                        nVar.mo29782k("encoding", mo29657h3().displayName());
                        if (nVar.mo29892J("version")) {
                            nVar.mo29782k("version", "1.0");
                            return;
                        }
                        return;
                    }
                    C12784n nVar2 = new C12784n("xml", false);
                    nVar2.mo29782k("version", "1.0");
                    nVar2.mo29782k("encoding", mo29657h3().displayName());
                    mo29815x2(nVar2);
                    return;
                }
                C12784n nVar3 = new C12784n("xml", false);
                nVar3.mo29782k("version", "1.0");
                nVar3.mo29782k("encoding", mo29657h3().displayName());
                mo29815x2(nVar3);
            }
        }
    }

    /* renamed from: q3 */
    public Element mo29665q3() {
        Element s3 = mo29666s3();
        for (Element next : s3.mo29749X0()) {
            if (next.mo29799r2().equals("head")) {
                return next;
            }
        }
        return s3.mo29689A2("head");
    }

    /* renamed from: s3 */
    public final Element mo29666s3() {
        for (Element next : mo29749X0()) {
            if (next.mo29799r2().equals("html")) {
                return next;
            }
        }
        return mo29720M0("html");
    }

    /* renamed from: u3 */
    public String mo29667u3() {
        return this.f31544E0;
    }

    /* renamed from: v3 */
    public Document mo29668v3() {
        Element s3 = mo29666s3();
        Element q3 = mo29665q3();
        mo29656g3();
        mo29670y3(q3);
        mo29670y3(s3);
        mo29670y3(this);
        mo29669x3("head", s3);
        mo29669x3("body", s3);
        mo29664p3();
        return this;
    }

    /* renamed from: x3 */
    public final void mo29669x3(String str, Element element) {
        Elements J1 = mo29714J1(str);
        Element w0 = J1.mo30361w0();
        if (J1.size() > 1) {
            ArrayList<C12779j> arrayList = new ArrayList<>();
            for (int i = 1; i < J1.size(); i++) {
                C12779j jVar = (C12779j) J1.get(i);
                arrayList.addAll(jVar.mo29703G());
                jVar.mo29932h0();
            }
            for (C12779j J0 : arrayList) {
                w0.mo29713J0(J0);
            }
        }
        if (w0.mo29760b0() != null && !w0.mo29760b0().equals(element)) {
            element.mo29713J0(w0);
        }
    }

    /* renamed from: y3 */
    public final void mo29670y3(Element element) {
        ArrayList arrayList = new ArrayList();
        for (C12779j next : element.f31570g) {
            if (next instanceof C12783m) {
                C12783m mVar = (C12783m) next;
                if (!mVar.mo29948J0()) {
                    arrayList.add(mVar);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C12779j jVar = (C12779j) arrayList.get(size);
            element.mo29910j0(jVar);
            mo29656g3().mo29815x2(new C12783m(" "));
            mo29656g3().mo29815x2(jVar);
        }
    }

    /* renamed from: z3 */
    public OutputSettings mo29671z3() {
        return this.f31546X;
    }
}
