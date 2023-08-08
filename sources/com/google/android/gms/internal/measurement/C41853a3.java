package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;

/* renamed from: com.google.android.gms.internal.measurement.a3 */
public final class C41853a3 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Activity f105989e;

    /* renamed from: f */
    public final /* synthetic */ C41961g3 f105990f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41853a3(C41961g3 g3Var, Activity activity) {
        super(g3Var.f106147a, true);
        this.f105990f = g3Var;
        this.f105989e = activity;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f105990f.f106147a.f106174i)).onActivityResumed(C41019f.m166811T6(this.f105989e), this.f106459b);
    }
}
