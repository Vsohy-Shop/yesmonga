package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.r2 */
public final class C42153r2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ C42255x2 f106376e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106377f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42153r2(C41979h3 h3Var, C42255x2 x2Var) {
        super(h3Var, true);
        this.f106377f = h3Var;
        this.f106376e = x2Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106377f.f106174i)).registerOnMeasurementEventListener(this.f106376e);
    }
}
