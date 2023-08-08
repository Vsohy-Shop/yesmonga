package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.x1 */
public final class C42254x1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ long f106489e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106490f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42254x1(C41979h3 h3Var, long j) {
        super(h3Var, true);
        this.f106490f = h3Var;
        this.f106489e = j;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106490f.f106174i)).setSessionTimeoutDuration(this.f106489e);
    }
}
