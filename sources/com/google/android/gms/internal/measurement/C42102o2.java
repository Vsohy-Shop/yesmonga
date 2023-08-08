package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.o2 */
public final class C42102o2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ boolean f106319e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106320f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42102o2(C41979h3 h3Var, boolean z) {
        super(h3Var, true);
        this.f106320f = h3Var;
        this.f106319e = z;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106320f.f106174i)).setDataCollectionEnabled(this.f106319e);
    }
}
