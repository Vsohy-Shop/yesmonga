package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.k2 */
public final class C42032k2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106249e;

    /* renamed from: f */
    public final /* synthetic */ C41851a1 f106250f;

    /* renamed from: g */
    public final /* synthetic */ C41979h3 f106251g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42032k2(C41979h3 h3Var, String str, C41851a1 a1Var) {
        super(h3Var, true);
        this.f106251g = h3Var;
        this.f106249e = str;
        this.f106250f = a1Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106251g.f106174i)).getMaxUserProperties(this.f106249e, this.f106250f);
    }

    /* renamed from: c */
    public final void mo136605c() {
        this.f106250f.mo136499s6((Bundle) null);
    }
}
