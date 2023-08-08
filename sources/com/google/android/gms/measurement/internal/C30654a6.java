package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
public abstract class C30654a6 extends C30961z5 {

    /* renamed from: b */
    public boolean f73222b;

    public C30654a6(C30731g5 g5Var) {
        super(g5Var);
        this.f74136a.mo87117i();
    }

    /* renamed from: i */
    public void mo86871i() {
    }

    /* renamed from: j */
    public abstract boolean mo86872j();

    /* renamed from: k */
    public final void mo86873k() {
        if (!mo86876n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo86874l() {
        if (this.f73222b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo86872j()) {
            this.f74136a.mo87115g();
            this.f73222b = true;
        }
    }

    /* renamed from: m */
    public final void mo86875m() {
        if (!this.f73222b) {
            mo86871i();
            this.f74136a.mo87115g();
            this.f73222b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: n */
    public final boolean mo86876n() {
        return this.f73222b;
    }
}
