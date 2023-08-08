package p073j$.time.temporal;

import p073j$.time.LocalDate;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.f */
final class C42667f extends C42668g {
    C42667f() {
        super("WEEK_BASED_YEAR", 3);
    }

    /* renamed from: E */
    public final C42679r mo138210E() {
        return C42662a.YEAR.mo138210E();
    }

    /* renamed from: Y */
    public final boolean mo138213Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo137885f(C42662a.EPOCH_DAY) && C42668g.m172488a0(temporalAccessor);
    }

    /* renamed from: o */
    public final C42671j mo138217o(C42671j jVar, long j) {
        if (mo138213Y(jVar)) {
            int a = mo138210E().mo138226a(j, C42668g.WEEK_BASED_YEAR);
            LocalDate o = LocalDate.m171812o(jVar);
            C42662a aVar = C42662a.DAY_OF_WEEK;
            int j2 = o.mo137890j(aVar);
            int e0 = C42668g.m172492e0(o);
            if (e0 == 53 && C42668g.m172496i0(a) == 52) {
                e0 = 52;
            }
            LocalDate of = LocalDate.m171813of(a, 1, 4);
            return jVar.mo137907e(of.mo137924b0((long) (((e0 - 1) * 7) + (j2 - of.mo137890j(aVar)))));
        }
        throw new C42678q("Unsupported field: WeekBasedYear");
    }

    /* renamed from: q */
    public final long mo138218q(TemporalAccessor temporalAccessor) {
        if (mo138213Y(temporalAccessor)) {
            return (long) C42668g.m172495h0(LocalDate.m171812o(temporalAccessor));
        }
        throw new C42678q("Unsupported field: WeekBasedYear");
    }

    public final String toString() {
        return "WeekBasedYear";
    }
}
