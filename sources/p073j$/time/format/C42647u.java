package p073j$.time.format;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p073j$.time.C42586c;
import p073j$.time.ZoneId;
import p073j$.time.ZoneOffset;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.TemporalQuery;
import p073j$.time.zone.C42687g;

/* renamed from: j$.time.format.u */
class C42647u implements C42633g {

    /* renamed from: c */
    private static volatile Map.Entry f107901c;

    /* renamed from: d */
    private static volatile Map.Entry f107902d;

    /* renamed from: a */
    private final TemporalQuery f107903a;

    /* renamed from: b */
    private final String f107904b;

    C42647u(TemporalQuery temporalQuery, String str) {
        this.f107903a = temporalQuery;
        this.f107904b = str;
    }

    /* renamed from: b */
    private static int m172396b(C42649w wVar, CharSequence charSequence, int i, int i2, C42638l lVar) {
        String upperCase = charSequence.toString().substring(i, i2).toUpperCase();
        if (i2 < charSequence.length() && charSequence.charAt(i2) != '0' && !wVar.mo138163b(charSequence.charAt(i2), C15369g.f37976b)) {
            C42649w d = wVar.mo138164d();
            int o = lVar.mo138136o(d, charSequence, i2);
            if (o < 0) {
                try {
                    if (lVar == C42638l.f107874d) {
                        return ~i;
                    }
                    wVar.mo138173n(ZoneId.m171932of(upperCase));
                    return i2;
                } catch (C42586c unused) {
                    return ~i;
                }
            } else {
                wVar.mo138173n(ZoneId.m171931o(upperCase, ZoneOffset.m171937L((int) d.mo138169j(C42662a.OFFSET_SECONDS).longValue())));
                return o;
            }
        } else {
            wVar.mo138173n(ZoneId.m171932of(upperCase));
            return i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C42641o mo138160a(C42649w wVar) {
        Set a = C42687g.m172580a();
        int size = ((HashSet) a).size();
        Map.Entry entry = wVar.mo138170k() ? f107901c : f107902d;
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                Map.Entry entry2 = wVar.mo138170k() ? f107901c : f107902d;
                if (entry2 == null || ((Integer) entry2.getKey()).intValue() != size) {
                    entry2 = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), C42641o.m172378g(a, wVar));
                    if (wVar.mo138170k()) {
                        f107901c = entry2;
                    } else {
                        f107902d = entry2;
                    }
                }
            }
        }
        return (C42641o) entry.getValue();
    }

    /* renamed from: n */
    public boolean mo138135n(C42651y yVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) yVar.mo138186f(this.f107903a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.mo138002s());
        return true;
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        } else if (i == length) {
            return ~i;
        } else {
            char charAt = charSequence.charAt(i);
            if (charAt == '+' || charAt == '-') {
                return m172396b(wVar, charSequence, i, i, C42638l.f107874d);
            }
            int i3 = i + 2;
            if (length >= i3) {
                char charAt2 = charSequence.charAt(i + 1);
                if (wVar.mo138163b(charAt, 'U') && wVar.mo138163b(charAt2, C15369g.f37992r)) {
                    int i4 = i + 3;
                    return (length < i4 || !wVar.mo138163b(charSequence.charAt(i3), C15369g.f37986l)) ? m172396b(wVar, charSequence, i, i3, C42638l.f107875e) : m172396b(wVar, charSequence, i, i4, C42638l.f107875e);
                } else if (wVar.mo138163b(charAt, 'G') && length >= (i2 = i + 3) && wVar.mo138163b(charAt2, C15369g.f37978d) && wVar.mo138163b(charSequence.charAt(i3), C15369g.f37992r)) {
                    return m172396b(wVar, charSequence, i, i2, C42638l.f107875e);
                }
            }
            C42641o a = mo138160a(wVar);
            ParsePosition parsePosition = new ParsePosition(i);
            String d = a.mo138155d(charSequence, parsePosition);
            if (d != null) {
                wVar.mo138173n(ZoneId.m171932of(d));
                return parsePosition.getIndex();
            } else if (!wVar.mo138163b(charAt, C15369g.f37976b)) {
                return ~i;
            } else {
                wVar.mo138173n(ZoneOffset.UTC);
                return i + 1;
            }
        }
    }

    public final String toString() {
        return this.f107904b;
    }
}
