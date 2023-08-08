package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.z3 */
public final class C41730z3 extends C41534r implements IInterface {
    public C41730z3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    /* renamed from: E8 */
    public final void mo136118E8(Map map, long j, String str, List<zzcp> list) throws RemoteException {
        Parcel m0 = mo135793m0();
        m0.writeMap(map);
        m0.writeLong(j);
        m0.writeString(str);
        m0.writeTypedList(list);
        mo135790O0(1, m0);
    }

    /* renamed from: f */
    public final void mo136119f() throws RemoteException {
        mo135790O0(2, mo135793m0());
    }
}
