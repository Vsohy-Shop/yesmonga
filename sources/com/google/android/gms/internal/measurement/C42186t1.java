package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.t1 */
public final class C42186t1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Boolean f106415e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106416f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42186t1(C41979h3 h3Var, Boolean bool) {
        super(h3Var, true);
        this.f106416f = h3Var;
        this.f106415e = bool;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        if (this.f106415e != null) {
            ((C41923e1) C40843u.m166202l(this.f106416f.f106174i)).setMeasurementEnabled(this.f106415e.booleanValue(), this.f106458a);
        } else {
            ((C41923e1) C40843u.m166202l(this.f106416f.f106174i)).clearMeasurementEnabled(this.f106458a);
        }
    }
}
