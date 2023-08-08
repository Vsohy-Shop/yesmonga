package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.f */
public final class C38598f extends C38533a implements IInterface {
    public C38598f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    /* renamed from: E8 */
    public final zzq[] mo122319E8(C41016d dVar, zzaj zzaj) throws RemoteException {
        Parcel m0 = mo122193m0();
        C38779t0.m160134b(m0, dVar);
        C38779t0.m160133a(m0, zzaj);
        Parcel H0 = mo122190H0(2, m0);
        zzq[] zzqArr = (zzq[]) H0.createTypedArray(zzq.CREATOR);
        H0.recycle();
        return zzqArr;
    }

    /* renamed from: T6 */
    public final zzq[] mo122320T6(C41016d dVar, zzaj zzaj) throws RemoteException {
        Parcel m0 = mo122193m0();
        C38779t0.m160134b(m0, dVar);
        C38779t0.m160133a(m0, zzaj);
        Parcel H0 = mo122190H0(1, m0);
        zzq[] zzqArr = (zzq[]) H0.createTypedArray(zzq.CREATOR);
        H0.recycle();
        return zzqArr;
    }

    /* renamed from: e */
    public final void mo122321e() throws RemoteException {
        mo122191O0(3, mo122193m0());
    }
}
