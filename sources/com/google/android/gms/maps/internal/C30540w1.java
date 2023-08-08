package com.google.android.gms.maps.internal;

import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.w1 */
public abstract class C30540w1 extends C41834l implements C30467c {
    public C30540w1() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo86023m0(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L_0x000c
            r3 = 2
            if (r2 == r3) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            r1.deactivate()
            goto L_0x002b
        L_0x000c:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0014
            r2 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r3 = "com.google.android.gms.maps.internal.IOnLocationChangeListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.maps.internal.C30538w
            if (r0 == 0) goto L_0x0022
            r2 = r3
            com.google.android.gms.maps.internal.w r2 = (com.google.android.gms.maps.internal.C30538w) r2
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.maps.internal.v r3 = new com.google.android.gms.maps.internal.v
            r3.<init>(r2)
            r2 = r3
        L_0x0028:
            r1.mo86000r5(r2)
        L_0x002b:
            r4.writeNoException()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30540w1.mo86023m0(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
