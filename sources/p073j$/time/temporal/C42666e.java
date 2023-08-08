package p073j$.time.temporal;

import java.util.HashMap;
import java.util.Map;
import p073j$.time.LocalDate;
import p073j$.time.format.C42624C;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.e */
final class C42666e extends C42668g {
    C42666e() {
        super("WEEK_OF_WEEK_BASED_YEAR", 2);
    }

    /* renamed from: E */
    public final C42679r mo138210E() {
        return C42679r.m172528l(52, 53);
    }

    /* renamed from: L */
    public final C42679r mo138212L(TemporalAccessor temporalAccessor) {
        if (mo138213Y(temporalAccessor)) {
            return C42668g.m172491d0(LocalDate.m171812o(temporalAccessor));
        }
        throw new C42678q("Unsupported field: WeekOfWeekBasedYear");
    }

    /* renamed from: R */
    public final TemporalAccessor mo138220R(Map map, TemporalAccessor temporalAccessor, C42624C c) {
        LocalDate localDate;
        long j;
        LocalDate c0;
        long j2;
        C42624C c2 = c;
        C42668g gVar = C42668g.WEEK_BASED_YEAR;
        HashMap hashMap = (HashMap) map;
        Long l = (Long) hashMap.get(gVar);
        C42662a aVar = C42662a.DAY_OF_WEEK;
        Long l2 = (Long) hashMap.get(aVar);
        if (l == null || l2 == null) {
            return null;
        }
        int a = gVar.mo138210E().mo138226a(l.longValue(), gVar);
        long longValue = ((Long) hashMap.get(C42668g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
        C42668g.m172490c0(temporalAccessor);
        LocalDate of = LocalDate.m171813of(a, 1, 4);
        if (c2 == C42624C.LENIENT) {
            long longValue2 = l2.longValue();
            if (longValue2 > 7) {
                j2 = longValue2 - 1;
                c0 = of.mo137925c0(j2 / 7);
            } else {
                j = 1;
                if (longValue2 < 1) {
                    c0 = of.mo137925c0(Math.subtractExact(longValue2, 7) / 7);
                    j2 = longValue2 + 6;
                }
                localDate = of.mo137925c0(Math.subtractExact(longValue, j)).m171823a(longValue2, aVar);
            }
            of = c0;
            j = 1;
            longValue2 = (j2 % 7) + 1;
            localDate = of.mo137925c0(Math.subtractExact(longValue, j)).m171823a(longValue2, aVar);
        } else {
            int a0 = aVar.mo138214a0(l2.longValue());
            if (longValue < 1 || longValue > 52) {
                (c2 == C42624C.STRICT ? C42668g.m172491d0(of) : mo138210E()).mo138227b(longValue, this);
            }
            localDate = of.mo137925c0(longValue - 1).m171823a((long) a0, aVar);
        }
        hashMap.remove(this);
        hashMap.remove(gVar);
        hashMap.remove(aVar);
        return localDate;
    }

    /* renamed from: Y */
    public final boolean mo138213Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo137885f(C42662a.EPOCH_DAY) && C42668g.m172488a0(temporalAccessor);
    }

    /* renamed from: o */
    public final C42671j mo138217o(C42671j jVar, long j) {
        mo138210E().mo138227b(j, this);
        return jVar.mo137905b(Math.subtractExact(j, mo138218q(jVar)), ChronoUnit.WEEKS);
    }

    /* renamed from: q */
    public final long mo138218q(TemporalAccessor temporalAccessor) {
        if (mo138213Y(temporalAccessor)) {
            return (long) C42668g.m172492e0(LocalDate.m171812o(temporalAccessor));
        }
        throw new C42678q("Unsupported field: WeekOfWeekBasedYear");
    }

    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}
