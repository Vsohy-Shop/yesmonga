package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.c */
public abstract class C32038c extends C32067l1 implements C32041d {
    /* renamed from: H0 */
    public static C32041d m129773H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof C32041d ? (C32041d) queryLocalInterface : new C32032b(iBinder);
    }
}
