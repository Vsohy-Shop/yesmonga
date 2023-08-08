package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.p1 */
public final class C42118p1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106331e;

    /* renamed from: f */
    public final /* synthetic */ String f106332f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f106333g;

    /* renamed from: v */
    public final /* synthetic */ C41979h3 f106334v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42118p1(C41979h3 h3Var, String str, String str2, Bundle bundle) {
        super(h3Var, true);
        this.f106334v = h3Var;
        this.f106331e = str;
        this.f106332f = str2;
        this.f106333g = bundle;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106334v.f106174i)).clearConditionalUserProperty(this.f106331e, this.f106332f, this.f106333g);
    }
}
