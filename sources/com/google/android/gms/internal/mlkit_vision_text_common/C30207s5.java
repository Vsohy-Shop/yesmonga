package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.s5 */
public final class C30207s5 extends C29984a implements IInterface {
    public C30207s5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    /* renamed from: T6 */
    public final zzl[] mo85323T6(C41016d dVar, zzd zzd) throws RemoteException {
        Parcel m0 = mo85032m0();
        C30190r0.m121836c(m0, dVar);
        C30190r0.m121835b(m0, zzd);
        Parcel H0 = mo85029H0(1, m0);
        zzl[] zzlArr = (zzl[]) H0.createTypedArray(zzl.CREATOR);
        H0.recycle();
        return zzlArr;
    }

    /* renamed from: e */
    public final void mo85324e() throws RemoteException {
        mo85030O0(2, mo85032m0());
    }
}
