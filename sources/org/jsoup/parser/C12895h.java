package org.jsoup.parser;

import com.contentsquare.android.api.C14092c;
import java.util.Arrays;
import javax.annotation.Nullable;
import kotlin.text.C11626x;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;

/* renamed from: org.jsoup.parser.h */
public final class C12895h {

    /* renamed from: s */
    public static final char f31880s = '�';

    /* renamed from: t */
    public static final char[] f31881t;

    /* renamed from: u */
    public static final int f31882u = 128;

    /* renamed from: v */
    public static final int[] f31883v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, C14092c.f34540N0, 8240, C14092c.f34663v0, 8249, 338, 141, 381, 143, C14092c.f34532K1, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, C14092c.f34499A0};

    /* renamed from: a */
    public final C12888a f31884a;

    /* renamed from: b */
    public final ParseErrorList f31885b;

    /* renamed from: c */
    public TokeniserState f31886c = TokeniserState.Data;

    /* renamed from: d */
    public Token f31887d;

    /* renamed from: e */
    public boolean f31888e = false;

    /* renamed from: f */
    public String f31889f = null;

    /* renamed from: g */
    public StringBuilder f31890g = new StringBuilder(1024);

    /* renamed from: h */
    public StringBuilder f31891h = new StringBuilder(1024);

    /* renamed from: i */
    public Token.C12820i f31892i;

    /* renamed from: j */
    public Token.C12819h f31893j = new Token.C12819h();

    /* renamed from: k */
    public Token.C12818g f31894k = new Token.C12818g();

    /* renamed from: l */
    public Token.C12814c f31895l = new Token.C12814c();

    /* renamed from: m */
    public Token.C12816e f31896m = new Token.C12816e();

    /* renamed from: n */
    public Token.C12815d f31897n = new Token.C12815d();

    /* renamed from: o */
    public String f31898o;
    @Nullable

    /* renamed from: p */
    public String f31899p;

    /* renamed from: q */
    public final int[] f31900q = new int[1];

    /* renamed from: r */
    public final int[] f31901r = new int[2];

    static {
        char[] cArr = {9, 10, 13, 12, ' ', C11626x.f28914e, C11626x.f28913d};
        f31881t = cArr;
        Arrays.sort(cArr);
    }

    public C12895h(C12888a aVar, ParseErrorList parseErrorList) {
        this.f31884a = aVar;
        this.f31885b = parseErrorList;
    }

    /* renamed from: A */
    public Token mo30233A() {
        while (!this.f31888e) {
            this.f31886c.mo30027X(this, this.f31884a);
        }
        StringBuilder sb = this.f31890g;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            this.f31889f = null;
            return this.f31895l.mo29990p(sb2);
        }
        String str = this.f31889f;
        if (str != null) {
            Token.C12814c p = this.f31895l.mo29990p(str);
            this.f31889f = null;
            return p;
        }
        this.f31888e = false;
        return this.f31887d;
    }

    /* renamed from: B */
    public void mo30234B(TokeniserState tokeniserState) {
        this.f31886c = tokeniserState;
    }

    /* renamed from: C */
    public String mo30235C(boolean z) {
        StringBuilder b = C12759f.m55102b();
        while (!this.f31884a.mo30072w()) {
            b.append(this.f31884a.mo30063o(C11626x.f28913d));
            if (this.f31884a.mo30033E(C11626x.f28913d)) {
                this.f31884a.mo30054f();
                int[] e = mo30240e((Character) null, z);
                if (e == null || e.length == 0) {
                    b.append(C11626x.f28913d);
                } else {
                    b.appendCodePoint(e[0]);
                    if (e.length == 2) {
                        b.appendCodePoint(e[1]);
                    }
                }
            }
        }
        return C12759f.m55116p(b);
    }

    /* renamed from: a */
    public void mo30236a(TokeniserState tokeniserState) {
        this.f31884a.mo30050a();
        this.f31886c = tokeniserState;
    }

    /* renamed from: b */
    public String mo30237b() {
        return this.f31898o;
    }

    /* renamed from: c */
    public String mo30238c() {
        if (this.f31899p == null) {
            this.f31899p = "</" + this.f31898o;
        }
        return this.f31899p;
    }

    /* renamed from: d */
    public final void mo30239d(String str, Object... objArr) {
        if (this.f31885b.mo29973e()) {
            ParseErrorList parseErrorList = this.f31885b;
            C12888a aVar = this.f31884a;
            parseErrorList.add(new C12890c(aVar, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    @Nullable
    /* renamed from: e */
    public int[] mo30240e(Character ch, boolean z) {
        boolean z2;
        String str;
        int i;
        int i2;
        if (this.f31884a.mo30072w()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f31884a.mo30070u()) || this.f31884a.mo30036H(f31881t)) {
            return null;
        }
        int[] iArr = this.f31900q;
        this.f31884a.mo30030B();
        if (this.f31884a.mo30031C("#")) {
            boolean D = this.f31884a.mo30032D("X");
            C12888a aVar = this.f31884a;
            if (D) {
                str = aVar.mo30058j();
            } else {
                str = aVar.mo30057i();
            }
            if (str.length() == 0) {
                mo30239d("numeric reference with no numerals", new Object[0]);
                this.f31884a.mo30045R();
                return null;
            }
            this.f31884a.mo30049V();
            if (!this.f31884a.mo30031C(";")) {
                mo30239d("missing semicolon on [&#%s]", str);
            }
            if (D) {
                i = 16;
            } else {
                i = 10;
            }
            try {
                i2 = Integer.valueOf(str, i).intValue();
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            if (i2 == -1 || ((i2 >= 55296 && i2 <= 57343) || i2 > 1114111)) {
                mo30239d("character [%s] outside of valid range", Integer.valueOf(i2));
                iArr[0] = 65533;
            } else {
                if (i2 >= 128) {
                    int[] iArr2 = f31883v;
                    if (i2 < iArr2.length + 128) {
                        mo30239d("character [%s] is not a valid unicode code point", Integer.valueOf(i2));
                        i2 = iArr2[i2 - 128];
                    }
                }
                iArr[0] = i2;
            }
            return iArr;
        }
        String l = this.f31884a.mo30060l();
        boolean E = this.f31884a.mo30033E(';');
        if (Entities.m55328i(l) || (Entities.m55329j(l) && E)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f31884a.mo30045R();
            if (E) {
                mo30239d("invalid named reference [%s]", l);
            }
            return null;
        } else if (!z || (!this.f31884a.mo30040L() && !this.f31884a.mo30038J() && !this.f31884a.mo30035G('=', '-', '_'))) {
            this.f31884a.mo30049V();
            if (!this.f31884a.mo30031C(";")) {
                mo30239d("missing semicolon on [&%s]", l);
            }
            int d = Entities.m55323d(l, this.f31901r);
            if (d == 1) {
                iArr[0] = this.f31901r[0];
                return iArr;
            } else if (d == 2) {
                return this.f31901r;
            } else {
                C12750d.m55064a("Unexpected characters returned for " + l);
                return this.f31901r;
            }
        } else {
            this.f31884a.mo30045R();
            return null;
        }
    }

    /* renamed from: f */
    public void mo30241f() {
        this.f31897n.mo29987m();
        this.f31897n.f31713d = true;
    }

    /* renamed from: g */
    public void mo30242g() {
        this.f31897n.mo29987m();
    }

    /* renamed from: h */
    public void mo30243h() {
        this.f31896m.mo29987m();
    }

    /* renamed from: i */
    public Token.C12820i mo30244i(boolean z) {
        Token.C12820i H = z ? this.f31893j.mo29987m() : this.f31894k.mo29987m();
        this.f31892i = H;
        return H;
    }

    /* renamed from: j */
    public void mo30245j() {
        Token.m55644n(this.f31891h);
    }

    /* renamed from: k */
    public boolean mo30246k() {
        return true;
    }

    /* renamed from: l */
    public void mo30247l(char c) {
        if (this.f31889f == null) {
            this.f31889f = String.valueOf(c);
            return;
        }
        if (this.f31890g.length() == 0) {
            this.f31890g.append(this.f31889f);
        }
        this.f31890g.append(c);
    }

    /* renamed from: m */
    public void mo30248m(String str) {
        if (this.f31889f == null) {
            this.f31889f = str;
            return;
        }
        if (this.f31890g.length() == 0) {
            this.f31890g.append(this.f31889f);
        }
        this.f31890g.append(str);
    }

    /* renamed from: n */
    public void mo30249n(StringBuilder sb) {
        if (this.f31889f == null) {
            this.f31889f = sb.toString();
            return;
        }
        if (this.f31890g.length() == 0) {
            this.f31890g.append(this.f31889f);
        }
        this.f31890g.append(sb);
    }

    /* renamed from: o */
    public void mo30250o(Token token) {
        C12750d.m55065b(this.f31888e);
        this.f31887d = token;
        this.f31888e = true;
        Token.TokenType tokenType = token.f31702a;
        if (tokenType == Token.TokenType.StartTag) {
            this.f31898o = ((Token.C12819h) token).f31720b;
            this.f31899p = null;
        } else if (tokenType == Token.TokenType.EndTag) {
            Token.C12818g gVar = (Token.C12818g) token;
            if (gVar.mo30008B()) {
                mo30258w("Attributes incorrectly present on end tag [/%s]", gVar.mo30013G());
            }
        }
    }

    /* renamed from: p */
    public void mo30251p(char[] cArr) {
        mo30248m(String.valueOf(cArr));
    }

    /* renamed from: q */
    public void mo30252q(int[] iArr) {
        mo30248m(new String(iArr, 0, iArr.length));
    }

    /* renamed from: r */
    public void mo30253r() {
        mo30250o(this.f31897n);
    }

    /* renamed from: s */
    public void mo30254s() {
        mo30250o(this.f31896m);
    }

    /* renamed from: t */
    public void mo30255t() {
        this.f31892i.mo30026z();
        mo30250o(this.f31892i);
    }

    /* renamed from: u */
    public void mo30256u(TokeniserState tokeniserState) {
        if (this.f31885b.mo29973e()) {
            this.f31885b.add(new C12890c(this.f31884a, "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    /* renamed from: v */
    public void mo30257v(String str) {
        if (this.f31885b.mo29973e()) {
            this.f31885b.add(new C12890c(this.f31884a, str));
        }
    }

    /* renamed from: w */
    public void mo30258w(String str, Object... objArr) {
        if (this.f31885b.mo29973e()) {
            this.f31885b.add(new C12890c(this.f31884a, str, objArr));
        }
    }

    /* renamed from: x */
    public void mo30259x(TokeniserState tokeniserState) {
        if (this.f31885b.mo29973e()) {
            ParseErrorList parseErrorList = this.f31885b;
            C12888a aVar = this.f31884a;
            parseErrorList.add(new C12890c(aVar, "Unexpected character '%s' in input state [%s]", Character.valueOf(aVar.mo30070u()), tokeniserState));
        }
    }

    /* renamed from: y */
    public TokeniserState mo30260y() {
        return this.f31886c;
    }

    /* renamed from: z */
    public boolean mo30261z() {
        return this.f31898o != null && this.f31892i.mo30010D().equalsIgnoreCase(this.f31898o);
    }
}
