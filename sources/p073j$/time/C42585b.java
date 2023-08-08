package p073j$.time;

/* renamed from: j$.time.b */
public abstract class C42585b {
    protected C42585b() {
    }

    /* renamed from: d */
    public static C42585b m171974d() {
        return new C42584a(ZoneId.systemDefault());
    }

    /* renamed from: e */
    public static C42585b m171975e() {
        return new C42584a(ZoneOffset.UTC);
    }

    /* renamed from: a */
    public abstract ZoneId mo138021a();

    /* renamed from: b */
    public abstract Instant mo138022b();

    /* renamed from: c */
    public abstract long mo138023c();
}
