package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.r1 */
public final class C42152r1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106374e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106375f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42152r1(C41979h3 h3Var, String str) {
        super(h3Var, true);
        this.f106375f = h3Var;
        this.f106374e = str;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106375f.f106174i)).setUserId(this.f106374e, this.f106458a);
    }
}
