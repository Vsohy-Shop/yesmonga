package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z9 */
public abstract class C30965z9 extends C30953y9 {

    /* renamed from: c */
    public boolean f74146c;

    public C30965z9(C30822na naVar) {
        super(naVar);
        this.f74119b.mo87385r();
    }

    /* renamed from: i */
    public final void mo87627i() {
        if (!mo87629k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo87628j() {
        if (!this.f74146c) {
            mo86867l();
            this.f74119b.mo87380m();
            this.f74146c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: k */
    public final boolean mo87629k() {
        return this.f74146c;
    }

    /* renamed from: l */
    public abstract boolean mo86867l();
}
