package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;

/* renamed from: com.google.android.gms.maps.internal.h1 */
public abstract class C30489h1 extends C41834l implements C30493i1 {
    public C30489h1() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo85978k6((Bitmap) C41835m.m169451a(parcel, Bitmap.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo85977H4(C41016d.C41017a.m166799H0(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
