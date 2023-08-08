package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.d0 */
public final /* synthetic */ class C1443d0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DeferrableSurface f4192a;

    /* renamed from: b */
    public final /* synthetic */ String f4193b;

    public /* synthetic */ C1443d0(DeferrableSurface deferrableSurface, String str) {
        this.f4192a = deferrableSurface;
        this.f4193b = str;
    }

    public final void run() {
        this.f4192a.m5989j(this.f4193b);
    }
}
