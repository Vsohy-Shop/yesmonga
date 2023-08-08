package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
public final class C41924e2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ C41851a1 f106089e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106090f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41924e2(C41979h3 h3Var, C41851a1 a1Var) {
        super(h3Var, true);
        this.f106090f = h3Var;
        this.f106089e = a1Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106090f.f106174i)).getCurrentScreenName(this.f106089e);
    }

    /* renamed from: c */
    public final void mo136605c() {
        this.f106089e.mo136499s6((Bundle) null);
    }
}
