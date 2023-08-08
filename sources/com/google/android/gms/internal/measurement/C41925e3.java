package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;

/* renamed from: com.google.android.gms.internal.measurement.e3 */
public final class C41925e3 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Activity f106091e;

    /* renamed from: f */
    public final /* synthetic */ C41851a1 f106092f;

    /* renamed from: g */
    public final /* synthetic */ C41961g3 f106093g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41925e3(C41961g3 g3Var, Activity activity, C41851a1 a1Var) {
        super(g3Var.f106147a, true);
        this.f106093g = g3Var;
        this.f106091e = activity;
        this.f106092f = a1Var;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106093g.f106147a.f106174i)).onActivitySaveInstanceState(C41019f.m166811T6(this.f106091e), this.f106092f, this.f106459b);
    }
}
