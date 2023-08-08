package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
public final class C40610q0 extends C40584l1 {

    /* renamed from: b */
    public final /* synthetic */ ConnectionResult f103543b;

    /* renamed from: c */
    public final /* synthetic */ C40620s0 f103544c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40610q0(C40620s0 s0Var, C40579k1 k1Var, ConnectionResult connectionResult) {
        super(k1Var);
        this.f103544c = s0Var;
        this.f103543b = connectionResult;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo133980a() {
        this.f103544c.f103558c.mo133832l(this.f103543b);
    }
}
