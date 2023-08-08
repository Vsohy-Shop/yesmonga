package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C41107i;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.common.internal.g1 */
public abstract class C40763g1 extends C41107i implements C40795o {
    public C40763g1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: m0 */
    public final boolean mo134408m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C41108j.m166983b(parcel);
            mo134402V2(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C41108j.m166982a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            C41108j.m166983b(parcel);
            mo134403m6(parcel.readInt(), (Bundle) C41108j.m166982a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            C41108j.m166983b(parcel);
            mo134404n7(parcel.readInt(), parcel.readStrongBinder(), (zzj) C41108j.m166982a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
