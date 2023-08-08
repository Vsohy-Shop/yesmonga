package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
public abstract class C42013j1 extends C42100o0 implements C42031k1 {
    public C42013j1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: m0 */
    public final boolean mo87178m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            long readLong = parcel.readLong();
            C42117p0.m170703c(parcel);
            mo137013E(parcel.readString(), parcel.readString(), (Bundle) C42117p0.m170701a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int e = mo137014e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
        }
        return true;
    }
}
