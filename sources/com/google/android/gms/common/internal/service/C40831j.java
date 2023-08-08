package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.C41064a;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.common.internal.service.j */
public final class C40831j extends C41064a implements IInterface {
    public C40831j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: E8 */
    public final void mo134502E8(TelemetryData telemetryData) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166938d(m0, telemetryData);
        mo134868T6(1, m0);
    }
}
