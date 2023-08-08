package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.i6 */
public final class C41324i6 extends C41534r implements C41373k6 {
    public C41324i6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    /* renamed from: E7 */
    public final void mo135488E7(boolean z, String str) throws RemoteException {
        Parcel m0 = mo135793m0();
        C41582t.m168362c(m0, z);
        m0.writeString(str);
        mo135791T6(1, m0);
    }
}
