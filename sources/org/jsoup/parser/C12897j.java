package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.jsoup.helper.C12750d;
import org.jsoup.nodes.C12767b;
import org.jsoup.nodes.C12772c;
import org.jsoup.nodes.C12775f;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.C12783m;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;

/* renamed from: org.jsoup.parser.j */
public class C12897j extends C12896i {

    /* renamed from: l */
    public static final int f31913l = 256;

    /* renamed from: org.jsoup.parser.j$a */
    public static /* synthetic */ class C12898a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31914a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.jsoup.parser.Token$TokenType[] r0 = org.jsoup.parser.Token.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31914a = r0
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.StartTag     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31914a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EndTag     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31914a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Comment     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31914a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Character     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31914a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Doctype     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31914a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C12897j.C12898a.<clinit>():void");
        }
    }

    /* renamed from: c */
    public C12891d mo30124c() {
        return C12891d.f31854d;
    }

    @ParametersAreNonnullByDefault
    /* renamed from: f */
    public void mo30128f(Reader reader, String str, C12892e eVar) {
        super.mo30128f(reader, str, eVar);
        this.f31906e.add(this.f31905d);
        this.f31905d.mo29671z3().mo29688v(Document.OutputSettings.Syntax.xml).mo29678i(Entities.EscapeMode.xhtml).mo29685s(false);
    }

    /* renamed from: j */
    public List<C12779j> mo30135j(String str, Element element, String str2, C12892e eVar) {
        return mo30279y(str, str2, eVar);
    }

    /* renamed from: k */
    public boolean mo30137k(Token token) {
        switch (C12898a.f31914a[token.f31702a.ordinal()]) {
            case 1:
                mo30271q(token.mo29979e());
                return true;
            case 2:
                mo30280z(token.mo29978d());
                return true;
            case 3:
                mo30273s(token.mo29976b());
                return true;
            case 4:
                mo30272r(token.mo29975a());
                return true;
            case 5:
                mo30274t(token.mo29977c());
                return true;
            case 6:
                return true;
            default:
                C12750d.m55064a("Unexpected token type: " + token.f31702a);
                return true;
        }
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo30141n(String str, C12767b bVar) {
        return super.mo30141n(str, bVar);
    }

    /* renamed from: q */
    public Element mo30271q(Token.C12819h hVar) {
        C12893f p = mo30270p(hVar.mo30010D(), this.f31909h);
        if (hVar.mo30008B()) {
            hVar.f31730l.mo29862m0(this.f31909h);
        }
        Element element = new Element(p, (String) null, this.f31909h.mo30170c(hVar.f31730l));
        mo30275u(element);
        if (!hVar.mo30009C()) {
            this.f31906e.add(element);
        } else if (!p.mo30197l()) {
            p.mo30202u();
        }
        return element;
    }

    /* renamed from: r */
    public void mo30272r(Token.C12814c cVar) {
        C12779j jVar;
        String q = cVar.mo29991q();
        if (cVar.mo29980f()) {
            jVar = new C12772c(q);
        } else {
            jVar = new C12783m(q);
        }
        mo30275u(jVar);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [org.jsoup.nodes.n] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30273s(org.jsoup.parser.Token.C12815d r3) {
        /*
            r2 = this;
            org.jsoup.nodes.d r0 = new org.jsoup.nodes.d
            java.lang.String r1 = r3.mo29995s()
            r0.<init>(r1)
            boolean r3 = r3.f31713d
            if (r3 == 0) goto L_0x001a
            boolean r3 = r0.mo29893J0()
            if (r3 == 0) goto L_0x001a
            org.jsoup.nodes.n r3 = r0.mo29889G0()
            if (r3 == 0) goto L_0x001a
            r0 = r3
        L_0x001a:
            r2.mo30275u(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C12897j.mo30273s(org.jsoup.parser.Token$d):void");
    }

    /* renamed from: t */
    public void mo30274t(Token.C12816e eVar) {
        C12775f fVar = new C12775f(this.f31909h.mo30171d(eVar.mo29997p()), eVar.mo29999r(), eVar.mo30000s());
        fVar.mo29904J0(eVar.mo29998q());
        mo30275u(fVar);
    }

    /* renamed from: u */
    public final void mo30275u(C12779j jVar) {
        mo30262a().mo29713J0(jVar);
    }

    /* renamed from: v */
    public C12897j mo30132h() {
        return new C12897j();
    }

    /* renamed from: w */
    public Document mo30277w(Reader reader, String str) {
        return mo30266i(reader, str, new C12892e((C12896i) this));
    }

    /* renamed from: x */
    public Document mo30278x(String str, String str2) {
        return mo30266i(new StringReader(str), str2, new C12892e((C12896i) this));
    }

    /* renamed from: y */
    public List<C12779j> mo30279y(String str, String str2, C12892e eVar) {
        mo30128f(new StringReader(str), str2, eVar);
        mo30269o();
        return this.f31905d.mo29942v();
    }

    /* renamed from: z */
    public final void mo30280z(Token.C12818g gVar) {
        int i;
        Element element;
        String d = this.f31909h.mo30171d(gVar.f31720b);
        int size = this.f31906e.size() - 1;
        if (size >= 256) {
            i = size - 256;
        } else {
            i = 0;
        }
        int size2 = this.f31906e.size() - 1;
        while (true) {
            if (size2 < i) {
                element = null;
                break;
            }
            element = this.f31906e.get(size2);
            if (element.mo29651S().equals(d)) {
                break;
            }
            size2--;
        }
        if (element != null) {
            int size3 = this.f31906e.size() - 1;
            while (size3 >= 0) {
                Element element2 = this.f31906e.get(size3);
                this.f31906e.remove(size3);
                if (element2 != element) {
                    size3--;
                } else {
                    return;
                }
            }
        }
    }
}
