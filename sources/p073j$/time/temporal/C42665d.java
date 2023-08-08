package p073j$.time.temporal;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.d */
final class C42665d extends C42668g {
    C42665d() {
        super("QUARTER_OF_YEAR", 1);
    }

    /* renamed from: E */
    public final C42679r mo138210E() {
        return C42679r.m172526j(1, 4);
    }

    /* renamed from: Y */
    public final boolean mo138213Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo137885f(C42662a.MONTH_OF_YEAR) && C42668g.m172488a0(temporalAccessor);
    }

    /* renamed from: o */
    public final C42671j mo138217o(C42671j jVar, long j) {
        long q = mo138218q(jVar);
        mo138210E().mo138227b(j, this);
        C42662a aVar = C42662a.MONTH_OF_YEAR;
        return jVar.mo137902a(((j - q) * 3) + jVar.mo137886g(aVar), aVar);
    }

    /* renamed from: q */
    public final long mo138218q(TemporalAccessor temporalAccessor) {
        if (mo138213Y(temporalAccessor)) {
            return (temporalAccessor.mo137886g(C42662a.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new C42678q("Unsupported field: QuarterOfYear");
    }

    public final String toString() {
        return "QuarterOfYear";
    }
}
