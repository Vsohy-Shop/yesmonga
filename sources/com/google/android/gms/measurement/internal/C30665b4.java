package com.google.android.gms.measurement.internal;

import androidx.annotation.C0348i1;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
public abstract class C30665b4 extends C30651a3 {

    /* renamed from: b */
    public boolean f73241b;

    public C30665b4(C30731g5 g5Var) {
        super(g5Var);
        this.f74136a.mo87117i();
    }

    /* renamed from: i */
    public final void mo86890i() {
        if (!mo86894m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo86891j() {
        if (this.f73241b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo86895n()) {
            this.f74136a.mo87115g();
            this.f73241b = true;
        }
    }

    /* renamed from: k */
    public final void mo86892k() {
        if (!this.f73241b) {
            mo86893l();
            this.f74136a.mo87115g();
            this.f73241b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    @C0348i1
    /* renamed from: l */
    public void mo86893l() {
    }

    /* renamed from: m */
    public final boolean mo86894m() {
        return this.f73241b;
    }

    /* renamed from: n */
    public abstract boolean mo86895n();
}
