package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.a2 */
public final class C41852a2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f105987e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f105988f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41852a2(C41979h3 h3Var, String str) {
        super(h3Var, true);
        this.f105988f = h3Var;
        this.f105987e = str;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f105988f.f106174i)).endAdUnitExposure(this.f105987e, this.f106459b);
    }
}
