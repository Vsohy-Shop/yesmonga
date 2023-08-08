package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.m0 */
public abstract class C32069m0 extends C32067l1 implements C32072n0 {
    /* renamed from: H0 */
    public static C32072n0 m129879H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof C32072n0 ? (C32072n0) queryLocalInterface : new C32066l0(iBinder);
    }
}
