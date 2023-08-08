package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
public final class C42135q1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106359e;

    /* renamed from: f */
    public final /* synthetic */ String f106360f;

    /* renamed from: g */
    public final /* synthetic */ C41851a1 f106361g;

    /* renamed from: v */
    public final /* synthetic */ C41979h3 f106362v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42135q1(C41979h3 h3Var, String str, String str2, C41851a1 a1Var) {
        super(h3Var, true);
        this.f106362v = h3Var;
        this.f106359e = str;
        this.f106360f = str2;
        this.f106361g = a1Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106362v.f106174i)).getConditionalUserProperties(this.f106359e, this.f106360f, this.f106361g);
    }

    /* renamed from: c */
    public final void mo136605c() {
        this.f106361g.mo136499s6((Bundle) null);
    }
}
