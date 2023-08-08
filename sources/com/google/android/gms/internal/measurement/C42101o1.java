package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.o1 */
public final class C42101o1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Bundle f106317e;

    /* renamed from: f */
    public final /* synthetic */ C41979h3 f106318f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42101o1(C41979h3 h3Var, Bundle bundle) {
        super(h3Var, true);
        this.f106318f = h3Var;
        this.f106317e = bundle;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106318f.f106174i)).setConditionalUserProperty(this.f106317e, this.f106458a);
    }
}
