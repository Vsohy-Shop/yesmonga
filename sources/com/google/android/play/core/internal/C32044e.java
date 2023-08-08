package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.e */
public abstract class C32044e extends C32067l1 implements C32056i {
    public C32044e() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* renamed from: m0 */
    public final boolean mo92735m0(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        mo92765b0((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
        return true;
    }
}
