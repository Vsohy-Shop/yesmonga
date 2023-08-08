package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ab */
public abstract class C38545ab extends C38838y implements C38558bb {
    /* renamed from: m0 */
    public static C38558bb m159856m0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof C38558bb) {
            return (C38558bb) queryLocalInterface;
        }
        return new C38861za(iBinder);
    }
}
