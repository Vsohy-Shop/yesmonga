package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.C41534r;
import com.google.android.gms.internal.gtm.C41582t;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.r */
public final class C31018r extends C41534r implements C31020t {
    public C31018r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    /* renamed from: Z1 */
    public final void mo87695Z1(C31014n nVar) throws RemoteException {
        Parcel m0 = mo135793m0();
        C41582t.m168364e(m0, nVar);
        mo135790O0(22, m0);
    }

    /* renamed from: m4 */
    public final void mo87696m4(C31017q qVar) throws RemoteException {
        Parcel m0 = mo135793m0();
        C41582t.m168364e(m0, qVar);
        mo135790O0(21, m0);
    }

    /* renamed from: o2 */
    public final void mo87697o2(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel m0 = mo135793m0();
        m0.writeString(str);
        m0.writeString(str2);
        C41582t.m168363d(m0, bundle);
        m0.writeLong(j);
        mo135790O0(2, m0);
    }

    public final Map zzb() throws RemoteException {
        Parcel H0 = mo135789H0(11, mo135793m0());
        HashMap b = C41582t.m168361b(H0);
        H0.recycle();
        return b;
    }
}
