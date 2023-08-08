package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41813a;
import com.google.android.gms.internal.maps.C41835m;

/* renamed from: com.google.android.gms.maps.internal.y1 */
public final class C30546y1 extends C41813a implements C30475e {
    public C30546y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30463b mo86118A() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 1
            android.os.Parcel r1 = r4.mo136322H0()
            android.os.Parcel r0 = r4.mo136325m0(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.C30463b
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.internal.b r1 = (com.google.android.gms.maps.internal.C30463b) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.internal.t1 r2 = new com.google.android.gms.maps.internal.t1
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30546y1.mo86118A():com.google.android.gms.maps.internal.b");
    }

    /* renamed from: G */
    public final void mo86119G(Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bundle);
        mo136323O0(10, H0);
    }

    /* renamed from: K */
    public final void mo86120K(C30476e0 e0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, e0Var);
        mo136323O0(9, H0);
    }

    /* renamed from: N */
    public final void mo86121N() throws RemoteException {
        mo136323O0(11, mo136322H0());
    }

    /* renamed from: a */
    public final void mo86122a() throws RemoteException {
        mo136323O0(13, mo136322H0());
    }

    /* renamed from: b */
    public final void mo86123b() throws RemoteException {
        mo136323O0(12, mo136322H0());
    }

    /* renamed from: c */
    public final void mo86124c() throws RemoteException {
        mo136323O0(5, mo136322H0());
    }

    /* renamed from: g */
    public final void mo86125g() throws RemoteException {
        mo136323O0(3, mo136322H0());
    }

    public final C41016d getView() throws RemoteException {
        Parcel m0 = mo136325m0(8, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: i */
    public final void mo86127i(Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bundle);
        mo136323O0(2, H0);
    }

    /* renamed from: m */
    public final void mo86128m(Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bundle);
        Parcel m0 = mo136325m0(7, H0);
        if (m0.readInt() != 0) {
            bundle.readFromParcel(m0);
        }
        m0.recycle();
    }

    public final void onLowMemory() throws RemoteException {
        mo136323O0(6, mo136322H0());
    }

    /* renamed from: v */
    public final void mo86130v() throws RemoteException {
        mo136323O0(4, mo136322H0());
    }
}
