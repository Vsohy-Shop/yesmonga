package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b0 */
public abstract class C38873b0 extends C39009p implements C38883c0 {
    public C38873b0() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static C38883c0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof C38883c0) {
            return (C38883c0) queryLocalInterface;
        }
        return new C38863a0(iBinder);
    }

    /* renamed from: m0 */
    public final boolean mo122802m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        C39099z newBarcodeScanner = newBarcodeScanner(C41016d.C41017a.m166799H0(parcel.readStrongBinder()), (zzbc) C38992n0.m160612a(parcel, zzbc.CREATOR));
        parcel2.writeNoException();
        C38992n0.m160613b(parcel2, newBarcodeScanner);
        return true;
    }
}
