package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.b1 */
public final class C41754b1 extends C41778j1 {

    /* renamed from: t */
    public final /* synthetic */ Location f105891t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41754b1(C41784l1 l1Var, C40507i iVar, Location location) {
        super(iVar);
        this.f105891t = location;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136252E0(this.f105891t);
        mo133793o(Status.f103184g);
    }
}
