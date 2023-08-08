package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.m2 */
public final class C42068m2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ C41851a1 f106290e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106291f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42068m2(C41979h3 h3Var, C41851a1 a1Var) {
        super(h3Var, true);
        this.f106291f = h3Var;
        this.f106290e = a1Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106291f.f106174i)).getSessionId(this.f106290e);
    }

    /* renamed from: c */
    public final void mo136605c() {
        this.f106290e.mo136499s6((Bundle) null);
    }
}
