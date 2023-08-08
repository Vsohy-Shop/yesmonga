package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.common.C41092a;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.common.internal.i1 */
public final class C40771i1 extends C41092a implements C40779k1 {
    public C40771i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: E5 */
    public final boolean mo134414E5(zzs zzs, C41016d dVar) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166985d(T6, zzs);
        C41108j.m166987f(T6, dVar);
        Parcel m0 = mo134907m0(5, T6);
        boolean g = C41108j.m166988g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: N6 */
    public final zzq mo134415N6(zzo zzo) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166985d(T6, zzo);
        Parcel m0 = mo134907m0(6, T6);
        zzq zzq = (zzq) C41108j.m166982a(m0, zzq.CREATOR);
        m0.recycle();
        return zzq;
    }

    /* renamed from: h */
    public final boolean mo134416h() throws RemoteException {
        Parcel m0 = mo134907m0(9, mo134905T6());
        boolean g = C41108j.m166988g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: k */
    public final boolean mo134417k() throws RemoteException {
        Parcel m0 = mo134907m0(7, mo134905T6());
        boolean g = C41108j.m166988g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: k7 */
    public final zzq mo134418k7(zzo zzo) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166985d(T6, zzo);
        Parcel m0 = mo134907m0(8, T6);
        zzq zzq = (zzq) C41108j.m166982a(m0, zzq.CREATOR);
        m0.recycle();
        return zzq;
    }
}
