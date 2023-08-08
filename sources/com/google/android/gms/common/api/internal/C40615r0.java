package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C40747e;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
public final class C40615r0 extends C40584l1 {

    /* renamed from: b */
    public final /* synthetic */ C40747e.C40750c f103549b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40615r0(C40620s0 s0Var, C40579k1 k1Var, C40747e.C40750c cVar) {
        super(k1Var);
        this.f103549b = cVar;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo133980a() {
        this.f103549b.mo134010a(new ConnectionResult(16, (PendingIntent) null));
    }
}
