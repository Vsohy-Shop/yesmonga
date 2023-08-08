package p073j$.time.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
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
import p073j$.time.temporal.C42674m;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.chrono.s */
public final class C42611s extends C42593a implements Serializable {

    /* renamed from: d */
    public static final C42611s f107793d = new C42611s();

    private C42611s() {
    }

    /* renamed from: B */
    public final C42594b mo138028B(int i, int i2) {
        return new C42613u(LocalDate.m171810Y(i, i2));
    }

    /* renamed from: F */
    public final List mo138029F() {
        return Arrays.asList(C42614v.m172247x());
    }

    /* renamed from: G */
    public final boolean mo138030G(long j) {
        return C42608p.f107789d.mo138030G(j);
    }

    /* renamed from: I */
    public final C42594b mo138031I(int i, int i2, int i3) {
        return new C42613u(LocalDate.m171813of(i, i2, i3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final C42594b mo138059L(Map map, C42624C c) {
        C42613u uVar;
        C42662a aVar = C42662a.ERA;
        HashMap hashMap = (HashMap) map;
        Long l = (Long) hashMap.get(aVar);
        C42614v r = l != null ? C42614v.m172244r(mo138036W(aVar).mo138226a(l.longValue(), aVar)) : null;
        C42662a aVar2 = C42662a.YEAR_OF_ERA;
        Long l2 = (Long) hashMap.get(aVar2);
        int a = l2 != null ? mo138036W(aVar2).mo138226a(l2.longValue(), aVar2) : 0;
        if (r == null && l2 != null && !hashMap.containsKey(C42662a.YEAR) && c != C42624C.STRICT) {
            r = C42614v.m172247x()[C42614v.m172247x().length - 1];
        }
        if (!(l2 == null || r == null)) {
            C42662a aVar3 = C42662a.MONTH_OF_YEAR;
            if (hashMap.containsKey(aVar3)) {
                C42662a aVar4 = C42662a.DAY_OF_MONTH;
                if (hashMap.containsKey(aVar4)) {
                    hashMap.remove(aVar);
                    hashMap.remove(aVar2);
                    if (c == C42624C.LENIENT) {
                        return new C42613u(LocalDate.m171813of((r.mo138087p().getYear() + a) - 1, 1, 1)).m172230b(Math.subtractExact(((Long) hashMap.remove(aVar3)).longValue(), 1), ChronoUnit.MONTHS).m172230b(Math.subtractExact(((Long) hashMap.remove(aVar4)).longValue(), 1), ChronoUnit.DAYS);
                    }
                    int a2 = mo138036W(aVar3).mo138226a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                    int a3 = mo138036W(aVar4).mo138226a(((Long) hashMap.remove(aVar4)).longValue(), aVar4);
                    if (c != C42624C.SMART) {
                        LocalDate localDate = C42613u.f107795d;
                        LocalDate of = LocalDate.m171813of((r.mo138087p().getYear() + a) - 1, a2, a3);
                        if (!of.mo137916K(r.mo138087p()) && r == C42614v.m172242n(of)) {
                            return new C42613u(r, a, of);
                        }
                        throw new C42586c("year, month, and day not valid for Era");
                    } else if (a >= 1) {
                        int year = (r.mo138087p().getYear() + a) - 1;
                        try {
                            uVar = new C42613u(LocalDate.m171813of(year, a2, a3));
                        } catch (C42586c unused) {
                            uVar = new C42613u(LocalDate.m171813of(year, a2, 1)).mo137941k(new C42674m(0));
                        }
                        if (uVar.mo138083K() == r || uVar.mo137890j(C42662a.YEAR_OF_ERA) <= 1 || a <= 1) {
                            return uVar;
                        }
                        throw new C42586c("Invalid YearOfEra for Era: " + r + " " + a);
                    } else {
                        throw new C42586c("Invalid YearOfEra: " + a);
                    }
                }
            }
            C42662a aVar5 = C42662a.DAY_OF_YEAR;
            if (hashMap.containsKey(aVar5)) {
                hashMap.remove(aVar);
                hashMap.remove(aVar2);
                if (c == C42624C.LENIENT) {
                    return new C42613u(LocalDate.m171810Y((r.mo138087p().getYear() + a) - 1, 1)).m172230b(Math.subtractExact(((Long) hashMap.remove(aVar5)).longValue(), 1), ChronoUnit.DAYS);
                }
                int a4 = mo138036W(aVar5).mo138226a(((Long) hashMap.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = C42613u.f107795d;
                int year2 = r.mo138087p().getYear();
                LocalDate Y = a == 1 ? LocalDate.m171810Y(year2, (r.mo138087p().mo137915E() + a4) - 1) : LocalDate.m171810Y((year2 + a) - 1, a4);
                if (!Y.mo137916K(r.mo138087p()) && r == C42614v.m172242n(Y)) {
                    return new C42613u(r, a, Y);
                }
                throw new C42586c("Invalid parameters");
            }
        }
        return null;
    }

    /* renamed from: O */
    public final C42594b mo138032O() {
        LocalDate L = LocalDate.m171808L(C42585b.m171974d());
        return L instanceof C42613u ? (C42613u) L : new C42613u(LocalDate.m171812o(L));
    }

    /* renamed from: Q */
    public final C42602j mo138033Q(int i) {
        return C42614v.m172244r(i);
    }

    /* renamed from: T */
    public final C42594b mo138034T(Map map, C42624C c) {
        return (C42613u) super.mo138034T(map, c);
    }

    /* renamed from: V */
    public final String mo138035V() {
        return "japanese";
    }

    /* renamed from: W */
    public final C42679r mo138036W(C42662a aVar) {
        switch (C42610r.f107792a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C42678q("Unsupported field: " + aVar);
            case 5:
                return C42679r.m172528l(C42614v.m172246t(), (long) (999999999 - C42614v.m172243o().mo138087p().getYear()));
            case 6:
                return C42679r.m172528l(C42614v.m172245s(), C42662a.DAY_OF_YEAR.mo138210E().mo138228d());
            case 7:
                return C42679r.m172526j((long) C42613u.f107795d.getYear(), 999999999);
            case 8:
                return C42679r.m172526j((long) C42614v.f107799d.getValue(), (long) C42614v.m172243o().getValue());
            default:
                return aVar.mo138210E();
        }
    }

    /* renamed from: p */
    public final C42594b mo138037p(long j) {
        return new C42613u(LocalDate.m171809R(j));
    }

    /* renamed from: s */
    public final String mo138038s() {
        return "Japanese";
    }

    /* renamed from: t */
    public final C42594b mo138039t(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof C42613u ? (C42613u) temporalAccessor : new C42613u(LocalDate.m171812o(temporalAccessor));
    }

    /* renamed from: x */
    public final int mo138040x(C42602j jVar, int i) {
        if (jVar instanceof C42614v) {
            C42614v vVar = (C42614v) jVar;
            int year = (vVar.mo138087p().getYear() + i) - 1;
            if (i == 1) {
                return year;
            }
            if (year >= -999999999 && year <= 999999999 && year >= vVar.mo138087p().getYear() && jVar == C42614v.m172242n(LocalDate.m171813of(year, 1, 1))) {
                return year;
            }
            throw new C42586c("Invalid yearOfEra value");
        }
        throw new ClassCastException("Era must be JapaneseEra");
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
