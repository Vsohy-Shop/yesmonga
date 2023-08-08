package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.a1 */
public final class C41751a1 extends C41778j1 {

    /* renamed from: t */
    public final /* synthetic */ boolean f105890t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41751a1(C41784l1 l1Var, C40507i iVar, boolean z) {
        super(iVar);
        this.f105890t = z;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136251D0(this.f105890t);
        mo133793o(Status.f103184g);
    }
}
