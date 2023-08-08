package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.C41065b;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.common.internal.service.k */
public abstract class C40832k extends C41065b implements C40833l {
    public C40832k() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* renamed from: E8 */
    public final boolean mo87664E8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        C41066c.m166936b(parcel);
        mo134500D6(readInt);
        return true;
    }
}
