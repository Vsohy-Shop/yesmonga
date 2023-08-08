package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.internal.maps.q */
public final class C41839q extends C41813a implements C41841s {
    public C41839q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: I0 */
    public final C41016d mo136438I0(String str) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeString(str);
        Parcel m0 = mo136325m0(2, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: S1 */
    public final C41016d mo136439S1(Bitmap bitmap) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bitmap);
        Parcel m0 = mo136325m0(6, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: T3 */
    public final C41016d mo136440T3(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        Parcel m0 = mo136325m0(1, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: e */
    public final C41016d mo136441e() throws RemoteException {
        Parcel m0 = mo136325m0(4, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: q7 */
    public final C41016d mo136442q7(String str) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeString(str);
        Parcel m0 = mo136325m0(3, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: t1 */
    public final C41016d mo136443t1(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        Parcel m0 = mo136325m0(5, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: y8 */
    public final C41016d mo136444y8(String str) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeString(str);
        Parcel m0 = mo136325m0(7, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }
}
