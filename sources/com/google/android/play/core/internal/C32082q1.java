package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.q1 */
public abstract class C32082q1 extends C32067l1 implements C32085r1 {
    public C32082q1() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* renamed from: m0 */
    public final boolean mo92735m0(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo92422b0((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo92421H((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
