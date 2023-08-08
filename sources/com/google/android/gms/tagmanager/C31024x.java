package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.gtm.C41421m6;
import com.google.android.gms.internal.gtm.C41445n6;
import com.google.android.gms.internal.gtm.C41534r;
import com.google.android.gms.internal.gtm.C41582t;

/* renamed from: com.google.android.gms.tagmanager.x */
public final class C31024x extends C41534r implements C31026z {
    public C31024x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    public final C41445n6 getService(C41016d dVar, C31020t tVar, C31011k kVar) throws RemoteException {
        Parcel m0 = mo135793m0();
        C41582t.m168364e(m0, dVar);
        C41582t.m168364e(m0, tVar);
        C41582t.m168364e(m0, kVar);
        Parcel H0 = mo135789H0(1, m0);
        C41445n6 H02 = C41421m6.m168040H0(H0.readStrongBinder());
        H0.recycle();
        return H02;
    }
}
