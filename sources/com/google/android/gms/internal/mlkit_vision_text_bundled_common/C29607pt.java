package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.pt */
public abstract class C29607pt extends C29024a implements C29644qt {
    public C29607pt() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    /* renamed from: m0 */
    public final boolean mo84466m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        C29570ot zbb = zbb(C41016d.C41017a.m166799H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        C29627qc.m120929c(parcel2, zbb);
        return true;
    }
}
