package p073j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p073j$.time.ZoneId;
import p073j$.time.chrono.C42608p;
import p073j$.time.chrono.Chronology;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.w */
final class C42649w {

    /* renamed from: a */
    private DateTimeFormatter f107909a;

    /* renamed from: b */
    private boolean f107910b = true;

    /* renamed from: c */
    private boolean f107911c = true;

    /* renamed from: d */
    private final ArrayList f107912d;

    /* renamed from: e */
    private ArrayList f107913e;

    C42649w(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f107912d = arrayList;
        this.f107913e = null;
        this.f107909a = dateTimeFormatter;
        arrayList.add(new C42623B());
    }

    /* renamed from: c */
    static boolean m172402c(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* renamed from: e */
    private C42623B m172403e() {
        ArrayList arrayList = this.f107912d;
        return (C42623B) arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo138162a(C42642p pVar) {
        if (this.f107913e == null) {
            this.f107913e = new ArrayList();
        }
        this.f107913e.add(pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo138163b(char c, char c2) {
        return this.f107910b ? c == c2 : m172402c(c, c2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C42649w mo138164d() {
        C42649w wVar = new C42649w(this.f107909a);
        wVar.f107910b = this.f107910b;
        wVar.f107911c = this.f107911c;
        return wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo138165f(boolean z) {
        ArrayList arrayList = this.f107912d;
        arrayList.remove(z ? arrayList.size() - 2 : arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final DecimalStyle mo138166g() {
        return this.f107909a.mo138097c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Chronology mo138167h() {
        Chronology chronology = m172403e().f107815c;
        if (chronology != null) {
            return chronology;
        }
        Chronology b = this.f107909a.mo138096b();
        return b == null ? C42608p.f107789d : b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Locale mo138168i() {
        return this.f107909a.mo138098d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Long mo138169j(C42662a aVar) {
        return (Long) ((HashMap) m172403e().f107813a).get(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo138170k() {
        return this.f107910b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo138171l() {
        return this.f107911c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo138172m(boolean z) {
        this.f107910b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo138173n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        m172403e().f107814b = zoneId;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo138174o(C42675n nVar, long j, int i, int i2) {
        Objects.requireNonNull(nVar, "field");
        Long l = (Long) ((HashMap) m172403e().f107813a).put(nVar, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo138175p() {
        m172403e().getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo138176q(boolean z) {
        this.f107911c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo138177r() {
        ArrayList arrayList = this.f107912d;
        C42623B e = m172403e();
        e.getClass();
        C42623B b = new C42623B();
        ((HashMap) b.f107813a).putAll(e.f107813a);
        b.f107814b = e.f107814b;
        b.f107815c = e.f107815c;
        arrayList.add(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo138178s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.f107910b) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final TemporalAccessor mo138179t(C42624C c, Set set) {
        C42623B e = m172403e();
        e.f107815c = mo138167h();
        ZoneId zoneId = e.f107814b;
        if (zoneId == null) {
            zoneId = this.f107909a.mo138099e();
        }
        e.f107814b = zoneId;
        e.mo138093o(c, set);
        return e;
    }

    public final String toString() {
        return m172403e().toString();
    }
}
