package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.j6 */
public abstract class C41348j6 extends C41558s implements C41373k6 {
    public C41348j6() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    /* renamed from: m0 */
    public final boolean mo87701m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo135488E7(C41582t.m168365f(parcel), parcel.readString());
        return true;
    }
}
