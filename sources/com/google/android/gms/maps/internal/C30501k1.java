package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41813a;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: com.google.android.gms.maps.internal.k1 */
public final class C30501k1 extends C41813a implements C30487h {
    public C30501k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    /* renamed from: L */
    public final void mo86158L() throws RemoteException {
        mo136323O0(7, mo136322H0());
    }

    /* renamed from: P6 */
    public final void mo86159P6(C41016d dVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        C41835m.m169454d(H0, streetViewPanoramaOptions);
        C41835m.m169454d(H0, bundle);
        mo136323O0(2, H0);
    }

    /* renamed from: T0 */
    public final void mo86160T0(C30481f1 f1Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, f1Var);
        mo136323O0(12, H0);
    }

    /* renamed from: a */
    public final void mo86161a() throws RemoteException {
        mo136323O0(14, mo136322H0());
    }

    /* renamed from: b */
    public final void mo86162b() throws RemoteException {
        mo136323O0(13, mo136322H0());
    }

    /* renamed from: c */
    public final void mo86163c() throws RemoteException {
        mo136323O0(8, mo136322H0());
    }

    /* renamed from: g */
    public final void mo86164g() throws RemoteException {
        mo136323O0(5, mo136322H0());
    }

    /* renamed from: i */
    public final void mo86165i(Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bundle);
        mo136323O0(3, H0);
    }

    /* renamed from: m */
    public final void mo86166m(Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bundle);
        Parcel m0 = mo136325m0(10, H0);
        if (m0.readInt() != 0) {
            bundle.readFromParcel(m0);
        }
        m0.recycle();
    }

    public final void onLowMemory() throws RemoteException {
        mo136323O0(9, mo136322H0());
    }

    /* renamed from: v */
    public final void mo86168v() throws RemoteException {
        mo136323O0(6, mo136322H0());
    }

    /* renamed from: x0 */
    public final boolean mo86169x0() throws RemoteException {
        Parcel m0 = mo136325m0(11, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: y0 */
    public final C41016d mo86170y0(C41016d dVar, C41016d dVar2, Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        C41835m.m169456f(H0, dVar2);
        C41835m.m169454d(H0, bundle);
        Parcel m0 = mo136325m0(4, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30483g mo86171z0() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.C30483g
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.internal.g r1 = (com.google.android.gms.maps.internal.C30483g) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.internal.j1 r2 = new com.google.android.gms.maps.internal.j1
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30501k1.mo86171z0():com.google.android.gms.maps.internal.g");
    }
}
