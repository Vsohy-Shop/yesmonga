package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.t1 */
public abstract class C32091t1 extends C32067l1 implements C32094u1 {
    /* renamed from: H0 */
    public static C32094u1 m129938H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof C32094u1 ? (C32094u1) queryLocalInterface : new C32088s1(iBinder);
    }
}
