package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.j */
public abstract class C41776j extends C41750a0 implements C41779k {
    public C41776j() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* renamed from: m0 */
    public final boolean mo85751m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo136192D8(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            mo136193r1(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            mo136194s4(parcel.readInt(), (PendingIntent) C41794q0.m169120b(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
