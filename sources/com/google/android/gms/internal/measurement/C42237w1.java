package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.w1 */
public final class C42237w1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ C41979h3 f106477e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42237w1(C41979h3 h3Var) {
        super(h3Var, true);
        this.f106477e = h3Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106477e.f106174i)).resetAnalyticsData(this.f106458a);
    }
}
