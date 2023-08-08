package p073j$.time.temporal;

/* renamed from: j$.time.temporal.h */
enum C42669h implements C42677p {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a */
    private final String f107956a;

    private C42669h(String str) {
        this.f107956a = str;
    }

    /* renamed from: n */
    public final boolean mo138198n() {
        return true;
    }

    /* renamed from: o */
    public final C42671j mo138199o(C42671j jVar, long j) {
        int i = C42663b.f107952a[ordinal()];
        if (i == 1) {
            C42675n nVar = C42670i.f107959c;
            return jVar.mo137902a(Math.addExact((long) jVar.mo137890j(nVar), j), nVar);
        } else if (i == 2) {
            return jVar.mo137905b(j / 256, ChronoUnit.YEARS).mo137905b((j % 256) * 3, ChronoUnit.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final String toString() {
        return this.f107956a;
    }
}
