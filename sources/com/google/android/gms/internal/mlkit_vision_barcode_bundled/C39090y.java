package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y */
public abstract class C39090y extends C39009p implements C39099z {
    public C39090y() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    /* renamed from: m0 */
    public final boolean mo122802m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo98920d();
            parcel2.writeNoException();
        } else if (i == 2) {
            mo98921e();
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            List<zzba> V3 = mo98919V3(C41016d.C41017a.m166799H0(parcel.readStrongBinder()), (zzbu) C38992n0.m160612a(parcel, zzbu.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedList(V3);
        }
        return true;
    }
}
