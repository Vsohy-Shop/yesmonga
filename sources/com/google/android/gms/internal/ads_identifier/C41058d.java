package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads_identifier.d */
public final class C41058d extends C41055a implements C41060f {
    public C41058d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: J1 */
    public final boolean mo134863J1(boolean z) throws RemoteException {
        Parcel m0 = mo134860m0();
        C41057c.m166919a(m0, true);
        Parcel H0 = mo134858H0(2, m0);
        boolean b = C41057c.m166920b(H0);
        H0.recycle();
        return b;
    }

    /* renamed from: d */
    public final String mo134864d() throws RemoteException {
        Parcel H0 = mo134858H0(1, mo134860m0());
        String readString = H0.readString();
        H0.recycle();
        return readString;
    }

    /* renamed from: e */
    public final boolean mo134865e() throws RemoteException {
        Parcel H0 = mo134858H0(6, mo134860m0());
        boolean b = C41057c.m166920b(H0);
        H0.recycle();
        return b;
    }
}
