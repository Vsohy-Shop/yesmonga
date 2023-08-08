package androidx.fragment.app.strictmode;

/* renamed from: androidx.fragment.app.strictmode.b */
public final /* synthetic */ class C19274b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f49613a;

    /* renamed from: b */
    public final /* synthetic */ Violation f49614b;

    public /* synthetic */ C19274b(String str, Violation violation) {
        this.f49613a = str;
        this.f49614b = violation;
    }

    public final void run() {
        FragmentStrictMode.m90375g(this.f49613a, this.f49614b);
    }
}
