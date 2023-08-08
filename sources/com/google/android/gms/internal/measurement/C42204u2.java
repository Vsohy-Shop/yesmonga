package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;

/* renamed from: com.google.android.gms.internal.measurement.u2 */
public final class C42204u2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106441e;

    /* renamed from: f */
    public final /* synthetic */ String f106442f;

    /* renamed from: g */
    public final /* synthetic */ Object f106443g;

    /* renamed from: v */
    public final /* synthetic */ boolean f106444v;

    /* renamed from: w */
    public final /* synthetic */ C41979h3 f106445w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42204u2(C41979h3 h3Var, String str, String str2, Object obj, boolean z) {
        super(h3Var, true);
        this.f106445w = h3Var;
        this.f106441e = str;
        this.f106442f = str2;
        this.f106443g = obj;
        this.f106444v = z;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106445w.f106174i)).setUserProperty(this.f106441e, this.f106442f, C41019f.m166811T6(this.f106443g), this.f106444v, this.f106458a);
    }
}
