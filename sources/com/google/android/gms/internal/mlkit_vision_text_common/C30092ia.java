package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.ia */
public final class C30092ia extends C29984a implements IInterface {
    public C30092ia(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    /* renamed from: E8 */
    public final void mo85154E8() throws RemoteException {
        mo85030O0(2, mo85032m0());
    }

    /* renamed from: T6 */
    public final zzmc mo85155T6(C41016d dVar, zzlq zzlq) throws RemoteException {
        Parcel m0 = mo85032m0();
        C30190r0.m121836c(m0, dVar);
        C30190r0.m121835b(m0, zzlq);
        Parcel H0 = mo85029H0(3, m0);
        zzmc zzmc = (zzmc) C30190r0.m121834a(H0, zzmc.CREATOR);
        H0.recycle();
        return zzmc;
    }

    /* renamed from: f */
    public final void mo85156f() throws RemoteException {
        mo85030O0(1, mo85032m0());
    }
}
