package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.z1 */
public final class C42288z1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106576e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106577f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42288z1(C41979h3 h3Var, String str) {
        super(h3Var, true);
        this.f106577f = h3Var;
        this.f106576e = str;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106577f.f106174i)).beginAdUnitExposure(this.f106576e, this.f106459b);
    }
}
