package org.jsoup.parser;

import javax.annotation.Nullable;
import org.jsoup.helper.C12750d;
import org.jsoup.nodes.C12767b;

public abstract class Token {

    /* renamed from: a */
    public TokenType f31702a;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* renamed from: org.jsoup.parser.Token$b */
    public static final class C12813b extends C12814c {
        public C12813b(String str) {
            mo29990p(str);
        }

        public String toString() {
            return "<![CDATA[" + mo29991q() + "]]>";
        }
    }

    /* renamed from: org.jsoup.parser.Token$c */
    public static class C12814c extends Token {

        /* renamed from: b */
        public String f31710b;

        public C12814c() {
            super();
            this.f31702a = TokenType.Character;
        }

        /* renamed from: m */
        public Token mo29987m() {
            this.f31710b = null;
            return this;
        }

        /* renamed from: p */
        public C12814c mo29990p(String str) {
            this.f31710b = str;
            return this;
        }

        /* renamed from: q */
        public String mo29991q() {
            return this.f31710b;
        }

        public String toString() {
            return mo29991q();
        }
    }

    /* renamed from: org.jsoup.parser.Token$d */
    public static final class C12815d extends Token {

        /* renamed from: b */
        public final StringBuilder f31711b = new StringBuilder();

        /* renamed from: c */
        public String f31712c;

        /* renamed from: d */
        public boolean f31713d = false;

        public C12815d() {
            super();
            this.f31702a = TokenType.Comment;
        }

        /* renamed from: m */
        public Token mo29987m() {
            Token.m55644n(this.f31711b);
            this.f31712c = null;
            this.f31713d = false;
            return this;
        }

        /* renamed from: p */
        public final C12815d mo29992p(char c) {
            mo29994r();
            this.f31711b.append(c);
            return this;
        }

        /* renamed from: q */
        public final C12815d mo29993q(String str) {
            mo29994r();
            if (this.f31711b.length() == 0) {
                this.f31712c = str;
            } else {
                this.f31711b.append(str);
            }
            return this;
        }

        /* renamed from: r */
        public final void mo29994r() {
            String str = this.f31712c;
            if (str != null) {
                this.f31711b.append(str);
                this.f31712c = null;
            }
        }

        /* renamed from: s */
        public String mo29995s() {
            String str = this.f31712c;
            return str != null ? str : this.f31711b.toString();
        }

        public String toString() {
            return "<!--" + mo29995s() + "-->";
        }
    }

    /* renamed from: org.jsoup.parser.Token$e */
    public static final class C12816e extends Token {

        /* renamed from: b */
        public final StringBuilder f31714b = new StringBuilder();

        /* renamed from: c */
        public String f31715c = null;

        /* renamed from: d */
        public final StringBuilder f31716d = new StringBuilder();

        /* renamed from: e */
        public final StringBuilder f31717e = new StringBuilder();

        /* renamed from: f */
        public boolean f31718f = false;

        public C12816e() {
            super();
            this.f31702a = TokenType.Doctype;
        }

        /* renamed from: m */
        public Token mo29987m() {
            Token.m55644n(this.f31714b);
            this.f31715c = null;
            Token.m55644n(this.f31716d);
            Token.m55644n(this.f31717e);
            this.f31718f = false;
            return this;
        }

        /* renamed from: p */
        public String mo29997p() {
            return this.f31714b.toString();
        }

        /* renamed from: q */
        public String mo29998q() {
            return this.f31715c;
        }

        /* renamed from: r */
        public String mo29999r() {
            return this.f31716d.toString();
        }

        /* renamed from: s */
        public String mo30000s() {
            return this.f31717e.toString();
        }

        /* renamed from: t */
        public boolean mo30001t() {
            return this.f31718f;
        }

        public String toString() {
            return "<!doctype " + mo29997p() + ">";
        }
    }

    /* renamed from: org.jsoup.parser.Token$f */
    public static final class C12817f extends Token {
        public C12817f() {
            super();
            this.f31702a = TokenType.EOF;
        }

        /* renamed from: m */
        public Token mo29987m() {
            return this;
        }

        public String toString() {
            return "";
        }
    }

    /* renamed from: org.jsoup.parser.Token$g */
    public static final class C12818g extends C12820i {
        public C12818g() {
            this.f31702a = TokenType.EndTag;
        }

        public String toString() {
            return "</" + mo30015J() + ">";
        }
    }

    /* renamed from: org.jsoup.parser.Token$h */
    public static final class C12819h extends C12820i {
        public C12819h() {
            this.f31702a = TokenType.StartTag;
        }

        /* renamed from: H */
        public C12820i mo29987m() {
            super.mo29987m();
            this.f31730l = null;
            return this;
        }

        /* renamed from: K */
        public C12819h mo30006K(String str, C12767b bVar) {
            this.f31720b = str;
            this.f31730l = bVar;
            this.f31721c = C12891d.m55921a(str);
            return this;
        }

        public String toString() {
            if (!mo30008B() || this.f31730l.size() <= 0) {
                return "<" + mo30015J() + ">";
            }
            return "<" + mo30015J() + " " + this.f31730l.toString() + ">";
        }
    }

    /* renamed from: org.jsoup.parser.Token$i */
    public static abstract class C12820i extends Token {

        /* renamed from: m */
        public static final int f31719m = 512;
        @Nullable

        /* renamed from: b */
        public String f31720b;
        @Nullable

        /* renamed from: c */
        public String f31721c;

        /* renamed from: d */
        public final StringBuilder f31722d = new StringBuilder();
        @Nullable

        /* renamed from: e */
        public String f31723e;

        /* renamed from: f */
        public boolean f31724f = false;

        /* renamed from: g */
        public final StringBuilder f31725g = new StringBuilder();
        @Nullable

        /* renamed from: h */
        public String f31726h;

        /* renamed from: i */
        public boolean f31727i = false;

        /* renamed from: j */
        public boolean f31728j = false;

        /* renamed from: k */
        public boolean f31729k = false;
        @Nullable

        /* renamed from: l */
        public C12767b f31730l;

        public C12820i() {
            super();
        }

        /* renamed from: A */
        public final boolean mo30007A(String str) {
            C12767b bVar = this.f31730l;
            return bVar != null && bVar.mo29869v0(str);
        }

        /* renamed from: B */
        public final boolean mo30008B() {
            return this.f31730l != null;
        }

        /* renamed from: C */
        public final boolean mo30009C() {
            return this.f31729k;
        }

        /* renamed from: D */
        public final String mo30010D() {
            boolean z;
            String str = this.f31720b;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            C12750d.m55065b(z);
            return this.f31720b;
        }

        /* renamed from: E */
        public final C12820i mo30011E(String str) {
            this.f31720b = str;
            this.f31721c = C12891d.m55921a(str);
            return this;
        }

        /* renamed from: F */
        public final void mo30012F() {
            String str;
            String str2;
            if (this.f31730l == null) {
                this.f31730l = new C12767b();
            }
            if (this.f31724f && this.f31730l.size() < 512) {
                if (this.f31722d.length() > 0) {
                    str = this.f31722d.toString();
                } else {
                    str = this.f31723e;
                }
                String trim = str.trim();
                if (trim.length() > 0) {
                    if (this.f31727i) {
                        if (this.f31725g.length() > 0) {
                            str2 = this.f31725g.toString();
                        } else {
                            str2 = this.f31726h;
                        }
                    } else if (this.f31728j) {
                        str2 = "";
                    } else {
                        str2 = null;
                    }
                    this.f31730l.mo29840A(trim, str2);
                }
            }
            Token.m55644n(this.f31722d);
            this.f31723e = null;
            this.f31724f = false;
            Token.m55644n(this.f31725g);
            this.f31726h = null;
            this.f31727i = false;
            this.f31728j = false;
        }

        /* renamed from: G */
        public final String mo30013G() {
            return this.f31721c;
        }

        /* renamed from: H */
        public C12820i mo29987m() {
            this.f31720b = null;
            this.f31721c = null;
            Token.m55644n(this.f31722d);
            this.f31723e = null;
            this.f31724f = false;
            Token.m55644n(this.f31725g);
            this.f31726h = null;
            this.f31728j = false;
            this.f31727i = false;
            this.f31729k = false;
            this.f31730l = null;
            return this;
        }

        /* renamed from: I */
        public final void mo30014I() {
            this.f31728j = true;
        }

        /* renamed from: J */
        public final String mo30015J() {
            String str = this.f31720b;
            return str != null ? str : "[unset]";
        }

        /* renamed from: p */
        public final void mo30016p(char c) {
            mo30024x();
            this.f31722d.append(c);
        }

        /* renamed from: q */
        public final void mo30017q(String str) {
            String replace = str.replace(0, 65533);
            mo30024x();
            if (this.f31722d.length() == 0) {
                this.f31723e = replace;
            } else {
                this.f31722d.append(replace);
            }
        }

        /* renamed from: r */
        public final void mo30018r(char c) {
            mo30025y();
            this.f31725g.append(c);
        }

        /* renamed from: s */
        public final void mo30019s(String str) {
            mo30025y();
            if (this.f31725g.length() == 0) {
                this.f31726h = str;
            } else {
                this.f31725g.append(str);
            }
        }

        /* renamed from: t */
        public final void mo30020t(char[] cArr) {
            mo30025y();
            this.f31725g.append(cArr);
        }

        public abstract String toString();

        /* renamed from: u */
        public final void mo30021u(int[] iArr) {
            mo30025y();
            for (int appendCodePoint : iArr) {
                this.f31725g.appendCodePoint(appendCodePoint);
            }
        }

        /* renamed from: v */
        public final void mo30022v(char c) {
            mo30023w(String.valueOf(c));
        }

        /* renamed from: w */
        public final void mo30023w(String str) {
            String replace = str.replace(0, 65533);
            String str2 = this.f31720b;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.f31720b = replace;
            this.f31721c = C12891d.m55921a(replace);
        }

        /* renamed from: x */
        public final void mo30024x() {
            this.f31724f = true;
            String str = this.f31723e;
            if (str != null) {
                this.f31722d.append(str);
                this.f31723e = null;
            }
        }

        /* renamed from: y */
        public final void mo30025y() {
            this.f31727i = true;
            String str = this.f31726h;
            if (str != null) {
                this.f31725g.append(str);
                this.f31726h = null;
            }
        }

        /* renamed from: z */
        public final void mo30026z() {
            if (this.f31724f) {
                mo30012F();
            }
        }
    }

    /* renamed from: n */
    public static void m55644n(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* renamed from: a */
    public final C12814c mo29975a() {
        return (C12814c) this;
    }

    /* renamed from: b */
    public final C12815d mo29976b() {
        return (C12815d) this;
    }

    /* renamed from: c */
    public final C12816e mo29977c() {
        return (C12816e) this;
    }

    /* renamed from: d */
    public final C12818g mo29978d() {
        return (C12818g) this;
    }

    /* renamed from: e */
    public final C12819h mo29979e() {
        return (C12819h) this;
    }

    /* renamed from: f */
    public final boolean mo29980f() {
        return this instanceof C12813b;
    }

    /* renamed from: g */
    public final boolean mo29981g() {
        return this.f31702a == TokenType.Character;
    }

    /* renamed from: h */
    public final boolean mo29982h() {
        return this.f31702a == TokenType.Comment;
    }

    /* renamed from: i */
    public final boolean mo29983i() {
        return this.f31702a == TokenType.Doctype;
    }

    /* renamed from: j */
    public final boolean mo29984j() {
        return this.f31702a == TokenType.EOF;
    }

    /* renamed from: k */
    public final boolean mo29985k() {
        return this.f31702a == TokenType.EndTag;
    }

    /* renamed from: l */
    public final boolean mo29986l() {
        return this.f31702a == TokenType.StartTag;
    }

    /* renamed from: m */
    public abstract Token mo29987m();

    /* renamed from: o */
    public String mo29988o() {
        return getClass().getSimpleName();
    }

    public Token() {
    }
}
