package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.p2 */
public final class C42119p2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Bundle f106335e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106336f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42119p2(C41979h3 h3Var, Bundle bundle) {
        super(h3Var, true);
        this.f106336f = h3Var;
        this.f106335e = bundle;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106336f.f106174i)).setDefaultEventParameters(this.f106335e);
    }
}
