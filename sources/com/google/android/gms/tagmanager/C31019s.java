package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.C41558s;

/* renamed from: com.google.android.gms.tagmanager.s */
public abstract class C31019s extends C41558s implements C31020t {
    public C31019s() {
        super("com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.tagmanager.q] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.tagmanager.n] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87701m0(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
        /*
            r6 = this;
            r10 = 2
            if (r7 == r10) goto L_0x005f
            r10 = 11
            if (r7 == r10) goto L_0x0054
            r10 = 21
            r0 = 0
            if (r7 == r10) goto L_0x0033
            r10 = 22
            if (r7 == r10) goto L_0x0012
            r7 = 0
            return r7
        L_0x0012:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 != 0) goto L_0x0019
            goto L_0x002c
        L_0x0019:
            java.lang.String r8 = "com.google.android.gms.tagmanager.IMeasurementEventListener"
            android.os.IInterface r8 = r7.queryLocalInterface(r8)
            boolean r10 = r8 instanceof com.google.android.gms.tagmanager.C31014n
            if (r10 == 0) goto L_0x0027
            r0 = r8
            com.google.android.gms.tagmanager.n r0 = (com.google.android.gms.tagmanager.C31014n) r0
            goto L_0x002c
        L_0x0027:
            com.google.android.gms.tagmanager.l r0 = new com.google.android.gms.tagmanager.l
            r0.<init>(r7)
        L_0x002c:
            r6.mo87695Z1(r0)
            r9.writeNoException()
            goto L_0x007b
        L_0x0033:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r8 = "com.google.android.gms.tagmanager.IMeasurementInterceptor"
            android.os.IInterface r8 = r7.queryLocalInterface(r8)
            boolean r10 = r8 instanceof com.google.android.gms.tagmanager.C31017q
            if (r10 == 0) goto L_0x0048
            r0 = r8
            com.google.android.gms.tagmanager.q r0 = (com.google.android.gms.tagmanager.C31017q) r0
            goto L_0x004d
        L_0x0048:
            com.google.android.gms.tagmanager.o r0 = new com.google.android.gms.tagmanager.o
            r0.<init>(r7)
        L_0x004d:
            r6.mo87696m4(r0)
            r9.writeNoException()
            goto L_0x007b
        L_0x0054:
            java.util.Map r7 = r6.zzb()
            r9.writeNoException()
            r9.writeMap(r7)
            goto L_0x007b
        L_0x005f:
            java.lang.String r1 = r8.readString()
            java.lang.String r2 = r8.readString()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.gtm.C41582t.m168360a(r8, r7)
            r3 = r7
            android.os.Bundle r3 = (android.os.Bundle) r3
            long r4 = r8.readLong()
            r0 = r6
            r0.mo87697o2(r1, r2, r3, r4)
            r9.writeNoException()
        L_0x007b:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C31019s.mo87701m0(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
