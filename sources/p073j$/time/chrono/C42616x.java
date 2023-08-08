package p073j$.time.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p073j$.time.C42585b;
import p073j$.time.C42586c;
import p073j$.time.Instant;
import p073j$.time.LocalDate;
import p073j$.time.LocalDateTime;
import p073j$.time.ZoneId;
import p073j$.time.format.C42624C;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.chrono.x */
public final class C42616x extends C42593a implements Serializable {

    /* renamed from: d */
    public static final C42616x f107805d = new C42616x();

    private C42616x() {
    }

    /* renamed from: B */
    public final C42594b mo138028B(int i, int i2) {
        return new C42618z(LocalDate.m171810Y(i + 1911, i2));
    }

    /* renamed from: F */
    public final List mo138029F() {
        return Arrays.asList(C42587A.values());
    }

    /* renamed from: G */
    public final boolean mo138030G(long j) {
        return C42608p.f107789d.mo138030G(j + 1911);
    }

    /* renamed from: I */
    public final C42594b mo138031I(int i, int i2, int i3) {
        return new C42618z(LocalDate.m171813of(i + 1911, i2, i3));
    }

    /* renamed from: O */
    public final C42594b mo138032O() {
        LocalDate L = LocalDate.m171808L(C42585b.m171974d());
        return L instanceof C42618z ? (C42618z) L : new C42618z(LocalDate.m171812o(L));
    }

    /* renamed from: Q */
    public final C42602j mo138033Q(int i) {
        if (i == 0) {
            return C42587A.BEFORE_ROC;
        }
        if (i == 1) {
            return C42587A.ROC;
        }
        throw new C42586c("Invalid era: " + i);
    }

    /* renamed from: T */
    public final C42594b mo138034T(Map map, C42624C c) {
        return (C42618z) super.mo138034T(map, c);
    }

    /* renamed from: V */
    public final String mo138035V() {
        return "roc";
    }

    /* renamed from: W */
    public final C42679r mo138036W(C42662a aVar) {
        int i = C42615w.f107804a[aVar.ordinal()];
        if (i == 1) {
            C42679r E = C42662a.PROLEPTIC_MONTH.mo138210E();
            return C42679r.m172526j(E.mo138229e() - 22932, E.mo138228d() - 22932);
        } else if (i == 2) {
            C42679r E2 = C42662a.YEAR.mo138210E();
            return C42679r.m172528l(E2.mo138228d() - 1911, (-E2.mo138229e()) + 1 + 1911);
        } else if (i != 3) {
            return aVar.mo138210E();
        } else {
            C42679r E3 = C42662a.YEAR.mo138210E();
            return C42679r.m172526j(E3.mo138229e() - 1911, E3.mo138228d() - 1911);
        }
    }

    /* renamed from: p */
    public final C42594b mo138037p(long j) {
        return new C42618z(LocalDate.m171809R(j));
    }

    /* renamed from: s */
    public final String mo138038s() {
        return "Minguo";
    }

    /* renamed from: t */
    public final C42594b mo138039t(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof C42618z ? (C42618z) temporalAccessor : new C42618z(LocalDate.m171812o(temporalAccessor));
    }

    /* renamed from: x */
    public final int mo138040x(C42602j jVar, int i) {
        if (jVar instanceof C42587A) {
            return jVar == C42587A.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    /* renamed from: y */
    public final ChronoLocalDateTime mo138041y(LocalDateTime localDateTime) {
        return super.mo138041y(localDateTime);
    }

    /* renamed from: z */
    public final ChronoZonedDateTime mo138042z(Instant instant, ZoneId zoneId) {
        return C42601i.m172116q(this, instant, zoneId);
    }
}
