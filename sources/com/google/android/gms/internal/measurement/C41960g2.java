package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.g2 */
public final class C41960g2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106142e;

    /* renamed from: f */
    public final /* synthetic */ String f106143f;

    /* renamed from: g */
    public final /* synthetic */ boolean f106144g;

    /* renamed from: v */
    public final /* synthetic */ C41851a1 f106145v;

    /* renamed from: w */
    public final /* synthetic */ C41979h3 f106146w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41960g2(C41979h3 h3Var, String str, String str2, boolean z, C41851a1 a1Var) {
        super(h3Var, true);
        this.f106146w = h3Var;
        this.f106142e = str;
        this.f106143f = str2;
        this.f106144g = z;
        this.f106145v = a1Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106146w.f106174i)).getUserProperties(this.f106142e, this.f106143f, this.f106144g, this.f106145v);
    }

    /* renamed from: c */
    public final void mo136605c() {
        this.f106145v.mo136499s6((Bundle) null);
    }
}
