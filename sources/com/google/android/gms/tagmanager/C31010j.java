package com.google.android.gms.tagmanager;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.C41558s;
import com.google.android.gms.internal.gtm.C41582t;

/* renamed from: com.google.android.gms.tagmanager.j */
public abstract class C31010j extends C41558s implements C31011k {
    public C31010j() {
        super("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    /* renamed from: m0 */
    public final boolean mo87701m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo87699F2(parcel.readString(), C41582t.m168361b(parcel));
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            String e2 = mo87700e2(parcel.readString(), C41582t.m168361b(parcel));
            parcel2.writeNoException();
            parcel2.writeString(e2);
        }
        return true;
    }
}
