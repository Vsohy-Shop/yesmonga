package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.C41534r;
import com.google.android.gms.internal.gtm.C41582t;

/* renamed from: com.google.android.gms.tagmanager.l */
public final class C31012l extends C41534r implements C31014n {
    public C31012l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    /* renamed from: E */
    public final void mo87702E(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel m0 = mo135793m0();
        m0.writeString(str);
        m0.writeString(str2);
        C41582t.m168363d(m0, bundle);
        m0.writeLong(j);
        mo135790O0(1, m0);
    }
}
