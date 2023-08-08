package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ya */
public final class C38849ya extends C38533a implements IInterface {
    public C38849ya(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    /* renamed from: E8 */
    public final void mo122584E8() throws RemoteException {
        mo122191O0(2, mo122193m0());
    }

    /* renamed from: T6 */
    public final List<zzms> mo122585T6(C41016d dVar, zznl zznl) throws RemoteException {
        Parcel m0 = mo122193m0();
        C38779t0.m160134b(m0, dVar);
        C38779t0.m160133a(m0, zznl);
        Parcel H0 = mo122190H0(3, m0);
        ArrayList<zzms> createTypedArrayList = H0.createTypedArrayList(zzms.CREATOR);
        H0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: f */
    public final void mo122586f() throws RemoteException {
        mo122191O0(1, mo122193m0());
    }
}
