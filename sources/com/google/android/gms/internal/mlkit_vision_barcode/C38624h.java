package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.h */
public abstract class C38624h extends C38838y implements C38637i {
    /* renamed from: m0 */
    public static C38637i m159974m0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof C38637i) {
            return (C38637i) queryLocalInterface;
        }
        return new C38611g(iBinder);
    }
}
