package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.gtm.C41534r;
import com.google.android.gms.internal.gtm.C41582t;

/* renamed from: com.google.android.gms.tagmanager.u */
public final class C31021u extends C41534r implements C31023w {
    public C31021u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public final void initialize(C41016d dVar, C31020t tVar, C31011k kVar) throws RemoteException {
        Parcel m0 = mo135793m0();
        C41582t.m168364e(m0, dVar);
        C41582t.m168364e(m0, tVar);
        C41582t.m168364e(m0, kVar);
        mo135790O0(1, m0);
    }

    public final void preview(Intent intent, C41016d dVar) throws RemoteException {
        throw null;
    }

    public final void previewIntent(Intent intent, C41016d dVar, C41016d dVar2, C31020t tVar, C31011k kVar) throws RemoteException {
        Parcel m0 = mo135793m0();
        C41582t.m168363d(m0, intent);
        C41582t.m168364e(m0, dVar);
        C41582t.m168364e(m0, dVar2);
        C41582t.m168364e(m0, tVar);
        C41582t.m168364e(m0, kVar);
        mo135790O0(3, m0);
    }
}
