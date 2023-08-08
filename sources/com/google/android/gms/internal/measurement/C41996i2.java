package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.i2 */
public final class C41996i2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Bundle f106202e;

    /* renamed from: f */
    public final /* synthetic */ C41851a1 f106203f;

    /* renamed from: g */
    public final /* synthetic */ C41979h3 f106204g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41996i2(C41979h3 h3Var, Bundle bundle, C41851a1 a1Var) {
        super(h3Var, true);
        this.f106204g = h3Var;
        this.f106202e = bundle;
        this.f106203f = a1Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106204g.f106174i)).performAction(this.f106202e, this.f106203f, this.f106458a);
    }

    /* renamed from: c */
    public final void mo136605c() {
        this.f106203f.mo136499s6((Bundle) null);
    }
}
