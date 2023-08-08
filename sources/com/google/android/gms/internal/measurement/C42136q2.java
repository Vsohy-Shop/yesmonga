package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.q2 */
public final class C42136q2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ C42238w2 f106363e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106364f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42136q2(C41979h3 h3Var, C42238w2 w2Var) {
        super(h3Var, true);
        this.f106364f = h3Var;
        this.f106363e = w2Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106364f.f106174i)).setEventInterceptor(this.f106363e);
    }
}
