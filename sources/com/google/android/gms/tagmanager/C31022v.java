package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.gtm.C41558s;

/* renamed from: com.google.android.gms.tagmanager.v */
public abstract class C31022v extends C41558s implements C31023w {
    public C31022v() {
        super("com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public static C31023w asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
        if (queryLocalInterface instanceof C31023w) {
            return (C31023w) queryLocalInterface;
        }
        return new C31021u(iBinder);
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87701m0(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
        /*
            r9 = this;
            java.lang.String r13 = "com.google.android.gms.tagmanager.ICustomEvaluatorProxy"
            java.lang.String r0 = "com.google.android.gms.tagmanager.IMeasurementProxy"
            r1 = 1
            r2 = 0
            if (r10 == r1) goto L_0x0075
            r3 = 2
            if (r10 == r3) goto L_0x0061
            r3 = 3
            if (r10 == r3) goto L_0x0010
            r10 = 0
            return r10
        L_0x0010:
            android.os.Parcelable$Creator r10 = android.content.Intent.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.gtm.C41582t.m168360a(r11, r10)
            r4 = r10
            android.content.Intent r4 = (android.content.Intent) r4
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.d r5 = com.google.android.gms.dynamic.C41016d.C41017a.m166799H0(r10)
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.d r6 = com.google.android.gms.dynamic.C41016d.C41017a.m166799H0(r10)
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0031
            r7 = r2
            goto L_0x0042
        L_0x0031:
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.tagmanager.C31020t
            if (r3 == 0) goto L_0x003c
            com.google.android.gms.tagmanager.t r0 = (com.google.android.gms.tagmanager.C31020t) r0
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.tagmanager.r r0 = new com.google.android.gms.tagmanager.r
            r0.<init>(r10)
        L_0x0041:
            r7 = r0
        L_0x0042:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x004a
        L_0x0048:
            r8 = r2
            goto L_0x005c
        L_0x004a:
            android.os.IInterface r11 = r10.queryLocalInterface(r13)
            boolean r13 = r11 instanceof com.google.android.gms.tagmanager.C31011k
            if (r13 == 0) goto L_0x0056
            r2 = r11
            com.google.android.gms.tagmanager.k r2 = (com.google.android.gms.tagmanager.C31011k) r2
            goto L_0x0048
        L_0x0056:
            com.google.android.gms.tagmanager.i r2 = new com.google.android.gms.tagmanager.i
            r2.<init>(r10)
            goto L_0x0048
        L_0x005c:
            r3 = r9
            r3.previewIntent(r4, r5, r6, r7, r8)
            goto L_0x00b0
        L_0x0061:
            android.os.Parcelable$Creator r10 = android.content.Intent.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.gtm.C41582t.m168360a(r11, r10)
            android.content.Intent r10 = (android.content.Intent) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            com.google.android.gms.dynamic.d r11 = com.google.android.gms.dynamic.C41016d.C41017a.m166799H0(r11)
            r9.preview(r10, r11)
            goto L_0x00b0
        L_0x0075:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.d r10 = com.google.android.gms.dynamic.C41016d.C41017a.m166799H0(r10)
            android.os.IBinder r3 = r11.readStrongBinder()
            if (r3 != 0) goto L_0x0085
            r0 = r2
            goto L_0x0095
        L_0x0085:
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r4 = r0 instanceof com.google.android.gms.tagmanager.C31020t
            if (r4 == 0) goto L_0x0090
            com.google.android.gms.tagmanager.t r0 = (com.google.android.gms.tagmanager.C31020t) r0
            goto L_0x0095
        L_0x0090:
            com.google.android.gms.tagmanager.r r0 = new com.google.android.gms.tagmanager.r
            r0.<init>(r3)
        L_0x0095:
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            android.os.IInterface r13 = r11.queryLocalInterface(r13)
            boolean r2 = r13 instanceof com.google.android.gms.tagmanager.C31011k
            if (r2 == 0) goto L_0x00a8
            r2 = r13
            com.google.android.gms.tagmanager.k r2 = (com.google.android.gms.tagmanager.C31011k) r2
            goto L_0x00ad
        L_0x00a8:
            com.google.android.gms.tagmanager.i r2 = new com.google.android.gms.tagmanager.i
            r2.<init>(r11)
        L_0x00ad:
            r9.initialize(r10, r0, r2)
        L_0x00b0:
            r12.writeNoException()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C31022v.mo87701m0(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
