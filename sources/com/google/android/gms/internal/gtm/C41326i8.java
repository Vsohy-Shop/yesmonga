package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.i8 */
public final class C41326i8 extends C41348j6 {

    /* renamed from: n */
    public final /* synthetic */ C41375k8 f104673n;

    public /* synthetic */ C41326i8(C41375k8 k8Var, C41302h8 h8Var) {
        this.f104673n = k8Var;
    }

    /* renamed from: E7 */
    public final void mo135488E7(boolean z, String str) throws RemoteException {
        this.f104673n.f104753e.execute(new C41278g8(this, z, str));
    }
}
