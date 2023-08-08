package com.google.android.play.core.splitinstall;

/* renamed from: com.google.android.play.core.splitinstall.v0 */
public final class C32215v0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32167f f78554a;

    /* renamed from: b */
    public final /* synthetic */ int f78555b;

    /* renamed from: c */
    public final /* synthetic */ int f78556c;

    /* renamed from: d */
    public final /* synthetic */ C32217w0 f78557d;

    public C32215v0(C32217w0 w0Var, C32167f fVar, int i, int i2) {
        this.f78557d = w0Var;
        this.f78554a = fVar;
        this.f78555b = i;
        this.f78556c = i2;
    }

    public final void run() {
        C32217w0 w0Var = this.f78557d;
        C32167f fVar = this.f78554a;
        w0Var.mo93010l(new C32171h(fVar.mo92964l(), this.f78555b, this.f78556c, fVar.mo92957c(), fVar.mo92966n(), fVar.mo92955a(), fVar.mo92956b(), fVar.mo92963k(), fVar.mo92958d()));
    }
}
