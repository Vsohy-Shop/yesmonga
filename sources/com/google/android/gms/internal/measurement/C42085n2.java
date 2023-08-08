package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
public final class C42085n2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ C41851a1 f106304e;

    /* renamed from: f */
    public final /* synthetic */ int f106305f;

    /* renamed from: g */
    public final /* synthetic */ C41979h3 f106306g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42085n2(C41979h3 h3Var, C41851a1 a1Var, int i) {
        super(h3Var, true);
        this.f106306g = h3Var;
        this.f106304e = a1Var;
        this.f106305f = i;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106306g.f106174i)).getTestFlag(this.f106304e, this.f106305f);
    }

    /* renamed from: c */
    public final void mo136605c() {
        this.f106304e.mo136499s6((Bundle) null);
    }
}
