package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;

/* renamed from: com.google.android.gms.internal.measurement.f3 */
public final class C41943f3 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Activity f106114e;

    /* renamed from: f */
    public final /* synthetic */ C41961g3 f106115f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41943f3(C41961g3 g3Var, Activity activity) {
        super(g3Var.f106147a, true);
        this.f106115f = g3Var;
        this.f106114e = activity;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106115f.f106147a.f106174i)).onActivityDestroyed(C41019f.m166811T6(this.f106114e), this.f106459b);
    }
}
