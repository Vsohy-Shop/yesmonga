package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.gtm.m6 */
public abstract class C41421m6 extends C41558s implements C41445n6 {
    public C41421m6() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    /* renamed from: H0 */
    public static C41445n6 m168040H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
        if (queryLocalInterface instanceof C41445n6) {
            return (C41445n6) queryLocalInterface;
        }
        return new C41397l6(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87701m0(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) throws android.os.RemoteException {
        /*
            r7 = this;
            r11 = 1
            if (r8 == r11) goto L_0x0065
            r0 = 2
            if (r8 == r0) goto L_0x0039
            r0 = 3
            if (r8 == r0) goto L_0x0035
            r0 = 101(0x65, float:1.42E-43)
            if (r8 == r0) goto L_0x0017
            r9 = 102(0x66, float:1.43E-43)
            if (r8 == r9) goto L_0x0013
            r8 = 0
            return r8
        L_0x0013:
            r7.mo135614f()
            goto L_0x0074
        L_0x0017:
            java.lang.String r1 = r9.readString()
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.gtm.C41582t.m168360a(r9, r8)
            r2 = r8
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = r9.readString()
            long r4 = r9.readLong()
            boolean r6 = com.google.android.gms.internal.gtm.C41582t.m168365f(r9)
            r0 = r7
            r0.mo135612Q2(r1, r2, r3, r4, r6)
            goto L_0x0074
        L_0x0035:
            r7.mo135615k()
            goto L_0x0074
        L_0x0039:
            java.lang.String r8 = r9.readString()
            java.lang.String r0 = r9.readString()
            java.lang.String r1 = r9.readString()
            android.os.IBinder r9 = r9.readStrongBinder()
            if (r9 != 0) goto L_0x004d
            r9 = 0
            goto L_0x0061
        L_0x004d:
            java.lang.String r2 = "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback"
            android.os.IInterface r2 = r9.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.gtm.C41373k6
            if (r3 == 0) goto L_0x005b
            r9 = r2
            com.google.android.gms.internal.gtm.k6 r9 = (com.google.android.gms.internal.gtm.C41373k6) r9
            goto L_0x0061
        L_0x005b:
            com.google.android.gms.internal.gtm.i6 r2 = new com.google.android.gms.internal.gtm.i6
            r2.<init>(r9)
            r9 = r2
        L_0x0061:
            r7.mo135613X5(r8, r0, r1, r9)
            goto L_0x0074
        L_0x0065:
            java.lang.String r8 = r9.readString()
            java.lang.String r0 = r9.readString()
            java.lang.String r9 = r9.readString()
            r7.mo135616v0(r8, r0, r9)
        L_0x0074:
            r10.writeNoException()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41421m6.mo87701m0(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
