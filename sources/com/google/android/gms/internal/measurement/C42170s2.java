package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
public final class C42170s2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ C42255x2 f106398e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106399f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42170s2(C41979h3 h3Var, C42255x2 x2Var) {
        super(h3Var, true);
        this.f106399f = h3Var;
        this.f106398e = x2Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106399f.f106174i)).unregisterOnMeasurementEventListener(this.f106398e);
    }
}
