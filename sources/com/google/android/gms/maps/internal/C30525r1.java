package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41813a;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.internal.maps.C41840r;
import com.google.android.gms.internal.maps.C41841s;

/* renamed from: com.google.android.gms.maps.internal.r1 */
public final class C30525r1 extends C41813a implements C30528s1 {
    public C30525r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30475e mo86217F7(com.google.android.gms.dynamic.C41016d r3, com.google.android.gms.maps.GoogleMapOptions r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo136322H0()
            com.google.android.gms.internal.maps.C41835m.m169456f(r0, r3)
            com.google.android.gms.internal.maps.C41835m.m169454d(r0, r4)
            r3 = 3
            android.os.Parcel r3 = r2.mo136325m0(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.internal.C30475e
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.internal.e r4 = (com.google.android.gms.maps.internal.C30475e) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.internal.y1 r0 = new com.google.android.gms.maps.internal.y1
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30525r1.mo86217F7(com.google.android.gms.dynamic.d, com.google.android.gms.maps.GoogleMapOptions):com.google.android.gms.maps.internal.e");
    }

    /* renamed from: Q5 */
    public final void mo86218Q5(C41016d dVar, int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        H0.writeInt(i);
        mo136323O0(10, H0);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30471d mo86219c5(com.google.android.gms.dynamic.C41016d r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo136322H0()
            com.google.android.gms.internal.maps.C41835m.m169456f(r0, r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo136325m0(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.C30471d
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.maps.internal.d r0 = (com.google.android.gms.maps.internal.C30471d) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.maps.internal.x1 r1 = new com.google.android.gms.maps.internal.x1
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30525r1.mo86219c5(com.google.android.gms.dynamic.d):com.google.android.gms.maps.internal.d");
    }

    /* renamed from: e */
    public final int mo86220e() throws RemoteException {
        Parcel m0 = mo136325m0(9, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30459a mo86221f() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 4
            android.os.Parcel r1 = r4.mo136322H0()
            android.os.Parcel r0 = r4.mo136325m0(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.C30459a
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.internal.a r1 = (com.google.android.gms.maps.internal.C30459a) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.internal.n0 r2 = new com.google.android.gms.maps.internal.n0
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30525r1.mo86221f():com.google.android.gms.maps.internal.a");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30487h mo86222g6(com.google.android.gms.dynamic.C41016d r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo136322H0()
            com.google.android.gms.internal.maps.C41835m.m169456f(r0, r4)
            r4 = 8
            android.os.Parcel r4 = r3.mo136325m0(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.C30487h
            if (r2 == 0) goto L_0x0023
            r0 = r1
            com.google.android.gms.maps.internal.h r0 = (com.google.android.gms.maps.internal.C30487h) r0
            goto L_0x0029
        L_0x0023:
            com.google.android.gms.maps.internal.k1 r1 = new com.google.android.gms.maps.internal.k1
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30525r1.mo86222g6(com.google.android.gms.dynamic.d):com.google.android.gms.maps.internal.h");
    }

    /* renamed from: p */
    public final C41841s mo86223p() throws RemoteException {
        Parcel m0 = mo136325m0(5, mo136322H0());
        C41841s H0 = C41840r.m169467H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30491i mo86224s3(com.google.android.gms.dynamic.C41016d r3, com.google.android.gms.maps.StreetViewPanoramaOptions r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo136322H0()
            com.google.android.gms.internal.maps.C41835m.m169456f(r0, r3)
            com.google.android.gms.internal.maps.C41835m.m169454d(r0, r4)
            r3 = 7
            android.os.Parcel r3 = r2.mo136325m0(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.internal.C30491i
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.internal.i r4 = (com.google.android.gms.maps.internal.C30491i) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.internal.l1 r0 = new com.google.android.gms.maps.internal.l1
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30525r1.mo86224s3(com.google.android.gms.dynamic.d, com.google.android.gms.maps.StreetViewPanoramaOptions):com.google.android.gms.maps.internal.i");
    }

    /* renamed from: w5 */
    public final void mo86225w5(C41016d dVar, int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        H0.writeInt(i);
        mo136323O0(6, H0);
    }
}
