package p073j$.time.temporal;

import java.util.HashMap;
import java.util.Map;
import p073j$.time.LocalDate;
import p073j$.time.chrono.C42608p;
import p073j$.time.format.C42624C;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.c */
final class C42664c extends C42668g {
    C42664c() {
        super("DAY_OF_QUARTER", 0);
    }

    /* renamed from: E */
    public final C42679r mo138210E() {
        return C42679r.m172528l(90, 92);
    }

    /* renamed from: L */
    public final C42679r mo138212L(TemporalAccessor temporalAccessor) {
        if (mo138213Y(temporalAccessor)) {
            long g = temporalAccessor.mo137886g(C42668g.QUARTER_OF_YEAR);
            if (g != 1) {
                return g == 2 ? C42679r.m172526j(1, 91) : (g == 3 || g == 4) ? C42679r.m172526j(1, 92) : mo138210E();
            }
            return C42608p.f107789d.mo138030G(temporalAccessor.mo137886g(C42662a.YEAR)) ? C42679r.m172526j(1, 91) : C42679r.m172526j(1, 90);
        }
        throw new C42678q("Unsupported field: DayOfQuarter");
    }

    /* renamed from: R */
    public final TemporalAccessor mo138220R(Map map, TemporalAccessor temporalAccessor, C42624C c) {
        LocalDate localDate;
        long j;
        C42662a aVar = C42662a.YEAR;
        HashMap hashMap = (HashMap) map;
        Long l = (Long) hashMap.get(aVar);
        C42668g gVar = C42668g.QUARTER_OF_YEAR;
        Long l2 = (Long) hashMap.get(gVar);
        if (l == null || l2 == null) {
            return null;
        }
        int a0 = aVar.mo138214a0(l.longValue());
        long longValue = ((Long) hashMap.get(C42668g.DAY_OF_QUARTER)).longValue();
        C42668g.m172490c0(temporalAccessor);
        if (c == C42624C.LENIENT) {
            localDate = LocalDate.m171813of(a0, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1), 3));
            j = Math.subtractExact(longValue, 1);
        } else {
            localDate = LocalDate.m171813of(a0, ((gVar.mo138210E().mo138226a(l2.longValue(), gVar) - 1) * 3) + 1, 1);
            if (longValue < 1 || longValue > 90) {
                (c == C42624C.STRICT ? mo138212L(localDate) : mo138210E()).mo138227b(longValue, this);
            }
            j = longValue - 1;
        }
        hashMap.remove(this);
        hashMap.remove(aVar);
        hashMap.remove(gVar);
        return localDate.mo137924b0(j);
    }

    /* renamed from: Y */
    public final boolean mo138213Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo137885f(C42662a.DAY_OF_YEAR) && temporalAccessor.mo137885f(C42662a.MONTH_OF_YEAR) && temporalAccessor.mo137885f(C42662a.YEAR) && C42668g.m172488a0(temporalAccessor);
    }

    /* renamed from: o */
    public final C42671j mo138217o(C42671j jVar, long j) {
        long q = mo138218q(jVar);
        mo138210E().mo138227b(j, this);
        C42662a aVar = C42662a.DAY_OF_YEAR;
        return jVar.mo137902a((j - q) + jVar.mo137886g(aVar), aVar);
    }

    /* renamed from: q */
    public final long mo138218q(TemporalAccessor temporalAccessor) {
        if (mo138213Y(temporalAccessor)) {
            return (long) (temporalAccessor.mo137890j(C42662a.DAY_OF_YEAR) - C42668g.f107953a[((temporalAccessor.mo137890j(C42662a.MONTH_OF_YEAR) - 1) / 3) + (C42608p.f107789d.mo138030G(temporalAccessor.mo137886g(C42662a.YEAR)) ? 4 : 0)]);
        }
        throw new C42678q("Unsupported field: DayOfQuarter");
    }

    public final String toString() {
        return "DayOfQuarter";
    }
}
