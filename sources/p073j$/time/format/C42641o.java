package p073j$.time.format;

import java.text.ParsePosition;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j$.time.format.o */
class C42641o {

    /* renamed from: a */
    protected String f107881a;

    /* renamed from: b */
    protected String f107882b;

    /* renamed from: c */
    protected char f107883c;

    /* renamed from: d */
    protected C42641o f107884d;

    /* renamed from: e */
    protected C42641o f107885e;

    private C42641o(String str, String str2, C42641o oVar) {
        this.f107881a = str;
        this.f107882b = str2;
        this.f107884d = oVar;
        this.f107883c = str.length() == 0 ? 65535 : this.f107881a.charAt(0);
    }

    /* synthetic */ C42641o(String str, String str2, C42641o oVar, int i) {
        this(str, str2, oVar);
    }

    /* renamed from: b */
    private boolean m172376b(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.f107881a.length() && mo138151c(str.charAt(i), this.f107881a.charAt(i))) {
            i++;
        }
        if (i != this.f107881a.length()) {
            C42641o e = mo138152e(this.f107881a.substring(i), this.f107882b, this.f107884d);
            this.f107881a = str.substring(0, i);
            this.f107884d = e;
            if (i < str.length()) {
                this.f107884d.f107885e = mo138152e(str.substring(i), str2, (C42641o) null);
                this.f107882b = null;
            } else {
                this.f107882b = str2;
            }
            return true;
        } else if (i < str.length()) {
            String substring = str.substring(i);
            for (C42641o oVar = this.f107884d; oVar != null; oVar = oVar.f107885e) {
                if (mo138151c(oVar.f107883c, substring.charAt(0))) {
                    return oVar.m172376b(substring, str2);
                }
            }
            C42641o e2 = mo138152e(substring, str2, (C42641o) null);
            e2.f107885e = this.f107884d;
            this.f107884d = e2;
            return true;
        } else {
            this.f107882b = str2;
            return true;
        }
    }

    /* renamed from: f */
    public static C42641o m172377f(C42649w wVar) {
        return wVar.mo138170k() ? new C42641o("", (String) null, (C42641o) null) : new C42640n();
    }

    /* renamed from: g */
    public static C42641o m172378g(Set set, C42649w wVar) {
        C42641o f = m172377f(wVar);
        Iterator it = ((HashSet) set).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.m172376b(str, str);
        }
        return f;
    }

    /* renamed from: a */
    public final void mo138154a(String str, String str2) {
        m172376b(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo138151c(char c, char c2) {
        return c == c2;
    }

    /* renamed from: d */
    public final String mo138155d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo138153h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f107881a.length() + index;
        C42641o oVar = this.f107884d;
        if (oVar != null && length2 != length) {
            while (true) {
                if (!mo138151c(oVar.f107883c, charSequence.charAt(length2))) {
                    oVar = oVar.f107885e;
                    if (oVar == null) {
                        break;
                    }
                } else {
                    parsePosition.setIndex(length2);
                    String d = oVar.mo138155d(charSequence, parsePosition);
                    if (d != null) {
                        return d;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f107882b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C42641o mo138152e(String str, String str2, C42641o oVar) {
        return new C42641o(str, str2, oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo138153h(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f107881a, i);
        }
        int length = this.f107881a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!mo138151c(this.f107881a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
