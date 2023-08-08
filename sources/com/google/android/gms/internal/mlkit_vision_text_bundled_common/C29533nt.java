package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.nt */
public abstract class C29533nt extends C29024a implements C29570ot {
    public C29533nt() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    /* renamed from: m0 */
    public final boolean mo84466m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo84761z();
            parcel2.writeNoException();
        } else if (i == 2) {
            mo84759k0();
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            zbsa x5 = mo84760x5(C41016d.C41017a.m166799H0(parcel.readStrongBinder()), (zbro) C29627qc.m120927a(parcel, zbro.CREATOR));
            parcel2.writeNoException();
            C29627qc.m120928b(parcel2, x5);
        }
        return true;
    }
}
