package p073j$.time.temporal;

/* renamed from: j$.time.temporal.l */
public final /* synthetic */ class C42673l implements C42672k {

    /* renamed from: a */
    public final /* synthetic */ int f107961a;

    public /* synthetic */ C42673l(int i) {
        this.f107961a = i;
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        int j = jVar.mo137890j(C42662a.DAY_OF_WEEK);
        int i = this.f107961a;
        if (j == i) {
            return jVar;
        }
        int i2 = j - i;
        return jVar.mo137905b((long) (i2 >= 0 ? 7 - i2 : -i2), ChronoUnit.DAYS);
    }
}
