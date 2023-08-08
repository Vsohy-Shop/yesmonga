package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: com.google.android.gms.maps.internal.z1 */
public abstract class C30549z1 extends C41834l implements C30462a2 {
    public C30549z1() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86001P3((CameraPosition) C41835m.m169451a(parcel, CameraPosition.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
