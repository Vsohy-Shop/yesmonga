package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.o1 */
public abstract class C32076o1 extends C32067l1 implements C32079p1 {
    /* renamed from: H0 */
    public static C32079p1 m129896H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C32079p1 ? (C32079p1) queryLocalInterface : new C32073n1(iBinder);
    }
}
