package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.r0 */
public abstract class C41535r0 extends C41511q0 {

    /* renamed from: b */
    public boolean f104916b;

    public C41535r0(C41607u0 u0Var) {
        super(u0Var);
    }

    /* renamed from: T */
    public final void mo135794T() {
        if (!mo135796V()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: U */
    public final void mo135795U() {
        mo133294W();
        this.f104916b = true;
    }

    /* renamed from: V */
    public final boolean mo135796V() {
        return this.f104916b;
    }

    /* renamed from: W */
    public abstract void mo133294W();
}
