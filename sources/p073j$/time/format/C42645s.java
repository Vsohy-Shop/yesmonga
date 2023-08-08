package p073j$.time.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p073j$.time.chrono.C42608p;
import p073j$.time.chrono.Chronology;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;

/* renamed from: j$.time.format.s */
final class C42645s implements C42633g {

    /* renamed from: a */
    private final C42675n f107895a;

    /* renamed from: b */
    private final TextStyle f107896b;

    /* renamed from: c */
    private final C42622A f107897c;

    /* renamed from: d */
    private volatile C42637k f107898d;

    C42645s(C42675n nVar, TextStyle textStyle, C42622A a) {
        this.f107895a = nVar;
        this.f107896b = textStyle;
        this.f107897c = a;
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        String str;
        C42608p pVar;
        Long e = yVar.mo138185e(this.f107895a);
        if (e == null) {
            return false;
        }
        Chronology chronology = (Chronology) yVar.mo138184d().mo137883c(C42676o.m172516a());
        if (chronology == null || chronology == (pVar = C42608p.f107789d)) {
            str = this.f107897c.mo138091d(this.f107895a, e.longValue(), this.f107896b, yVar.mo138183c());
        } else {
            C42675n nVar = this.f107895a;
            long longValue = e.longValue();
            TextStyle textStyle = this.f107896b;
            Locale c = yVar.mo138183c();
            C42622A a = this.f107897c;
            a.getClass();
            str = (chronology == pVar || !(nVar instanceof C42662a)) ? a.mo138091d(nVar, longValue, textStyle, c) : null;
        }
        if (str == null) {
            if (this.f107898d == null) {
                this.f107898d = new C42637k(this.f107895a, 1, 19, C42625D.NORMAL);
            }
            return this.f107898d.mo138135n(yVar, sb);
        }
        sb.append(str);
        return true;
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        C42608p pVar;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator it = null;
        TextStyle textStyle = wVar.mo138171l() ? this.f107896b : null;
        Chronology h = wVar.mo138167h();
        C42675n nVar = this.f107895a;
        C42622A a = this.f107897c;
        if (h == null || h == (pVar = C42608p.f107789d)) {
            it = a.mo138092e(nVar, textStyle, wVar.mo138168i());
        } else {
            Locale i2 = wVar.mo138168i();
            a.getClass();
            if (h == pVar || !(nVar instanceof C42662a)) {
                it = a.mo138092e(nVar, textStyle, i2);
            }
        }
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (wVar.mo138178s(str, 0, charSequence, i, str.length())) {
                    return wVar.mo138174o(this.f107895a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (wVar.mo138171l()) {
                return ~i;
            }
        }
        if (this.f107898d == null) {
            this.f107898d = new C42637k(this.f107895a, 1, 19, C42625D.NORMAL);
        }
        return this.f107898d.mo138136o(wVar, charSequence, i);
    }

    public final String toString() {
        StringBuilder sb;
        TextStyle textStyle = TextStyle.FULL;
        C42675n nVar = this.f107895a;
        TextStyle textStyle2 = this.f107896b;
        if (textStyle2 == textStyle) {
            sb = new StringBuilder("Text(");
            sb.append(nVar);
        } else {
            sb = new StringBuilder("Text(");
            sb.append(nVar);
            sb.append(",");
            sb.append(textStyle2);
        }
        sb.append(")");
        return sb.toString();
    }
}
